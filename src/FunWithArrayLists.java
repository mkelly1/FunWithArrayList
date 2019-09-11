import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FunWithArrayLists {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        ArrayList<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("blue");
        colors.add("green");
        System.out.println("The second color is "+ colors.get(1));
        while(true) {
            System.out.print("Enter a color or 'q' to quit: ");
            String input = scan.next();
            if(input.equalsIgnoreCase("q")) {
                System.out.println("Program ending.");
                break;
            }
            colors.add(input);
        }
        System.out.println("The colors are:");
        System.out.println(colors);


    }
}
