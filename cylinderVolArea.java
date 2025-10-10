import java.util.Scanner;
public class cylinderVolArea {
    public static void main(String[] args){
	Scanner scan = new Scanner(System.in);
	System.out.printf("\nWelcome! Please respond with whole numbers.\n");
	System.out.printf("\nGive me the radius of the cylinder: ");
	int radius = scan.nextInt();
	System.out.printf("\nGive me the length of the cylinder: ");
	int length = scan.nextInt();

	double surfaceArea = (2.0 * Math.PI * Math.pow(radius, 2)) + (2.0 * Math.PI * radius * length);
	double volume = Math.PI * Math.pow(radius, 2) * length;

	System.out.printf("\nSurface Area of Cylinder: %f units squared\n", surfaceArea);
	System.out.printf("\nVolume of Cylinder: %f units cubed\n", volume);
    }
}
