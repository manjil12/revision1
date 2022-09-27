
public class Day3ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Numberoftickets----<= 5---- 5%
		//Numberoftickets----> 5 && Numberoftickets <=10---- 10%
		//Numberoftickets >10---- 30%
		//if(condition) {
		//
		//}
		
		//Program 1
		int a = 10;
		if (a>= 10) {
			System.out.println("A is 10");
		}
		
		//Program2
		int b = -90;
		if(b>0) {
			System.out.println("Number is positive");
		}
		else {
			System.out.println("Number is negative");
		}
		
		//Program3 
		if(b>0)
			System.out.println("number is positive");
		System.out.println("number is negative");
		
		//Program4 (to check the greater number)
		int x = 12;
		int y = 25;
		if(x>y) {
			System.out.println("x is greater");
		}
		else {
			System.out.println("y is greater");
		}
		
		//Program 5
		//numberofticket >0 && numberofticket <=5----- 5% discount
		//numberofticket>5------ 10% discount
		//numberofticket> 10------ 30% discount
		
		
		int numberofticket =13;
		if(numberofticket > 0 && numberofticket <= 5) {
			System.out.println("5% discount");
		}
		if(numberofticket>5 && numberofticket <= 10) {
			System.out.println("10% discount");
		}
		if(numberofticket>12) {
			System.out.println("30% discount");
		}
		
		
		//Program6
		
		numberofticket = -10;
		
		if(numberofticket>0 && numberofticket<=5) {
			System.out.println("5% discount");
		}
		else if(numberofticket>5 && numberofticket <= 10) {
			System.out.println("10% discount");
		}
		else if(numberofticket>10) {
			System.out.println("30% discount");
		}
		else {
			System.out.println("incorrect input");
		}
		
		//Program7
		
		//if percent is above 90--- A grade
		//if percent is above 80--- B grade
		//if percent is above 60--- C grade
		
		int marks = 65;
		//if(marks>90){
		System.out.println("A grade");
	//}
	if(marks>80) {
		System.out.println("B grade");
	}
	if (marks>60) {
		System.out.println("C grade");
	}
		
	
	if(marks>90) {
		System.out.println("A grade");
	}
	else if(marks>80) {
		System.out.println("B grade");
	}
	else if(marks>60) {
		System.out.println("C grade");
	}
	else {
		System.out.println("Fail");
	}
	
	
	//Program8
	
	int M = 100;
	int N = 250;
	int O = 500;
	
	if(M > N) {//M is greater
		System.out.println("M is greater");
	
		if(M > 0) {
			System.out.println("M is greater");
		}
		else {
			System.out.println("O is greater");
	 	}
		
	}
	else {
		if(N > O) {
			System.out.println("N is greater");
		}
		else {
			System.out.println("O is greater");
		}
	}
	
	
	
	//Program 9
	
	M = 100;
	N = 200;
	O = 400;
	 
	 if(M>N && M>0) {
		 System.out.println("M is greater");
		 
		
	 }
	 else if (N>M && N>0) {
		 System.out.println("N is greater");
		 
	 }
	 else {
		 System.out.println("O is greater");
	 }
	 
	 
	 

	}

}
