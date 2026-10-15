/**
 * 
 * Circle class with a radius property and methods to calculate area
 */
public class Circle implements Shape {
  private double radius;

  /**
   * Constructor for Circle class
   * @param double radius
   */
  public Circle(double radius) {
    this.radius = radius;
  }

  /**
   * Setter for radius
   * @param double radius
   */
  public void setRadius(double radius) {
    this.radius = radius;
  }

  /**
   * Getter for radius
   * @return double radius
   */
  public double getRadius() {
    return radius;
  }

  /**  (non-Javadoc)
   * 
   * @see Shape#getArea()
   */
  @Override 
  public double getArea() {
    return Math.PI * radius * radius;
  }

  /**  (non-Javadoc)
   * 
   * @see Shape#getClassName()
   */
  @Override 
  public String getClassName() {
    return "Circle";
  }

  /**  (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override 
  public String toString() {
    return "Circle (r=" + radius + ")";
  }
}
