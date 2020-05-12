/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode20200512;



/**
 *
 * @author m2912
 */
public class Leetcode122 {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int i =0;
        int valley = prices[0];
        int peak = prices[0];
        
        while(i < prices.length){
            while(i<prices.length-1 &&(prices[i]>= prices[i+1])){
                i++;
            }
            valley = prices[i];
            while(i<prices.length-1 &&(prices[i]<= prices[i+1])){
                i++;
            }
            peak = prices[i];
            
            maxProfit += peak - valley;
            i++;
        }
        return maxProfit;
    }
}
