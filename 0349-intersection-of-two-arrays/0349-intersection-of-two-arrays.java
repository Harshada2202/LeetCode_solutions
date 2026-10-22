class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        //LinkedHashSet<Integer> set = new LinkedHashSet<>();
        // for(int i=0;i<nums1.length;i++)
        // {
        //     for(int j=0;j<nums2.length;j++){
        //         if(nums1[i]==nums2[j]){
        //             set.add(nums1[i]);
        //         }
        //     }
        // }
        //  return set.stream()
        //             .mapToInt(Integer::intValue)
        //             .toArray();

        // int ans[] = new int[set.size()];
        // int k=0;
        // for(int num:set){
        //     ans[k++]=num;
        // }

        // return ans;

        HashSet<Integer> set = new HashSet<>();
        HashSet<Integer> intersect = new HashSet<>();

        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }

        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]))
                intersect.add(nums2[i]);
        }

        int ans[] = new int[intersect.size()];
        int k=0;
        for(int num:intersect){
            ans[k++]=num;
        }

        return ans;
    }
}