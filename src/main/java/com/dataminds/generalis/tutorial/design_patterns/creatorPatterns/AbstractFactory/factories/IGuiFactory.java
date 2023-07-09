package com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.factories;

import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.IButton;
import com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.ICheckbox;

public interface IGuiFactory {
    IButton createButton();
    ICheckbox createChceckbox();
}
