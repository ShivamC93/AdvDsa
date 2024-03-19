import java.util.*;

public class hashmap2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,1,3,4,2,5,1,2,3,4,5,7};
        Map<Integer, Integer> freq = new HashMap<>();
        for(int el: arr){
            if(!freq.containsKey(el)){
                freq.put(el, 1);
            } else{
                freq.put(el, freq.get(el)+1);
            }
        }
        System.out.println("Frequency Map");
        System.out.println(freq.entrySet());
        int mxFreq = 0, ansKey = -1;
        for (var key : freq.keySet()){
            if(freq.get(key)> mxFreq){
                mxFreq = freq.get(key);
                ansKey = key;
            }
        }
        System.out.printf("%d has max frequency and it occurs %d times", ansKey);
    }
}
