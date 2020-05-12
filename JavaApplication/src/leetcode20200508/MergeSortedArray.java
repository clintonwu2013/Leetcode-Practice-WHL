/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode20200508;

/**
 *
 * @author m2912
 */
public class MergeSortedArray {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        for(int i=(m+n-1); i>=0;i--){
            if(m==0 || n==0){
                break;
            }
            if(nums1[m-1]>=nums2[n-1]){
                nums1[i] = nums1[m-1];
                m--;
            }else if(nums2[n-1]>nums1[m-1]){
                nums1[i] = nums2[n-1];
                n--;
            }
        }
        
        if(n>0){
            for(int i=0; i<n; i++){
                nums1[i] = nums2[i];
            }
        }
    }
}
