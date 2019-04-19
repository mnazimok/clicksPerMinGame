import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PushCounterPanel extends JPanel {
    private int count;
    private JButton push;
    private JLabel label;
    private long startTime;

    public PushCounterPanel() {
        count = 0;

        push = new JButton("Click Here!");
        push.addActionListener(new ButtonListener());

        label = new JLabel();

        add(push);
        add(label);

        setBackground(Color.cyan);
        setPreferredSize(new Dimension(275, 75));
        startTime = System.currentTimeMillis();
    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            long minutesSinceStart = (System.currentTimeMillis() - startTime) / 60 / 60;
            if (minutesSinceStart > 0) {
                label.setText("Clicks per minute: " + (count / minutesSinceStart));
            }
            count++;
        }
    }
}
