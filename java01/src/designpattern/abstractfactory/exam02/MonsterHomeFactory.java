package designpattern.abstractfactory.exam02;

public class MonsterHomeFactory extends HomeFactory {
  @Override
  public Home createHome() {
    Home h = new Home();
    h.image = "monster-home.gif";
    h.defense = 70;
    h.attack = 100;
    return h;
  }
}
