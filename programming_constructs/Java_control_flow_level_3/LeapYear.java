import java.util.*;

class LeapYear {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year:");
        int year = sc.nextInt();

        if (year < 1582) {
            System.out.println("Year should be 1582 or later");
        } 
        else {
            if (year % 400 == 0) {
                System.out.println("Year is a Leap Year (using if-else)");
            } 
            else if (year % 100 == 0) {
                System.out.println("Year is NOT a Leap Year (using if-else)");
            } 
            else if (year % 4 == 0) {
                System.out.println("Year is a Leap Year (using if-else)");
            } 
            else {
                System.out.println("Year is NOT a Leap Year (using if-else)");
            }

            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println("Year is a Leap Year (using single if)");
            } else {
                System.out.println("Year is NOT a Leap Year (using single if)");
            }
        }
    }
}
