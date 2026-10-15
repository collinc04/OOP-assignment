public class Rectangle implements Shape {
  private double length;
  private double width;

  public double getLength() {
    return length;
  }

  public double getWidth() {
    return width;
  }

  public void setLength(double length) {
    this.length = length;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  @Override 
  public double getArea() {
    return length * width;
  }

  @Override 
  public String getClassName() {
    return "Rectangle";
  }

  @Override 
  public String toString() {
    return "Rectangle (l=" + length + ", w=" + width + ")";   
  }
}
