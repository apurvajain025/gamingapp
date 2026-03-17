public class HelloApp {
    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Hello, World!");
            return;
        }
        String result = String.join(", ", args);
        System.out.println("Hello, " + result + "!");
    }
}