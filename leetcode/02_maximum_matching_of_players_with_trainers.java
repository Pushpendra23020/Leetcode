//maximum matching of players with trainers
class Practise {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int x;
        int[] nums1={1, 3};
        int[] nums2={2};
        int[] nums3=new int[nums1.length+ nums2.length];
         System.arraycopy(nums1 , 0, nums3 , 0 , nums1.length);
        System.arraycopy(nums2, 0, nums3, nums1.length, nums2.length);
        Arrays.sort(nums3);
        if(nums3.length %2==0){
             x= ((nums1.length/2-1)+(nums2.length/2))/2;

        }
        else{
            x=nums3.length/2;
        }

        return x;
        
    }
}


