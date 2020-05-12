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
public class Leetcode119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        for(int i=0; i<rowIndex; i++){
            ans = generateNext(ans);
        }
        
        return ans;
    }

    private List<Integer> generateNext(List<Integer> ans) {
        List<Integer> nextRow = new ArrayList<>();
        nextRow.add(1);
        for(int i =0; i<ans.size()-1; i++ ){
            nextRow.add(ans.get(i)+ans.get(i+1));
        }
        nextRow.add(1);
        return nextRow;
    }
}
