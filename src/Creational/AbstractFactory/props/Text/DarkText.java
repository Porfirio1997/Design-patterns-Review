package Creational.AbstractFactory.props.Text;

public class DarkText implements Text{

    @Override
    public void paint() {
        System.out.println("painting background dark #c8c8c8");
    }
}
