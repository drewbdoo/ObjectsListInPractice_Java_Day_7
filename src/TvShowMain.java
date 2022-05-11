import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> tvlist = new ArrayList<>();
        while(true){
            System.out.println("Name of the show:");
            String name = scanner.nextLine();
            if(name.equals("")){
                break;
            }
            System.out.println("How many episodes?");
            String epi = scanner.nextLine();
            System.out.println("What is the genre?");
            String genre = scanner.nextLine();
            int episodes = Integer.parseInt(epi);
            tvlist.add(String.valueOf(new TvShow(name, episodes,genre)));
        }
        for (Object o: tvlist){
            System.out.println(o.toString());
        }
    }
}
