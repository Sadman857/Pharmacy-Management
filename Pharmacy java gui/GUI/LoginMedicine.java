package GUI;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginMedicine extends JFrame implements ActionListener {

    private Container c;
    private JLabel userLabel, passLabel, titleLabel;
    private JTextField userTF;
    private JPasswordField passPF;
    private JButton loginBtn, exitBtn;

    private Font labelFont = new Font("Arial", Font.BOLD, 16);
    private Font titleFont = new Font("Arial", Font.BOLD, 22);
    private Font btnFont = new Font("Verdana", Font.BOLD, 16);

    public LoginMedicine() {
        super("Login Page");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        // Container 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(Color.LIGHT_GRAY);

        // Title
        titleLabel = new JLabel("Pharmacy Login", JLabel.CENTER);
        titleLabel.setBounds(100, 20, 200, 30);
        titleLabel.setFont(titleFont);
        titleLabel.setForeground(Color.BLUE);
        c.add(titleLabel);

        // Username
        userLabel = new JLabel("Username:");
        userLabel.setBounds(50, 80, 120, 25);
        userLabel.setFont(labelFont);
        c.add(userLabel);

        userTF = new JTextField();
        userTF.setBounds(180, 80, 150, 25);
        c.add(userTF);

        // Password
        passLabel = new JLabel("Password:");
        passLabel.setBounds(50, 120, 120, 25);
        passLabel.setFont(labelFont);
        c.add(passLabel);

        passPF = new JPasswordField();
        passPF.setBounds(180, 120, 150, 25);
        c.add(passPF);

        // Buttons
        loginBtn = new JButton("Login");
        loginBtn.setFont(btnFont);
        loginBtn.setBounds(70, 180, 100, 35);
        loginBtn.addActionListener(this);
        c.add(loginBtn);

        exitBtn = new JButton("Exit");
        exitBtn.setFont(btnFont);
        exitBtn.setBounds(220, 180, 100, 35);
        exitBtn.addActionListener(this);
        c.add(exitBtn);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginBtn) {
            String user = userTF.getText();
            String pass = new String(passPF.getPassword());

            if (user.equals("admin") && pass.equals("1234")) {
                JOptionPane.showMessageDialog(this, "Login Successful!");
                this.dispose(); 
                new PharmacyManagementGUI(); // Open main GUI
            } else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password!");
            }
        } else if (e.getSource() == exitBtn) {
            System.exit(0);
        }
    }
}