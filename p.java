import java.util.*;
class graph
{
   HashMap<String,ArrayList> h = new HashMap();
   void addedge(String a,String b,boolean con){  
       
		 if(h.containsKey(a)){  
		     h.get(a).add(b);
		 }
		 else{  ArrayList<String> al = new ArrayList();
		 al.add(b);
		  h.put(a,al);
		 }
		 if(con){ 
		    	 if(h.containsKey(b)){  
		     h.get(b).add(a);
			 }
			 else{ 
				 ArrayList<String> al = new ArrayList();
			 al.add(a);
			  h.put(b,al);
			 }
		 }
   }
   void print(){ 
        for(String x:h.keySet()){ 
			System.out.print(x+" --> ");
		      System.out.println(h.get(x));
			   System.out.println();
		}
   }
   void bfs(String src){ 
       HashSet visited = new HashSet();
	   PriorityQueue<String> p = new PriorityQueue();
	   p.add(src);
	   while(p.size()!=0){ 
		   String temp =p.poll();
		    System.out.print(temp+" ");
			visited.add(temp);
			for(Object o:h.get(temp)){ 
                 String s = (String)o;
				 if(!visited.contains(s)){
					 p.add(s);
				 visited.add(s);
			   }
			}
	   }
   }
   void dfs(String scr,HashSet hs){ 
        System.out.print(scr+" ");
		hs.add(scr);
		for(Object x:h.get(scr)){ 
		 String s = (String)x;
          if(!hs.contains(s))
			  dfs(s,hs);
		}
   }
   int spAlgo(String src,String node){ 
         int distance=0;
        HashMap<String,Integer> visited = new HashMap();
	   PriorityQueue<String> p = new PriorityQueue();
	   p.add(src);
	   visited.put(src,0);
	   while(p.size()!=0){ 
		   String temp =p.poll();
			for(Object o:h.get(temp)){ 
                 String s = (String)o;
				 if(!visited.containsKey(s)){
					 p.add(s);
				     visited.put(s,visited.get(temp)+1);
			   }
			}
	   }  
	  return visited.get(node);
   }
}
class p{
 
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
          int m= sc.nextInt();
		  sc.nextLine();
		  graph g= new graph();
          for(int i=0;i<m;i++){ 
		     String a,b;
			 a=sc.next();
			 b=sc.next();
			 g.addedge(a,b,true);
		  }
          g.print();
		  g.bfs("b");
		  System.out.println();
		  //g.dfs("5",new HashSet());
		  System.out.println(g.spAlgo("a","d"));
     }
}
/*
5 6
a b
a c
c d
b d
b c
c e
--------
6 7
0 1
0 3
1 3
1 2
3 2
3 4
4 5
*/
//leetcode sol 4
/*
class Solution {
public:
    long long countSubarrays(vector<int>& nums, int minK, int maxK) {
        long long ans = 0; 
        int ii = -1, imin = -1, imax = -1; 
        for (int i = 0; i < nums.size(); ++i) {
            if (minK <= nums[i] && nums[i] <= maxK) {
                if (nums[i] == minK) imin = i; 
                if (nums[i] == maxK) imax = i; 
                if (min(imin, imax) >= ii) ans += min(imin, imax) - ii; 
            } else ii = i; 
        }
        return ans; 
    */