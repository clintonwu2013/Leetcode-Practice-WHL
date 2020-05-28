package javaapplication;

public class RecurrenceRelationTest {

	public static void main(String[] args) {
		double[] ans = new double[51];
		ans[0] = 0.0;
		ans[1] = 0.0;
		ans[2] = 0.0;
		ans[3] = (0.5)*(0.5)*(0.5);
		ans[4] = (0.5)*(0.5)*(0.5)*(0.5);
		ans[5] = (0.5)*(0.5)*(0.5)*(0.5);
		ans[6] = (0.5)*(0.5)*(0.5)*(0.5);
		for(int n =7; n<51; n++) {
			ans[n] = (1-ans[n-4])*(0.5)*(0.5)*(0.5)*(0.5);
		}
		
		//System.out.println("ans[49]="+ans[49]);
		for(int i=0; i<51; i++) {
			System.out.println("ans["+i+"]="+ans[i]);
		}
		  
		System.out.println((0.5)*(0.5)*(0.5)*(0.5)*(1-0.0546875));

	}

}
