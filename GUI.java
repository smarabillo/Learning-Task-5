import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

abstract class GUI extends Main{
    public static void UserInterface() {

        JFrame frame;
        JLabel labelTitle, text1, text2;
        JPanel panel;
        JTextField fieldOne, fieldTwo;
        JButton button1, button2, button3, button4;

        //frame
        frame = new JFrame("Learning task 5");
        frame.setSize(400, 250);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //label
        labelTitle = new JLabel("Simple Calculator");
        labelTitle.setBounds(130, 10, 500, 20);
        text1 = new JLabel("Enter 1st Number: ");
        text1.setBounds(50,50,150,25);
        text2 = new JLabel("Enter 2nd Number: ");
        text2.setBounds(50,80,150,25);

        //panel
        panel = new JPanel();
        panel.setBounds(10, 10, 380, 200);
        frame.add(panel);
        panel.setLayout(null);
        panel.add(labelTitle);
        panel.add(text1);
        panel.add(text2);

        //field
        fieldOne= new JTextField(20);
        fieldOne.setBounds(175, 50, 170, 25);
        panel.add(fieldOne);
        fieldTwo = new JTextField(20);
        fieldTwo.setBounds(175, 80, 170, 25);
        panel.add(fieldTwo);

        //button
        button1 = new JButton("Add");
        button1.setBounds(40, 130,150,25);
        button2 = new JButton("Subtract");
        button2.setBounds(200, 130, 150,25);
        button3 = new JButton("Multiply");
        button3.setBounds(40, 160,150,25);
        button4 = new JButton("Divide");
        button4.setBounds(200, 160, 150,25);
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = calculation.add(fieldOne.getText(),fieldTwo.getText());
                methods.displayMessage1(String.valueOf(sum));
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int difference = calculation.minus(fieldOne.getText(),fieldTwo.getText());
                methods.displayMessage2(String.valueOf(difference));
            }
        });
        button3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int product = calculation.multiply(fieldOne.getText(),fieldTwo.getText());
                methods.displayMessage3(String.valueOf(product));
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double quotient = calculation.divide(fieldOne.getText(),fieldTwo.getText());
                methods.displayMessage4(String.valueOf(quotient));
            }
        });
        frame.setVisible(true);
    }
}
