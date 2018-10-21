package br.com;

public class CombinaValores {

	public static void main(String args[]) {
		int a = 10256;
		int b = 512;
		String c = "";

		String[] aArray = Integer.toString(a).split("");
		String[] bArray = Integer.toString(b).split("");

		// Degug arrays
		System.out.println(java.util.Arrays.toString(aArray));
		System.out.println(java.util.Arrays.toString(bArray));

		for (int i = 0; i < Math.max(aArray.length, bArray.length); i++) {
			String valorA = (i < aArray.length) ? aArray[i] : "";
			String valorB = (i < bArray.length) ? bArray[i] : "";
			c += valorA + valorB;
		}
		if (Integer.parseInt(c) > 1000000) {
			System.out.println("-1");
		}

		System.out.println("Valor final -> " + Integer.parseInt(c));
	}

}
