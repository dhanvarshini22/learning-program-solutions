public class FinancialForecast {

    // Recursive method to calculate future value
    public static double futureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValue(principal, rate, years - 1) * (1 + rate);
    }

    // Optimized version using memoization
    public static double futureValueMemo(double principal, double rate, int years, double[] memo) {
        if (years == 0) return principal;
        if (memo[years] != 0) return memo[years];

        memo[years] = futureValueMemo(principal, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }

    public static void main(String[] args) {
        double principal = 10000;
        double growthRate = 0.1; // 10%
        int years = 5;

        System.out.println("📊 Forecasting future value recursively:");
        System.out.printf("Year %d: ₹%.2f\n", years, futureValue(principal, growthRate, years));

        System.out.println("\n🚀 Forecasting with memoization (optimized):");
        double[] memo = new double[years + 1];
        System.out.printf("Year %d: ₹%.2f\n", years, futureValueMemo(principal, growthRate, years, memo));
    }
}
