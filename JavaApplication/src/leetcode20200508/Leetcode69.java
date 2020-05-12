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
public class Leetcode69 {
    public int mySqrt(int x) {
        int left = 1;
        int right = x;
        while(left < right){
            int mid = (right+left)/2;
            if(mid == left){
                break;
            }
            if(mid  == x/mid){
                return mid;
            }
            else if(mid < x/mid){
                left = mid;
                
            }
            else if(mid>x){
                right = mid;
            }
        }
        return left;
    }
    
    
    public int mySqrt2(int x) {
        int left = 1;
        int right = x;
        while(left <= right){
            int m = (left+right)/2;
            if(m>x/m){
                right = m-1;
            }else if(m<x/m){
                left = m+1;
            }else{
                return m;
            }
        }
            
        return right;
    }
}
