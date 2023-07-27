package com.dataminds.tutorial.design_patterns.creatorPatterns.AbstractFactory.buttons;

/**
 * All products families have the same varieties (MacOS/Windows).
 *
 * This is a MacOS variant of a button.
 */
public class MacOSButton implements IButton {
    @Override
    public void paint() {
        System.out.println("You have created MacOSButton.");
    }
}
