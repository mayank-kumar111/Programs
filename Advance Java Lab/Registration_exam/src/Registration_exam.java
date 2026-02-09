import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Registration_exam extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField nameField, emailField, contactField;
    private JRadioButton rdbtnMale, rdbtnFemale;
    private JComboBox<String> dayComboBox, monthComboBox, yearComboBox;
    private JCheckBox chckbxC, chckbxCpp, chckbxCsharp, chckbxJava;
    private ButtonGroup genderGroup;

    // --- DATABASE CONFIGURATION ---
    // UPDATE THESE WITH YOUR OWN DATABASE DETAILS
    private static final String DB_URL = "jdbc:mysql://localhost:3306/registration_java_lab";
    private static final String DB_USER = "root";
    private static final String DB_PASS = "MySQL72588@$"; 

    public static void main(String[] args) {
        // Use Nimbus Look and Feel for a modern look
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            // If Nimbus isn't available, fall back to default
        }

        EventQueue.invokeLater(() -> {
            try {
                Registration_exam frame = new Registration_exam();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Registration_exam() {
        setTitle("Student Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 550);
        setLocationRelativeTo(null); // Center the window on screen

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(10, 10, 10, 10));
        contentPane.setLayout(new BorderLayout(0, 20));
        setContentPane(contentPane);

        // --- 1. HEADER SECTION ---
        JPanel headerPanel = new JPanel();
        headerPanel.setBackground(new Color(70, 130, 180)); // Steel Blue
        JLabel lblTitle = new JLabel("Participant Registration Form");
        lblTitle.setForeground(Color.WHITE);
        lblTitle.setFont(new Font("Segoe UI", Font.BOLD, 22));
        lblTitle.setBorder(new EmptyBorder(10, 0, 10, 0));
        headerPanel.add(lblTitle);
        contentPane.add(headerPanel, BorderLayout.NORTH);

        // --- 2. FORM SECTION (Using GridBagLayout) ---
        JPanel formPanel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10); // Padding around elements
        gbc.fill = GridBagConstraints.HORIZONTAL;
        
        // Name
        addComponent(formPanel, new JLabel("Full Name:"), 0, 0, gbc);
        nameField = new JTextField(20);
        addComponent(formPanel, nameField, 1, 0, gbc);

        // Email
        addComponent(formPanel, new JLabel("Email Address:"), 0, 1, gbc);
        emailField = new JTextField(20);
        addComponent(formPanel, emailField, 1, 1, gbc);

        // Contact
        addComponent(formPanel, new JLabel("Contact No:"), 0, 2, gbc);
        contactField = new JTextField(20);
        addComponent(formPanel, contactField, 1, 2, gbc);

        // Gender
        addComponent(formPanel, new JLabel("Gender:"), 0, 3, gbc);
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        rdbtnMale = new JRadioButton("Male");
        rdbtnMale.setSelected(true);
        rdbtnFemale = new JRadioButton("Female");
        genderGroup = new ButtonGroup();
        genderGroup.add(rdbtnMale);
        genderGroup.add(rdbtnFemale);
        genderPanel.add(rdbtnMale);
        genderPanel.add(Box.createHorizontalStrut(10));
        genderPanel.add(rdbtnFemale);
        addComponent(formPanel, genderPanel, 1, 3, gbc);

        // DOB
        addComponent(formPanel, new JLabel("Date of Birth:"), 0, 4, gbc);
        JPanel dobPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        
        String[] days = new String[31];
        for(int i=0; i<31; i++) days[i] = String.valueOf(i+1);
        dayComboBox = new JComboBox<>(days);

        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        monthComboBox = new JComboBox<>(months);

        int currentYear = Calendar.getInstance().get(Calendar.YEAR);
        ArrayList<String> years = new ArrayList<>();
        for (int i = 1980; i <= currentYear - 10; i++) years.add(String.valueOf(i));
        yearComboBox = new JComboBox<>(years.toArray(new String[0]));

        dobPanel.add(dayComboBox);
        dobPanel.add(Box.createHorizontalStrut(5));
        dobPanel.add(monthComboBox);
        dobPanel.add(Box.createHorizontalStrut(5));
        dobPanel.add(yearComboBox);
        addComponent(formPanel, dobPanel, 1, 4, gbc);

        // Skills
        addComponent(formPanel, new JLabel("Technical Skills:"), 0, 5, gbc);
        JPanel skillsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 0, 0));
        chckbxC = new JCheckBox("C");
        chckbxCpp = new JCheckBox("C++");
        chckbxCsharp = new JCheckBox("C#");
        chckbxJava = new JCheckBox("Java");
        skillsPanel.add(chckbxC);
        skillsPanel.add(chckbxCpp);
        skillsPanel.add(chckbxCsharp);
        skillsPanel.add(chckbxJava);
        addComponent(formPanel, skillsPanel, 1, 5, gbc);

        contentPane.add(formPanel, BorderLayout.CENTER);

        // --- 3. FOOTER / BUTTON SECTION ---
        JPanel buttonPanel = new JPanel();
        JButton btnRegister = new JButton("Submit Registration");
        btnRegister.setFont(new Font("Segoe UI", Font.BOLD, 14));
        btnRegister.setBackground(new Color(60, 179, 113)); // Medium Sea Green
        btnRegister.setForeground(Color.WHITE);
        btnRegister.setFocusPainted(false);
        
        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                handleRegistration();
            }
        });

        buttonPanel.add(btnRegister);
        contentPane.add(buttonPanel, BorderLayout.SOUTH);
    }

    // Helper method to add components to GridBagLayout cleanly
    private void addComponent(JPanel panel, JComponent component, int x, int y, GridBagConstraints gbc) {
        gbc.gridx = x;
        gbc.gridy = y;
        // If it's a label (column 0), align right. If it's a field (column 1), align left/fill
        gbc.anchor = (x == 0) ? GridBagConstraints.EAST : GridBagConstraints.WEST;
        panel.add(component, gbc);
    }

    private void handleRegistration() {
        String name = nameField.getText().trim();
        String email = emailField.getText().trim();
        String mobile = contactField.getText().trim();
        String gender = rdbtnMale.isSelected() ? "Male" : "Female";
        String dob = dayComboBox.getSelectedItem() + "-" + monthComboBox.getSelectedItem() + "-" + yearComboBox.getSelectedItem();
        
        ArrayList<String> skillsList = new ArrayList<>();
        if (chckbxC.isSelected()) skillsList.add("C");
        if (chckbxCpp.isSelected()) skillsList.add("C++");
        if (chckbxCsharp.isSelected()) skillsList.add("C#");
        if (chckbxJava.isSelected()) skillsList.add("Java");
        String skills = String.join(", ", skillsList);

        // Validation
        if (name.isEmpty() || email.isEmpty() || mobile.isEmpty()) {
            JOptionPane.showMessageDialog(this, "All fields are required!", "Validation Error", JOptionPane.WARNING_MESSAGE);
            return;
        }
        if (!mobile.matches("\\d{10}")) {
            JOptionPane.showMessageDialog(this, "Please enter a valid 10-digit mobile number.", "Input Error", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Perform Database Operation
        boolean success = saveStudentData(name, email, mobile, gender, dob, skills);
        
        if (success) {
            JOptionPane.showMessageDialog(this, "Student Registered Successfully!");
            // Clear fields
            nameField.setText("");
            emailField.setText("");
            contactField.setText("");
            genderGroup.clearSelection();
            chckbxC.setSelected(false);
            chckbxCpp.setSelected(false);
            chckbxCsharp.setSelected(false);
            chckbxJava.setSelected(false);
        } else {
            JOptionPane.showMessageDialog(this, "Registration Failed. Check Database Connection.", "Database Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Separate method for Database Logic
    private boolean saveStudentData(String name, String email, String mobile, String gender, String dob, String skills) {
        String query = "INSERT INTO students (name, email, contact, gender, dob, skills) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection con = DriverManager.getConnection(DB_URL, DB_USER, DB_PASS);
                 PreparedStatement pst = con.prepareStatement(query)) {

                pst.setString(1, name);
                pst.setString(2, email);
                pst.setString(3, mobile);
                pst.setString(4, gender);
                pst.setString(5, dob);
                pst.setString(6, skills);

                int rowCount = pst.executeUpdate();
                return rowCount > 0;
            }
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver not found!");
            e.printStackTrace();
            return false;
        } catch (SQLException e) {
            System.err.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
            return false;
        }
    }
}