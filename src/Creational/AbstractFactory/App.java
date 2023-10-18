package Creational.AbstractFactory;

import Creational.AbstractFactory.Factories.UserPreferenceFactory;
import Creational.AbstractFactory.props.Background.Background;
import Creational.AbstractFactory.props.Buttons.Button;
import Creational.AbstractFactory.props.CheckBox.Checkbox;
import Creational.AbstractFactory.props.Text.Text;

public class App {
    private Button button;
    private Checkbox checkbox;
    private Text text;
    private Background background;
    public App(UserPreferenceFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
        text = factory.createText();
        background = factory.createBackground();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
        text.paint();
        background.paint();
    }
}
