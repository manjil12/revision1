
 class ConstructorQ{
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//with no paramater
		
		sub b = new sub();
		
		//with parameter
		multiply c = new multiply(12,5);
		c.multiply();

		
		//overloaded
		Cal x1 = new Cal();
		Cal x2 = new Cal (3);
		Cal x3 = new Cal (3,6);
		x2.greet();
		
	}

}


class sub {
	int a = 13;
	int b = 12;
	 //constructor with no parameter
	
	sub(){
		System.out.println("substraction constructor is called");
	}
	
	public void substraction() {
		System.out.println(this.a - this.a);
	}
}


//constructor with parameter

class multiply {
	int x ;
	int y ;
	
	multiply (int a, int b){
		this.x = 5;
		this.y = 5;
	}
	
	multiply (){
		System.out.println("multiply constructor is called");
		}
	
public void multiply() {
	System.out.println(this.x * this.y);
}
	
}

//overloading the constructor

class Cal {
	
	Cal (){
		System.out.println("Constructor with no parameter is called");
	}
	
	Cal(int x){
		System.out.println("Constructor with one parameter is called");
	}
	
	Cal(int x, int y){
		System.out.println("Constructor with two parameter is called");
	}
	
	public void greet() {
		System.out.println("nice to meet you");
	}
	
	//class fields (property and methods)
	//greet is method
	//preperty
	//constructor we used to set class properties or execute some code at time of object creation
}
