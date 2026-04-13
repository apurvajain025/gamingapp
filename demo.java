public class HelloApp {
    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World!");
        } else {
            // Create StringBuilder to store names
            StringBuilder nameBuilder = new StringBuilder();

            // Enhanced for loop to append names
            for (String name : args) {
                nameBuilder.append(name).append(", ");
            }

            // Remove trailing ", "
            if (nameBuilder.length() > 0) {
                String names = nameBuilder.substring(0, nameBuilder.length() - 2);
                System.out.println("Hello, " + names + "!");
            }
        }
    }
}