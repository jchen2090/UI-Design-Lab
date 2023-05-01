import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainGUIWindow extends JFrame implements ActionListener, KeyListener {
    private JPanel mainPanel;
    private JTextArea myTextArea;
    private JButton button1;
    private JTextField textField1;
    private JButton sendButton;
    private JLabel title;

    public MainGUIWindow() {
        createUIComponents();
    }

    private void createUIComponents() {
        setContentPane(mainPanel);
        setTitle("My GUI");
        setSize(300, 400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        button1.addActionListener(this);
        sendButton.addActionListener(this);
        textField1.addKeyListener(this);
        myTextArea.setLineWrap(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source instanceof JButton) {
            JButton button = (JButton) source;
            String text = button.getText();

            if (text.equals("Send")) {
                myTextArea.append("Button 1 Clicked! ");
            } else {
                myTextArea.append("Button 2 Clicked! ");
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
