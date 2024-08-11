
public class CalculationService implements CalculationInterface {
    @Override
    public double calculateTotal(double[] values) {
        double total = 0;
        for (double value : values) {
            total += value;
        }
        return total;
    }

    @Override
    public double calculateAverage(double total, int count) {
        return total / count;
    }

    @Override
    public double findMaximum(double[] values) {
        double max = values[0];
        for (double value : values) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    @Override
    public double findMinimum(double[] values) {
        double min = values[0];
        for (double value : values) {
            if (value < min) {
                min = value;
            }
        }
        return min;
    }

    @Override
    public double calculateInterest(double total, double interestRate) {
        return total * interestRate;
    }
}
