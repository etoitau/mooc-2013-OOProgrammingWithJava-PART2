package calculator.ui;


import calculator.logic.Addition;
import calculator.logic.Subtraction;
import calculator.logic.Zero;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {
    private JFrame frame;
    private JTextField out, in;
    private JButton add, sub, zed;
    

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
    }

    private void createComponents(Container container) {
        container.setLayout(new GridLayout(3,1));
        out = new JTextField("0");
        out.setEnabled(false);
        in = new JTextField();
        JPanel buttons = createButtons();
        out.getDocument().addDocumentListener(new WatchZero(out, zed));
        
        container.add(out);
        container.add(in);
        container.add(buttons);
    }

    private JPanel createButtons() {
        JPanel buttons = new JPanel(new GridLayout(1,3));
        add = new JButton("+");
        sub = new JButton("-");
        zed = new JButton("Z");
        add.addActionListener(new Addition(in, out));
        sub.addActionListener(new Subtraction(in, out));
        zed.addActionListener(new Zero(in, out));
        zed.setEnabled(false);
        buttons.add(add);
        buttons.add(sub);
        buttons.add(zed);
        return buttons;
    }
    
    public JFrame getFrame() {
        return frame;
    }
}
