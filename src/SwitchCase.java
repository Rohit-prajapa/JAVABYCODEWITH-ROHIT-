import java.util.Scanner;

public class SwitchCase {
    public static void newswitch(int day){
        String dayStr=switch(day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayStr);
    }
    public static void oldswitch(int day){
        switch (day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
                case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
    static void main() {
        Scanner sc=new Scanner(System.in);
        int day;
        System.out.println("Enter the Day:");
        day=sc.nextInt();
//        oldswitch(day);
        newswitch(day);
    }
}
