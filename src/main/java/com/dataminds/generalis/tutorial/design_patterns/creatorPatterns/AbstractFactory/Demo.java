package com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory;

import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.factories.IGuiFactory;
import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.factories.MacOSFactory;
import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.factories.WindovsFactory;

public class Demo {

    private static Application ConfigureApplication() {
        Application application;
        IGuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindovsFactory();
        }

        application = new Application(factory);
        return application;
    }


    public static void main(String[] args) {
        Application app = ConfigureApplication();
        app.paint();
    }
}
