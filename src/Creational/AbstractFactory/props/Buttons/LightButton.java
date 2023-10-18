package Creational.AbstractFactory.props.Buttons;

public class LightButton implements Button{

    @Override
    public void paint() {
        System.out.println("painting background light #414141");
    }
}