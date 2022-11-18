import java.util.*;
public class FindLongestSubstring{
    public static int findLongestSubstring(String inputString) {
        int start=0, maxlength=0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int end=0; end<inputString.length(); end++)
        {
            map.put(inputString.charAt(end), map.getOrDefault(inputString.charAt(end),0)+1);
            
            while(map.get(inputString.charAt(end))>1){
                map.put(inputString.charAt(start), map.get(inputString.charAt(start))-1);
                start++;
            }

            if (maxlength < end-start+1)
            {
                maxlength= end-start+1;
            }
        }
        return maxlength;
    }
}