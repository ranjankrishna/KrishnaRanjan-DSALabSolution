package com.greatlearning.driver;

import java.util.ArrayList;
import com.greatlearning.services.FindLongestPath;
import com.greatlearning.services.Node;

public class DriverTreeTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(100);
		root.left = new Node(20);
		root.right = new Node(130);
		root.left.left = new Node(10);
		root.left.right = new Node(50);
		root.left.left.left = new Node(5);
		root.right.left = new Node(110);
		root.right.right = new Node(140);

		ArrayList<Integer> finallist = FindLongestPath.findLongestPath(root);

		for (int i = finallist.size() - 1; i > 0; i--) {
			System.out.print(finallist.get(i) + "->");
		}
		System.out.print(finallist.get(0));
	}

}
