import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyFirstGUI extends JFrame implements ActionListener {
    private JLabel l1, l2;
    private JTextField tF1, tF2, tF3;
    private JButton b1, b2;
    MyFirstGUI() {
        // setting up two labels in front of text fields
        l1 = new JLabel("Username");
        l1.setBounds(25, 50, 150, 30);
        l2 = new JLabel("Email");
        l2.setBounds(25, 100, 150, 30);
        l1.setFont(new Font("Comic Sans", Font.BOLD, 14));
        l2.setFont(new Font("Comic Sans", Font.BOLD, 14));
        l2.setForeground(Color.white);
        l1.setForeground(Color.white);
        // adding labels into frame
        add(l2);
        add(l1);

        // setting up two textfields
        tF1 = new JTextField();
        tF1.setBounds(110, 50, 250, 30);
        tF2 = new JTextField();
        tF2.setBounds(110, 100, 250, 30);
        tF3 = new JTextField();
        tF3.setBounds(125, 175, 100, 30);
        tF3.addActionListener(this);
        tF3.setFont(new Font("Comic Sans", Font.BOLD, 16));
        // adding text fields into frame
        add(tF1);
        add(tF2);
        add(tF3);
        // setting two buttons
        b1 = new JButton("Login");
        b2 = new JButton("Cancel");
        b1.setBounds(100, 250, 80, 30);
        b1.addActionListener(this);
        b2.setBounds(200, 250, 100, 30);
        b2.addActionListener(this);
        b1.setFont(new Font("Comic Sans", Font.BOLD, 15));
        b2.setFont(new Font("Comic Sans", Font.BOLD, 15));
        b1.setBackground(Color.LIGHT_GRAY);
        b2.setBackground(Color.LIGHT_GRAY);
        // adding buttons into frame
        add(b1);
        add(b2);

        setSize(420, 420);  // frame size
        setLayout(null);
        setVisible(true); // now frame will be visible(by default not visible)
        setResizable(false); // prevent frame from being resized
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the application
        setTitle("Login Frame"); // sets title of frame
        getContentPane().setBackground(Color.DARK_GRAY);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1) {
            tF3.setText("  Welcome!");
            tF3.setBackground(Color.GREEN);
        } else { 
            tF3.setText("  Cancelled!");
            tF3.setBackground(Color.RED);
        }
    }
    public static void main(String []args) {
        new MyFirstGUI(); // takes less memory
    }
}
