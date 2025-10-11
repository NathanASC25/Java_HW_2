public class JavaWorkbook {
    public static void main(String[] args){
	int a, b, y, z, x;
	a = 4;
	b = 3;
	y = 5;
	z = 1;
	x = 0;
	// Section 3.2 Problem 3b)
	if (a > z && b > y) {
	    x = 2;
	}
	else if (a > z) {
	    x = 7;
	}
	System.out.printf("\n%d\n", x);
    }
}
