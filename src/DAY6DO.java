
public class DAY6DO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//program 1
		
				int a = 0;
				do {
					System.out.println("hello");
					a++;
				}while(a<5);
					
				
				//Program 2
				
				int[] age = new int[4];
				System.out.println();
				age[0] = 12;
				age[1] = 13;
				age[2] = 14;
				age[3] = 16;
				
				//property------length
				
				System.out.println(age.length);
				System.out.println(age[0]);
				System.out.println(age[1]);
				System.out.println(age[2]);
				System.out.println(age[3]);
				
				//lenght -1 is always the last index
				System.out.println(age[age.length-1]);
				
				
				//Program 3
				int[] birthyear = new int[5];
				birthyear[0] = 1990;
				birthyear[1] = 1991;
				birthyear[2] = 1992;
				birthyear[3] = 1993;
				birthyear[4] = 1994;
				
				// 0     1   2     3    4
				//1990,1991,1992,1993,1994
				
				System.out.println(birthyear[0]);
				System.out.println(birthyear[1]);
				System.out.println(birthyear[2]);
				System.out.println(birthyear[3]);
				System.out.println(birthyear[4]);
				
				System.out.println(birthyear.length);
				System.out.println(birthyear[birthyear.length-1]);
				
				
				//0  1 2 3 4 5 6 7 
				int[]marks = {90,92,93,95,87,88,89,99};
				System.out.println(marks[1]);
				System.out.println(marks[2]);
				System.out.println(marks[3]);
				System.out.println(marks[4]);
				System.out.println(marks[5]);
				System.out.println(marks[6]);
				System.out.println(marks[7]);
				System.out.println(marks.length);
				System.out.println(marks[marks.length-1]);
				
				
				for (int i = 0;i<8;i++) {
					//System.out.println(i);
					System.out.println(marks[i]);
					
				}
				
				
				//Program 4
				// 0   1   2   3    4    
				String[] names = {"manjil","bibek","rohit","vijay","rabindra"};
				
				//print all the element of array using for loop
				
				for(int i = 0;i<names.length;i++) {
					System.out.println(names[i]);
				}
				
				//print all the element of array using while loop
				
				int i1 = 0;
				while(i1<names.length) {
				//System.out.println(i1);
				System.out.println(names[i1]);
				i1++;
				}
				
				//print the element in reverse using for loop
				
				for (int i = names.length-1;i>=0;i--) {
					//System.out.println(i);
					System.out.println(names[i]);
				}
				
				//Print the element in reverse using while loop
				
				int i2 = names.length-1;
				
				while (i2>=0) {
				//System.out.println(i2);
					System.out.println(names[i2]);
					i2--;
				}
				
				
				
				
				
				
		
				
	}

}
