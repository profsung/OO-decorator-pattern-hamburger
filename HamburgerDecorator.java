
// participant: Decorator
//      Decorator maintains a reference to a Component object and
//          defins an interface that conforms to Component's interface

public abstract class HamburgerDecorator implements HamburgerComponent {
    
    protected HamburgerComponent hamburger;
    
    public HamburgerDecorator(HamburgerComponent hamburger) {
        this.hamburger = hamburger;
    }
    
}
