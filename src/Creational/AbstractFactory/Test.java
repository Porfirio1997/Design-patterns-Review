package Creational.AbstractFactory;

import Creational.AbstractFactory.Factories.DarkUserPreferenceFactory;
import Creational.AbstractFactory.Factories.LightUserPreferenceFactory;
import Creational.AbstractFactory.Factories.UserPreferenceFactory;

public class Test {
    private static App configureApplication() {
        App app;
        UserPreferenceFactory factory;
        String preference = "dark";
        if (preference.contains("light")) {
            factory = new DarkUserPreferenceFactory();
        } else {
            factory = new LightUserPreferenceFactory();
        }
        app = new App(factory);
        return app;
    }

    public static void main(String[] args) {
        App app = configureApplication();
        app.paint();
    }
}
