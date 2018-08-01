
// Interview Preparation Kit

// Lowest Common Ancestor

import java.util.*;

public class btree_common_ancestor{

	public static void main(String[] args)
	{
		int data;

		Scanner scan = new Scanner(System.in);

		data = scan.nextInt();

		Node root = null;

		int v1 = scan.nextInt();

		int v2 = scan.nextInt();

		Node answer = common_ancestor(root, v1, v2);

		System.out.println(answer.data);
	}

	class Node{

		int data;
		Node right, left;

		Node(int data)
		{
			this.data = data;

			left = right = null;
		}
	}

	// Can we compare with the parent node value and go down ?

	public static Node common_ancestor(Node root, int v1, int v2)
	{
		if(root == null)
		{
			return null;
		}

		if(root.data > v1 && root.data > v2)
		{
			return common_ancestor(root.left, v1, v2);
		}

		if(root.data < v1 && root.data < v2)
		{
			return common_ancestor(root.right, v1, v2);
		}

		return root;
	}
}