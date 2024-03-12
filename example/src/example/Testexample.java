package example;
import java.sql.*;
public class Testexample {

	public static void main(String args[])
	{
		System.out.println("Result :: "+isPalindrome(121));
	}
	
	    public static boolean isPalindrome(int x) {
	        if(x<0)
	        return false;
	        int num =0;
	        int reserve = x;
	        while(x!=0){
	        	System.out.println("x:: "+x);
	            num=num * 10+(x%10);
	            System.out.println("num:: "+num);
	            x/=10;
	        }
	       System.out.println("num:: "+num);
	       System.out.println("reserve:: "+reserve);
	        if(num == reserve){
	            return true;
	        }
	        else{
	            return false;
	        }
	    }
	

}
