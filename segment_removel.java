import java.util.*;
class segment_removel{
 
   public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
          int n=sc.nextInt();
		  int [] arr= new int[n];
		  for(int i=0;i<n;i++)arr[i]=sc.nextInt();
		  int i1= 0;
		  int j=0;
		  int opreation=0;
		  for(int i=0;i<n;i++){
		            while(j<n && arr[i1]==arr[j]){
					   j++;
					}
					i1=j;
					opreation++;
				
		  }
		  System.out.println(opreation);
     }
}


