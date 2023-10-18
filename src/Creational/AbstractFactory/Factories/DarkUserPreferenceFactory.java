package Creational.AbstractFactory.Factories;

import Creational.AbstractFactory.props.Background.Background;
import Creational.AbstractFactory.props.Background.DarkBackground;
import Creational.AbstractFactory.props.Buttons.Button;
import Creational.AbstractFactory.props.Buttons.DarkButton;
import Creational.AbstractFactory.props.CheckBox.Checkbox;
import Creational.AbstractFactory.props.CheckBox.DarkCheckbox;
import Creational.AbstractFactory.props.Text.Text;
import Creational.AbstractFactory.props.Text.DarkText;

public class DarkUserPreferenceFactory implements UserPreferenceFactory {
    public Button createButton(){
        return new DarkButton();
    }
    public Checkbox createCheckbox(){
        return new DarkCheckbox();
    }
    public Text createText(){
        return new DarkText();
    }
    public Background createBackground(){
        return new DarkBackground();
    }
}
