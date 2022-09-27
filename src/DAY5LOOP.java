
public class DAY5LOOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Loops
		
				// 1) for loop
				// 2) while loop
				// 3) do while loop
				
				
				// for-loop
				// for(intialization ; conditionCheck ; increment/decrement) {
				//   // statements
				//  }
				
				
				//Program 1 (Print " Good Bye" 3 times)
				
				for(int i = 0; i<3; i++) {
					System.out.println("Good Bye");
					
				}
				
				System.out.println("Program ---1b");
				
				for(int i = 1; i<5; i= i+2) {
					System.out.println("Good Bye");
				}
				
				// Program 2
				
				System.out.println("print the number from 2 to 10");
				for(int i = 2; i<=10; i++) {
					System.out.println(i);
				}
				
				
				//Program 3
				System.out.println("table of 3");
				for(int i = 3; i<=30;i=i+3) {
					System.out.println(i);
				}
				
				
				//Program 4
				
				System.out.println("sum of all numbers from 1 to 7");
				
				int sum = 0;
				for(int i = 1; i<=7; i++) {
					System.out.println(i);
					sum = sum + i;
					System.out.println(sum);
				}
				
				//Program 4
				System.out.println("print the value from 4 to 1");
				for(int i = 4; i>=1;i--) {
					System.out.println(i);
				}
				
				//table of 4 (reverse)
				for(int i = 40;i>=4; i = i-4) {
					System.out.println(i);
				}
				
				
				//break statement with for-loop
				
				//Program 5
				System.out.println("for loop with break statement");
				
				for(int i = 1; i<6; i++) {
					if (i==3) {
						break;
					}
					System.out.println(i);
						
				}
				
				for(int i = 1; i<6; i++) {
					System.out.println(i);
					if(i ==4) {
						break;
					}
				}
				
				
				for(int i = 8; i>=0;i--) {
					System.out.println(i);
						if(i == 5) {
							break;
						}
					
				}
				
				
				//Program 6
				System.out.println("continue statement with for loop");
				
				for(int i = 0; i < 6; i++) {
					if(i == 3) {
						continue;
					}
					System.out.println(i);
				}
				
				for(int i = 8; i>=2; i--) {
					if( i== 5) {
						continue;
					}
					System.out.println(i);
				}
				
				
				
				
				// While loop
				
				//intialization
				
				//while(condition) {
				// //statement one
				// //statement two
				// //increment/decrement
				//}
				
				//Program 7 print Good bye 3 times
				int x = 0;
				while(x<3) {
					System.out.println("Good bye");
					x++;
				}
				
				//Program 8  print from 2 to 7
				int y = 2;
				
				while(y<=7) {
					System.out.println(y);
					y++;
				}
				
				
				//Program 9. Table of 6
				int z = 6;
				while(z<=60) {
					System.out.println(z);
					z= z+6;
					
				}
				
				//Program 10  print 4 to 1
				
				int a = 4;
				while(a>=1) {
					System.out.println(a);
					a--;
				}
				
				
				//Program 11
				//While loop with break statement
				
				int a1 = 1;
				while(a1<4) {
					if(a1== 3) {
						break;
						
					}
					System.out.println(a1);
					a1++;
				}
				
				
				int a2 = 8;
				while(a2>=2) {
					System.out.println(a2);
					if(a2 == 4) {
						break;
					}
					a2--;
				}
				
				//Program 12
				
				//Continue with while
				
				//infinite loop
//				
//				int a3 = 0;
//				while(a3<4) {
//					if(a3 == 2) {
//						continue;
//					}
//					System.out.println(a3);
//					a3++;
//				}
				
				
				//Program 13
				
			System.out.println("hello");
				
				int a4 = 5;
				while(a4<15) {
					if(a4 == 8) {
						a4++; 
						continue;
					}
					System.out.println(a4);
					a4++;
					}
				
				
				

	}

}
