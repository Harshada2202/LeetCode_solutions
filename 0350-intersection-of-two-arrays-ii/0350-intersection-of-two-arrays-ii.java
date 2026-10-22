class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {

        int i=0;
        int j=0;
        int k=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]<nums2[j])
                i++;
            else if(nums1[i]>nums2[j])
                j++;
            else{
                nums1[k++]=nums1[i++];
                j++;
            }
        }
        return Arrays.copyOfRange(nums1,0,k);
    //Optimal Solution
    //     HashMap<Integer,Integer> map = new HashMap<>();
        
    //    for(int num:nums1){
    //        map.put(num,map.getOrDefault(num,0)+1);
    //     }

    //     ArrayList<Integer> result = new ArrayList<>();
    //     for (int num : nums2) {
    //         if (map.getOrDefault(num,0)>0) {
    //                 result.add(num);
    //                 map.put(num,map.get(num)-1);
    //         }
    //     }
    //     int ans[]=new int[result.size()];
    //     for (int i = 0; i < result.size(); i++) {
    //         ans[i]=result.get(i);
    //     }
    //     return ans;

    }
}