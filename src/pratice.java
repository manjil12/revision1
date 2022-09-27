
public class pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String name = "Shilu";
		System.out.println(name);
		
		
		int a = 2;
		int b = 4;
		String c = "Good luck";
		System.out.println(a+b+c);
		System.out.println(a+b);
		System.out.println(b+c);
		System.out.println(a+c);
		System.out.println(c+a);
		
		
		String country = "Nepal";
		int a1 = country.length();
		System.out.println(a1);
		int a2 = country.length()-1;
		System.out.println(a2);
		String a3 = country.toUpperCase();
		System.out.println(a3);
		String a4 = a3.toLowerCase();
		System.out.println(a4);
		
		
		String fruit = "banana";
		String a5 = "peach";
		String favorite = a5.concat(fruit);
		System.out.println(favorite);
		String favorite1 = fruit.concat(a5);
		System.out.println(favorite1);
		
		
		String vegetable = "cauliflower";
		String a6 = "i love";
		
		String favorite2 = vegetable.concat(a6);
		System.out.println(favorite2);
		String favorite3 = a6.toUpperCase();
		System.out.println(favorite3);
		int number = vegetable.length();
		System.out.println(number);
		int favorite4 = vegetable.toLowerCase().toUpperCase().length();
		System.out.println(favorite4);
		
		//equal
		String first = "russia";
		String second = "russia";
		boolean favorite5 = first.equals(second);
		System.out.println(favorite5);
		boolean favorite6 = first.equals(vegetable);
		System.out.println(favorite6);
		
		//substring
		String country2 = "India";
		String country3 = country2.substring(2,4 );
		System.out.println(country3); 
				
		
		//join
	String str1 = "i love";
	String str2 = "eating";
	String str3 = "fast food";
	String fav = String.join(" ",str1,str2,str3);
	System.out.println(fav);
	String str4 = "manjil";
	String str5 = "gmail.com";
	String email = String.join("@",str4,str5);
	System.out.println(email);
	
	//replace 
	String str6 = "i want to go to LA";
	String result1 = str6.replace("LA", "NEW YORK");
	System.out.println(result1);
	
	String result2 = str6.replace("a", "c");
	System.out.println(result2);
	String result3 = str6.replaceAll("want to go to LA","must go to NEW YORK");
	System.out.println(result3);
	String str7 = "i love living in bay area but bay area is very expensive";
	String result4 = str7.replaceFirst("bay area","San francisco");
	System.out.println(result4);
	
	String str8 = "Kathmandu";
	char result5 = str8.charAt(0);
	System.out.println(result5);
	
	
	//indexof
	int result6 = str6.indexOf("t",2);
	System.out.println(result6);
	
	//trim
	String str10 = "Kathmandu";
	String result9 = str10.trim();
	System.out.println(result9);
	
	//Split
	String str12 = "i-love-my-country";
	String[] result11 = str12.split("-");
	System.out.println(result11[0]);
	System.out.println(result11[2]);
	
	
	

		
		
		
		
	}

}

