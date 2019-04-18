import java.awt.*;
import java.awt.event.*;
import java.util.Date;
import javax.swing.*;

public class PushCounterPanel extends JPanel {
    private int count;
    private JButton push;
    private JLabel label;
    private int timer = 60;
    private JLabel timerLabel;
    private boolean isFirstClick;
    private long startTime;
    private long endTime;

    public PushCounterPanel() {
        count = 0;

        push = new JButton("Click Here!");
        push.addActionListener(new ButtonListener());

        label = new JLabel("Clicks: " + count);

        timerLabel = new JLabel();

        add(push);
        add(label);
        add(timerLabel);

        setBackground(Color.cyan);
        setPreferredSize(new Dimension(275, 75));


    }

    private class ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if(isFirstClick == false) {
                isFirstClick = true;
                startTime = System.currentTimeMillis();


            }

            count++;
            label.setText("Clicks: " + count);
            timerLabel.setText("Start Time: " + new Date(startTime));
            timerLabel.setText("End Time: " + new Date(endTime));

//            do{
//                timer--;
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                timerLabel.setText("Time: " + timer);
//                System.out.println("Time: " + timer);
//
//            } while (timer > 0);
        }
    }


}
