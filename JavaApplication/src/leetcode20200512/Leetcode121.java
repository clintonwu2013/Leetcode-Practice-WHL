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
public class Leetcode121 {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        
        for(int i=0; i<prices.length; i++){
            if(prices[i]< minPrice){
                minPrice = prices[i];
            }else if( prices[i] - minPrice > maxProfit){
                maxProfit = prices[i] - minPrice;
            }
        }
       return maxProfit;
    }
}

  