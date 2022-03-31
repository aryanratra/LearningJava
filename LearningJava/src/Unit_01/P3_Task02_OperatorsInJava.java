package Unit_01;

public class P3_Task02_OperatorsInJava {

	public static void main(String[] args) {
		P3_Task02_OperatorsInJava obj = new P3_Task02_OperatorsInJava();
		obj.UnaryOperator();
		obj.ArithmeticOperators();
		obj.ShiftOperators();
		obj.RelationalOperators();
		obj.BitWiseOperatorsAndLogical();
	}
	
	void UnaryOperator()
	{
		int a = 5;
		boolean b = true;
		System.out.println("Unary Operators - ");
		System.out.println("a++ = " + a++);
		System.out.println("a-- = " + a--);
		System.out.println("++a = " + ++a);
		System.out.println("--a = " + --a);
		System.out.println("~a = " + ~a);
		System.out.println("!b = " + !b);
		System.out.println("--------------");
	}

	
	void ArithmeticOperators()
	{
		int a = 10;
		int b = 5;
		System.out.println("Arithmetic Operators - ");
		System.out.println("a+b = " + (a+b));
		System.out.println("a-b = " + (a-b));
		System.out.println("a/b = " + (a/b));
		System.out.println("a*b = " + (a*b));
		System.out.println("a%b = " + (a%b));
		System.out.println("--------------");
	}
	
	 void ShiftOperators()
	 {
		System.out.println("Shift Operators - ");
		System.out.println("10<<2 = " + (10<<2)); //10*2^2=40
		System.out.println("10<<1 = " + (10<<1)); //10*2^1=20
		System.out.println("10>>2 = " + (10>>2)); //10/2^2=2
		System.out.println("20>>4 = " + (20>>4)); //20/2^4=1
		System.out.println("--------------");
	 }
	 
	 
	 void RelationalOperators()
	 {
		System.out.println("Relational Operators - ");
		int a=3,b=3,c=5;
		System.out.println("a==b = " + (a==b));
		System.out.println("a!=b = " + (a!=b));
		System.out.println("a>c = " + (a>c));
		System.out.println("a<=c = " + (a<=c));
		System.out.println("--------------");
	}
	 
	 
	 void BitWiseOperatorsAndLogical()
	 {
		int a=5,b=10,c=20;
		System.out.println("Bitwise and Logical Operators - ");
		System.out.println(a<b && b++<c);
		System.out.println(a++>b || b>c);
		System.out.println(b);
		System.out.println(a);
		System.out.println(a>b | a<c);
		System.out.println(a<b & a++<c);
		System.out.println(a);
		System.out.println("--------------");
	 }
}
