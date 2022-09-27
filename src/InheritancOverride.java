
class worldbank {
	String country = " Nepal";
	
	public void loan (int x) {
		System.out.println("i am loan method from worldbank");
		
	}
	
	public void save (int x) {
		System.out.println("i am saving from world bank");
		
	}
	
	public void country() {
		System.out.println("country" + this.country);
	}
}
class NRB extends worldbank {
	@Override
	public void loan (int x) {
		System.out.println("i am loan from NRB");
	}
	
	@Override
	public void save (int x) {
		System.out.println("i am saving from NRB");
	}
}
	class BOA extends worldbank{
		@Override
		public void loan (int x) {
			System.out.println("i am loan from BOA");
			
		}
		@Override
		public void save (int x) {
			System.out.println("i am saving from BOA");
		}
		
	}
	
	class NIB extends worldbank {
		@Override
		public void loan (int x) {
			System.out.println("i am loan from NIA");
		}
		@Override
		public void save (int x) {
			System.out.println("i am saving from NIB");
		}
	}
	



public class InheritancOverride {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		NRB nrb = new NRB();
		BOA boa = new BOA();
		NIB nib = new NIB();
		
		nrb.loan(4);
		nrb.save(1);
		boa.loan(5);
		boa.save(2);
		nib.save(2);
		nib.loan(5);
		
		nrb.country();
		boa.country();
		nib.country();

	}

}
