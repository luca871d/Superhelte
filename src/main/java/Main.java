import java.util.Scanner;

public class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);

        String realNameIn = sc.next();
        String superNameIn = sc.next();

        Superhero hero1 = new Superhero("1", "2", true, "4", 5555, 6.0);
        System.out.println(hero1.toString());
    }
}
