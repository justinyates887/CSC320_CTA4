import java.util.Scanner;

public class InputService implements InputInterface {
    @Override
    public double[] getValuesFromUser(int count) {
        double[] values = new double[count];
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        
        while (i < count) {
            System.out.printf("Enter value %d: ", i + 1);
            if (scanner.hasNextDouble()) {
                values[i] = scanner.nextDouble();
                i++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); // clear the invalid input
            }
        }
        scanner.close();
        return values;
    }
}