package TwoSumII;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        
        Map<Integer, Integer> map = new HashMap();
        
        for(int i = 0; i < numbers.length; i++) {
            int temp = target - numbers[i];
            if(map.containsKey(target - numbers[i])) {
                res[0] = map.get(temp);
                res[1] = i+1;
            }
            map.put(numbers[i], i+1);
        }
        
        return res;
    }
}
