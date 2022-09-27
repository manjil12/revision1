
class Granddad {
	String firstname;
	String lastname;
	
	//constructor
	 Granddad(String firstname, String lastname){
		 this.firstname = firstname;
		 this.lastname = lastname;
		 
	 }
	 public void displayname () {
		 System.out.println(this.firstname+" "+this.lastname);
	 }
}

class Dad extends Granddad {
	String ffirstname;
	
	Dad (String firstname,String lastname,String ffirstname){
		super(firstname,lastname);
		this.ffirstname = ffirstname;
	}
	
	@Override
	public void displayname() {
		System.out.println(this.ffirstname+" "+this.firstname+" "+this.lastname);
		
	}
}

class Keto extends Dad {
	String gfirstname;
	
	Keto(String firstname,String lastname,String ffirstname,String gfirstname){
		super(firstname,ffirstname,lastname);
		this.gfirstname = gfirstname;
	}
	
	@Override
	public void displayname() {
		System.out.println(this.gfirstname+" "+this.ffirstname+" "+this.lastname);
	}
}


public class InheritanceMultilevel1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Granddad Govinda = new Granddad ("Govinda","Ghimire");
		Govinda.displayname();
		
		Dad Ananda = new Dad ("Govinda","Ghimire","Ananda");
		Ananda.displayname();
		
		Keto Manjil = new Keto ("Govinda","Ananda","Ghimire","Manjil");
		Manjil.displayname(); 
		
		

	}

}
