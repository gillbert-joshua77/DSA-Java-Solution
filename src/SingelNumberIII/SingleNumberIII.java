package SingelNumberIII;
import java.util.*;

class Solution {
    public int[] singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int[] ans = new int[2];
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int index = 0;
        for(int key:map.keySet()){
            if(map.get(key)==1){
                ans[index] = key;
                index++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums=new int[]{1,2,1,3,2,5};
        int[] as=s.singleNumber(nums);
        System.out.println(Arrays.toString(as));
    }
}