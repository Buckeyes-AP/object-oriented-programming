package com.in28minutes.oops;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming = new Book(1000);
		Book effectiveJava = new Book(1000);
		Book cleanCode = new Book(1000);

		// artOfComputerProgramming.setNoOfCopies(100);
		// effectiveJava.setNoOfCopies(40);
		// cleanCode.setNoOfCopies(90);

		artOfComputerProgramming.increaseNoOfCopies(100);
		effectiveJava.increaseNoOfCopies(50);
		cleanCode.increaseNoOfCopies(20);

		artOfComputerProgramming.decreaseNoOfCopies(50);
		effectiveJava.decreaseNoOfCopies(50);
		cleanCode.decreaseNoOfCopies(25);

		artOfComputerProgramming.read();
		effectiveJava.read();
		cleanCode.read();

		System.out.println(artOfComputerProgramming.getNoOfCopies());
		System.out.println(effectiveJava.getNoOfCopies());
		System.out.println(cleanCode.getNoOfCopies());
	}

}
