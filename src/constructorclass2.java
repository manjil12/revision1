
 class ConstructorS {
	
	



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//what is constructor
		//creating a object for class
		Add a = new Add();
		a.Addition();
 
	}

}

class Add {
	int a = 23;
	int b = 44;
	
	public void Addition() {
		System.out.println(this.a + this.b);
	}
}