package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.props.Background.Background;
import Creational.AbstractFactory.props.Background.LightBackground;
import Creational.AbstractFactory.props.Buttons.Button;
import Creational.AbstractFactory.props.Buttons.LightButton;
import Creational.AbstractFactory.props.CheckBox.Checkbox;
import Creational.AbstractFactory.props.CheckBox.LightCheckbox;
import Creational.AbstractFactory.props.Text.LightText;
import Creational.AbstractFactory.props.Text.Text;

public class LightUserPreferenceFactory implements UserPreferenceFactory {
    public Button createButton(){
        return new LightButton();
    }
    public Checkbox createCheckbox(){
        return new LightCheckbox();
    }
    public Text createText(){
        return new LightText();
    }
    public Background createBackground(){
        return new LightBackground();
    }
}