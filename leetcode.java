/*class Solution {  
	String[] s= null;
    Map<Character,Integer> h = new HashMap();
     int get(String temp){
        for(int i=0;i<temp.length();i++){
             if(h.contains(temp.charAt(i))
                return 0;
			h.put(temp.charAt(i),h.getOrDefault(temp.charAt(i),0)+1);
		}
		return 1;
   }
    int solve(int n,int curlen,int maxlen){
       if(n<0)
		   return Math.max(curlen,maxlen);
       
	   int flag = get(s[n]);
	   int o1 =0;
	   if(flag==1){  
	      o1 = solve(n-1,s[n].length+curlength,maxlength);
	   }
	   int o2 =solve(n-1,curlength,maxlength);
     return MAth.max(o1,o2);
	}
    public int maxLength(List<String> arr) {
        int i=0;
		s = new String[arr.size()];
		for(String ss:arr)
		    s[i++]= ss;
           return solve();
    }
}

*/
/*
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] arr= new int[nums1.length+nums2.length];
        int n = nums1.length+nums2.length;
		int j=0;
		int k=0;
		for(int i=0;i<n;i++){ 
		        if(j<nums1.length && k<nums2.length && nums1[j]<nums2[k]){ 
				     arr[i]=nums[j++];
				}
				if(j<nums1.length && k<nums2.length && nums2[k]<nums1[j])
		             arr[i]=nums2[k++];
				else if(j<nums1.length && k<nums2.length && nums1[j]==nums2[k]){ 
				 arr[i++]=nums1[j];
				 arr[i]=nums2[k];
				}
				else{ 
				      if(j<nums1.length && k>=nums2.lenth)
						  arr[i]=nums1[j++];
					  if(k<nums2.length && j>=nums1.length)
						  arr[i]= nums2[k++];
				
				}
		}
		int mid = n/2;
       if(n%2==0)
		   return (double)((arr[mid]+arr[mid-1])/2);
      else
		  return (double)arr[mid];
	}
}*/
import java.util.*;
public class leetcode {
    static int n=0;
    static int k1=0;
    static int[] arr = null;
    static int solve(int i,int j,int k){
        if(i>=n || j>=n || k>=n)
           return 0;
        if(Math.abs(arr[i]-arr[j])<=k1 && Math.abs(arr[j]-arr[k])<=k1 && Math.abs(arr[k]-arr[i])<=k1){
		   return 1;
        }else{
     int o1 = solve(i,j,k+1);
     int o2  =solve(i,j+1,k);
     int o3 = solve(i+1,j,k);
     return o1+o2+o3;
		}
    }
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
          n = sc.nextInt();
          k1 = sc.nextInt();
          arr= new int[n];
          for(int i=0;i<n;i++)
              arr[i]=sc.nextInt();
            int ans = solve(0,1,2);
           System.out.println(ans);
    }
}