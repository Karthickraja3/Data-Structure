import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {
    private JTextField userField;
    private JPasswordField passField;
    private JButton loginButton;
    private JLabel messageLabel;

    public LoginForm() {
        setTitle("Login Page");
        setSize(350, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new GridLayout(4, 2, 10, 10));

        // Username Label and Field
        add(new JLabel("Username:"));
        userField = new JTextField();
        add(userField);

        // Password Label and Field
        add(new JLabel("Password:"));
        passField = new JPasswordField();
        add(passField);

        // Message Label
        messageLabel = new JLabel();
        add(messageLabel);

        // Empty Label for spacing
        add(new JLabel());

        // Login Button
        loginButton = new JButton("Login");
        loginButton.addActionListener(this);
        add(loginButton);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = userField.getText();
        String password = new String(passField.getPassword());

        // Simple validation against hardcoded credentials
        if ("admin".equals(username) && "password123".equals(password)) {
            messageLabel.setText("Login successful!");
        } else {
            messageLabel.setText("Invalid credentials.");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
