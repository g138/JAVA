import java.util.*;
public class MinSubArrayLen{
   public static int minSubArrayLen(int target, int[] arr) {
      // for (int i=0; i<arr.length; i++){
      //    if (arr[i]==target){
      //       return 1;
      //    }
      // }
      int start=0;
      int windowsize=Integer.MAX_VALUE;
      int sum=0;

      for (int end=0; end<arr.length; end++){
         sum= sum + arr[end];

         while(sum>=target){
            if (windowsize>end-start+1){
               windowsize= end-start+1;
            }
            sum= sum-arr[start];
            start++;
         }
      }
      if (windowsize==Integer.MAX_VALUE){
         return 0;
      }
      return windowsize;
   }
}