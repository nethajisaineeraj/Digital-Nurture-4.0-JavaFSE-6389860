public class Main{
    public static void main(String[] args) {
        double growthRate = 0.05;
        double presentValue=10000;

        FinancialForecastingClass.dp.add(0, presentValue);

        int years;
        double futureValue;
        
        years = 7;
        futureValue = FinancialForecastingClass.forecastFutureValue(presentValue, growthRate, years);
        System.out.printf("Forecasted value after %d years: %.2f Rupees\n", years, futureValue);

        years = 15;
        futureValue = FinancialForecastingClass.forecastFutureValue(presentValue, growthRate, years);
        System.out.printf("Forecasted value after %d years: %.2f Rupees\n", years, futureValue);

        years = 5;
        futureValue = FinancialForecastingClass.forecastFutureValue(presentValue, growthRate, years);
        System.out.printf("Forecasted value after %d years: %.2f Rupees\n", years, futureValue);

    }
}