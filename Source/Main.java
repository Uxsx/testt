import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        new Display();

        System.out.print("ป้อนตัวเลขเริ่มต้น: ");
        double initialNumber = scanner.nextDouble();
        
        Calculator cal = new Calculator(initialNumber);

        while (true) {
            System.out.print("ป้อนเครื่องหมาย: ");
            String operation = scanner.next();

            if (operation.equals("=")) {
                break;
            }

            System.out.print("ป้อนตัวเลขถัดไป: ");
            double nextNumber = scanner.nextDouble();

            cal.applyOperation(operation, nextNumber);
            
            System.out.println("ผลลัพธ์ปัจจุบัน: " + cal.getResult());
        }

        System.out.println("-------------------------");
        System.out.println("คำตอบสุดท้ายคือ: " + cal.getResult());
        
        scanner.close();
    }
}