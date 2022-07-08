package JavaPackage;

public class palindromeNumber {

	public static void ispalindromeNumber(int num) {
		
		int r=0;
		int sum=0;
		int t;
		
		t=num;
		
		while(num>0) {
			
			r=num%10;
			sum=(sum*10)+r;
			num=num/10;
				
		}
		if(t==sum) {
			
			System.out.println("palindrome number");
		}
		else {
			
			System.out.println("NOT palindrome number");
			
		}
	}
	
	public static  void stringpali()
	{
		String str= "test1234test";
		//String data = str.replaceAll("[^\\d]","");
		String data = str.replaceAll("[^0-9]","[^a-z]");
		System.out.println(data);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringpali();
		ispalindromeNumber(123);

	}

}
