public class JavaWorkbook {
    public static void main(String[] args){
	int a, b, c, d, e;

	a = 1;
	b = 18;
	c = 6;
	d = 42;
	e = 8;
	if (!(a == b && c * c <= 100 || d != e/8)) {
	    System.out.println("valid");
	}
	else {
            System.out.println("invalid");
	}
	if (1000 > a + b * b * 10 || !(e * d == a / d)){
	    a = a + b;
	}
	else {
	    a = a - b;
	}
	System.out.println(a);
    }
}
