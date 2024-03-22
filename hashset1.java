import java.util.*;

public class hashset1 {
//Given an unsorted array of integers nums, return the length of the longest consecutuve elements sequence.
    public static int longest(int[] nums){
        HashSet<Integer> st = new HashSet<>();
        for(int num : nums) st.add(num);
        int maxStreak = 0;
        for (int num : st){
            if(!st.contains(num-1)){
                int currNum = num;
                int currStreak = 1;
                while (st.contains(currNum+1)){
                    currStreak++;
                    currNum++;
                }
                maxStreak = Math.max(maxStreak, currStreak);
            }
        }
        return maxStreak;
    }
    public static void main(String[] args) {
        int[] nums ={100,4,200,1,3,2};
        System.out.println(longest(nums));
    }
}
