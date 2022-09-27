
public class DAY8Methood {

	private static CharSequence learning;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//type
		//type object----property and method
		//method
		//method-action and return type
		
		
		String name = "Manjil";
		System.out.println(name);
		
		String city = "Kathmandu";
		System.out.println(city);
		
		
		//String + String=====> String
		//String + number=====> String
		//number + String =====> String
		//number + number ======> number
		
		int a = 9;
		int b = 3;
		String c = "Welcome";
		
		System.out.println(a+b+c);
		//number+number+string======>string
		
		System.out.println(b+c);
		//number+string=====> string
		
		System.out.println(a+b);
		//number+number======>number
		
		
		
		String a1 = "5";
		String b1 = "7";
		System.out.println(a1+b1);
		
		
		//Methods
		
		
		String country = "Bhutan";
		int s1 = country.length(); 
		System.out.println(s1);
		
		//toUpperCase()
		String country2 = "Singapore";
				String s2 = country2.toUpperCase();
		System.out.println(s2);
		
		//toLowerCase()
		String s3 = country2.toLowerCase();
		System.out.println(s3);
		System.out.println("welcome to"+ s3);
		
		//concat()
		String fruit = "mango";
		String v = "i want";
		String passion = v.concat(fruit);
		System.out.println(passion);
		
		String s4 = fruit.concat(v);
		System.out.println(s4);
		
		
		//method Chaining
		
		
		String vegetable = "Potato";
		System.out.println(vegetable);
		
		
		String s5 = vegetable.toLowerCase();
		System.out.println(s5);
		
		int s6 = s5.length();
		System.out.println(s6);
		
		int s7 = vegetable.toUpperCase().toLowerCase().length();
		//"POTATO".toLowerCase().length()
		//"potato".length()
		//6
		
		System.out.println(s7);
		
		//equal 
		
		String first = "welcome";
		String second = "welcome";
		boolean result = first.equals(second);
		System.out.println(result);
		
		
		//contains
		String abc = "I am new to java learning";
		boolean result1 = abc.contains(second);
		System.out.println(result1);
		
		
		
		//substring()
		String city3 = "Bhadrapur";
		//city3.substring(startIndex, Endindex(not included))
		
		String result3 = city3.substring(2);
		System.out.println(result3);
		
		
		String result4 = city3.substring(2,5);
		System.out.println(result4);
		
		String result5 = city3.substring(3,7);
		System.out.println(result5);
		
		
		//Join()
		String str1 = "I am";
		String str2 = "praticing";
		String str3 = "javascript";
		
		String result6 = String.join(" ",str1,str2,str3);
		System.out.println(result6);
		
		String aba = "manjil";
		String email = String.join("@",aba,"gmail.com");
		System.out.println(email);
		
		
		//replace()-can work with character also
		
		String str5 = "I am leaving the city";
		String str6 = str5.replace("city", "country");
		System.out.println(str6);
		
		
		String str7 = "I am leaving the city, and city was not fun";
		String str8 = str7.replace("e", "m");
		System.out.println(str8);
		
		//replaceALL()
		String str9 = "I am going to nepal and it is my home country";
		String str10 = str9.replaceAll("nepal","Singapore");
		System.out.println(str10);
		
		//replace first()
		String str11 = "I am having fun doing automation and it is engaging";
		String str12 = str11.replaceFirst("fun","excited");
		System.out.println(str12);
		
		//charAt()
		
		String str13 = "Kathmandu";
		char result11 = str13.charAt(4);
		System.out.println(result11);
		
		//indexOf()
		
		int result16 = str11.indexOf("t", 26);
		System.out.println(result16);
		
		
		//trim()
		String str14 = "Kathmandu";
		System.out.println(str14.length());
		String str15 = str14.trim();
		System.out.println(str15.length());
		
		//Split() 
		
		String str16 = "Manjil- Ghimire-714494330";
		String[]result17 = str16.split("-");
		//Manjil-Ghimire-7144943330 on "-"
		//["Manjil","Ghimire","7144943330"]
		System.out.println(result17[0]);
		System.out.println(result17[1]);
		System.out.println(result17[2]);
		
		
		String[] result18 = "Manjil-Ghimire-7144943330".split("i");
		System.out.println(result18[0]);
		System.out.println(result18[1]);
		//System.out.println(result18[2]);
		
		
		String str18 = "i am new to this coding";
		boolean result19 = str18.startsWith("i am");
		System.out.println(result19);
		
		String str19 = "i am new to this coding";
		boolean result20 = str19.endsWith("coding");
		System.out.println(result20);
		
		
		String str20 = "Jhapa";
		
		// 0 1 2 3 4
		// J h a p a
		 for (int i=0; i<str20.length();i++)
		 {//1 //2 ------//5
			// System.out.println(i); // 0 1 2 3 4 5
		 
		 System.out.println(str20.charAt(i));
	}
		
		 
		 String str21 = "Palpa";
		 String rev = "";
		 
		 //aplap
		 for (int i=0;i<str21.length();i++)
		 {
			 rev = str21.charAt(i)+rev;
			 // p + ""----> p
			 // a +p ----->ap
			 // l +ap----->lap
			 //p + lap---->plap
			 //a +plap----->aplap
		 }
				System.out.println(rev); 
				
				
				String str22 = "Kathmandu";
				String rev2 = "";
				// 0 1 2 3 4 
				// P a l p a
		
		for (int i= 0; i<str22.length();i++)
		//System.out.println(i);
		 rev2 = str22.charAt(i)+rev2;
		System.out.println(rev2);
		
		String str23 = "hari";
		String rev3 = "";
		//0 1 2 3
		//H a r i
		
		
		for (int i=str23.length()-1;i>0;i--)
		{//System.out.println(i);
		//System.out.println(str23.charAt(i))
			rev3 = rev3+str23.charAt(i);
			//"" + i---->i
			//i+ r ----->ir
			//ir + a----->ira
			//ira + h---->irah
		}
			System.out.println(rev3);
		
			String str24 = "good";
			int counter = 0;
			// 0 1 2 3
			// g o o d
		for (int i = 0;i<str24.length();i++) {
			char a5 = str24.charAt(i);
			if (a5 == 'o') {
				counter = counter+1;
			}
		}
		System.out.println(counter);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
