
abstract class NRBA{
	//here we are creating abstract method from which we cannot create object
	
	abstract void loan();
	abstract void save();
	
}

class BOK extends NRBA{
	public void loan() {
		System.out.println("i am loan from BOK");
	}
	public void save() {
		System.out.println("i am saving from BOK");
	}
}

class NIBS extends NRBA{
	public void loan() {
		System.out.println("i am loan from NIB");
	}
	public void save() {
		System.out.println("i am saving from NIB");
	}
	public void display() {
		System.out.println("we provide excellent services");
	}
}
public class abstractworldbank2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BOK bank = new BOK();
		bank.loan();
		bank.save();
		NIBS banka = new NIBS();
		banka.loan();
		banka.save();
		banka.display();

	}

}
