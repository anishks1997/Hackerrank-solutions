
// Interview Preparation Kit

// Height of a Binary Tree

// Solving using recursion

import java.util.*;

public class btree_height{

	public static void main(String[] args)
	{
		int data;

		Scanner scan = new Scanner(System.in);

		data = sc.nextInt();

		Node root = null;  // Taking a blank root node at first

		root = Node(root, data);

		int height = calc_height(data);

		System.out.println(height);

		scanner.close();
	}

	public class Node{

		Node left, right;
		int data;

		Node(int data)
		{
			this.data = data;
			left = right = null;
		}
	}

	public static int calc_height(Node root)
	{
		if(root == null)
			return 0;

		int left = calc_height(root.left);

		int right = calc_height(root.right);

		return (Math.max(left, right) + 1);
	}

	public static insert_data(Node root, int data)
	{
		if(root == null)
		{
			return new Node(data);
		}
		else if(data <= root.data)
		{
			Node temp;

			temp = Node(root.left, data);  // We are just initializing an entirely new

			root.left = temp;
		}
		else
		{
			Node temp;

			temp = Node(root.right, data);

			root.right = temp;
		}

		return root;  // The new node becomes the root
	}
}