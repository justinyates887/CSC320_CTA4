
public class Main {
	
/*
Define CalculationService Interface
    - Method calculateTotal(double[] values)
    - Method calculateAverage(double total, int count)
    - Method findMaximum(double[] values)
    - Method findMinimum(double[] values)
    - Method calculateInterest(double total, double interestRate)

Define CalculationServiceImpl Class (implements CalculationService)
    - Implement calculateTotal(double[] values)
        - Initialize total to 0
        - For each value in values
            - Add value to total
        - Return total
    - Implement calculateAverage(double total, int count)
        - Return total / count
    - Implement findMaximum(double[] values)
        - Initialize max to values[0]
        - For each value in values
            - If value > max
                - Set max to value
        - Return max
    - Implement findMinimum(double[] values)
        - Initialize min to values[0]
        - For each value in values
            - If value < min
                - Set min to value
        - Return min
    - Implement calculateInterest(double total, double interestRate)
        - Return total * interestRate

Define InputService Interface
    - Method getValuesFromUser(int count)

Define InputServiceImpl Class (implements InputService)
    - Implement getValuesFromUser(int count)
        - Initialize an array of double with size count
        - Initialize Scanner for user input
        - Initialize index i to 0
        - While i < count
            - Prompt user to enter a value
            - If input is a valid double
                - Store input in array at index i
                - Increment i
            - Else
                - Print "Invalid input" and clear invalid input
        - Return array of values

Define Main Class
    - Create InputService instance
    - Create CalculationService instance
    - Call getValuesFromUser with count 5 and store result in values
    - Call calculateTotal with values and store result in total
    - Call calculateAverage with total and count, store result in average
    - Call findMaximum with values and store result in maximum
    - Call findMinimum with values and store result in minimum
    - Call calculateInterest with total and 0.20, store result in interest
    - Print Total, Average, Maximum, Minimum, and Interest on total at 20%
*/

	public static void main(String[] args) {
		
        InputService inputService = new InputService();
        CalculationService calculationService = new CalculationService();
        
        int count = 5;
        double[] values = inputService.getValuesFromUser(count);
        
        double total = calculationService.calculateTotal(values);
        double average = calculationService.calculateAverage(total, count);
        double maximum = calculationService.findMaximum(values);
        double minimum = calculationService.findMinimum(values);
        double interest = calculationService.calculateInterest(total, 0.20);
        
        System.out.printf("Total: %.2f%n", total);
        System.out.printf("Average: %.2f%n", average);
        System.out.printf("Maximum: %.2f%n", maximum);
        System.out.printf("Minimum: %.2f%n", minimum);
        System.out.printf("Interest on total at 20%%: %.2f%n", interest);
	}
}