package View;

import javax.swing.*;
import java.awt.*;

public class TextView extends JFrame {
    String text;

    public TextView(String text){
        this.text = text;
        this.setSize(1200,800);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        panel();
        this.setVisible(true);
    }

    private void panel(){
        this.setLayout(new BorderLayout());
        JLabel heading = new JLabel("Lernbildschirm");
        JLabel text = new JLabel();
        text.setText(this.text);
        JButton next = new JButton("weiter");
        this.add(heading,BorderLayout.NORTH);
        this.add(text,BorderLayout.CENTER);
        this.add(next,BorderLayout.SOUTH);
    }
}
