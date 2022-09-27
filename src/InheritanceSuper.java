
class Animals {
	//method
	
	public void eat () {
		System.out.println("i love hunting and eating animaml");
	}
}

class Lion extends Animals {
@Override	
	public void eat () {
		System.out.println("i love eating animals hunted by others");
		super.eat();
	}
	
}
public class InheritanceSuper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion Shamshera = new Lion();
		Shamshera.eat();
		
				

	}

}
