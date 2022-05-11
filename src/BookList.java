import java.util.ArrayList;
import java.util.Scanner;

public class BookList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookList = new ArrayList<>();
        bookList.add(new Book("The Three Body Problem", 302, 2014));
        bookList.add(new Book("The Dark Forest", 400, 2015));
        bookList.add(new Book("Death's End", 592, 2010));
        System.out.println("What information will be printed?");
        String reply = scanner.nextLine();

        for (int i=0; i<bookList.size();i++){
            if(reply.equalsIgnoreCase("everything")){
                System.out.println(bookList.get(i).toString());
            }else if(reply.equalsIgnoreCase("name")){
                System.out.println(bookList.get(i).getTitle());
            }else{
                System.out.println("That is not an applicable reply");
            }
        }
    }
 }
