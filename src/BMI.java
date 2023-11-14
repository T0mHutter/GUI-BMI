import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI {
    private JPanel main_panel;
    private JButton button1;
    private JTextField TextField1;
    private JTextField TextField2;
    private JTextField output;
    private JLabel Label1;
    private  JLabel Label2;
    private  JLabel Label3;

    public BMI(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Float bmi;
                Float size = Float.valueOf(TextField1.getText());
                Float weight = Float.valueOf(TextField2.getText());
                bmi = weight/(size*size);
                String val = String.valueOf(bmi);
                output.setText(val);
            }
        });
    }

    public static void main(String[] args){
        JFrame frame = new JFrame("BMI");
        frame.setContentPane(new BMI().main_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

    }

}
