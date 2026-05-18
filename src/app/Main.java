package app;

public class Main {

    public static void main(String[] args) {
        String[] products = DataProvider.getProductNames();
        Double[] sales = DataProvider.getSalesAmounts();

        try {
            String report = SalesReportFormatter.formatReport(products, sales);
            System.out.println(report);
        } catch (IllegalArgumentException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
