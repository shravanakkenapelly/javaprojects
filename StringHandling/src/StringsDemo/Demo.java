package StringsDemo;

public class Demo {

	public static void main(String[] args) {
		//char[] c= {'a','e','i','o','u'};
	     //byte[] b= {97,101,105,111,117};
         //String s=new String(b);
		  String s="shravan kumar vattimalla";
		  int length=s.length();
		  char[] ch=new char[length];
		  for(int i=0;i<length;i++) {
			  ch[i]=s.charAt(i);
		  }
		  for(char c5:ch) {
			  System.out.println(c5);
		  }
       /*   char[]ch=s.toCharArray();
          for(char c2:ch) {
        	  System.out.println(c2);
          }
          */
         /* for(int i=0;i<ch.length;i++) {
        	  ch[i]=s.charAt(i);
          }
         for(char c1:ch) {
        	 System.out.println(c1);
         }
          */
	   //  System.out.println(s);
	     //String s=new String(b);
	     //System.out.println(s);
		//System.out.println(c);
		//String s=new String(c);
		//System.out.println(s);
		
		

	}

}
