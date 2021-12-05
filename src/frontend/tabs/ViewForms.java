package frontend.tabs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class ViewForms extends JPanel {
    public ViewForms() {
        setLayout(new BorderLayout());
        JLabel jl = new JLabel("Forms Submitted");
        add(jl, BorderLayout.NORTH);
        String data[][] = { { "101", "person-1", "M" },
                { "102", "Person-2", "M" },
                { "101", "Person-3", "F" } };
        String column[] = { "ID", "NAME", "GENDER" };
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        add(sp);
    }
}