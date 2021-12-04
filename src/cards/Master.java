package cards;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class Master {
    static CardLayout cardLayout = new CardLayout();

    static JPanel cardHolder = new JPanel(cardLayout);

    static JFrame masterFrame = new JFrame();

    public Master() {

        Login login = new Login();
        TeacherDashboard dashboard = new TeacherDashboard();
        UserManagement usermanagement = new UserManagement();
        RegPart regpart = new RegPart();

        cardHolder.add(login, "Login");
        cardHolder.add(dashboard, "TeacherDashboard");
        cardHolder.add(usermanagement, "UserManagement");
        cardHolder.add(regpart, "RegPart");

        masterFrame.getContentPane().add(cardHolder);

        masterFrame.setTitle("Census Duty Management System");
        masterFrame.setSize(850, 500);
        masterFrame.setLocationRelativeTo(null);
        masterFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        masterFrame.setVisible(true);
        masterFrame.setResizable(false);
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
