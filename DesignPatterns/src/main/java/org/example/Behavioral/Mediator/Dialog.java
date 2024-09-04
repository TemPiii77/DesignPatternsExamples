package org.example.Behavioral.Mediator;

import java.awt.*;

public class Dialog implements Mediator {
    private TextField userTextBox;
    private TextField passTextBox;
    private LoginButton button;

    @Override
    public void login() {
        String username = userTextBox.getText();
        String password = passTextBox.getText();
    }
}
