package SingelNumberII;
import java.util.*;

class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        for(int key:map.keySet()){
            if(map.get(key)==1){
                return key;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Solution s=new Solution();
        int[] nums=new int[]{2,2,3,2};
        System.out.println(s.singleNumber(nums));
    }
}
