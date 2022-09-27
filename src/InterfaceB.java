
public interface InterfaceB {
	void getcolor (String color);
	void modelnumber (int number);
}
 interface B2 extends InterfaceB{
	 void getbrandname (String name);
 }
 
 class Vehicleinfo implements InterfaceB,B2{

	@Override
	public void getbrandname(String name) {
		// TODO Auto-generated method stub
		System.out.println("brand name: "+ name);
		
	}

	@Override
	public void getcolor(String color) {
		// TODO Auto-generated method stub
	System.out.println("color :"+ color);	
	}

	@Override
	public void modelnumber(int number) {
		// TODO Auto-generated method stub
		System.out.println("modelnumber :"+ number);
	}
	 
 }