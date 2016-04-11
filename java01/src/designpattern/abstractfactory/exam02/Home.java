package designpattern.abstractfactory.exam02;

public class Home {
  String image;
  int defense;
  int attack;
  
  @Override
  public String toString() {
    return "[그림=" + image + ", 방어력=" + defense + ", 공격력=" + attack + "]";
  }
  
}
