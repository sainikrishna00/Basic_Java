
import java.util.Scanner;

public class subString {
    static void main() {
        //.substring() = A method used to extract a portion of a string
        //.substring(start,end)
        Scanner sc = new Scanner(System.in);
        String email;
        String userName;
        String domain;
        System.out.println("Enter your email : ");
        email = sc.nextLine();
        if(email.contains("@")){
            userName = email.substring(0, email.indexOf("@"));
            domain = email.substring(email.indexOf("@") +1);
            System.out.println(userName);
            System.out.println(domain);
        }else{
            System.out.println("invalid mail pls check again");
        }
    }
}
