
import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {

    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);

        ArrayList<String> fullName = new ArrayList<String>();
        ArrayList<String> education = new ArrayList<String>();
        ArrayList<String> skills = new ArrayList<String>();
        ArrayList<String> experience = new ArrayList<String>();
        ArrayList<String> references = new ArrayList<String>();

        String input = "";

        while(!input.equalsIgnoreCase("q")){

            System.out.println("What is your fill name ");
            fullName.add(keyboard.next());
            System.out.println("What is your education ");
            education.add(keyboard.next());
            System.out.println("What is your skill ");
            skills.add(keyboard.next());
            System.out.println("What is your experience ");
            experience.add(keyboard.next());
            System.out.println("What is your reference ");
            references.add(keyboard.next());

            System.out.println("Type q when done");
            input = keyboard.next();

        }


    }
}
