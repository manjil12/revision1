
public class Day7methood {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int a = 20;
		int b = 12;
		
		System.out.println(a+b);
		System.out.println(a-b);
	    System.out.println(a*b);
	    System.out.println(a/b);
	    System.out.println(a%b);
	    
	    
	    
	    int m = 500;
	    int n = 200;
	    
	    System.out.println(m+n);	
	    System.out.println(m-n);
	    System.out.println(m*n);
	    System.out.println(m/n);
	    System.out.println(m%n);
	    
	    
	    //12 Pairs we have to 60 lines
	    //DRY (DO NOT REPEAT) yourself
	    //solution-functions
	    
	    
	    //function without parameter and without return type
	   
	    DivisionA();
	    DivisionA();
	    DivisionA();
	    DivisionA();
	    
	    
	    //function with parameter and without return type
	    DivisionB(20,5);
	    DivisionB(10,2);
	    DivisionB(18,3);
	    
	    //function with parameter and with return type
	    int v = DivisionC(33,3);
	    System.out.println(v);
	    System.out.println(v+v);
	    System.out.println(v*v);
	    System.out.println(v-7);
	    System.out.println(v*0.25);
	    
	    //revision function without paramater and without return type
	    MultiplyA();
	    MultiplyA();
	    MultiplyA();
	    MultiplyA();
	    
	    //function with paramater and without return type
	    MultiplyB(2,3);
	    MultiplyB(3,2);
	    MultiplyB(4,2);
	    MultiplyB(5,2);
	    
	    
	    //function with parameter and with return type
	    int e = MultiplyC(3,5);
	    System.out.println(e);
	    System.out.println(e+e);
	    System.out.println(e-e);
	    System.out.println(e/e);
	    System.out.println(e%e);
	    
	    
	    
	    String f = MultiplyD(4,6);
	    System.out.println(f);
	    System.out.println(f+f); 
	    
	    
	    
	    
	    
	}
	    
	    
	    
	    
	    
	    //three basic types of functions
	    //function without parameter and without return type
	    public static void DivisionA() {
	    System.out.println(12/3);	
	    }
	
	    //function with parameter and without return type
	    public static void DivisionB (int d, int e) {
	    	System.out.println(d/e);
	    }
	    
	    //function with parameter and with return type
	    public static int DivisionC(int d, int e) {
	    	return d/e; // 33/3
	    }
	    
	    
	    //revision function without paramater and without return type
	    public static void MultiplyA() {
	    	System.out.println(2*2);
	    }
	    
	    //function with parameter and without return type
	    public static void MultiplyB(int a, int b) {
	    	System.out.println(a*b);
	    }
	    
	    //function with parameter and with return type
	    public static int MultiplyC(int a,int b) {
	    	return a*b;
	    	
	    }
	    
	    
	    public static String MultiplyD(int a, int b) {
	    	System.out.println(a*b);
	    	return "Good Bye";
	    }
	    
	    
	    
	    
	    
	    
	
	}

