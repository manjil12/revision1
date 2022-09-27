
class Animal {
	//field
	String name;
	
	//method
	public void eat() {
		System.out.println("i eat only meat");
	}
}

//class
class Tiger extends Animal {
	
	//method
	public void display() {
		System.out.println("My name is "+ name);
	}
}
public class InheritanceA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Tiger Sheru = new Tiger();
		Sheru.name = "Sheru";
		Sheru.eat();
		Sheru.display();

	}

}
