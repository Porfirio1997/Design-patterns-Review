package Creational.AbstractFactory.props.CheckBox;

public class LightCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("painting background light #414141");
    }
}