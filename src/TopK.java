import java.util.*;

public class TopK {

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();

        //  2, 3, 6, 1
        //  0 + 1
        //  5
        for(int i =0;i<nums.length-1;i++){
            //  2   = 5 - 3
            int complement = target - nums[i];  // 2
            // complement = 2
            if(seen.containsKey(complement)){
                return new int[] {seen.get(complement), i};
            }
            seen.put(complement, i);  // (2, 0)
        }

        return new int[] {-1, -1};
    }

    public static int[] topKFrequent(int[] nums, int k){
        //  element, count
        Map<Integer, Integer> countMap = new HashMap<>();
        // 2, 4, 6, 2, 3

        for (int num: nums){
            // 2, 3
            // 4, 2
            // 6, 1
            // 3, 1
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(
                Comparator.comparingInt(countMap::get)
        );
        for (int num : countMap.keySet()){
            minHeap.offer(num);
            if (minHeap.size() > k){
                minHeap.poll();
            }
        }

        int[] result = new int[k];
        for(int i = 0; i < k;i++){
            result[i] = minHeap.poll();
        }

        return result;
    }

    static void main(String[] args) {

//        int[] nums = {1,1,1,2,2,3};
//        int k = 2;
//
//
//        int[] result = topKFrequent(nums, k);
//
//        for (int i: result){
//            System.out.println(i);
//        }






    }
}
