import javax.swing.*;
import java.awt.*;

public class LeadFormButton {

    private JButton leadFormButton;

    LeadFormButton(){
        leadFormButton = new JButton();
    }

    public JButton leadButton(){
        JPanel leadFormPanel = new JPanel();
        leadFormButton.setText("Generate Lead Request");
        leadFormButton.setFocusPainted(false);
        leadFormButton.setFont(new Font(Font.SANS_SERIF, Font.BOLD, 15));
        leadFormButton.setForeground(Color.white);
        leadFormButton.setBackground(new Color(0,128,255));
        leadFormButton.setToolTipText("This is a JButton");
        leadFormButton.setPreferredSize(new Dimension(250, 50));
        return leadFormButton;
    }

}
