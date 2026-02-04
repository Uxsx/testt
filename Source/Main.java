import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Calculator Program!");
        new Display();

        System.out.print("Input Number: ");
        double initialNumber = scanner.nextDouble();
        
        Calculator cal = new Calculator(initialNumber);

        while (true) {
            System.out.print("Input Operators: ");
            String operation = scanner.next();

            if (operation.equals("=")) {
                System.out.println("-------------------------");
                System.out.println("Final Result: " + cal.getResult());
                break;
            }

            System.out.print("Input Next Number: ");
            double nextNumber = scanner.nextDouble();

            cal.applyOperation(operation, nextNumber);

            new Display();
            System.out.println("Current Result: " + cal.getResult());
        }

        scanner.close();
    }
}