package com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a variant of a checkbox.
 */
public class MacOSCheckbox implements ICheckbox {
    @Override
    public void paint() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
