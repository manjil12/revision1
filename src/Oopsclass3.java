
public class Oopsclass3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bank boa = new Bank ("Manjil Ghimire",123,15000);

System.out.println(boa.accName);
System.out.println(boa.accountNo);
System.out.println(boa.bal);


//deposit amount
int updatedBal = boa.deposit(5000);
System.out.println(boa.bal);

int currentBal2 = boa.deposit(200);
System.out.println(currentBal2);


//withdrawl
int bal = boa.withdrawl(7000);
System.out.println(boa.bal);

//withdrawl more than balance amount
int bal2 = boa.withdrawl(25000);
System.out.println(boa.bal);

int currentBal = boa.withdrawl(3500);
System.out.println(currentBal);


int[]statement = {20000,20200,13800,10300};
System.out.println(statement.length);

	
	}
}
class Bank{
	String accName;
	int accountNo;
	int bal;
	
	Bank(String acname,int actno,int bl){
		this.accName = acname;
		this.accountNo = actno;
		this.bal = bl;
	}
	public int deposit(int amount) {
		this.bal = this.bal+amount;
		System.out.println("Balance Update");
		return this.bal;
	}
		public int withdrawl (int amount) {
			if(this.bal>amount) {
				this.bal = this.bal-amount;
				System.out.println("Balance updated");
				return this.bal;
			}
			else {
				System.out.println("insuffcient bal");
				return this.bal;
			}
		}
}
	
	
	
	
