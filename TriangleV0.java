package week05.lab;

/**
 * Drawing triangles.
 * 
 * @author bingol
 */
public class TriangleV0 {

	static final int SIZE = 9;
	static final int SIZE_M1 = SIZE - 1;;

	public static void main(String[] args) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
		
        for (int i = 0; i < SIZE; i++) {             
            for (int j = 0; j < SIZE - i - 1; j++) { 
                System.out.print(".");
            }
            for (int k = 0; k < 2 * i + 1; k++) {    
                System.out.print("*");
            }
            for (int j = 0; j < SIZE - i - 1; j++) { 
            }
            System.out.println();
        }

        System.out.println("end: pyramid");

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}
}
