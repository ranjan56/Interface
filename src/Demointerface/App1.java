package Demointerface;

interface StudentActivities{
	

   void study();
   void eat();
   void sleep();
}
 class computerScienceStudent implements StudentActivities{

	@Override
	public void study() {
		System.out.println("studying");

		
	}

	@Override
	public void eat() {
		System.out.println("eating");
		
	}

	@Override
	public void sleep() {
		System.out.println("sleeping");
	
		
	}
	 
 }

public class App1 {
	public static void main(String[] arga) {
		computerScienceStudent cs = new computerScienceStudent();
		cs.study();
		cs.eat();
		cs.sleep();
		
		
	}

}
