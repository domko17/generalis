package com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.factories;

import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.*;


/**
 * Each concrete factory extends basic factory and responsible for creating
 * products of a single variety.
 */
public class WindovsFactory implements IGuiFactory {
    @Override
    public IButton createButton() {
        return new WindowsButton();
    }

    @Override
    public ICheckbox createChceckbox() {
        return new WindowsCheckbox();
    }
}
