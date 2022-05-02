package com.sumBST;

import com.sumBST.FindSumPair.Node;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = null;

		FindSumPair findSP = new FindSumPair();
		root = findSP.insert(root, 40);
		root = findSP.insert(root, 20);
		root = findSP.insert(root, 60);
		root = findSP.insert(root, 10);
		root = findSP.insert(root, 30);
		root = findSP.insert(root, 50);
		root = findSP.insert(root, 70);

		int sum = 130;
		findSP.findPairWithGivenSum(root, sum);

	}

}
