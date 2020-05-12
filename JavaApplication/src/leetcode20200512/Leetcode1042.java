package leetcode20200512;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;


public class Leetcode1042 {
	public int[] gardenNoAdj(int N, int[][] paths) {
		//data form [ [1,2],[2,3] ....]
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		for(int i=0; i<N ;i++) {
			list.add(new ArrayList<Integer>());
		}
		
		
        //collect neighbors
		for(int[] path : paths) {
			list.get(path[0]-1).add(path[1]-1);
			list.get(path[1]-1).add(path[0]-1);
		}
		
		int[] res = new int[N];
		for(int i=0; i< list.size(); i++) {
			//check if the neighbors are colored
			HashSet<Integer> colors = new HashSet<>();
			for(int j=0; j<list.get(i).size(); j++) {
				int neighbor = list.get(i).get(j);
				if(res[neighbor]!=0) {
					colors.add(res[neighbor]);
				}
			}
			
			//color itself
			int color = getAvailColor(colors, N);
			res[i] = color;
		}
        
            	
		return res;
           
        
    }
    
    public int getAvailColor(HashSet<Integer> hs, int N) {
        for(int i=1; i<=N; i++) {
            if(!hs.contains(i)){
                return i;
            }
        }
        return 0;
    }
	
	public static void main(String[] args) {
		Leetcode1042 tmp = new Leetcode1042();
		int N= 3;
		int[][] paths = {{1,2},{2,3},{3,1}};
		tmp.gardenNoAdj(N, paths);
	}
}
