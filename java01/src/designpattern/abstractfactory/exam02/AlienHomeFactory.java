package designpattern.abstractfactory.exam02;

public class AlienHomeFactory extends HomeFactory {
  @Override
  public Home createHome() {
    Home h = new Home();
    h.image = "alien-home.gif";
    h.defense = 50;
    h.attack = 90;
    return h;
  }
}
