
public interface interface1b {
void getArea (int length, int breath);
}

class Rectangle implements interface1b{

	@Override
	public void getArea(int length, int breath) {
		// TODO Auto-generated method stub
		System.out.println("the area of rectangle"+ (length*breath));
	}
}

class Square implements interface1b{

	@Override
	public void getArea(int length, int breath) {
		// TODO Auto-generated method stub
		System.out.println("the area of square"+ (2*length*length));
	}
	
}