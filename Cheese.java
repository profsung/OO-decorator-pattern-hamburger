
// participant: ConcreteDecorator
public class Cheese extends HamburgerDecorator {

    public Cheese(HamburgerComponent hamburger) {
        super(hamburger);
    }

    @Override
    public String decorations() {
        return hamburger.decorations() + addedDecoration();
    }
    
    private String addedDecoration() {
        return "[Cheese]";
    }
}
