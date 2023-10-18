package Creational.AbstractFactory.props.Background;

public class LightBackground implements  Background{
    @Override
    public void paint() {
        System.out.println("painting background light #414141");
    }
}