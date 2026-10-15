/**
 * 
 * Rectangle class that implements the Shape interface
 */
public class Rectangle implements Shape {
  private double length;
  private double width;

  /**
   * getter for length
   * @return double length of the rectangle
   */
  public double getLength() {
    return length;
  }

  /**
   * getter for width
   * @return double width of the rectangle
   */
  public double getWidth() {
    return width;
  }
  
  /**
   * setter for length
   * @param double length
   */
  public void setLength(double length) {
    this.length = length;
  }

  /**
   * setter for width
   * @param double width
   */
  public void setWidth(double width) {
    this.width = width;
  }

  /**
   * Constructor for Rectangle class
   * @param double length
   * @param double width
   */
  public Rectangle(double length, double width) {
    this.length = length;
    this.width = width;
  }

  /**  (non-Javadoc)
   * 
   * @see Shape#getArea()
  */
  @Override 
  public double getArea() {
    return length * width;
  }

  /**  (non-Javadoc)
   * 
   * @see Shape#getClassName()
   */
  @Override 
  public String getClassName() {
    return "Rectangle";
  }

  /**  (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override 
  public String toString() {
    return "Rectangle (l=" + length + ", w=" + width + ")";   
  }
}
