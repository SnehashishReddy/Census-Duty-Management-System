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
        TeacherDashboard dashboard = new TeacherDashboard();
        
        cardHolder.add(login, "Login");
        cardHolder.add(dashboard, "Teacher Dashboard");

        masterFrame.getContentPane().add(cardHolder);

        masterFrame.setTitle("Census Duty Management System");
        masterFrame.setSize(850, 500);
        masterFrame.setLocationRelativeTo(null);
        masterFrame.setDefaultLookAndFeelDecorated(true);
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

    public static void goTo(String name) {
        CardLayout c3 = (CardLayout) (cardHolder.getLayout());
        c3.show(cardHolder, name);
    }

    public static void first() {
        CardLayout c4 = (CardLayout) (cardHolder.getLayout());
        c4.first(cardHolder);
    }

    public static void last() {
        CardLayout c5 = (CardLayout) (cardHolder.getLayout());
        c5.last(cardHolder);
    }
}
