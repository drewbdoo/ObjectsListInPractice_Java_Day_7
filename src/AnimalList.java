import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Animal Menu" + "\n"+"Entering nothing will stop the loop");
        ArrayList<Object> list = new ArrayList<>();
        while(true){
            System.out.println("Please enter a name: ");
            String name = scanner.nextLine();
            System.out.println("Is it a dog? Yes or no: ");
            String doggy = scanner.nextLine();
            boolean dog;
            if(name.equalsIgnoreCase("")){
                break;
            }
            dog= doggy.equalsIgnoreCase("yes");
            list.add(String.valueOf(new Animal(name, dog)));

          }
        for (Object o : list) {
            System.out.println(o.toString());
        }

    }
}
