package cards;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Master {
    static CardLayout cardLayout = new CardLayout();

    static JPanel cardHolder = new JPanel(cardLayout);

    public Master() {

        JFrame masterFrame = new JFrame();

        Login login = new Login();
        Dashboard dashboard = new Dashboard();

        cardHolder.add(login, "Login");
        cardHolder.add(dashboard, "Dashboard");

        masterFrame.getContentPane().add(cardHolder);

        masterFrame.setTitle("Census Duty Management System");
        masterFrame.setSize(500, 500);
        masterFrame.setLocationRelativeTo(null);
        masterFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        masterFrame.setVisible(true);
    }

    public static void next() {
        CardLayout c1 = (CardLayout) (cardHolder.getLayout());
        c1.next(cardHolder);
    }

    public static void previous() {
        CardLayout c2 = (CardLayout) (cardHolder.getLayout());
        c2.previous(cardHolder);
    }
}
