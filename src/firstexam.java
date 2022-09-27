
public class firstexam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//to find greatest between two number
		int x = 15;
		int y = 20;
		if(x>y) {
			System.out.println("x is greater than y");
			
		}
		else System.out.println("y is greater than x");
		
		//wirte any 5 methods of string
		
		String name = "Manjil";
		String lastname = "Ghimire";
	
		String a = name.toUpperCase();
		System.out.println(a);
		String b = lastname.toLowerCase();
		System.out.println(b);
		int c = name.length();
		System.out.println(c);
		String d = name.concat(lastname);
		System.out.println(d);
		String e = lastname.replace(name, lastname);
		System.out.println(e);
		
		//define class with constructor
		Addition sum = new Addition();
		sum.Addition();
		
		//define a class with inheritance
		 
			//Grandmother mitha = new Grandmother ("mitha","ghimire");
			//mitha.displayname();
			
	
		
		//loop with while and for loop
			for (int i = 1; i<10;i++) {
				
				if (i==5);{
					break;
				}
				//.out.println(i);
			}
		
		//give example for overloading and overriding
			
		Calculator A = new Calculator();
		int m = A.Addition(2, 2);
		System.out.println(m);
		int n = A.Addition(2, 3, 6);
		System.out.println(n);
		
		
	}
	

}

class Addition{
	int c = 4;
	int d = 5;
	
	public void Addition (){
		System.out.println(this.c+this.d);}
	
	class Grandmother{
		String Firstname;
		String Lastname;
		
		Grandmother(String firstname,String lastname){
			this.Firstname = firstname;
			this.Lastname = lastname;
		}
			public void displayname () {
				System.out.println(this.Firstname+" "+this.Lastname);
			}
			
			class Mother extends Grandmother{
				String ffirstname;
				
				Mother(String firstname, String lastname, String ffirstname){
					super(firstname, lastname);
					this.ffirstname = firstname;  
				}
			}
		
			class Calculator {
				public int addition(int a1, int b1) {
					return a1+b1;
				}
				public int addition (int a1,int b1,int c1) {
					return a1+b1+c1;
				}
			}
	}
	}
	
