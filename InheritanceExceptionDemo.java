import java.util.Scanner;

class WrongAge extends Exception {
    public WrongAge(String message) {
        super(message);
    }
}

class Father {
    int fatherAge;

    Father(int age) throws WrongAge {
        if (age < 0) {
            throw new WrongAge("Father age cannot be negative");
        }
        fatherAge = age;
    }
}

class Son extends Father {
    int sonAge;

    Son(int fatherAge, int sonAge) throws WrongAge {
        super(fatherAge);

        if (sonAge < 0 || sonAge >= fatherAge) {
            throw new WrongAge("Invalid son age");
        }
        this.sonAge = sonAge;
    }
}

public class InheritanceExceptionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter father's age: ");
            int fAge = sc.nextInt();

            System.out.print("Enter son's age: ");
            int sAge = sc.nextInt();

            Son s = new Son(fAge, sAge);

            System.out.println("Father Age: " + s.fatherAge);
            System.out.println("Son Age: " + s.sonAge);
        } catch (WrongAge e) {
            System.out.println(e.getMessage());
        }
    }
}
