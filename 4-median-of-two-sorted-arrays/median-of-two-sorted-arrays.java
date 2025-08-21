class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merged = merge(nums1,nums2);

        int n =merged.length;

        if(n%2==0){
            return (merged[n/2 -1]+merged[n/2])/2.0;
        }
        else{
            return merged[n/2];
        }
    }
    private int[] merge(int[] a , int[]b){
        int [] mix = new int[a.length+b.length];
        
        int i=0;
        int j=0;
        int k=0;

        while(i<a.length && j<b.length){
            if(a[i]<b[j]){
                mix[k]=a[i];
                i++;
            }
            else{
                mix[k]=b[j];
                j++;
            }
            k++;
        }
        while(i<a.length){
            mix[k]=a[i];
            i++;
            k++;
        }
        while(j<b.length){
            mix[k]=b[j];
            j++;
            k++;
        }
        return mix;
    }
}