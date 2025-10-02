package largestPerimeterTriangle;

import java.util.Arrays;

public class Main {

	static int largestPerimeter(int[] nums) {
		int i,n=nums.length;
		Arrays.sort(nums);
		for(i=0;i<n;i++) {
			if(i+2<n && nums[i]+nums[i+1]>nums[i+2]) {
				if(i+3<n) {
					continue;
				}
				return nums[i]+nums[i+1]+nums[i+2];
			}
		}
		
		return 0;
    }
	
	public static void main(String[] args) {
		int[] e1={2,1,2};
		int[] e2={1,2,1,10};
		
		System.out.println(largestPerimeter(e1));
		System.out.println(largestPerimeter(e2));
	}

}
