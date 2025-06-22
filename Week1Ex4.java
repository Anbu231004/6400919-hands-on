public class Week1Ex4 {
    public static void main(String[] args) {
        double currentValue = 10000.0; // starting amount
        double growthRate = 0.10;      // 10% annual growth
        int years = 5;                 // forecast for 5 years

        double futureValue = Forecasting.forecast(years, currentValue, growthRate);

        System.out.printf("Future Value after %d years: %.2f\n", years, futureValue);
    }
}
class Forecasting {
    static double forecast(int years, double currentValue, double rate) {
        if (years == 0) return currentValue;
        return forecast(years - 1, currentValue, rate) * (1 + rate);
    }
}