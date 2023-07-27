package com.dataminds.tutorial.design_patterns.creatorPatterns.AbstractFactory;

import com.dataminds.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.IButton;
import com.dataminds.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.ICheckbox;
import com.dataminds.tutorial.design_patterns.creatorPatterns.AbstractFactory.factories.IGuiFactory;

public class Application {

    private IButton button;
    private ICheckbox checkbox;

    public Application(IGuiFactory factory) {
        button = factory.createButton();
        checkbox = factory.createChceckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }

}
