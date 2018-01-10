
public class MergeStrings {

		/* Complete the function below. */

		static String mergeStrings(String a, String b) { 
			String m = "";

		int index_a = 0, index_b = 0; while (index_a != a.length() || index_b != b.length()) { 
			
			if (index_a < a.length()) m += a.charAt(index_a++);
			  if (index_b < b.length())
				m += b.charAt(index_b++);

		}

		System.out.println(m); 
		return m;
		}
		public static void main(String args[]) {
			mergeStrings("jiminy", "crickets");
			
		}
	

}
