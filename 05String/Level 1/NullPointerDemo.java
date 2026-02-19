public class NullPointerDemo {
    public static void main(String[] args) {
        generateException();
        handleException();
    }

    public static void generateException() {
        String text = null;
        text.length(); // This will throw NullPointerException
    }

    public static void handleException() {
        String text = null;
        try {
            text.length();
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }
}