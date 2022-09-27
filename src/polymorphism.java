
public class polymorphism {
	
	//overloading-- same methodname, same class, different signature
	//overriding-- same methodname, different class, same signature

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator A = new Calculator();
		int a = A.Addition(4, 4);
		System.out.println(a);
		int b = A.Addition(4, 4, 6);
		System.out.println(b);
		int c = A.Addition(2, 2, 5, 6);
		System.out.println(c);
		Country Nepal = new Country();
		String d = Nepal.cities("kathmandu", " dharan");
		System.out.println(d);
	}

}
class Calculator{
	
	//method A
	public int Addition(int a, int b) {
		return a+b;
	}
		
		//method B
		public int Addition(int a, int b, int c) {
			return a+b+c;
		}
		
		//method C
		public int Addition (int a, int b, int c, int d) {
			return a+b+c+d;
		}
	}
class Country{
	
	
	//methodA
	public String cities (String x, String y) {
		return x+y;
	}
}