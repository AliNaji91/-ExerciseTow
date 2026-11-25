import java.util.Scanner;
public class ExerciseTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        1.Write a program that checks the role of the user
//        If the role is admin print "welcome admin"
//        If the role is superuser print "welcome superuser"
//        If the role is user print "welcome user" (tip:
//        use if else)

        System.out.println("What is your role:");
        String role = input.nextLine();
        if (role.equalsIgnoreCase("admin")){
            System.out.println("Welcome admin");
        } else if (role.equalsIgnoreCase("superuser")) {
            System.out.println("Welcome superuser");
        } else if (role.equalsIgnoreCase("user")){
            System.out.println("Welcome user");
        }
        else {
            System.out.println("Sorry you dont have role");
        }

//
//        2.Take three numbers from the user and print the greatest number.
//                Test Data
//        Input the 1st number: 25
//        Input the 2nd number: 78
//        Input the 3rd number: 87
//        Expected Output : The
//        greatest: 87

        System.out.println("Enter Three numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1>num2 && num1>num3){
            System.out.println("Big number is:" +num1);
        } else if (num2>num1 && num2>num3) {
            System.out.println("Big number is:" +num2);
        }
        else {
            System.out.println("Big number is:" +num3);

        }

//        3.Write a Java program that generates an integer between 1 and 7
//        and displays the name of the weekday.
//                Test Data
//        number: 4
//        Expected Output:
//        Wednesday

        int day = (int)(Math.random()*7)+1;

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;

        }

//        4. Write a program that takes a numeric score as input and prints
//        the corresponding letter grade using the following grading scale:
//        A: 90-100
//        B: 80-89
//        C: 70-79
//        D: 60-69 F:
//        0-59
//        Enter your numeric score: 85
//        Numeric Score: 85
//        Letter Grade: B

        System.out.println("Enter your numeric score:");
        int score = input.nextInt();
        System.out.println("Numeric score:"+score);
        if (score>100 ||score<0){
            System.out.println("Sorry wrong number");
        }else {
            if (score>=90){
                System.out.println("Letter grade: A");
            }
            else if (score>=80){
                System.out.println("Letter grade: B");
            } else if (score>=70){
                System.out.println("Letter grade: C");
            }
            else if (score>=60){
                System.out.println("Letter grade: D");
            }
            else{
                System.out.println("Letter grade: F");
            }
        }
//        5. Write a Java program that takes a person's age as input and
//        categorizes them into one of three age categories: "Child,"
//        "Teenager," or "Adult" using an if statement.
//                use an if statement to categorize the age based on the following criteria:
//• If the age is less than 13, categorize them as a "Child."
//• If the age is between 13 and 19 (inclusive), categorize them as a
//        "Teenager."
//• If the age is 20 or older, categorize them as an "Adult."
//        Sample Output:
//        Enter your age: 25
//        You are an Adult.

        System.out.println("Enter your age:");
        int age = input.nextInt();
        if (age<13){
            System.out.println("You are child");
        } else if (age>=13 && age<=19) {
            System.out.println("you are teenager");
        }
        else {
            System.out.println("You are adult");
        }
    }
}
