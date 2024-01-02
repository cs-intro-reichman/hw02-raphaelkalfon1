public class DamkaBoard {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[0]); // Set the number of rows and columns

        for (int i = 0; i < x; i++) {
            if (i % 2 == 1) {
                System.out.print(" ");
	        // Add a space at the beginning every second line
            }

            
            for (int j = 0; j < x; j++) {
                System.out.print("* ");
	        // Print "* " line with length x
            }

            System.out.println(); 
	    // Move to the next line
        }
    }
}
