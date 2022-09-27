 
class Grandfather {
	String firstname;
	String lastname;
	
	
	//constructor
	Grandfather (String firstname, String lastname){
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public void displayname() {
		System.out.println(this.firstname + " "+this.lastname);
	}
}

class Father extends Grandfather {
	String ffirstname;
	
	
	Father (String firstname, String lastname, String ffirstname){
		super (firstname, lastname);
		this.ffirstname = ffirstname;
	}
	@Override
	public void displayname() {
		System.out.println(this.ffirstname+" "+ this.firstname+" "+ this.lastname);
		
	}
}

class Son extends Father {
	String gfirstname ;
	
	Son (String firstname,String lastname,String ffirstname, String gfirstname){
		super(firstname, ffirstname,lastname);
		this.gfirstname = gfirstname;
	}
		@Override
		public void displayname() {
			System.out.println(this.gfirstname+" "+this.ffirstname+" "+this.lastname);
		}
	}
	

public class InheritanceMultilevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Grandfather manohar = new Grandfather ("monohar","deshpande");
		manohar.displayname();
		
		Father shirish = new Father ("manohar","deshpande","shirish");
		shirish.displayname();
		
		Son chinmey = new Son ("manohar","shirish","deshpande","chinmey");
		chinmey.displayname();
		
		
	}
	

}
