public class DamkaBoardtest {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("no");
            return;
        }

        int x = Integer.parseInt(args[0]); 

        for (int i = 0; i < x; i++) {
            
            if (i % 2 == 1) {
                System.out.print(" ");
            }

           
            for (int j = 0; j < x; j++) {
                System.out.print("*");
                if (j < x - 1) {
                    System.out.print(" "); 
                }
            }

            System.out.println(); 
        }
    }
}
