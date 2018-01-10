
public class FindNodeinBST {

	public static int isPresent(Node root, int val) {
		// TODO Auto-generated constructor stub
		
		
		
		if(root == null)
			return 0;

		// Base Cases: root is null or key is present at root 
		if ( root.data==val) 
			 return 1;

		// val is greater than root's key 
		if (root.data > val) 
			return 
			  isPresent(root.left, val);

		// val is less than root's key 
		   return
		      isPresent(root.right, val);
	}

}
