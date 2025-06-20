import java.util.ArrayList;

/*Using Recurrsion  */
// public class FinancialForecastingClass{
//     public static double forecastFutureValue(double initialValue, double growthRate, int years) {
//         if (years == 0) {
//             return initialValue; // Base case
//         }
//         return forecastFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate);  
//     }
// }

/*Using the Recurrsion with DP-Memoization */
public class FinancialForecastingClass {
    public static ArrayList<Double> dp = new ArrayList<>(); 
    // Recursive method to calculate future value
    public static double forecastFutureValue(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue; // Base case
        }
        if(dp.size()>years && dp.get(years)!=0){
            return dp.get(years);
        }
        dp.add(years,forecastFutureValue(initialValue, growthRate, years - 1) * (1 + growthRate));
        return  dp.get(years);
    }
}

/*Optimization: 
 * Since we are using Recurrsion there is a chnace of calculating the already known value
 * that's the reason why the idea of memoization came into the picture
 * Let's think of a situation first we have called this function to know the final value after 7 years so it calculates 
 * as expected using normal recurrsion but the next time onwards when we call with years = 15 it goes deeper and deeper
 * at a certain point it need to calculate at no.of years = 7 but we have already done with that so no need of 
 * calculating it again. 
 * This shows the usefulness of memoization — by avoiding redundant calculations (e.g., saving 8 repeated calls), 
 * it significantly reduces computation, especially for large inputs.
*/



/* formula intution:
 * increasedValue = (growth/100)*prevValue
 * currVlaue = prevValue + increasedValue
 * therefore, currValue = prevValue + prevValue*(growth/100)
 *                      = prevValue(1+growth/100)
 * while passing the input itself we are he passing growth/100 value
 */