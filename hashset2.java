import java.util.*;

public class hashset2 {
    static int maxNumberOnTable(int[] bag){
        HashSet<Integer> table = new HashSet<>();
        int max = 0;
        for(int i=0;i<bag.length;i++){
            int num = bag[i];
            if(table.contains(num)){
                table.remove(num);
            } else{
                table.add(num);
                max = Math.max(max, table.size());
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,1,3,2,3};
        System.out.println(maxNumberOnTable(nums));
    }
}
