package frontend.tabs;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

public class RegPart extends JPanel {
    public RegPart() {
        setLayout(new BorderLayout());
        // JLabel jl = new JLabel("Local Registry Partition");
        // add(jl, BorderLayout.NORTH);
        String data[][] = { { "101", "Amit", "670000" },
                { "102", "Jai", "780000" },
                { "101", "Sachin", "700000" } };
        String column[] = { "ID", "NAME", "SALARY" };
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        add(sp);
    }
}
