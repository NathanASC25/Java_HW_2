import java.util.Scanner;
public class ExtractDigits {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("\nEnter an integer: ");
	int n = sc.nextInt();
	int multiplier = 1;
	int count = 1;
	boolean wasNegative = n < 0;
	if (n < 0) {
	    n *= -1;
	}
	// Determine the digits of multiplier. If 3 digits, multiplier is 100
	while (n >= multiplier * 10) {
	    multiplier *= 10;
	}
	// Extract each digit with the while loop below, using modulo
        while (multiplier >= 1) {
	    int tempInput = n;
	    if (wasNegative && count == 1) { 
		System.out.print("-");
	    }
	    while (tempInput >= 10) {
		if (count > 1 && multiplier > 1) {
		    int tempMulti = multiplier;
		    tempInput /= multiplier;
		    if (multiplier >= tempInput) {
			do {
			    tempMulti /= 10;
			} 
			while (tempMulti > 10);
			tempInput %= tempMulti;
		    }
		    else {
			if (count > 2 && tempInput % multiplier >= 10) {
			    do {
				tempMulti /= 10;
			    }
			    while (tempMulti > 10);
			}
			tempInput %= tempMulti;
		    }
		}
		else if (multiplier == 1) {
		    tempInput %= (multiplier * 10);
		}
		else {
		    tempInput /= multiplier;
		}
	    }
	    count++;
	    System.out.printf("%d ", tempInput);
	    multiplier /= 10;
	}
	System.out.print("\n");
    }
}
