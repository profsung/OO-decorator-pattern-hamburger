
// participant: ConcreteDecorator
public class Onion extends HamburgerDecorator {

    public Onion(HamburgerComponent hamburger) {
        super(hamburger);
    }

    @Override
    public String decorations() {
        return hamburger.decorations() + addedDecoration();
    }
    
    private String addedDecoration() {
        return "[Onion]";
    }
}
