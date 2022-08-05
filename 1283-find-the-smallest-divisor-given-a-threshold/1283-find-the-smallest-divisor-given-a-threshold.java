class Solution{
    public int smallestDivisor(int[] nums, int threshold){
        int lo = 1, hi = 1000000;

        while (lo < hi){
            int mid = (lo + hi) >> 1;
            int result = cal(nums, mid);
            
            if(result > threshold)
                lo = mid + 1;
            else
                hi = mid;
        }
        return lo;
    }
    
    private int cal(int[] nums, int div){
        int sum = 0;
        for(int n : nums){
            sum += Math.ceil((double)n / (double)div);  // 向上取整
            //if(n % div != 0) sum += 1;
        }
        return (int)sum;
    }
}