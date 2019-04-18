import javax.swing.JFrame;

public class pushCounter {

    public static void main(String[] args) {
        JFrame frame = new JFrame("Clicks Per Minute");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        PushCounterPanel panel = new PushCounterPanel();
        frame.getContentPane().add(panel);

        frame.pack();
        frame.setVisible(true);
    }



}
