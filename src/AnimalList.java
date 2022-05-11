import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Animal Menu" + "\n"+"Entering nothing will stop the loop");
        ArrayList<Animal> list = new ArrayList<>();
        while(true){
            System.out.println("Please enter a name: ");
            String name = scanner.nextLine();
            if(name.equalsIgnoreCase("")){
                break;
            }
            System.out.println("Is it a dog? Yes or no: ");
            String doggy = scanner.nextLine();
            boolean dog;
            dog=doggy.equalsIgnoreCase("yes");
            list.add(new Animal(name, dog));

          }
        for (Animal animal : list) {
            System.out.println(animal.toString());
            System.out.println(animal.getName());
        }


    }
}
