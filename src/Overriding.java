
class Driving{
	
	public void displayinfo() {
		System.out.println("Driving is fun");
	}
}

class Learningdriving extends Driving {
	
	@Override
	public void displayinfo() {
		System.out.println("Learing driving is a must");
		//super.displayinfo(); (if you want both outcome )
	}
	
}
public class Overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Learningdriving lesson =  new Learningdriving();
		lesson.displayinfo();
}
}