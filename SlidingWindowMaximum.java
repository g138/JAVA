import java.util.*;
class SlidingWindowMaximum {
	public static ArrayDeque<Integer> findMaxSlidingWindow(List<Integer> nums, int windowSize) {
		ArrayDeque<Integer> result = new ArrayDeque<>();
		int windowStart = 0;
		int maxElement = nums.get(0);


		
		for(int windowEnd = 1; windowEnd < nums.size(); windowEnd++) {
			if(windowSize == 1) {

			} else {
				if(nums.get(windowEnd) > maxElement) {
					maxElement = nums.get(windowEnd);
				}

				if((windowEnd - windowStart + 1) == windowSize) {
					result.add(maxElement);
					maxElement = nums.get(windowEnd);
					windowStart++;
				}
			}
		}
		
		return result;
	}
}