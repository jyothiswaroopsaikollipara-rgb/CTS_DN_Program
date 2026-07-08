public class ForecastCalculator {

    public static double futureValue(double presentValue,double growthRate,int years) {
        if(years == 0) {
            return presentValue;
        }
        double previousYearValue = futureValue(presentValue,growthRate,years - 1);

        double currentYearValue = previousYearValue * (1 + growthRate);

        return currentYearValue;
    }

}
