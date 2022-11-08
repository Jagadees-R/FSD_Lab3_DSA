package com.BSTSumPairNodes.Main;
import java.util.Scanner;
import com.BSTSumPairNodes.process.NodesForSumPair;
import com.BSTSumPairNodes.process.NodesForSumPair.Node;

public class DriverClass 
{
	public static void main(String[] args)
	{
		NodesForSumPair findSumPair = new NodesForSumPair();
		Node root = null;
		root = findSumPair.insert(root, 40);
		root = findSumPair.insert(root, 20);
		root = findSumPair.insert(root, 60);
		root = findSumPair.insert(root, 10);
		root = findSumPair.insert(root, 30);
		root = findSumPair.insert(root, 50);
		root = findSumPair.insert(root, 70);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum you want to find");
		int sum = sc.nextInt();
		findSumPair.findPairWithGivenSum(root, sum);
		sc.close();
	}
}
