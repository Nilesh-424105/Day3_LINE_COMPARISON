
import java.util.Scanner;
public class lineComparisonProblem {
     public static void main(String[] args) {

		System.out.println("Calculate Length Of Line: ");

		Scanner line = new Scanner(System.in);

		System.out.println("Enter the Value of x Co-ordinate 1st point: ");
		int x1 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate  1nd point: ");
		int y1 = line.nextInt();
		System.out.println("Enter the Value of x Co-ordinate 2nd point: ");
		int x2 = line.nextInt();
		System.out.println("Enter the Value of y Co-ordinate 2nd point: ");
		int y2 = line.nextInt();

		double length_of_line1 = Math.sqrt((y2 - y1) * (y2 - y1) + (x2 - x1) * (x2 - x1));
		System.out.println("length_of_line1 = " + length_of_line1);

   }
}

