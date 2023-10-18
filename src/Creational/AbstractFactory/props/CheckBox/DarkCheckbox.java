package Creational.AbstractFactory.props.CheckBox;

public class DarkCheckbox implements Checkbox{

    @Override
    public void paint() {
        System.out.println("painting background dark #4a4a4a");
    }
}
