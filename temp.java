import java.util.*;
class temp {
  static boolean check(String s){
           
			  for(int i=0;i<s.length();i++){
			      char c = (Character.isLowerCase(s.charAt(i)))?Character.toUpperCase(s.charAt(i)):Character.toLowerCase(s.charAt(i));
			          if(!s.contains(Character.toString(c)))
						  return false;
			  }
			  return true;
  
  }
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          String s = sc.nextLine();
		  int n= s.length();
		 
		 int max=-1;
		  String res="";
		for(int i=0;i<n;i++){
		   for(int j=i+1;j<=n;j++){
		      String t= s.substring(i,j);
			  if(check(t) && t.length()>max){
				  res=t;
			    max= t.length();
			  }
		   }
		}
		 System.out.println(res);
     }
	
}


