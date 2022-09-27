

		
		class Person{
			int weight;
			int height;
			int age;
			String country;
			
			
		
			//constructor
			Person(int age,int weight,int height,String country){
				this.age = age;
				this.weight = weight;
				this.height = height;
				this.country = country;
				
			}
			
				public static void talk() { 
					System.out.println("how you doing");
				}
				
				public static void walk () {
					System.out.println("good day");
				}
				
		}
				
					public class Oops2class {

						public static void main(String[] args) {
							// TODO Auto-generated method stub
				
				
							Person ajay = new Person(29,67,24, "Nepal");
							System.out.println(ajay.age);
							System.out.println(ajay.weight);
							System.out.println(ajay.height);
							System.out.println(ajay.country);
							
							
							Person sanjay = new Person (30,82,6,"India");
							System.out.println(sanjay.age);
							System.out.println(sanjay.height);
							System.out.println(sanjay.country);
			
		
						}
		

						}

					
