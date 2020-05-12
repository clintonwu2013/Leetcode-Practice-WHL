/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leetcode20200512;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author m2912
 */
public class Leetcode118 {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if(numRows == 0){
            return ans;
        }
        
        List<Integer> prevRow = new ArrayList<>();
        prevRow.add(1);
        ans.add(prevRow);
        for(int i=1; i<numRows; i++){
            List<Integer> nextRow = new ArrayList<>();
            nextRow.add(1);
            for(int j=0; j<prevRow.size()-1; j++){
                nextRow.add(prevRow.get(j)+prevRow.get(j+1));
            }
            nextRow.add(1);
            ans.add(nextRow);
            prevRow = nextRow;
        }
        
        return ans;
    }

    
}
