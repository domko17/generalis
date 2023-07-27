package com.dataminds.tutorial.design_patterns.creatorPatterns.AbstractFactory.factories;

import com.dataminds.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.IButton;
import com.dataminds.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons.ICheckbox;

public interface IGuiFactory {
    IButton createButton();
    ICheckbox createChceckbox();
}
