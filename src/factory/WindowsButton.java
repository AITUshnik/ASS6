package factory;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Windows button implementation.
 */
public class WindowsButton implements Button {
    JPanel panel = new JPanel();
    JFrame frame = new JFrame();
    JButton button;
// There is realization of the Button interface
    public void render() {
        //Java code that define how Windows Tab will be
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel("Hello World!");
        label.setOpaque(true);
        label.setBackground(new Color(235, 233, 126));
        label.setFont(new Font("Dialog", Font.BOLD, 44));
        label.setHorizontalAlignment(SwingConstants.CENTER);
        panel.setLayout(new FlowLayout(FlowLayout.CENTER));
        frame.getContentPane().add(panel);
        panel.add(label);
        //There calls another method which defines click function
        onClick();
        panel.add(button);

        frame.setSize(320, 200);
        frame.setVisible(true);
        //Also there calls another method which defines click function
        onClick();
    }
    //onClick method itself
    public void onClick() {
        //On clicking Button "Exit" we will close the tab
        button = new JButton("Exit");
        //addActionListener check did I click or not
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                //if yes it will close tab
                frame.setVisible(false);
                //and write in console "Process finished with exit code 0"
                System.exit(0);
            }
        });
    }
}
