package Creational.AbstractFactory.props.Buttons;

public class DarkButton implements Button{

    @Override
    public void paint() {
        System.out.println("painting background dark #4a4a4a");
    }
}
