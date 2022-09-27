
public class newprogram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//program 1
		 //join two String
		String firstname = "Manish";
		String lastname = "Adhikari";
		System.out.println(firstname.concat(lastname));
		System.out.println(lastname.concat(firstname));
		
		
		//program 2
		//compare two String in java
		
		String first = "I am from Nepal";
		String second = "I am from India";
		String thrid = "I am from Nepal";
		
		boolean match = first.equals(second);
		System.out.println(match);
		boolean match1 = first.equals(thrid);
		System.out.println(match1);
		boolean match2 = second.equals(thrid);
		System.out.println(match2);
		boolean match3 = thrid.equals(first);
		System.out.println(match3);
		boolean match4 = thrid.equals(second);
		System.out.println(match4);
		
		
		//program 3
		//Escape sequence in String
		
		String quote1 = "the quote says \"learn to be a better person not better at things\" ";
		System.out.println(quote1);
		
		
		//program 4
		
		String city = new String ("jhapa");
		String uppercase = city.toUpperCase();
		System.out.println(uppercase);
		String city1 = "morang";
		String city2 = city1.toUpperCase();
		System.out.println(city2);
		
		//program 5
		
		String quote2 = "i am learning java and selenium";
		boolean found = quote2.contains("ing");
		System.out.println(found);
		boolean found1 = quote2.contains("ting");
		System.out.println(found1);
		
		
		//java is case sensative--meaning java and Java are different String
		
		String vegetables = "potato,tomato,chilly,bringle";
		String vegetable1 = "pumpkin";
		
		if(vegetables.contains(vegetable1)) {
			System.out.println("vegetables is available");
		}
		else {
			System.out.println("vegetables is not available");
			
			//conditional statement
			
			//if (conditon){
			// //statement
			//}
			// else{
			// // statement
			//}
			
			//program6
			
			//join()
			
			String a = "what's up";
			String b = "how you doing";
			String c = "hey";
			
			String d = String.join("-",a,b,c);
			System.out.println(d);
			String e = String.join("",a,c,b);
			System.out.println(e);
			
			//replace
			String f = "i want to go to new york and live in new york";
			String g = f.replace("n", "l");
			System.out.println(g);
			
			//replaceALL
			
			String h = f.replaceAll("new york","los angeles");
			System.out.println(h);
			
			//program 7
			
			String City3 = "Biratnagar";
			int i = City3.indexOf("r");
			System.out.println(i);
			int j = City3.indexOf("-1");
			System.out.println(j);
			
			
			//program 8
			//startWith()
			//endsWith()
			
			String k = "being student is very hard";
			boolean l = k.startsWith("b");
			System.out.println(l);
			boolean m = k.endsWith("d");
			System.out.println(m);
			boolean n = k.endsWith("a");
			System.out.println(n);
			boolean o = k.startsWith("being");
			System.out.println(o);
			
			//program9
			
			//isEmpty
			String p = "";
			boolean q = p.isEmpty();
			System.out.println(q);
			if(q) {
				System.out.println("needs to fill out the space");
			}
			
			
			//program 10
			//trim
			
			String r = " Gaurav "; 
			System.out.println(r.length());
			String s = r.trim();
			System.out.println(s);
			
			
			
		}
	}

}
