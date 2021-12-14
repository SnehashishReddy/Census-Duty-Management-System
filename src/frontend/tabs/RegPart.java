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
        // String data[][] = { { "101", "Amit", "MALE", "9176907338", "M.Tech", "INDIAN"
        // },
        // { "102", "Bob", "MALE", "9182364810", "B.Tech", "INDIAN" },
        // { "103", "Sachin", "MALE", "5674251942", "M. Sc.", "INDIAN" },
        // { "104", "John", "MALE", "2564736775", "PhD", "INDIAN" },
        // { "105", "Marie", "FEMALE", "6380381945", "M.Tech", "INDIAN" },
        // { "106", "Sammy", "MALE", "4623674567", "M.Tech", "INDIAN" } };
        String data[][] = { { "", "", "", "", "", "", "", "", "", "", "", "", "", "", "" } };
        String column[] = { "Form ID", "T-ID", "D-ID", "NAME", "PHONE NO.", "AADHAR NO.", "GENDER",
                "EDUCATION", "OCCUPATION", "NATIONALITY" };
        JTable jt = new JTable(data, column);
        JScrollPane sp = new JScrollPane(jt);
        add(sp);
    }
}