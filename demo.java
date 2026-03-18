public class HelloApp {
    public static void main(String[] args) {

        // If no arguments provided → default message
        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }

        // Use StringBuilder for efficient string concatenation
        StringBuilder names = new StringBuilder();

        // Enhanced for loop to iterate through arguments
        for (String name : args) {
            names.append(name).append(", ");
        }

        // Remove last comma and space
        names.setLength(names.length() - 2);

        // Print final greeting
        System.out.println("Hello, " + names + "!");
    }
}