package frontend.tabs;

import backend.PostgreSQLAccess;
import frontend.cards.*;

import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.*;

public class ViewForms extends JPanel {
    public static String query = "";
    public static JScrollPane sp = new JScrollPane();
    public static String teacherID;

    public ViewForms() {
        setLayout(new BorderLayout());
        JLabel jl = new JLabel("Forms Submitted");
        add(jl, BorderLayout.NORTH);
        add(sp);
    }

    public static void onTeacherLogin() {
        query = "select form_id, district_id, firstname, phone_no, aadhaar_no, gender, education, occupation, nationality from Census where teacher_id='"
                + TeacherDashboard.teacher.getTeacherID() + "';";
        ResultSet rs;
        ResultSetMetaData rsmd;
        ArrayList<ArrayList<String>> regpart = new ArrayList<>();
        try {
            rs = PostgreSQLAccess.fetch(query);
            rsmd = rs.getMetaData();
            int column_no = rsmd.getColumnCount();
            while (rs.next()) {
                ArrayList<String> row = new ArrayList<>();
                for (int x = 1; x <= column_no; x++) {
                    row.add((String) rs.getString(x));
                    // System.out.println(rs.getString(x));
                }
                regpart.add(row);
                System.out.println("Row completed.");
            }
            for (int x = 0; x < regpart.size(); x++) {
                System.out.printf("Row %d: ", x + 1);
                for (int y = 0; y < regpart.get(x).size(); y++) {
                    System.out.printf("%s ", regpart.get(x).get(y));
                }
                System.out.println();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        String data[][] = regpart.stream().map(u -> u.toArray(new String[0])).toArray(String[][]::new);
        String column[] = { "Form ID", "D-ID", "NAME", "PHONE NO.", "AADHAR NO.", "GENDER",
                "EDUCATION", "OCCUPATION", "NATIONALITY" };
        JTable jt = new JTable(data, column);
        jt.setEnabled(false);
        sp.setViewportView(jt);
    }
}