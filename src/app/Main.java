package app;

public class Main {

    public static void main(String[] args) {
        try {
            String[] products = DataProvider.getProductNames();
            Double[] sales = DataProvider.getSalesAmounts();

            String report = SalesReportFormatter.formatReport(products, sales);
            System.out.println(report);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
