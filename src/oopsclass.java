
public class oopsclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
			
		//string
		//Array
		//Int
		//Boolean
		//Object
		
		class Person{
			//property and methods
			//fields and methods
			
			//fields
			int weight = 56;
			int height = 5;
			int age = 23;
			
			//methods
			public static void talk() {
				System.out.println("Hello nice to meet you");;
			}
			
			public static void walk() {
				System.out.println("I walk fast");
			}
			
			
			
			
			
		}
		
		
		
		
		Person vj = new Person();
		//accessing the fields
		System.out.println(vj.age);
		System.out.println(vj.weight);
		System.out.println(vj.height);
		
		
		//calling the method on object
		vj.walk();
		vj.talk();
		
		
		//person ==> height, weight,age , method walk(), talk()
		
		
		Person risa = new Person();
		//accessing the field
		System.out.println(risa.height);
		risa.age = 29;
		System.out.println(risa.age);
		 
		
		
		
		
		
	}

}
