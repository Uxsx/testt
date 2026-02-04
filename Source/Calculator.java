public class Calculator {
    private double currentResult;

    public Calculator(double initialNumber) {
        this.currentResult = initialNumber;
    }

    public void applyOperation(String operation, double nextNumber) {
        switch (operation) {
            case "+": currentResult += nextNumber; break;
            case "-": currentResult -= nextNumber; break;
            case "*": currentResult *= nextNumber; break;
            case "%":
                if (nextNumber != 0) {
                    currentResult %= nextNumber;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            case "/":
                if (nextNumber != 0) {
                    currentResult /= nextNumber;
                } else {
                    System.out.println("Error: Cannot divide by zero!");
                }
                break;
            default:
                System.out.println("Error: Invalid operation!");
        }
    }

    public double getResult() {
        return currentResult;
    }
}