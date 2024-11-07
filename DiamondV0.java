package week05.lab;

/**
 * Drawing a diamond.
 * 
 * @author bingol
 */
public class DiamondV0 {

	static final int SIZE = 5;

	public static void main(String[] args) {
		// below-0123456789-V toDo // do not change this line ~~~~~~~~~~ V
		// TODO your code should be between below and above marks.
                for (int i = 0; i < SIZE; i++) {
            for (int o = 0; o < SIZE - i - 1; o++) {
                System.out.print(".");
            }
                        for (int t = 0; t < 2 * i + 1; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = SIZE - 2; i >= 0; i--) {
            for (int o = 0; o < SIZE - i - 1; o++) {
                System.out.print(".");
            }
                        for (int t = 0; t < 2 * i + 1; t++) {
                System.out.print("*");
            }
            System.out.println();
}
		 System.out.println("not implemented.");

		// above-0123456789-A toDo // do not change this line ~~~~~~~~~~ A
	}

}
