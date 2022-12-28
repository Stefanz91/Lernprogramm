package Control;

import View.MainView;
import View.TextView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainControl {
    MainView firstMainView;
    TextView textView;
    public static void main(String[] args) {
        MainControl firstMainControll = new MainControl();

    }

    public MainControl(){
        firstMainView = new MainView();
        firstMainView.generateLessonListener(this::performGenerateLesson);
        firstMainView.generateContinueLearningListener(this::performGenerateContinueLearning);
        firstMainView.generateOptionsListener(this::performGenerateOptions);
    }

    private void performGenerateOptions(ActionEvent actionEvent) {
    }

    private void performGenerateContinueLearning(ActionEvent actionEvent) {
        TextView textView = new TextView("Dies ist der Probetext den du lesen sollst! Bladd giabhrihirhioghoaijgoirgjoi" +
                "gjaoioigahigoaiogagiojioegjioagrjajgiogejioagejogeijoerajgjgoijgreioejgioejreiojgriojioagjog");
    }

    private void performGenerateLesson(ActionEvent actionEvent) {
        
    }
}
