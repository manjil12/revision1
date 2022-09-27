
public class Overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Pattern r = new Pattern();
		r.display();
		r.display('#');
	}

}

class Pattern {
	
	public void display() {
		for (int i =0;i<5;i++) {
			System.out.print("*");
		}
	}
	

	public void display(char symbol){
		for (int i=0;i<7;i++) {
			System.out.print(symbol);
		}
	}
}