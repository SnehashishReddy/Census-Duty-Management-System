package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Dashboard extends JPanel {
    public Dashboard() {
        JButton previousButton = new JButton("Dashboard");
        previousButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Master.previous();
            }
        });
        add(previousButton);
    }
}
