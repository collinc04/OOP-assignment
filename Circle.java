public class Circle implements Shape {
  private double radius;

  public Circle(double radius) {
    this.radius = radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public double getRadius() {
    return radius;
  }

  @Override 
  public double getArea() {
    return Math.PI * radius * radius;
  }

  @Override 
  public String getClassName() {
    return "Circle";
  }

  @Override 
  public String toString() {
    return "Circle (r=" + radius + ")";
  }
}
