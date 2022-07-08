package JavaPackage;

public class String1 {

	public static void main(java.lang.String[] args) {
		
	     String str = "India is my country"; 
	     String st1 = "India is best";
         char c= str.charAt(2);
         System.out.println(c);
	     //   System.out.println(charRemoveAt(str, 7)); 
       //  System.out.println(str.equals(st1));
        // System.out.println(str.split(st1));
         
         System.out.println(str.intern());
		
		
	}
/*
	  public static String charRemoveAt(String str, int p) {  
          return str.substring(0, p) + str.substring(p + 1);  
       }  */
}
