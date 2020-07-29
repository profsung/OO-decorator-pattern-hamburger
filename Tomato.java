
// participant: ConcreteDecorator
public class Tomato extends HamburgerDecorator {

    public Tomato(HamburgerComponent hamburger) {
        super(hamburger);
    }

    @Override
    public String decorations() {
        return hamburger.decorations() + addedDecoration();
    }
    
    private String addedDecoration() {
        return "[Tomato]";
    }
}
