package JavaPackage;

public class Basic {

	public int primeNumer(int num) {
		
		if(num % 2==0) {
			System.out.println("num is not prime");
			
		}
		else {
			
			System.out.println("num is prime");
		}
		return num;
		
		
	}
	
	
	public static void main(String[] args) {
		
		Basic p = new Basic();
		
		p.primeNumer(14);
		System.out.println("hello");
		System.out.println((5 < 3) || (8 > 5));

	}

}
