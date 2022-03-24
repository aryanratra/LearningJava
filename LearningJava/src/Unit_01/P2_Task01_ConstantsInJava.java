package Unit_01;

public class P2_Task01_ConstantsInJava {

	//Declaring Constants
	protected static final double PRICE = 328.23;
	
	public static final double PRICE2 = 3.14;
	
	static final int a = 14;
	
	public static final float pi = 3.14f;
	
	public static void main(String[] args) {
		
		//Syntax error on token "void", delete this token
		P2_Task01_ConstantsInJava void = new P2_Task01_ConstantsInJava();
		
		//Syntax error on token "double", invalid VariableDeclaratorId
		int double = 45.5;
		
		
		System.out.println("Value of constant PRICE = " + PRICE);
		
		System.out.println("Value of constant PRICE2 = " + PRICE2);
		
		//Cannot make a static reference to the non-static field a
		System.out.println("Value of constant a = " + a);
		
		System.out.println("Value of constant PI = " + pi);
		
		//The final field P2_Task01_ConstantsInJava.a cannot be assigned
		a = 11;

	}
	
	//Syntax error on token "for", Identifier expected	
	public void for()
	{
		
	}

}
