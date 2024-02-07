import java.util.Arrays;
import java.util.Scanner;

// Superclass
class MathOperations {
    // Method to calculate arithmetic mean
    public double calculateMean(double[] numbers) {
        if (numbers.length == 0) {
            return 0.0;
        }

        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }

        return sum / numbers.length;
    }
}

// Subclass
class StatisticsCalculator extends MathOperations {
    // Method to calculate standard deviation
    public double calculateStandardDeviation(double[] numbers) {
        if (numbers.length < 2) {
            return 0.0;
        }

        double mean = calculateMean(numbers);
        double sumSquaredDifferences = 0;

        for (double num : numbers) {
            double diff = num - mean;
            sumSquaredDifferences += diff * diff;
        }

        return Math.sqrt(sumSquaredDifferences / (numbers.length - 1));
    }

     public static void main(String[] args) {
        double data[]=new double[5];
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Data");
        for(int i=0;i<5;i++){
            data[i]=sc.nextDouble();
        }
        
        StatisticsCalculator calculator = new StatisticsCalculator();

        double mean = calculator.calculateMean(data);
        System.out.println("Arithmetic Mean: " + mean);

        double standardDeviation = calculator.calculateStandardDeviation(data);
        System.out.println("Standard Deviation: " + standardDeviation);
    }

}
