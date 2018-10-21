package br.com;

import br.com.model.BinaryTree;

public class Main {

	public static void main(String args[]) {
		
		BinaryTree root = new BinaryTree(2);
		
		BinaryTree childrenOne = new BinaryTree(6);
		BinaryTree childrenTwo = new BinaryTree(3);
		BinaryTree childrenThree = new BinaryTree(9);
		BinaryTree childrenFour = new BinaryTree(7);
		BinaryTree childrenFive = new BinaryTree(4);
		BinaryTree childrenSix = new BinaryTree(5);
		BinaryTree childrenSeven = new BinaryTree(1);
		BinaryTree childrenEight = new BinaryTree(8);
		BinaryTree childrenNine = new BinaryTree(10);
		BinaryTree childrenTen = new BinaryTree(11);
		BinaryTree childrenEleven = new BinaryTree(12);
		BinaryTree childrenTwelve = new BinaryTree(13);

		root.setLeft(childrenOne);
		root.setRight(childrenTwo);

		childrenOne.setLeft(childrenThree);
		childrenOne.setRight(childrenFour);

		childrenTwo.setLeft(childrenFive);
		childrenTwo.setRight(childrenSix);
		
		childrenThree.setLeft(childrenTen);
		childrenThree.setRight(childrenNine);
		
		childrenFour.setLeft(childrenTwelve);
		childrenFour.setRight(childrenEleven);
		
		childrenFive.setLeft(childrenSeven);
		childrenFive.setRight(childrenEight);
		
//		System.out.println(calcularFilhos(root));

//		System.out.println(calcularFilhos(childrenOne));

		System.out.println(calcularFilhos(childrenTwo));
	}

	public static int calcularFilhos(BinaryTree node) {
		int sum = 0;
		if (node.getLeft() != null) {
			sum += node.getLeft().getValor();
			sum += calcularFilhos(node.getLeft());
		}
		if (node.getRight() != null) {
			sum += node.getRight().getValor();
			sum += calcularFilhos(node.getRight());
		}
		return sum;
	}

}
