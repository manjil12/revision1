
public class Day1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.out.println("hello");

//Arthmetic Operators
//+- addition 
//-- subtraction
//*- multiplication
// /- Division
// %- Modulo-- remainder after division
 int a = 15;
 int b = 3;
 
 System.out.println(a+b);//addition
 System.out.println(a-b);//subtraction
 System.out.println(a*b);//multiplication
 System.out.println(a/b);//division
 System.out.println(a%b);//modulo
 
 System.out.println(9/4);
 System.out.println(9%4);//generally used with interger
 System.out.println(9.0/4.0);
 
 //interger ----9,1,-1
 //float number --9.0,5.5
 
 //assignment operators in Java
 
 int x = 10;
 //+=
 x = x+ 1;
 System.out.println(x);
 x+= 1;//x=x+ 1
 System.out.println(x);
 
 //x = x+1--- x + 1
 
 int y = 90;
 System.out.println(y);
 y = y + 5;
 System.out.println(y);
 y += 2;//y = y + 2;
 System.out.println(y);
 
 //y -= 1 ---- y = y-1
 y -= 1;
 System.out.println(y);
 
 //y* = 2 // y= y*2
 y *= 2;
 System.out.println(y);
 
 //y /= 2; --y = y/2
 y/= 2;
 System.out.println(y);
 //y %= 5----y = y % 5
 y %= 5;
 System.out.println(y);
 
 
 // Java assignment operators
 //=  int a = 10
 //+= a += 1 == a= a + 1
 //-= a- = 1 == a = a - 1
 //*= a* = 1 == a = a * 1
 // /= a/ =1 == a = a/1
 // %= a % =1 == a = a % 1
 
 //Java Relational Operators
 
 //==, !=, <, >, <=, >=
 //3<8-- output will be always boolean value (true or false)
 
 int s = 100;
 int t = 50;
 
 System.out.println(s>t);
 System.out.println(t<s);
 System.out.println(t==s);
 System.out.println(6==6);
 System.out.println(5>=6);
 System.out.println(5>=4);// is 5 greater than or equal to 4
 System.out.println(5>=6);
 System.out.println(5>=5);
 System.out.println(6<=7);
 System.out.println(6<=6);
 System.out.println(6<=5);
 System.out.println(7!=5);
 System.out.println(6!=6);
 
 //Logical Operator
 
 //AND operator --&&
 
 // True  True---- True
 System.out.println(6>=5 && 5==5);
 //False True --- False
 System.out.println(5!=5 && 7==7);
 //True  False --- False
 System.out.println(6>3 && 6<5);
 // False  False --- False
 System.out.println(5>6 && 8>9);
 
 //OR --||
 // True  True ---- True
 System.out.println(5==5|| 6 !=7);
 // False True --- True
 System.out.println(7!=7 || 8>6);
 // True False ---True
 System.out.println(9>6 || 7<=2);
 //False  False --- False
 System.out.println(8!=8 || 10>12);
 
 //NOT--!
 //True --- False
 System.out.println(!(8==8));
 //False --- True
 System.out.println(!(10<5));
 
 //Unary Operator
 
 //--
 
 int numberone = 40;
 numberone = numberone + 1;
 System.out.println(numberone);
 
 //Second
 numberone += 1;
 System.out.println(numberone);
 
 //++
 numberone++;
 System.out.println(numberone);
 
 //--
 int numbertwo = 50;
 numbertwo= numbertwo -1;
 System.out.println(numbertwo);
 
 //second
 numbertwo-= 1;
 System.out.println(numbertwo);
 
 //third
 numbertwo--;
 System.out.println(numbertwo);
 
 
  
 
 
 
 
 
 






 
		 
		
		 
		 
		 
		 
		 
		
 
	}

}
