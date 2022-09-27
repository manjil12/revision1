
abstract class Greetings {
	//we cannot create object of abstract class
	//we cannot create object of class with abstract method
	
	public void display() {
		System.out.println("welcome");
	}
}
class Welcoming extends Greetings{
	//this one is optional (just praticing myself adding one more method)
	public void display1() {
		System.out.println("good evening");
	}
}


public class Abstractmethod1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Welcoming greet = new Welcoming();
		greet.display();
		greet.display1();
	}

}
