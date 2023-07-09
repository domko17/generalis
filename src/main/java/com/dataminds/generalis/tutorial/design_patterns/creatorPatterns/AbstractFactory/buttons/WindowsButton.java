package com.dataminds.generalis.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is another variant of a button.
 */
public class WindowsButton implements IButton {

    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
