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
        // String data[][] = { { "101", "Amit", "MALE", "9176907338", "M.Tech", "INDIAN"
        // },
        // { "102", "Bob", "MALE", "9182364810", "B.Tech", "INDIAN" },
        // { "103", "Sachin", "MALE", "5674251942", "M. Sc.", "INDIAN" },
        // { "104", "John", "MALE", "2564736775", "PhD", "INDIAN" },
        // { "106", "Sammy", "MALE", "4623674567", "M.Tech", "INDIAN" } };
        // String column[] = { "FORM ID", "NAME", "GENDER", "PHONE NO", "EDUCATION",
        // "NATIONALITY" };
        String data[][] = { { "", "", "", "", "", "", "", "", "", "", "", "", "" } };
        String column[] = { "Form ID", "NAME", "PHONE NO.", "AADHAR NO.", "GENDER",
                "EDUCATION", "OCCUPATION", "NATIONALITY" };
        JTable jt = new JTable(data, column);
        jt.setEnabled(false);
        JScrollPane sp = new JScrollPane(jt);
        add(sp);
    }
}