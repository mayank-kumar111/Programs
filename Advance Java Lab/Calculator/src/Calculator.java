import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Calculator extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textField;
    private JLabel historyLabel;

    private double firstOperand = 0;
    private String currentOperator = "";
    private boolean isNewInput = true;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                new Calculator().setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Calculator() {
        // --- Frame and Component Setup ---
        setTitle("Calculator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null); // Keep null layout to preserve design
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);

        textField = new JTextField();
        textField.setEditable(false);
        textField.setBounds(10, 65, 170, 20);
        contentPane.add(textField);

        JLabel titleLabel = new JLabel("Calculator");
        titleLabel.setFont(new Font("Serif", Font.PLAIN, 24));
        titleLabel.setBounds(168, 11, 170, 20);
        contentPane.add(titleLabel);

        historyLabel = new JLabel("");
        historyLabel.setFont(new Font("Serif", Font.PLAIN, 20));
        historyLabel.setBounds(246, 61, 133, 20);
        contentPane.add(historyLabel);

        // --- Create all buttons using the helper method ---
        createButton("1", 10, 96, 50, 20);
        createButton("2", 70, 96, 50, 20);
        createButton("3", 130, 96, 50, 20);
        createButton("4", 10, 127, 50, 20);
        createButton("5", 70, 126, 50, 20);
        createButton("6", 130, 126, 50, 20);
        createButton("7", 10, 158, 50, 20);
        createButton("8", 70, 157, 50, 20);
        createButton("9", 130, 157, 50, 20);
        createButton("0", 70, 188, 50, 20);

        createButton("+", 246, 95, 50, 20);
        createButton("-", 246, 126, 50, 20);
        createButton("/", 246, 157, 50, 20);
        createButton("*", 246, 187, 50, 20);
        createButton("sqrt", 316, 95, 63, 20);
        createButton("mod", 316, 126, 63, 20);
        createButton("clear", 316, 157, 63, 20);
        createButton("=", 316, 187, 63, 20);
    }

    /**
     * Helper method to create, place, and add a listener to a button.
     */
    private void createButton(String text, int x, int y, int width, int height) {
        JButton button = new JButton(text);
        button.setBounds(x, y, width, height);
        button.addActionListener(this);
        contentPane.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();
        if ("0123456789".contains(command)) {
            if (isNewInput) textField.setText("");
            textField.setText(textField.getText() + command);
            isNewInput = false;
        } else {
            handleOperator(command);
        }
    }
    
    private void handleOperator(String op) {
        if (textField.getText().isEmpty() && !op.equals("clear")) return;
        
        try {
            double value = op.equals("clear") ? 0 : Double.parseDouble(textField.getText());
            switch (op) {
                case "clear":
                    textField.setText("");
                    historyLabel.setText("");
                    firstOperand = 0;
                    currentOperator = "";
                    isNewInput = true;
                    break;
                case "sqrt":
                    if (value < 0) { showError("Invalid input for sqrt"); return; }
                    double sqrtResult = Math.sqrt(value);
                    historyLabel.setText("sqrt(" + value + ") = " + sqrtResult);
                    textField.setText(String.valueOf(sqrtResult));
                    isNewInput = true;
                    break;
                case "=":
                    if (!currentOperator.isEmpty()) calculateResult(value);
                    break;
                default: // For +, -, *, /, mod
                    firstOperand = value;
                    currentOperator = op;
                    historyLabel.setText(firstOperand + " " + currentOperator);
                    isNewInput = true;
                    break;
            }
        } catch (NumberFormatException e) {
            showError("Invalid Number");
        }
    }
    
    private void calculateResult(double secondOperand) {
        double result = 0;
        switch (currentOperator) {
            case "+": result = firstOperand + secondOperand; break;
            case "-": result = firstOperand - secondOperand; break;
            case "*": result = firstOperand * secondOperand; break;
            case "mod": result = firstOperand % secondOperand; break;
            case "/":
                if (secondOperand == 0) { showError("Cannot divide by zero"); return; }
                result = firstOperand / secondOperand;
                break;
        }
        historyLabel.setText(firstOperand + " " + currentOperator + " " + secondOperand + " = " + result);
        textField.setText(String.valueOf(result));
        isNewInput = true;
        currentOperator = "";
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Error", JOptionPane.ERROR_MESSAGE);
    }
}