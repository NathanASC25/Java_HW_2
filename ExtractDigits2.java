import java.util.Scanner;
public class ExtractDigits2 {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.printf("\nEnter an integer to be printed out: ");
	int inputNum = scan.nextInt();
	int modulusNum = 10;
	boolean wasNegative = inputNum < 0;
	// (Lines 10 to 16) If input integer was detected negative, switch to positive number to ensure no buggy output for negative symbols. Both conditions print on new line
	if (wasNegative) {
	    inputNum *= -1;
	    System.out.printf("\n-");
	}
	else {
	    System.out.printf("\n");
	}
	// Condition ensures divisor has one more digit than dividend at failure. For example 234 % 1000 = 234 because the divisor has more digits
	while (inputNum % modulusNum != inputNum) {
	    modulusNum *= 10;
	}
	// While the modulo/divisor value is greater than or equal to 10, each digit from the input number is extracted and printed out
	while (modulusNum >= 10) {
	    System.out.printf("%d ", (inputNum % modulusNum) / (modulusNum / 10));
	    modulusNum /= 10;
	}
	System.out.printf("\n");
    }
}
