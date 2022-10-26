import java.util.*;
class Main {
	static int ans;
  static void gcd(int a,int b){
       if(b==0){
		   ans= a;
		  //return a;
	   }
	   else
	   gcd(b,a%b);
	   
       
  }
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
		  gcd(12,20);
          System.out.println(ans);
     }
}


