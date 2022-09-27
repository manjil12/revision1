
abstract class Jungle{
	


//abstract method, they will not have body
//a simple class have abstract as well as normal method
//make class abstract if there is one abstract method


	//abstract method
abstract void eat();


//normal method
public void gives() {
	System.out.println("it gives fresh air");
}
}
class Bamboo extends Jungle{
	public void eat() {
		System.out.println("different animals eat and lives there");
	}
		public void breathe() {
			System.out.println("we breathe fresh air cuz of jungles near by");
		}
	
		// TODO Auto-generated method stub
		
	}

public class abstractmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bamboo tree = new Bamboo();	
		tree.eat();
		tree.gives();
		tree.breathe();
		}

}
