import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame frame ;
    private JButton button;
    private JLabel label;
    private JPanel panel;
    private int counter = 0;

    public GUI() {

        //creating a frame
        frame = new JFrame();

        button = new JButton("Clicker");
        button.addActionListener(this);
        label  = new JLabel("Number of Clicks: " +counter);


        // creating a panle
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);


        frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        frame.add(panel, BorderLayout.CENTER);
        frame.setTitle("GUI");
        frame.pack();
        frame.setVisible(true);

    }


    public static void main(String[] args) {
        GUI gui = new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        label.setText("Number of Clicks: " +counter);
    }
}
