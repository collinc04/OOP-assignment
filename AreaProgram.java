import java.util.Scanner;
import java.lang.Math;

public class AreaProgram {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int option;

		do {
			System.out
					.print("=== AREA CALCULATOR ===\n1. Square\n2. Circle\n3. Triangle\n4. Exit\n");
			System.out.print("Enter the desired option[1-4]: ");
			option = keyboard.nextInt();

			switch (option) {
				case 1:
					//square
					System.out.print("Enter the length of the square: ");
					double length = keyboard.nextDouble();
					double area = length * length;
					System.out.println("The are of the square is equal to " + area);
					break;
				case 2:
					//circle
					System.out.print("Enter the radius of the circle: ");
					double radius = keyboard.nextDouble();
					double areaCircle = (radius * radius) * Math.PI;
					System.out.println("The are of the square is equal to " + areaCircle);
					break;
				case 3:
					//triangle
					System.out.print("Enter the base of the triangle: ");
					double base = keyboard.nextDouble();
					System.out.print("Enter the height of the triangle: ");
					double height = keyboard.nextDouble();
					double areaTriangle = (base * height) * 0.5;
					System.out.println("The are of the triangle is equal to " + areaTriangle);
				    break;
				default:
					System.out.println("Invalid. enter a number between 1 and 4");
			}
		} while (option != 4);
		keyboard.close();
	}
}