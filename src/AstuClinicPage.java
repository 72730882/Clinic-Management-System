import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AstuClinicPage {
    private JFrame frame;
    private ImageIcon imageIcon;
    private JButton searchButton,addNewButton, bimage;
    public JLabel mainLabel, lRecpt, lname, lid;
    public JTextField  tname, tid;
    public AstuClinicPage() {
        // frame
        frame = new JFrame("ASTU Clinic Management System");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(null); // Set null layout

        //Creat Labels
        imageIcon =new ImageIcon("src\\icon.png");
        bimage = new JButton();
        bimage.setIcon(imageIcon);
        mainLabel = new JLabel("WELCOME TO ASTU CLINIC");
        lRecpt = new JLabel("RECEPTION");
        lname = new JLabel(" Patient Name");
        lid = new JLabel("Patient ID");
        bimage.setBounds(30,40,250,250);
        mainLabel.setBounds(50,270,250,110);
        lRecpt.setBounds(100,300,250,110);
        lname.setBounds(350,150,90,20);
        lid.setBounds(350,200,90,20);


        //Create Textfeids
        tname = new JTextField();
        tid = new JTextField();
        tname.setBounds(350,180,90,20);
        tid.setBounds(350,230,90,20);

        // Create buttons
        searchButton = new JButton("Search");
        addNewButton = new JButton("Add New");

        // Set button positions and sizes using absolute coordinates
        searchButton.setBounds(290, 330, 90, 20);
        addNewButton.setBounds(390, 330, 90, 20);
       // Search Button Actions
        searchButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String tid3 = tid.getText();
                if(!tid3.isEmpty()) {
                    Frame3 obj3 = new Frame3();
                    obj3.setVisible(true);
                    obj3.searchById(tid3);
                }
                else {
                    JOptionPane.showMessageDialog(frame, "ID Field cannot be empty", "Error", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        //Add Button Actions
        addNewButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame2 obj2 = new Frame2();
                obj2.setVisible(true);
            }
        });
        // Add buttons to the frame
        frame.add(searchButton);
        frame.add(addNewButton);
        frame.add(mainLabel);
        frame.add(lname);
        frame.add(lid);
        frame.add(tname); frame.add(tid); frame.add(lRecpt);
        Color customColor = new Color(210, 224, 251);
        frame.getContentPane().setBackground(customColor);
        frame.add(bimage);
        frame.setVisible(true);

    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new AstuClinicPage();
            }
        });
    }

}