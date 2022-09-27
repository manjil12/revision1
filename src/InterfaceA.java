
public interface InterfaceA {
	void getname (String name);
}

interface A2{
	void getage (int age);
}
interface A3{
	void getcountry (String countty);
	}

class Access implements InterfaceA, A2,A3{


	@Override
	public void getcountry(String countty) {
		// TODO Auto-generated method stub
		System.out.println("country: "+countty);
		
		
	}

	@Override
	public void getage(int age) {
		// TODO Auto-generated method stub
		System.out.println("age :"+ age);
	}

	@Override
	public void getname(String name) {
		// TODO Auto-generated method stub
		System.out.println("name :"+ name);
	}
	
}
