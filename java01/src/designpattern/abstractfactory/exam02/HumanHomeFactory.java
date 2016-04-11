package designpattern.abstractfactory.exam02;

public class HumanHomeFactory extends HomeFactory {
  @Override
  public Home createHome() {
    Home h = new Home();
    h.image = "human-home.gif";
    h.defense = 100;
    h.attack = 30;
    return h;
  }
}
