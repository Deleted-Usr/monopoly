package Java.MONOPOLY;

import javax.swing.*;

public class Settings {
    JTextField playerField = new JTextField("");
    JTextField moneyField = new JTextField("");
    
    private final JButton applyButton = new JButton("Apply");

    public Settings(BoardPanel panel) {
         applyButton.addActionListener(event -> applyMoneyValue());
         
         String str = playerField.getText();
         
         panel.add(applyButton);
    }
    
    public void applyMoneyValue() {
        // Apply the money value here...
    }
}
