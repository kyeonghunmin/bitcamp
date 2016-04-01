package bitcamp.pms.context;

import java.io.File;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import bitcamp.pms.annotation.Component;
import bitcamp.pms.annotation.Controller;

public class ApplicationContext {
  HashMap<String,Object> objPool = new HashMap<>();
  
  public ApplicationContext(String basePackage) {
    String path = "./bin/" + basePackage.replace(".", "/");
    createObject(new File(path));
    injectDependency();
  }
  
  private void injectDependency() {
    Collection<Object> objects = objPool.values();
    
    Method[] methods = null;
    Class<?> paramType = null;
    Object dependency = null;
    
    for (Object obj : objects) {
      //System.out.println(obj.getClass().getName());
      
      methods = obj.getClass().getMethods();
      for (Method m : methods) {
        if (!m.getName().startsWith("set"))
          continue;
        
        paramType = m.getParameterTypes()[0];
        //System.out.printf("--->%s(%s)\n", m.getName(), paramType.getName());
        dependency = findObjectByType(paramType);
        
        if (dependency == null)
          continue;
        
        try {
          m.invoke(obj, dependency);
        } catch (Exception e) {}
      }
    }
  }

  private Object findObjectByType(Class<?> paramType) {
    Collection<Object> objects = objPool.values();
    for (Object obj : objects) {
      if (paramType.isInstance(obj)) {
        return obj;
      }
    }
    return null;
  }

  private void createObject(File file) {
    if (file.isFile() && file.getName().endsWith(".class")) {
      String classNameWithPackage = file.getPath()
                                        .replace("./bin/", "")
                                        .replace(".class", "")
                                        .replace("/", ".");
      try {
        Class<?> clazz = Class.forName(classNameWithPackage);
        
        Annotation[] annos = clazz.getAnnotations();
        
        for (Annotation anno : annos) {
          if (anno.annotationType() == Component.class) {
            //System.out.printf("%s --> %s\n", clazz.getName(), "Component");
            processComponentAnnotation(clazz);
            
          } else if (anno.annotationType() == Controller.class) {
            //System.out.printf("%s --> %s\n", clazz.getName(), "Controller");
            processControllerAnnotation(clazz);
          }
        }
      } catch (Exception e) {
        e.printStackTrace();
      }    
      return;
    }
    
    File[] subfiles = file.listFiles();
    for (File subfile : subfiles) {
      createObject(subfile);
    }
  }
  
  private void processComponentAnnotation(Class<?> clazz) throws Exception {
    Component anno = clazz.getAnnotation(Component.class);
    String key = anno.value();
    if (key.equals("")) {
      key = clazz.getName();
    }
    objPool.put(key, clazz.newInstance());
  }
  
  private void processControllerAnnotation(Class<?> clazz) throws Exception {
    Controller anno = clazz.getAnnotation(Controller.class);
    String key = anno.value();
    if (key.equals("")) {
      key = clazz.getName();
    }
    objPool.put(key, clazz.newInstance());
  }

  public List<Object> getBeans(Class<?> beanType) {
    ArrayList<Object> list = new ArrayList<>();
    
    Collection<Object> objects = objPool.values();
    for (Object obj : objects) {
      if (beanType.isInstance(obj)) {
        list.add(obj);
      }
    }
    return list;
  }
  
  public Object getBean(Class<?> type) {
    Collection<Object> objects = objPool.values();
    for (Object obj : objects) {
      if (type.isInstance(obj)) {
        return obj;
      }
    }
    return null;
  }

  public Map<String, Object> getBeansWithAnnotation(Class<? extends Annotation> annoType) {
    Set<Entry<String,Object>> entrySet = objPool.entrySet();
    // Map은 반복문을 수행할 수 없기 때문에 Set을 활용하여 반복문을 수행한다.
    
    HashMap<String,Object> objMap = new HashMap<>();
    
    Object obj = null;
    for (Entry<String,Object> entry : entrySet) {
    // entrySet에서 Entry를 하나씩 뽑는다.
      obj = entry.getValue();
      
      if (obj.getClass().getAnnotation(annoType) == null)
        continue;
      
      objMap.put(entry.getKey(), obj);
    }
    return objMap;
  }
  
  public void addBean(String name, Object bean) {
    objPool.put(name, bean);
  }

}
