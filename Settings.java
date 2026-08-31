package Java.MONOPOLY;

import javax.swing.*;
import java.awt.*;

public class Settings {
    public int playerCount;


    JLabel howManyPlayers = new JLabel("How Many Player?");
    JButton player1 = new JButton("1");
    JButton player2 = new JButton("2");
    JButton player3 = new JButton("3");
    JButton player4 = new JButton("4");
    JTextField playerField1 = new JTextField("Enter Name");
    JTextField playerField2 = new JTextField("Enter Name");
    JTextField playerField3 = new JTextField("Enter Name");
     JTextField playerField4 = new JTextField("Enter Name");
    JTextField moneyField = new JTextField("TEST");
    
    final JButton applyButton = new JButton("Apply");

    public Settings(BoardPanel panel) {


        applyButton.addActionListener(event -> apply());


         player1.addActionListener(event -> {
             playerCount = 1;
             updatePFields();
                 });
         player2.addActionListener(event -> {
             playerCount = 2;
             updatePFields();
                 });
         player3.addActionListener(event -> {
             playerCount = 3;
             updatePFields();
                 });
         player4.addActionListener(event -> {
             playerCount = 4;
             updatePFields();
                 });

         howManyPlayers.setFont(new Font("Arial", Font.BOLD, 16));

        howManyPlayers.setBounds(50, 350, 200, 40);
        player1.setBounds(50, 400, 50, 50);
        player2.setBounds(50, 450, 50, 50);
        player3.setBounds(50, 500, 50, 50);
        player4.setBounds(50, 550, 50, 50);
         playerField1.setBounds(105,400, 200, 50);
         playerField2.setBounds(105, 450, 200, 50);
         playerField3.setBounds(105, 500, 200, 50);
         playerField4.setBounds(105, 550, 200, 50);
        moneyField.setBounds(200, 660, 200, 40);
         applyButton.setBounds(200, 710, 200, 40);

         panel.add(howManyPlayers);
         panel.add(applyButton);
         panel.add(playerField1);
         panel.add(moneyField);
         panel.add(player1);
         panel.add(player2);
         panel.add(player3);
         panel.add(player4);
         panel.add(playerField2);
         panel.add(playerField3);
         panel.add(playerField4);

         howManyPlayers.setVisible(false);
        playerField1.setVisible(false);
        moneyField.setVisible(false);
        applyButton.setVisible(false);
        player1.setVisible(false);
        player2.setVisible(false);
        player3.setVisible(false);
        player4.setVisible(false);
        playerField1.setVisible(false);
        playerField2.setVisible(false);
        playerField3.setVisible(false);
        playerField4.setVisible(false);

        styleButton(player1);
        styleButton(player2);
        styleButton(player3);
        styleButton(player4);

        styleFields(playerField1);
        styleFields(playerField2);
        styleFields(playerField3);
        styleFields(playerField4);

        styleLabel(howManyPlayers);


        panel.revalidate();
        panel.repaint();
    }
    
    public void apply() {
        //
    }

    public void updatePFields() {
        switch (playerCount) {
            case 1:
                playerField1.setVisible(true);
                playerField2.setVisible(false);
                playerField3.setVisible(false);
                playerField4.setVisible(false);
                break;
                case 2:
                playerField1.setVisible(true);
                playerField2.setVisible(true);
                playerField3.setVisible(false);
                playerField4.setVisible(false);
                break;
                case 3:
                    playerField1.setVisible(true);
                    playerField2.setVisible(true);
                    playerField3.setVisible(true);
                    playerField4.setVisible(false);
                    break;
                    case 4:
                        playerField1.setVisible(true);
                        playerField2.setVisible(true);
                        playerField3.setVisible(true);
                        playerField4.setVisible(true);
                        break;
        }
    }

    public void getMText(){
        String mText = moneyField.getText();
    }

    public void getPText(){
        String pText = playerField1.getText();
    }

    public void styleButton(JButton button){
        button.setOpaque(false);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setForeground(Color.WHITE);
        button.setBorder(BorderFactory.createLineBorder(Color.WHITE));
    }

    public void styleFields(JTextField field){
        field.setOpaque(false);
        field.setForeground(Color.WHITE);
        field.setBorder(BorderFactory.createLineBorder(Color.WHITE));

    }

    public void styleLabel(JLabel label){
        label.setForeground(Color.WHITE);
    }
}
