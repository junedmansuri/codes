import java.util.*;
class D_and_B {
        static PriorityQueue p1 = new PriorityQueue();
          static PriorityQueue p2 = new PriorityQueue(new Comparator(){
		        public int compare(Object o1,Object o2){
				 Integer i1 = (Integer)o1;
                  Integer i2 = (Integer)o2;
                        return i2.compareTo(i1);
				}
		  });

    public static int fun1(int max){
	    int temp=(int)p1.peek();
		int count=0;
           while(temp!=max){
		            p1.poll();
					p1.add(temp+1);
					count++;
					temp=(int)p1.peek();
		   }
		   return count;
	 } 
	public static  int fun2(int min){
			int temp=(int)p2.peek();
			int count=0;
			   while(temp!=min){
						p2.poll();
						p2.add(temp-1);
						count++;
						temp=(int)p2.peek();
			   }
			   return count;
		 } 
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n= sc.nextInt();
		  int m = sc.nextInt();
		  int [] arr1= new int[n];
		  int [] arr2= new int[m];
		  int max1=-1;
		  for(int i=0;i<n;i++){
			  arr1[i]=sc.nextInt();
			  p1.add(arr1[i]);
		       if(max1<arr1[i])
				   max1=arr1[i];
		  }
		  int min2=Integer.MAX_VALUE;
		  for(int i=0;i<m;i++){
			   arr2[i]=sc.nextInt();
			   p2.add(arr2[i]);
			   if(min2>arr2[i])
				   min2=arr2[i];
		  }
		  int count=0;
		  if((int)p1.peek()<(int)(p2.peek())){
		         count+=fun1(max1);     
		  }
		  //System.out.println((int)p1.peek()<(int)(p2.peek()));
		   if((int)p1.peek()<(int)(p2.peek())){
				  count+=fun2(min2);
				}
        //ek or con add krna he
        if((int)p1.peek()<(int)(p2.peek())){
		     int t= (int)p1.peek();
			 int t1= (int)p2.peek();
			 int res= t1-t;
			 count= count+(res*n);
		 }
		System.out.println(count);
		//  System.out.println(p1);
		//  System.out.println(p2);
     }
}


