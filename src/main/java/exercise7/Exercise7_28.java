package exercise7;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Created by hyojeongyoon on 2016. 7. 3..
 */
public class Exercise7_28 {

    public static void main(String[] args) {
        Frame frame = new Frame();
//        frame.addWindowFocusListener(new EventHandler());

        frame.addWindowFocusListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                e.getWindow().setVisible(false);
                e.getWindow().dispose();
                System.exit(0);
            }
        });

    }
}


class EventHandler extends WindowAdapter {
    public void windowClosing(WindowEvent e) {
        e.getWindow().setVisible(false);
        e.getWindow().dispose();
        System.exit(0);
    }
}