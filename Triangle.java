public class Triangle implements Shape {
  private double base;
  private double height;

  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }

  /**
   * getter for base
   * @return double base of the triangle
   */
  public double getBase() {
    return base;
  }

  /**
   * getter for height
   * @return double height of the triangle
   */
  public double getHeight() {
    return height;
  }

  /**
   * setter for base
   * @param double base
   */
  public void setBase(double base) {
    this.base = base;
  }

  /**
   * setter for height
   * @param double height
   */
  public void setHeight(double height) {
    this.height = height;
  }

  /**  (non-Javadoc)
   * 
   * @see Shape#getArea()
   */
  @Override 
  public double getArea() {
    return 0.5 * base * height;
  }

  /**  (non-Javadoc)
   * 
   * @see Shape#getClassName()
   */
  @Override 
  public String getClassName() {
    return "Triangle";  
  }

  /**  (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override 
  public String toString() {
    return "Triangle (b=" + base + ", h=" + height + ")";
  }
}
