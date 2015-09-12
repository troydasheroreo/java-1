import skilstak.c;
import java.util.*;   
public class eightball {
    

    private static String[] list = {"Yes","No","Maybe"};
    
    private static final String input(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        return text;
    }
   


    private static final String choice(String[] list) {

        int index = (int)(Math.random()*list.length);
        return list[index];
    }
    
    public static final void main(String[] args) {
        System.out.println(c.clear + c.rc() + "Welcome! " + c.rc() + "To the magic-8-ball program!");

        while(true) {
            String question = input("~~> " + c.rc());
            System.out.println(choice(list));
       }
    
       


    }
}    
