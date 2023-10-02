package StringsDemo;

public class AllMethods {
//ALL METHODS IN STRING
	public static void main(String[] args) {
	  	String s="Shravan";
	  	// s.charAt(i)to find character at particular index
	  	char c=s.charAt(5);
	  	//s.length() to find length
	  	System.out.println(s.length());
	  	System.out.println(c);
	  	//substring taken from starting index
	  	System.out.println(s.substring(3));
	  	//substring taken from including starting and excluding last index
	  	System.out.println(s.substring(3,7));
	  	String s2="kumar";
	  	//concat-adding two strings
	  	System.out.println(s.concat(s2));
	  	String result=s+s2;
	  	System.out.println(result);
	  	//searching and matching
	  	System.out.println(s.equals("Shravan"));//true
	  	System.out.println(s.equals("shravan"));//false
	  	System.out.println(s.equalsIgnoreCase("Shravan"));//true
	  	System.out.println(s.contains("a"));//true-it may character or string
	  	System.out.println(s.contains("Shra"));//true
		System.out.println(s.contains("shra"));//false
		System.out.println(s.startsWith("S"));//true
		System.out.println(s.startsWith("h"));//false
		System.out.println(s.endsWith("n"));//true
		System.out.println(s.endsWith("a"));//false
		//toUpperCase() -convert to uppercase
		System.out.println(s.toUpperCase());
		//toLowerCase()-convert to lowercase
		System.out.println(s.toLowerCase());
		//isEmpty-it checks given object is empty or not
		System.out.println(s.isEmpty());//false
		String s3="rajkumar";
		boolean b=s3.isEmpty();
		System.out.println(b);
		System.out.println(s3.isEmpty());//exception araise
		if(!b) {
			System.out.println("true");//if not empty
		}
		else {
	      	System.out.println("false");//if empty
		}
		//trim()-it removes the end spaces
      String s4=" Shravan Akkkenapelli ";
      System.out.println(s4);//before trimming
      System.out.println(s4.trim());//after trimming
      //IndexOf()
      String s5="Viratkohlifatherofpakistan";
      //IndexOf(int char)-it gives IndexOf given first occurance character
      System.out.println(s5.indexOf('a'));
      //lastIndexOf()-it gives last character index
      System.out.println(s5.lastIndexOf('n'));
      //it gives first occurance of character from which you given startin index
      System.out.println(s5.indexOf('a',5));
      //it gives index of last character from last Index which you given
      System.out.println(s5.lastIndexOf('a',23));
      //it gives first character index in substring of first substring
      String s6="india win the cup in india";
      System.out.println(s6.indexOf("india"));
      //it gives first character index in substring of last substring
      System.out.println(s6.lastIndexOf("india"));
      //replace()-it replace old character with new character
      System.out.println(s5.replace('p', 'k'));
      //replaceAll()-it replace old string with new string
      System.out.println(s6.replaceAll("india","BHARAT"));
      //By using regex expressions it replaces
      System.out.println(s6.replaceAll(" ","BHARAT"));
      String s7="i am akkenapelli shravan";
      String[] s8=s7.split("");
     for(String s9:s8) {
    	 System.out.println(s9);
     }
     //It gives the format i.e s.format()-it is like printf
      String st=String.format("shravan is %s","shravan");//it gives string value
      System.out.println(st);
      String st01=String.format("%e",78.98);//it gives scientific notation
      System.out.println(st01);
      String st1=String.format("%f",32.33);//it gives float value
      System.out.println(st1);
      String st3=String.format("%33.12f",789.9); //it gives no of decimals after integer
      System.out.println(st3);
      String st31=String.format("%g",32.33);
      System.out.println(st31);
      String st2=String.format("%d",789);//it gives integer
      System.out.println(st2);
      String st4=String.format("%a",789.9); 
      System.out.println(st4);
      String st5=String.format("%b",null);//it gives true false
      System.out.println(st5);//false
      String st6=String.format("%c",'s');//it gives character
      System.out.println(st6);
      String st61=String.format("%h",879.98);//gives hashcode()
      System.out.println(st61);
      String st611=String.format("%n","shravan kumar");//line seperator
      System.out.println(st611);
      //String joiner
      String sj=String.join("-","i","am","from","india");
      System.out.println(sj);
      String sj1=String.join("-","i am from india","from vattimalla");
      System.out.println(sj1);
      String sj2=String.join("-","15","02","2000");
      System.out.println(sj2);
      
   
    
      
	}

}
