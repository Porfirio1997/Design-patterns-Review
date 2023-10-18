package Creational.AbstractFactory.props.Text;

public class LightText implements Text{
    @Override
    public void paint() {
        System.out.println("painting background light #323232");
    }
}
