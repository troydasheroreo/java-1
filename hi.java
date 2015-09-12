import skilstak.c;
import java.util.Scanner;

public class hi {
    public static void main(String[] args){
        System.out.println(c.clear + c.rc() + "Hi there! What's your name?" + c.x);
        System.out.print("--> " + c.rc());
        Scanner scanner = new Scanner(System.in);
        String name= scanner.nextLine();
        System.out.println(c.rc() + "Well, " + c.rc() + name + c.rc() + " nice to meet you!" + c.rc());
    }
}
