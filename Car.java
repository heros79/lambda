package lessonfour;

public class Car {

  private String name;

  public Car(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Car start() {
    System.out.println("Start");
    return this;
  }

  public Car run() {
    System.out.println("Run");
    return this;
  }

  public Car toBeep() {
    System.out.println("Beep");
    return this;
  }

  public Car stop() {
    System.out.println("Stop");
    return this;
  }
}
