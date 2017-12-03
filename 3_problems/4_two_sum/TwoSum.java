import java.util.*;

public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        int[] response = new int[2];
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        int currentItem;
        int targetItem;
        
        for (int i = 0; i < list.length; i++) {
            currentItem = list[i];
            targetItem = sum - currentItem;
            if (hm.containsKey(targetItem)) {
                response[0] = i;
                response[1] = hm.get(targetItem);
                return response;
            } else {
                hm.put(currentItem, i);
            }
        }
        
        return null;    
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[] {1, 3, 6, 7, 9}, 12);
        if (indices != null) {
            System.out.println(indices[0] + " " + indices[1]);
        } else {
            System.out.println("Not Found");
        }
        
    }
}
