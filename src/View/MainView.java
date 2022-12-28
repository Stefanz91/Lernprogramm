package View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    private JButton newLesson;
    private JButton continueLearning;
    private JButton options;

    public MainView(){
        this.setSize(1200,800);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        panel();
    }


    private void panel(){
        this.setLayout(new BorderLayout());
        JLabel mainmenu = new JLabel("Hauptmenü");
        mainmenu.setFont(new Font("Calibri",Font.BOLD,50));
        mainmenu.setHorizontalAlignment(SwingConstants.CENTER);
        this.add(mainmenu,BorderLayout.NORTH);
        JPanel selectPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(3,1);
        gridLayout.setHgap(50);
        gridLayout.setVgap(10);
        selectPanel.setLayout(gridLayout);
        newLesson = new JButton("Neue Lektion");
        continueLearning = new JButton("Weiterlernen");
        options = new JButton("Optionen");
        selectPanel.add(newLesson);
        selectPanel.add(continueLearning);
        selectPanel.add(options);
        this.add(selectPanel,BorderLayout.CENTER);
    }
    public void generateLessonListener(ActionListener listener){newLesson.addActionListener(listener);}
    public void generateContinueLearningListener(ActionListener listener){continueLearning.addActionListener(listener);}
    public void generateOptionsListener(ActionListener listener){options.addActionListener(listener);}
}
