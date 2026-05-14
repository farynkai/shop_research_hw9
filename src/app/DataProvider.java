package app;

public final class DataProvider {
    private DataProvider() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static String[] getProductNames() {
        return new String[] {"apple", "grape", "mango", "apple", "orange"};
    }

    public static Double[] getSalesAmounts() {
        return new Double[] {1520.89, 2058.35, 1807.29, 899.99, 1924.25};
    }
}
