
public interface Interface1a {
	void getFirstName (String name);
	void getLastName (String name);
	void getCity (String name);
	
}
 class Personalinfo implements Interface1a{

	@Override
	public void getFirstName(String name) {
		// TODO Auto-generated method stub
		System.out.println("FirstName:" + name);
		
	}

	@Override
	public void getLastName(String name) {
		// TODO Auto-generated method stub
		System.out.println("LastName:" + name);
	}

	@Override
	public void getCity(String name) {
		// TODO Auto-generated method stub
		System.out.println("City" + name);
	}
	 
 }
