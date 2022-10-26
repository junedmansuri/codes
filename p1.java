import java.util.*;
class p1 {
 
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int t= sc.nextInt();
		  int [] temp= new int[t];
		  for(int i=0;i<t;i++)
			  temp[i]=sc.nextInt();
		  for(int i2=0;i2<t;i2++){
		        int n =temp[i2];
				int [] arr= new int[n];
				for(int i=1;i<=n;i++)arr[i-1]=i;
				int i=0;
				int j=n-1;
				System.out.println(n);
				while(n>0){
				     for(int i1=0;i1<arr.length;i1++)
						 System.out.print(arr[i1]+" ");
					 System.out.println();
					 int tem = arr[i];
					 arr[i]=arr[j];
					 arr[j]=tem;
					 i++;
				 n--;
				}
				
		  }
     }
}


