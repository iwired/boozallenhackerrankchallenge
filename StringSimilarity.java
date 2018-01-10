package boozallen;

public class StringSimilarity {

	/* * Complete the function below.

	*/ static int stringSimilarity(String[] inputs) { 
		int[] recur = new int[inputs.length]; 
		int count =0; int index = 0; 
		for(int i = 0; i < inputs.length; i ++) { 
			for(int j = 1; j < inputs.length; j++) { 
				if( inputs[i].contentEquals(inputs[j]) )
				{ count++; } 
				recur[index++] = count; }
			}
		int total = 0;
		for(int c : recur) {
			total+=c;
		}
		return total;
	}
	
	public static void main(String args) {
		
	}

}
