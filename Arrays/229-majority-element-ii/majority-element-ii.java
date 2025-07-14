class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Integer c1=null,c2=null;
        int count1=0;
        int count2=0;
        for(int i=0;i<nums.length;i++){
            if(c1!=null && nums[i]==c1){
                count1++;
            }
            else if(c2!=null && nums[i]==c2){
                count2++;
            }
            else if(count1==0){
                c1=nums[i];
                count1=1;
            }else if(count2==0){
                c2=nums[i];
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==c1) count1++;
            else if(nums[i]==c2) count2++;
        }
        List<Integer> ans=new ArrayList<>();
        if(count1>nums.length/3) ans.add(c1);
        if(count2>nums.length/3) ans.add(c2);
        return ans;

    }
}