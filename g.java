import java.util.*;
class g {
       static int gcd(int a,int b){
         if(b==0)
             return a;
         else
             return gcd(b,a%b);
     }
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          System.out.println(gcd(gcd(3,4),5)); 
     }
}
/* // minwindow substring leetcode
class Solution {
    public String minWindow(String s, String t) {
        String ans="";
      HashMap<Character,Integer> h2 = new HashMap();
	  for(int i=0;i<t.length();i++){ 
	        if(h2.containsKey(s.charAt(i))
				h2.put(s.charAt(i),h2.get(s.charAt(i))+1);
			else
				h2.put(s.charAt(i),1);
	   }
     int cout=0;
	 int dcount=t.length();
  HashMap<Character,Integer> h1 = new HashMap();
  int i=-1;
  int j=-1;
  while(true){ 
	  Boolean f1 = false;
	  boolean f2 = false; 
      while(i<s.length() && count<dcount()){ 
	      i++;
		  char c = s.charAt(i);
		  h1.put(c,h1.getOrDefault(ch,0)+1);
		  if(h1.getOrDefault(ch,0)<=h2.getOrDefault(ch,0))
			  count++;
		  f1=true;
	  }
     while(j<i && count==dcount){ 
	  String temp= s.substring(j+1,i+1);
	   if(ans.length()==0 && temp.length()<ans.length())
		   ans=temp;
	   j++;
	   char ch = s.charAt(j);
	   if(h1.get(ch)==1)
		   h1.remove(ch);
	   else{ 
	      h1.put(ch,h1.get(ch)-1);
	   }
	   if(h1.getOrdefault(ch,0)<h2.getOrDefault(ch,0))
		   count--;
	   f2=true;
	 }
	 if(f1 == false && f2==false)
		 break;
  }
		return ans;
    }
}*/