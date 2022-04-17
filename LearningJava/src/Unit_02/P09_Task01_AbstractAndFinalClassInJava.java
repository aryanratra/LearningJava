package Unit_02;


abstract class Bike{
	
	int a;
	
	Bike(){
		System.out.println("Inside Bike Constructor: "+ a + "\n");
	}
	
	abstract void run(); //abstract method! (0-100%)
	
	void display() {
		System.out.println("This is diplay method!");
	}
}

class Honda4 extends Bike{
	
	@Override
	void run() {
		//TODO Auto-generated method stub
	}
}

public class P09_Task01_AbstractAndFinalClassInJava {

	public static void main(String[] agrs) {
		Bike obj=new Honda4();
		//obj.run();
		obj.display();
		
		// can not be instantiated
		// Bike obj2=new Bike();
	}
}

// Final Class
final class Super{
	
	public int data=30;
	
	void display() {
		System.out.println(data);
	}
	
}
