
public class array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//when to use array??
		//Datatype [] arrayName = new Datatype [3]
		
		
		//program 1
		String [] names = new String [3];
		//Array stores the value in index
		names[0] = "Manjil";
		names [1] = "Gaurav";
		names [2] = "Mandeep";
		
		
		//Another way to initialize array
		String [] names1 = {"Manjil","Gaurav","Mandeep"};
		
		
		
		
		//program 2
		//Array of integers
		
		int [] numbers = new int [4];
		numbers[0] = 11;
		numbers [1] = 12;
		numbers[2] = 13;
		numbers[3] = 14;
		
		//another way to write out
		int[] numbers1 = {11,12,13,14};
		
		
		//Program 3 
		
		//how to access the element from array
		String []cities = {"hetauda","bharatpur","lalitipur","bhaktapur"};
		System.out.println(cities[0]);
		System.out.println(cities[3]);
		
		//total number of elements in array
		int a = cities.length;
		System.out.println(a);
		System.out.println(cities[cities.length-1]);
		
		
		//program4 (print every element of array)
		
		String[]fruits = {"mangoes","banana","papaya","apple","peach"};
		System.out.println(fruits[3]);
		
		
		for (int i = 0; i<4; i++)
		System.out.println(i);
		
		for (int i = 0;i <fruits.length;i++)
		System.out.println(fruits[i]);
		
		int[]numbers2 = {11,15,19,22,27};
		for (int i = 0;i<numbers.length;i++)
		System.out.println(numbers[i]);
		
		//print all the values of array in reverse
		
		String[]seasons = {"winter","summer","autum","fall","spring"};
		for (int i =seasons.length-1;i>=0;i--) {
			System.out.println(i);
			System.out.println(seasons[i]);
		}
			
			int[]numbers4 = {2,4,6,8,10,23};
			for(int i = numbers4.length-1;i>=0;i--) {
				System.out.println(i);
				System.out.println(numbers4[i]);
			}
				
		//Program6
		//using for each loop
			
			int[]age = {23,25,27};
			for(int ag:age)
			System.out.println(ag);
			
			String[]countries = {"NEPAL","USA","UK","FRANCE"};
			for(String cnt:countries) {
			System.out.println(cnt);
			}
			
			//program7
			int[]numbers5 = {1,2,3,4,5};
			int sum = 0;
			for(int i = 0;i<numbers5.length;i++) {
				System.out.println(numbers5[i]);
				sum = sum+numbers5[i];
			}
		System.out.println(sum);
		
		int[]numbers6 = {4,7,44,56,76};
		int sum1 = 0;
		for(int i=0;i<numbers6.length;i++) {
			System.out.println(numbers6[i]);
			sum = sum+numbers6[i];
		}
		System.out.println(sum);
		
		
		//Program 8 (average of all elements of array)
		
		int[] weight = {24,36,57,68,78};
		int total = 0;
		//sum of all elements/total number of elements
		for (int i = 0;i<weight.length;i++) {
			System.out.println(i);
			System.out.println(weight[i]);
			total = total+weight[i];
		}
		
		System.out.println(total/weight.length);
		
		
		
		
		

	}

}
