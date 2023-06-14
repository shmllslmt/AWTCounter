import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AWTCounter extends JFrame {
    private JLabel lblCounter;
    private JTextField txtCounter;
    private JButton btnCounter;
    private int counter = 0;

    AWTCounter()  {
        // Setting up the layout of the GUI or the frame to flow from left to right
        setLayout(new FlowLayout());
        // Set the size of the frame
        setSize(400, 100);
        // Set the title or header of the frame
        setTitle("AWT Counter");

        lblCounter = new JLabel("Counter");
        add(lblCounter);    // Adding label to the frame

        txtCounter = new JTextField("0", 10);
        txtCounter.setEditable(false);
        add(txtCounter);

        btnCounter = new JButton("Increase Counter");
        add(btnCounter);
        btnCounter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter += 10;
                txtCounter.setText(counter + "");
            }
        });
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AWTCounter().setVisible(true);
            }
        });
    }
}