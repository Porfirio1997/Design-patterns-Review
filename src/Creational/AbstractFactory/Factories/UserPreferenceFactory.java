package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.props.Background.Background;
import Creational.AbstractFactory.props.Buttons.Button;
import Creational.AbstractFactory.props.CheckBox.Checkbox;
import Creational.AbstractFactory.props.Text.Text;

public interface UserPreferenceFactory {
    Button createButton();
    Checkbox createCheckbox();
    Text createText();
    Background createBackground();
}
