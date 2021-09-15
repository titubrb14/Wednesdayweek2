import java.util.ArrayList;
import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        var studentNames = new ArrayList<String>();
        var reader = new Scanner(System.in);
        var userResponse = "";
        while (!userResponse.equals("done")){
            System.out.print("Type in the next studendt name or 'done' to exit: ");
            userResponse = reader.nextLine();
            if (userResponse.equals("done")){
                break;

            }
            System.out.println("All of your students name are below: ");

        }


    }
}
