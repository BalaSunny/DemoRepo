package JavaPackage;

public class MaxandMinArray {

	public static void main(String[] args) {
       int a[] = {20,60,25,12,19,67,100,10};
       
       int max= a[0];
       int min=a[0];
             
       
       for(int i=0;i<a.length;i++)
       {
    	   
    	  if(a[i]>max)
    	  {
    		  max=a[i];
    		  
    	  }
       }

       System.out.println("Maximum number"+max);
	
	
	for(int i=0;i<a.length;i++)
    {
 	   
 	  if(a[i]<min)
 	  {
 		  min=a[i];
 		  
 	  }
    }

    System.out.println("minimum number"+min);


}
	
}
