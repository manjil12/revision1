
public class publicstringpratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	//date type
		
		//boolean---it can hold only two values; true or false
		//int ---87,-89,78
		//String ----"manjil","kathmandu"
		//ghimiremanny@gmail.com
		
		//user define data type
		//person-----manjil
		//property-----hegiht, weight,age, color, gender
		//method----talk(),walk(),sleep()
		
		//vehicle----BMW
		//Property----color,model, type, reg no
		//method-----start(),brake(),stop()
		
		
		//Data type----properties and method
		//method- action and return type
		
		
		
		//toupperCase()
		
		String firstname = "manjil"; //object is created
		String upperCaseFirstname = firstname.toUpperCase();
		System.out.println(upperCaseFirstname);
		
		//tolowerCase()
		//action--to convert every character into lowercase
		//return another
		
		String lastname = "ghimire";
		String lowercaselastname = lastname.toLowerCase();
		System.out.println(lowercaselastname);
		
		//length()
		//action- counts number of the character in string
		//return-int
		
		String city = "kathmandu";
		System.out.println(city);
		int a = city.length();
		System.out.println(a+a);
		System.out.println(city.length());
		
		
		String country = "Nepal";
		int b = country.toUpperCase().toLowerCase().length();
		System.out.println(b); 
		
		
	}

}
