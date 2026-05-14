package app;

public final class SalesReportFormatter {
    private static final String SEPARATOR = "=".repeat(40);

    private SalesReportFormatter() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static String formatReport(String[] products, Double[] sales) {
        validateInput(products, sales);

        StringBuilder sb = new StringBuilder();
        sb.append("Product Sales Report\n");
        sb.append(SEPARATOR).append("\n");

        for (int i = 0; i < products.length; i++) {
            sb.append(String.format("(%d) %-15s EUR %.2f%n", i + 1, products[i], sales[i]));
        }

        sb.append(SEPARATOR).append("\n");
        sb.append(String.format("Total Sales: EUR %.2f", calculateTotal(sales)));

        return sb.toString();
    }

    private static void validateInput(String[] products, Double[] sales) {
        if (products == null || sales == null) {
            throw new IllegalArgumentException("Products and sales cannot be null");
        }

        if (products.length != sales.length) {
            throw new IllegalArgumentException(
                String.format("Array length mismatch: %d products but %d sales", products.length, sales.length)
            );
        }

        // Both arrays have equal length at this point
        if (products.length == 0) {
            throw new IllegalArgumentException("Cannot generate report from empty data");
        }
    }

    private static double calculateTotal(Double[] sales) {
        double total = 0;
        for (Double sale : sales) {
            total += sale;
        }
        return total;
    }
}
