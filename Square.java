/**
 * 
 * Square class implementing the Shape inteface. It has a side length
 */
public class Square implements Shape {
  private double side;

  /**
   * getter for side length
   * @return double side length of the square
   */
  public double getSide() {
    return side;
  }
  
  /**
   * setter for side length
   * @param double side
   */
  public void setSide(double side) {
    this.side = side;
  }

  /**
   * Constructor for Square class 
   * @param double side
   */
  public Square(double side) {
    this.side = side;
  }

  /**  (non-Javadoc)
   * 
   * @see Shape#getArea()
   */
  @Override 
  public double getArea() {
    return side * side;
  }

  /**  (non-Javadoc)
   * 
   * @see Shape#getClassName()
   */
  @Override 
  public String getClassName() {
    return "Square";
  }

  /**  (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override 
  public String toString() {
    return "Square (s=" + side + ")";
  }
}
