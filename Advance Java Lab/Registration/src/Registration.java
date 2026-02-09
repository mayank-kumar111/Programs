import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

// The class name is changed to 'Registration' to match your file name 'Registration.java'
public class Registration extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nameField;
    private JTextField emailField;
    private JTextField contactField;
    private JRadioButton rdbtnMale;
    private JRadioButton rdbtnFemale;
    private JComboBox<String> dayComboBox;
    private JComboBox<String> monthComboBox;
    private JComboBox<String> yearComboBox;
    private final ButtonGroup genderGroup = new ButtonGroup();
    private JCheckBox chckbxC;
    private JCheckBox chckbxCpp;
    private JCheckBox chckbxCsharp;
    private JCheckBox chckbxJava;


    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    // The class name here is also changed to 'Registration'
                    Registration frame = new Registration();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    // The constructor name is changed to 'Registration'
    public Registration() {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 370);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitle = new JLabel("Registration Form");
        lblTitle.setFont(new Font("Sitka Banner", Font.BOLD, 20));
        lblTitle.setBounds(145, 10, 175, 23);
        contentPane.add(lblTitle);

        JLabel lblName = new JLabel("Name:");
        lblName.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblName.setBounds(35, 55, 88, 23);
        contentPane.add(lblName);
        nameField = new JTextField();
        nameField.setBounds(120, 58, 250, 20);
        contentPane.add(nameField);
        nameField.setColumns(10);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblEmail.setBounds(35, 89, 88, 23);
        contentPane.add(lblEmail);
        emailField = new JTextField();
        emailField.setColumns(10);
        emailField.setBounds(120, 92, 250, 20);
        contentPane.add(emailField);

        JLabel lblContact = new JLabel("Contact:");
        lblContact.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblContact.setBounds(35, 123, 88, 23);
        contentPane.add(lblContact);
        contactField = new JTextField();
        contactField.setColumns(10);
        contactField.setBounds(120, 126, 250, 20);
        contentPane.add(contactField);

        JLabel lblGender = new JLabel("Gender:");
        lblGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblGender.setBounds(35, 157, 88, 23);
        contentPane.add(lblGender);
        rdbtnMale = new JRadioButton("Male");
        rdbtnMale.setSelected(true);
        genderGroup.add(rdbtnMale);
        rdbtnMale.setBounds(120, 159, 74, 23);
        contentPane.add(rdbtnMale);
        rdbtnFemale = new JRadioButton("Female");
        genderGroup.add(rdbtnFemale);
        rdbtnFemale.setBounds(200, 159, 74, 23);
        contentPane.add(rdbtnFemale);

        JLabel lblDob = new JLabel("DOB:");
        lblDob.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblDob.setBounds(35, 191, 88, 23);
        contentPane.add(lblDob);
        
        dayComboBox = new JComboBox<>();
        dayComboBox.setModel(new DefaultComboBoxModel<>(new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"}));
        dayComboBox.setBounds(120, 193, 60, 22);
        contentPane.add(dayComboBox);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthComboBox = new JComboBox<>(months);
        monthComboBox.setBounds(190, 193, 70, 22);
        contentPane.add(monthComboBox);

        ArrayList<String> years = new ArrayList<>();
        for (int i = 1990; i <= 2010; i++) {
            years.add(String.valueOf(i));
        }
        yearComboBox = new JComboBox<>(years.toArray(new String[0]));
        yearComboBox.setBounds(270, 193, 70, 22);
        contentPane.add(yearComboBox);

        JLabel lblSkills = new JLabel("Skills:");
        lblSkills.setFont(new Font("Tahoma", Font.PLAIN, 14));
        lblSkills.setBounds(35, 225, 88, 23);
        contentPane.add(lblSkills);
        chckbxC = new JCheckBox("C");
        chckbxC.setBounds(120, 227, 50, 23);
        contentPane.add(chckbxC);
        chckbxCpp = new JCheckBox("C++");
        chckbxCpp.setBounds(175, 227, 50, 23);
        contentPane.add(chckbxCpp);
        chckbxCsharp = new JCheckBox("C#");
        chckbxCsharp.setBounds(230, 227, 50, 23);
        contentPane.add(chckbxCsharp);
        chckbxJava = new JCheckBox("Java");
        chckbxJava.setBounds(285, 227, 74, 23);
        contentPane.add(chckbxJava);
        
        JButton btnRegister = new JButton("Register");
        btnRegister.setFont(new Font("Tahoma", Font.BOLD, 14));
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = nameField.getText();
                String email = emailField.getText();
                String mobile = contactField.getText();
                String gender = rdbtnMale.isSelected() ? "Male" : "Female";
                String dob = dayComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + "-" + yearComboBox.getSelectedItem();
                
                ArrayList<String> skillsList = new ArrayList<>();
                if (chckbxC.isSelected()) skillsList.add(chckbxC.getText());
                if (chckbxCpp.isSelected()) skillsList.add(chckbxCpp.getText());
                if (chckbxCsharp.isSelected()) skillsList.add(chckbxCsharp.getText());
                if (chckbxJava.isSelected()) skillsList.add(chckbxJava.getText());
                String skills = String.join(", ", skillsList);

                if (name.isEmpty() || email.isEmpty() || mobile.isEmpty()) {
                    JOptionPane.showMessageDialog(btnRegister, "Please fill all required fields.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                
                if (mobile.length() != 10 || !mobile.matches("\\d{10}")) {
                    JOptionPane.showMessageDialog(btnRegister, "Please enter a valid 10-digit mobile number.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                String url = "jdbc:mysql://localhost:3306/registration_java_lab";
                String user = "root";
                String pass = "MySQL72588@$";
                
                String query = "INSERT INTO registrations (name, email, mobile, gender, dob, skills) VALUES (?, ?, ?, ?, ?, ?)";
                
                try {
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    
                    try (Connection con = DriverManager.getConnection(url, user, pass);
                         PreparedStatement pst = con.prepareStatement(query)) {

                        pst.setString(1, name);
                        pst.setString(2, email);
                        pst.setString(3, mobile);
                        pst.setString(4, gender);
                        pst.setString(5, dob);
                        pst.setString(6, skills);

                        int rowsAffected = pst.executeUpdate();
                        if (rowsAffected > 0) {
                            JOptionPane.showMessageDialog(btnRegister, "Welcome, " + name + "! Your account was successfully created.");
                            nameField.setText("");
                            emailField.setText("");
                            contactField.setText("");
                        } else {
                            JOptionPane.showMessageDialog(btnRegister, "Registration failed.", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    }
                } catch (ClassNotFoundException ex) {
                    JOptionPane.showMessageDialog(btnRegister, "MySQL JDBC Driver not found.", "Driver Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(btnRegister, "Database Error: " + ex.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
                    ex.printStackTrace();
                }
            }
        });
        btnRegister.setBounds(175, 280, 120, 30);
        contentPane.add(btnRegister);
    }
}