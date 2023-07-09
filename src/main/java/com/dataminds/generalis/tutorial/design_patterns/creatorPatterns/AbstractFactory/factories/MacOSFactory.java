package com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.factories;

import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.IButton;
import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.ICheckbox;
import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.MacOSButton;
import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.MacOSCheckbox;

/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class MacOSFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public ICheckbox createChceckbox() {
        return new MacOSCheckbox();
    }
}
