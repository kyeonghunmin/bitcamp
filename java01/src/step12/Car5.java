package step12;

public class Car5 {
  private String model;
  private String maker;
  private int cc;
  private int capacity;

  public Car5() {}

  public Car5(String model, String maker, int cc, int capacity) {
    this.model = model;
    this.maker = maker;
    this.cc = cc;
    this.capacity = capacity;
    // this.setModel(mode);
    // this.setMaker(maker);
    // this.setCc(cc);
    // this.setCapacity(capacity);
  }

  public String getModel() {
    return this.model;
  }
  public void setModel(String model) {
    this.model = model;
  }

  public String getMaker() {
    return this.maker;
  }
  public void setMaker(String maker) {
    this.maker = maker;
  }

  public int getCc() {
    return this.cc;
  }
  public void setCc(int cc) {
    if (cc > 0 && cc <= 10000) {
      this.cc = cc;
    }
  }

  public int getCapacity() {
    return this.capacity;
  }
  public void setCapacity(int capacity) {
    if (capacity > 0 && capacity <= 100) {
      this.capacity = capacity;
    }
  }
}
