class Solution {
    int solve(int i,int[] arr){
	     if(i==arr.length)
			 return 0;
		 int sum = solve(i+2,arr)+arr[i];
		 return sum;
	}
    public int rob(int[] nums) {
        return solve(0,nums);
    }
}