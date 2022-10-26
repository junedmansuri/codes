import java.util.*;
class sort_by_feq {
 
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
		  int [] feq= new int[200];
		  char min='z';
		  char max ='a';
		
		    for(int i=feq.length-1;i>=0;i--){feq[i]=0;}
		  for(int i=0;i<s.length();i++){
		      feq[s.charAt(i)]++;
			  System.out.println((int)s.charAt(i));
		  }
		  Arrays.sort(feq);
		  String res="";
		  for(int i=feq.length-1;i>=0;i--){
		         if(feq[i]!=0){
				 res =res+(char)(i);
				 System.out.println(i);
				 feq[i]=0;
				 }
		  }
		  System.out.println(res);
     }
}


