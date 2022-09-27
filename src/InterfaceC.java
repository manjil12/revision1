
public interface InterfaceC {
	void getarea ();
	
	default void getsides() {
		System.out.println("i can get sides of rectangle");
	}

}

class Rct implements InterfaceC{

	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		int length = 3;
		int breath = 5;
		int area = length*breath;
		System.out.println("the area of rectangle :"+ area);
	}
	
	public void getsides() {
		System.out.println("i have four sides");
	}
}

class SquareC implements InterfaceC {

	@Override
	public void getarea() {
		// TODO Auto-generated method stub
		int length = 3;
		int area = length*length;
		System.out.println("the area of square:" + area);
	}
	
}
