//modified file
package coreJava; //U.D.P

public class ArthematicClass { // class -by compiler

	int i = 20, j = 10, k; // V.D

	public void add() { // U.D.M

		k = i + j; // B.L
		System.out.println("addition result is :" + k);
	}

	public void mutli() { // U.D.M

		k = i * j; // B.L
		System.out.println("mutli result is :" + k);
	}

	public void sub() { // U.D.M

		k = i - j; // B.L
		System.out.println("sub result is :" + k);
	}

	public void div() { // U.D.M

		 k = i / j; // B.L
		System.out.println("div result is :" +k);
	}

	public static void main(String[] lakshman) { // Default main method-by JVM

		ArthematicClass obj = new ArthematicClass();

		obj.add();
		obj.mutli();
		obj.sub();
		obj.div();

	}

}
