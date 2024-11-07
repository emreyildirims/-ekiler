package week05.lab;

/**
 * Drawing pyramids.
 * 
 * @author bingol
 */
public class PyramidsV0 {

	static final int SIZE = 5;
	static final int SIZE_M1 = SIZE - 1;;
	static final int SIZE_M2 = SIZE - 2;

	public static void main(String[] args) {
		lowerLeft();
		lowerRight();
		upperLeft();
		upperRight();
	}

	static void lowerLeft() {
		System.out.println("\nstart: lowerLeft");
		for (int i = 0; i < SIZE; i++) {
			for (int j = 0; j < SIZE; j++) {
				if (j <= i) {
					System.out.print("*");
				} else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
		System.out.println("end: lowerLeft");
	}

	static void lowerRight() {
		System.out.println("\nstart: lowerRight");

		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 System.out.println("lowerRight is not implemented.");

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
		System.out.println("end: lowerRight");
	}

	static void upperLeft() {
		System.out.println("\nstart: upperLeft");
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 System.out.println("upperLeft is not implemented.");

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
		System.out.println("end: upperLeft");
	}

	static void upperRight() {
		System.out.println("\nstart: upperRight");
		// below-0123456789-V toDo  // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.

		 System.out.println("upperRight is not implemented.");

		// above-0123456789-A toDo  // do not change this line ~~~~~~~~~~ A
		System.out.println("end: upperRight");
	}

}
