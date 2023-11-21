import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BMI {
    private JPanel main_panel;
    private JButton button1;
    private  JLabel Label2;
    private  JLabel Label3;
    private JLabel Label1;
    private JLabel Label4;
    private JLabel Label5;
    private JLabel Label6;
    private JLabel Label7;
    private JLabel Label8;
    private JLabel Label9;
    private JLabel Label10;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JRadioButton mänlichRadioButton;
    private JRadioButton weiblichRadioButton;
    private JLabel Label11;
    private Float bmi;
    private int min;
    private int max;
    private Float size;
    private Float weight;
    private String val;

    public BMI(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                size = Float.valueOf(textField1.getText());
                weight = Float.valueOf(textField2.getText());
                bmi = weight/(size*size);
                val = String.valueOf(bmi);
                Label5.setText(val);
                bestimmeMinUndMax();
                klassifikation();
            }
        });
    }

    public void bestimmeMinUndMax(){
        if( 19 <= Float.valueOf(textField3.getText()) || Float.valueOf(textField3.getText()) <= 24){
            min = 19;
            max = 24;

        }
        else if( 24 < Float.valueOf(textField3.getText()) || Float.valueOf(textField3.getText()) <=34){
            min = 20;
            max = 25;
        }
        else if( 34 < Float.valueOf(textField3.getText()) || Float.valueOf(textField3.getText()) <=44){
            min = 21;
            max = 26;
        }
        else if( 44 < Float.valueOf(textField3.getText()) || Float.valueOf(textField3.getText()) <=54){
            min = 22;
            max = 27;
        }
        else if( 45 < Float.valueOf(textField3.getText()) || Float.valueOf(textField3.getText()) <=64){
            min = 23;
            max = 27;
        }
        else if( 64 > Float.valueOf(textField3.getText())){
            min = 24;
            max = 29;
        }

        Label7.setText(String.valueOf(min));
        Label9.setText(String.valueOf(max));
    }

    public void klassifikation(){

        if(mänlichRadioButton.isSelected()){
            if(bmi < 20){
                Label11.setText("Untergewicht");
            }
            else if(20 < bmi && bmi < 25 ){
                Label11.setText("Normalgewicht");
            }
            else if(25 < bmi && bmi < 30){
                Label11.setText("Übergewicht");
            }
            else if(30 < bmi && bmi < 40){
                Label11.setText("Adipositas");
            }
            else if(40 < bmi ){
                Label11.setText(" Schwere Adipositas");
            }
        }
        else if (weiblichRadioButton.isSelected()){
            if(bmi < 19){
                Label11.setText("Untergewicht");
            }
            else if(19 < bmi && bmi < 24 ){
                Label11.setText("Normalgewicht");
            }
            else if(24 < bmi && bmi < 30){
                Label11.setText("Übergewicht");
            }
            else if(30 < bmi && bmi < 40){
                Label11.setText("Adipositas");
            }
            else if(40 < bmi ){
                Label11.setText(" Schwere Adipositas");
            }
        }
        else if (weiblichRadioButton.isSelected() && mänlichRadioButton.isSelected()){
            Label11.setText("Nur eine Auswahl treffen!!!");
        }
        else{
            Label11.setText("Bitte eine Auswahl treffen!!");
        }
    }
    public static void main(String[] args){
        JFrame frame = new JFrame("BMI");
        frame.setContentPane(new BMI().main_panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(500,300);

    }

}
