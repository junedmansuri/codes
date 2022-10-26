import java.util.*;
class substring {
  static  int min=0;
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
		  int it=0;
         int n = sc.nextInt();
		 int m = sc.nextInt();
		 int [] arr= new int[n];
		 for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		 int time=0;
         int [] ans = new int[n];
         PriorityQueue p = new PriorityQueue(new Comparator(){
		        public int compare(Object o1,Object o2){
				 Integer i1 = (Integer)o1;
				 Integer i2 = (Integer)o2;
				 return i2.compareTo(i1);
				}
		 });
		 for(int i=0;i<n;i++){
		        time+=arr[i];
              if(time<=m){
				  ans[it]=min;
				  it++;
			  }
			  else{
                 int temp = time;
				 int count =0;
				 while(p.size()>0 && time>m){
				  time = time - (int)p.poll();
				   count++;
				 }
				 ans[it++]=min+count;
				 min +=count;
			  }
			//  System.out.println(time);
			  
		      p.add(arr[i]);
		  }
		  for(int i=0;i<n;i++){
		  System.out.print(ans[i]+" ");
		  }
		  }
}
     



