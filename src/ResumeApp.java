
import java.util.ArrayList;
import java.util.Scanner;

public class ResumeApp {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        ArrayList<Personal> nameList = new ArrayList<Personal>();
        ArrayList<Education> educationList = new ArrayList<Education>();
        ArrayList<Experience> experienceList = new ArrayList<Experience>();
        ArrayList<Skills> skillsList = new ArrayList<Skills>();
        String name, email;
        String degree, major, university, jobTitle, company, startDate, endDate, skillName, rating;
        int year;

        String input = "";

        while (!input.equalsIgnoreCase("view")) {
            String input2 = "";
            String input3 = "";
            String input4 = "";
            String input5 = "";
            while (!input2.equalsIgnoreCase("next")) {
                printer("What is your full name ");
                name = keyboard.next();
                printer("What is your email address ");
                email = keyboard.next();

                nameList.add(new Personal(name, email));

                System.out.println("Type next to enter your education.");
                input2 = keyboard.next();
            }

            while (!input3.equalsIgnoreCase("next")) {
                printer("What is your degree? Write AS, BS or MS. ");
                degree = keyboard.next();
                printer("What is your major?");
                major = keyboard.next();
                printer("What is the name of your University?");
                university = keyboard.next();
                printer("What is your year of graduation?");
                year = keyboard.nextInt();

                educationList.add(new Education(degree, major, university, year));

                System.out.println("Do you still want to add another education? If yes type yes if not type next to enter your experience.");
                input3 = keyboard.next();
            }
            while (!input4.equalsIgnoreCase("next")) {
               String duty, description;
                ArrayList<Description> descriptionList = new ArrayList<Description>();
                String input6 =  "";
                printer("What is your Job title ");
                jobTitle = keyboard.next();
                printer("What is the name of your company ");
                company = keyboard.next();
                printer("What is your start date ");
                startDate = keyboard.next();
                printer("What is your endDate ");
                endDate = keyboard.next();
                while(!input6.equalsIgnoreCase("next")){

                    printer("What is your duty?");
                    duty = keyboard.next();
                    printer("Write description of the duty?");
                    description = keyboard.next();
                    descriptionList.add(new Description(duty, description));
                    printer("Do you still want to add more? type yes if not type next to continue");
                    input6 = keyboard.next();
                }


                experienceList.add(new Experience(jobTitle, company, startDate, endDate, descriptionList));

                System.out.println("Do you still want to add experience? If yes yes type yes if not type next to continue to your skills.");
                input4 = keyboard.next();
            }
            while (!input5.equalsIgnoreCase("next")) {
                printer("Add a skill ");
                skillName = keyboard.next();
                printer("What is your level of proficiency?");
                rating = keyboard.next();

                skillsList.add(new Skills(skillName, rating));

                System.out.println("Do you still want to add another skill? If yest type yes, if not type next.");
                input5 = keyboard.next();
            }
            System.out.println("Type view to populate your resume.");
            input = keyboard.next();
        }
        printer("=======================================================================");
        for (int i = 0; i < nameList.size(); i++) {
            System.out.println(nameList.get(i).toString());
        }
        printer(" \nEducation");

        for (int i = 0; i < educationList.size(); i++) {
            System.out.println(educationList.get(i).toString());
        }
        printer("\nExperience ");

        for (int i = 0; i < experienceList.size(); i++) {
            System.out.println(experienceList.get(i).toString());
        }
        printer("\nSkills");
        for (int i = 0; i < skillsList.size(); i++) {
            System.out.println(skillsList.get(i).toString());
        }

    }

    private static void printer(String message) {
        System.out.println(message);
    }
}
