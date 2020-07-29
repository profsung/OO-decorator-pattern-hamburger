
// Example: Decorator design pattern
// (c) Dr. Hong K. Sung
public class Main {

    public static void main(String[] args) {
        // Big Mac
        HamburgerComponent hamburger = new BigMac();
        System.out.println("You're getting a " + hamburger.decorations());

        hamburger = new Cheese(hamburger);
        System.out.println("You're getting a " + hamburger.decorations());

        hamburger = new Tomato(hamburger);
        System.out.println("You're getting a " + hamburger.decorations());

        hamburger = new Cheese(hamburger);
        System.out.println("You're getting a " + hamburger.decorations());

        hamburger = new Onion(hamburger);
        System.out.println("You're getting a " + hamburger.decorations());

        // Whopper
        hamburger = new Whopper();
        System.out.println("You're getting a " + hamburger.decorations());

        hamburger = new Cheese(hamburger);
        System.out.println("You're getting a " + hamburger.decorations());

        hamburger = new Tomato(hamburger);
        System.out.println("You're getting a " + hamburger.decorations());

        hamburger = new Cheese(hamburger);
        System.out.println("You're getting a " + hamburger.decorations());

        hamburger = new Onion(hamburger);
        System.out.println("You're getting a " + hamburger.decorations());
    }
}
