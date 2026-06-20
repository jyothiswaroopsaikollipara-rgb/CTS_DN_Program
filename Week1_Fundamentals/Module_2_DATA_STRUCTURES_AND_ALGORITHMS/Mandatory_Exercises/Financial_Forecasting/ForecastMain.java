public class ForecastMain {

    public static void main(String[] args) {

        double initialAmount = 1000;

        double annualGrowthRate = 0.10;

        int years = 5;

        double futureAmount =ForecastCalculator.futureValue(initialAmount,annualGrowthRate,years);

        System.out.println("Initial Amount : ₹" + initialAmount);

        System.out.println("Growth Rate : " +(annualGrowthRate * 100) + "%");

        System.out.println("Years : " + years);

        System.out.println("Future Value : ₹" + futureAmount);

    }

}