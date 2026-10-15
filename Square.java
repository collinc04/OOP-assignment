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
  
  public void setSide(double side) {
    this.side = side;
  }

  public Square(double side) {
    this.side = side;
  }

  @Override 
  public double getArea() {
    return side * side;
  }

  @Override 
  public String getClassName() {
    return "Square";
  }

  @Override 
  public String toString() {
    return "Square (s=" + side + ")";
  }
}
