class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int i=0;i<nums1.length;i++)
        {
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    set.add(nums1[i]);
                }
            }
        }
         return set.stream()
                    .mapToInt(Integer::intValue)
                    .toArray();

        // int ans[] = new int[set.size()];
        // int k=0;
        // for(int num:set){
        //     ans[k++]=num;
        // }

        // return ans;
    }
}