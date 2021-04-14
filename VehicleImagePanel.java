
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class VehicleImagePanel {
    private JLabel imageLabel;
    private JButton incButton;
    private JButton decButton;
    private List<String> imageList;
    private int index = 0;

    VehicleImagePanel(List<String> images){
        this.imageList = images;
        incButton = getIncButton();
        decButton = getDecButton();
        imageLabel = new JLabel();
    }

    public JPanel imagePanel(){
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        imageLabel.setIcon(getImageByIndex(index));
        imageLabel.setBorder(new EmptyBorder(10,10,20,10));
        panel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        if(decButton != null)
            panel.add(decButton);
        panel.add(imageLabel);
        if(decButton != null)
            panel.add(incButton);
        //panel.setBackground(Color.white);
        panel.setBorder(new EmptyBorder(10,10,10,10));
        panel.setPreferredSize(new Dimension(700,550));
        return panel;
    }

    public JButton getDecButton(){
        if(imageList == null || imageList.size() <= 1){
            return null;
        }
        decButton = getButton();
        decButton.setText("<");
        decButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(index == 0)
                    return;
                index--;
                imageLabel.setIcon(getImageByIndex(index));
            }
        });
        return decButton;
    }

    public JButton getIncButton(){
        if(imageList == null || imageList.size() <= 1){
            return null;
        }
        incButton = getButton();
        incButton.setText(">");
        incButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(index == imageList.size()-1)
                    return;
                index++;
                imageLabel.setIcon(getImageByIndex(index));
            }
        });
        return incButton;
    }

    public JButton getButton(){
        JButton button = new JButton();
        Font newButtonFont=new Font(button.getFont().getName(),button.getFont().getStyle(),25);
        button.setContentAreaFilled(false);
        button.setFocusPainted(false);
        button.setBorderPainted(false);
        button.setFont(newButtonFont);
        return button;
    }

    public ImageIcon getImageByIndex(int index){
        if(imageList != null && imageList.size() > 0) {
            return getUpdateImage(imageList.get(index),500,400);
        }
        return getUpdateImage("TestImages/noImage.jpg",500,400);
    }

    public ImageIcon getUpdateImage(String url, int width, int height){
        Image newImage = new ImageIcon(url).getImage().getScaledInstance(width, height, Image.SCALE_AREA_AVERAGING);
        return new ImageIcon(newImage);
    }

}
