import java.util.Scanner;

public class JavaHomework {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);

            System.out.println("First name");

            String firstName = reader.nextLine();

            System.out.println("Second name");

            String secondName = reader.nextLine();

            System.out.println("Full name");

            String fullName = firstName + " " + secondName;

            System.out.println(fullName);
        }
}
