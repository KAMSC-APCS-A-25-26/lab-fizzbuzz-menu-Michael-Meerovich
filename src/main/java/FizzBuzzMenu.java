import java.util.Scanner;

// DO NOT CHANGE THE CLASS NAME, IT WILL BREAK THE AUTO GRADER
public class FizzBuzzMenu {
    public static void main(String[] args) {
        // TODO WRITE CODE HERE
        Scanner sc = new Scanner(System.in);
        boolean runprogram = true;
        int choice;
        while (runprogram) {
            System.out.println("------------------------FizzBuzz Menu------------------------");
            System.out.println("Option 1: Display Fizz numbers (multiples of 3)");
            System.out.println("Option 2: Display Buzz numbers (multiples of 5)");
            System.out.println("Option 3: Display FizzBuzz numbers (multiples of both 3 and 5)");
            System.out.println("Option 4: Exit the program");
            choice = sc.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    for (int k = 1; k <= 100; k++) {
                        if (k % 3 == 0) {
                            System.out.print(k + " ");
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 2:
                    for (int k = 1; k <= 100; k++) {
                        if (k % 5 == 0) {
                            System.out.print(k + " ");
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 3:
                    for (int k = 1; k <= 100; k++) {
                        if (k % 3 == 0 && k % 5 == 0) {
                            System.out.print(k + " ");
                        }
                    }
                    System.out.println();
                    System.out.println();
                    System.out.println();
                    break;
                case 4:
                    runprogram = false;
            }

        }
    }
}