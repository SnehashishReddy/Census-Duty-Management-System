package cards;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Login extends JPanel {
    public Login() {
        JButton nextButton = new JButton("Login");
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.goTo("UserManagement");
            }
        });
        add(nextButton);
        JButton anotherNextButton = new JButton("Next");
        anotherNextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.goTo("RegPart");
            }
        });
        add(anotherNextButton);
    }
}
