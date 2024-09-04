package org.example.Behavioral.Mediator;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ComponentListener;

public class LoginButton extends JButton implements Component {
    private Mediator mediator;

    public LoginButton() {
        super("Log In");
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.login();
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    public String getName() {
        return "LoginButton";
    }
}
