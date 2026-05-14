package app;

public final class DataHandler {
    private DataHandler() {
        throw new AssertionError("Utility class cannot be instantiated");
    }

    public static <T> String handleData(T[] items) {
        if (items == null || items.length == 0) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < items.length; i++) {
            sb.append(String.format("(%d) %s", i + 1, items[i]));
            if (i < items.length - 1) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }
}
