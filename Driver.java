//import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {

//        Scanner in = new Scanner(System.in);
//        String line = in.nextLine(); // user input

        Model m1 = new Model("Susan", "Smith", 70, 120, false, true);
        Model m2 = new Model("Tiger", "Woods", 72, 190, true, false);
        m1.printDetails();
        m2.printDetails();
    }
}

