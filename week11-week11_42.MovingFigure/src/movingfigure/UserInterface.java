package movingfigure;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Figure fig;
    private DrawingBoard dBoard;
    
    public UserInterface(Figure fig) {
        this.fig = fig;
    }

    @Override
    public void run() {
        frame = new JFrame();
        frame.setPreferredSize(new Dimension(400, 400));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());
        addListeners();

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        dBoard = new DrawingBoard(fig);
        container.add(dBoard);
    }

    private void addListeners() {
        frame.addKeyListener(new KeyboardListener(dBoard, fig));
    }

    public JFrame getFrame() {
        return frame;
    }
}
