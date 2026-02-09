import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class LoginForm extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField emailField;
    private JPasswordField passwordField;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    LoginForm frame = new LoginForm();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public LoginForm() {
        setTitle("User Login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(null);
        setContentPane(contentPane);

        JLabel lblTitle = new JLabel("User Login");
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitle.setFont(new Font("Arial", Font.BOLD, 24));
        lblTitle.setBounds(10, 11, 414, 32);
        contentPane.add(lblTitle);

        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblEmail.setBounds(27, 68, 108, 26);
        contentPane.add(lblEmail);

        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblPassword.setBounds(27, 122, 108, 26);
        contentPane.add(lblPassword);

        emailField = new JTextField();
        emailField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        emailField.setBounds(138, 68, 213, 32);
        contentPane.add(emailField);
        emailField.setColumns(10);

        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Tahoma", Font.PLAIN, 16));
        passwordField.setBounds(138, 122, 213, 32);
        contentPane.add(passwordField);

        JButton btnLogin = new JButton("Login");
        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String email = emailField.getText();
                String password = new String(passwordField.getPassword());

                if (email.isEmpty() || password.isEmpty()) {
                    JOptionPane.showMessageDialog(btnLogin, "Email and Password cannot be empty.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }

                if (validateCredentials(email, password)) {
                    JOptionPane.showMessageDialog(btnLogin, "Welcome, " + email + "!", "Login Successful", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(btnLogin, "Invalid email or password.", "Login Failed", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btnLogin.setFont(new Font("Tahoma", Font.BOLD, 18));
        btnLogin.setBounds(168, 195, 96, 32);
        contentPane.add(btnLogin);
    }

    private boolean validateCredentials(String email, String password) {
        String url = "jdbc:mysql://localhost:3306/registration_java_lab";
        String user = "root";
        String dbPassword = "MySQL72588@$"; // Your MySQL password

        // The SQL query is now updated to use the new 'user_login' table
        String sql = "SELECT * FROM user_login WHERE email = ? AND password = ?";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            try (Connection connection = DriverManager.getConnection(url, user, dbPassword);
                 PreparedStatement statement = connection.prepareStatement(sql)) {

                statement.setString(1, email);
                statement.setString(2, password);

                try (ResultSet resultSet = statement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "MySQL Driver not found!", "Driver Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Database Error: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        return false;
    }
}