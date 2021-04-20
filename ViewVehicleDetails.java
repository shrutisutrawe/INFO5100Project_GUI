package com.neu.project;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ViewVehicleDetails {
    private List<String> vehicleImageList;
    private JPanel innerPanel;
    private JPanel vehicleShortDescriptionPanel;
    private JPanel vehicleDetailsPanel;
    private JPanel vehicleImageAndLeadFormPanel;
    private JPanel vehicleInfoPanel;
    private JScrollPane vehicleDescriptionPane;
    private JPanel vehicleDescriptionPanel;
    private JScrollPane dealersInformationPane;
    private JPanel dealersInformationPanel;
    private JLabel vehicleMSRPLabel;
    private JPanel vehicleImagePanel;
    private JButton leadFormButton;
    private JLabel vehicleInfoLabel;
    private JLabel vehicleDescriptionLabel;
    private JLabel dealersInformationLabel;
    private JTextArea vehicleDescriptionTextArea;
    private JTextArea dealersInformationTextArea;
    private JLabel vehicleNameLabel;
    private JScrollPane scrollPane;
    private JTextField vehicleNameTextField;
    private JTextField vehicleMSRPTextField;
    private Dimension iconLabelDimension = new Dimension(60, 50);
    private Dimension imageLabelDimension = new Dimension(120, 50);
    private Dimension dataLabelDimension = new Dimension(196, 50);
    private Dimension labelPanelDimension = new Dimension(376, 50);
    private ImageIcon carImage;
    private ImageIcon engineImage;
    private ImageIcon transmissionImage;
    private ImageIcon vinImage;
    private ImageIcon fuelImage;
    private ImageIcon exteriorColorImage;
    private ImageIcon stockNumberImage;
    private ImageIcon mileageImage;
    private ImageIcon seatCountImage;
    private ImageIcon ratingsImage;
    private JPanel requestLeadFormPanel;
    private JPanel vehicleInfoLabelPanel;
    private JPanel vehicleConditionLabelPanel;
    private JPanel vehicleEngineLabelPanel;
    private JPanel vehicleTransmissionLabelPanel;
    private JPanel vehicleVINLabelPanel;
    private JPanel vehicleFuelLabelPanel;
    private JPanel vehicleColorLabelPanel;
    private JPanel vehicleStockNumberLabelPanel;
    private JPanel vehicleMileageLabelPanel;
    private JPanel vehicleSeatCountLabelPanel;
    private JPanel vehicleRatingsLabelPanel;
    private JFrame frame;

    public ViewVehicleDetails(Car myCar) {
        vehicleImageList = new ArrayList<>();
        vehicleImageList.add("TestImages/img1.jpg");
        vehicleImageList.add("TestImages/img2.jpg");
        vehicleImageList.add("TestImages/img3.jpg");
        vehicleImageList.add("TestImages/img4.jpg");

        createVehicleShortDescriptionPanel(myCar);
        createVehicleDetailsPanel(myCar);
        createVehicleDescriptionPanel(myCar);
        createDealersInformationPanel(myCar);
        createOuterPanel();
    }

    public void createOuterPanel() {
        frame = new JFrame();

        scrollPane = new JScrollPane();
        scrollPane.setBackground(new Color(-4473925));
        scrollPane.setMaximumSize(new Dimension(916, 940));
        scrollPane.setMinimumSize(new Dimension(916, 940));
        scrollPane.setPreferredSize(new Dimension(916, 940));
//        scrollPane.setBorder(new LineBorder(new Color(255,0,0)));

        innerPanel = new JPanel();
        innerPanel.setLayout(new BoxLayout(innerPanel, BoxLayout.Y_AXIS));
        innerPanel.setPreferredSize(new Dimension(916, 940));
        innerPanel.setMaximumSize(new Dimension(916, 940));
        innerPanel.setMinimumSize(new Dimension(916, 940));
//        innerPanel.setBorder(new LineBorder(new Color(0,255,0)
//        ));
        scrollPane.setViewportView(innerPanel);

        innerPanel.add(vehicleShortDescriptionPanel, 0);
        innerPanel.add(vehicleDetailsPanel, 1);
        innerPanel.add(vehicleDescriptionPanel, 2);
        innerPanel.add(dealersInformationPanel, 3);
        JPanel additionalBlankPanel = new JPanel();
        additionalBlankPanel.setBorder(new LineBorder(Color.BLACK));
        additionalBlankPanel.add(Box.createRigidArea(new Dimension(916, 1)));
        additionalBlankPanel.setPreferredSize(new Dimension(916, 1));
        additionalBlankPanel.setMaximumSize(new Dimension(916, 1));
        additionalBlankPanel.setMinimumSize(new Dimension(916, 1));
        innerPanel.add(additionalBlankPanel);

        frame.pack();
        frame.setSize(new Dimension(950, 950));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setContentPane(scrollPane);
    }

    public void createVehicleShortDescriptionPanel(Car myCar) {
        vehicleShortDescriptionPanel = new JPanel();
        vehicleNameLabel = new JLabel();
        vehicleMSRPLabel = new JLabel();

        vehicleShortDescriptionPanel.setPreferredSize(new Dimension(916, 74));
        vehicleShortDescriptionPanel.setMaximumSize(new Dimension(916, 74));
        vehicleShortDescriptionPanel.setMinimumSize(new Dimension(916, 74));
        vehicleShortDescriptionPanel.setLayout(new BoxLayout(vehicleShortDescriptionPanel, BoxLayout.X_AXIS));
        vehicleShortDescriptionPanel.setBorder(new LineBorder(Color.BLACK));

        vehicleNameLabel.setText(myCar.getName());
        vehicleNameLabel.setFont(new Font("Calibri", Font.BOLD, 36));
        vehicleNameLabel.setMinimumSize(new Dimension(750, 74));
        vehicleNameLabel.setMaximumSize(new Dimension(750, 74));
        vehicleNameLabel.setPreferredSize(new Dimension(750, 74));

        vehicleMSRPLabel.setText(Double.toString(myCar.getMSRP()));
        Font VehicleMSRPLabelFont = new Font("Calibri", Font.BOLD, 28);
        vehicleMSRPLabel.setFont(VehicleMSRPLabelFont);
        vehicleMSRPLabel.setMinimumSize(new Dimension(166, 74));
        vehicleMSRPLabel.setMaximumSize(new Dimension(166, 74));
        vehicleMSRPLabel.setPreferredSize(new Dimension(166, 74));

        vehicleShortDescriptionPanel.add(vehicleNameLabel, 0);
        vehicleShortDescriptionPanel.add(vehicleMSRPLabel, 1);
    }

    public void createVehicleDetailsPanel(Car myCar) {
        vehicleDetailsPanel = new JPanel();
        vehicleDetailsPanel.setLayout(new BoxLayout(vehicleDetailsPanel, BoxLayout.X_AXIS));
        vehicleDetailsPanel.setPreferredSize(new Dimension(916, 600));
        vehicleDetailsPanel.setMaximumSize(new Dimension(916, 600));
        vehicleDetailsPanel.setMinimumSize(new Dimension(916, 600));
//        vehicleDetailsPanel.setBorder(new LineBorder(new Color(0, 0, 0)));

        createVehicleImageAndLeadFormPanel();
        createVehicleInfoDetailsPanel(myCar);
        vehicleDetailsPanel.add(vehicleImageAndLeadFormPanel, 0);
        vehicleDetailsPanel.add(vehicleInfoPanel, 1);
    }

    public void createVehicleImageAndLeadFormPanel() {
        vehicleImageAndLeadFormPanel = new JPanel();
        vehicleImageAndLeadFormPanel.setLayout(new BoxLayout(vehicleImageAndLeadFormPanel, BoxLayout.Y_AXIS));
        vehicleImageAndLeadFormPanel.setPreferredSize(new Dimension(540, 600));
        vehicleImageAndLeadFormPanel.setMinimumSize(new Dimension(540, 600));
        vehicleImageAndLeadFormPanel.setMaximumSize(new Dimension(540, 600));
//        vehicleImageAndLeadFormPanel.setBorder(new LineBorder(new Color(0,0,190)));

        vehicleImagePanel = new VehicleImagePanel(vehicleImageList).imagePanel();
        requestLeadFormPanel = new JPanel();
        requestLeadFormPanel.setLayout(new BoxLayout(requestLeadFormPanel, BoxLayout.X_AXIS));
        requestLeadFormPanel.setPreferredSize(new Dimension(540, 100));
        requestLeadFormPanel.setMinimumSize(new Dimension(540, 100));
        requestLeadFormPanel.setMaximumSize(new Dimension(540, 100));
        requestLeadFormPanel.setBorder(new LineBorder(Color.black));

        leadFormButton = new JButton();
        leadFormButton.setText("Request Lead Form");
        leadFormButton.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        leadFormButton.setBorder(new BevelBorder(0));
        leadFormButton.setPreferredSize(new Dimension(200, 30));
        leadFormButton.setMaximumSize(new Dimension(200, 30));
        leadFormButton.setMinimumSize(new Dimension(200, 30));
        leadFormButton.setBackground(new Color(185, 185, 185));
        leadFormButton.setFocusPainted(false);

        requestLeadFormPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        leadFormButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        requestLeadFormPanel.add(Box.createRigidArea(new Dimension(170, 100)));
        requestLeadFormPanel.add(leadFormButton);
        requestLeadFormPanel.add(Box.createRigidArea(new Dimension(170, 100)));

        vehicleImageAndLeadFormPanel.add(vehicleImagePanel, 0);
        vehicleImageAndLeadFormPanel.add(requestLeadFormPanel, 1);
    }

    public void createVehicleInfoDetailsPanel(Car myCar) {

        vehicleInfoPanel = new JPanel();
        vehicleInfoPanel.setLayout(new BoxLayout(vehicleInfoPanel, BoxLayout.Y_AXIS));

        vehicleInfoPanel.setBorder(new LineBorder(Color.BLACK));
        vehicleInfoPanel.setPreferredSize(new Dimension(376, 600));
        vehicleInfoPanel.setMaximumSize(new Dimension(376, 600));
        vehicleInfoPanel.setMaximumSize(new Dimension(376, 600));

        vehicleInfoLabelPanel = new JPanel();
        vehicleInfoLabelPanel.setLayout(new BoxLayout(vehicleInfoLabelPanel, BoxLayout.Y_AXIS));
        vehicleInfoLabelPanel.setPreferredSize(labelPanelDimension);
        vehicleInfoLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleInfoLabelPanel.setMinimumSize(labelPanelDimension);

        vehicleInfoLabel = new JLabel();
        vehicleInfoLabel.setFont(new Font("Calibri", Font.BOLD, 24));
        vehicleInfoLabel.setText("Vehicle Info");
        vehicleInfoLabel.setAlignmentX(Component.CENTER_ALIGNMENT);

        vehicleInfoLabelPanel.add(vehicleInfoLabel, 0);

        carImage = new ImageIcon("Icons/carcondition.jpg");
        engineImage = new ImageIcon("Icons/CarEngine.jpg");
        transmissionImage = new ImageIcon("Icons/Transmission.jpg");
        vinImage = new ImageIcon("Icons/VIN.jpg");
        fuelImage = new ImageIcon("Icons/Fuel.jpg");
        exteriorColorImage = new ImageIcon("Icons/CarColor.jpg");
        stockNumberImage = new ImageIcon("Icons/vehicleid.jpg");
        mileageImage = new ImageIcon("Icons/Mileage.jpg");
        seatCountImage = new ImageIcon("Icons/carseat.jpg");
        ratingsImage = new ImageIcon("Icons/Ratings.jpg");

        vehicleConditionLabelPanel = vehicleSubInfoPanel(carImage, "Car Condition", myCar.getCarCategory());
        vehicleEngineLabelPanel = vehicleSubInfoPanel(engineImage, "Engine", myCar.getEngine());
        vehicleTransmissionLabelPanel = vehicleSubInfoPanel(transmissionImage, "Transmission", myCar.getTransmission());
        vehicleVINLabelPanel = vehicleSubInfoPanel(vinImage, "VIN", myCar.getVIN());
        vehicleFuelLabelPanel = vehicleSubInfoPanel(fuelImage, "Fuel", myCar.getFuel());
        vehicleColorLabelPanel = vehicleSubInfoPanel(exteriorColorImage, "Color", myCar.getExteriorColor());
        vehicleStockNumberLabelPanel = vehicleSubInfoPanel(stockNumberImage, "Stock #", Integer.toString(myCar.getStockNumber()));
        vehicleMileageLabelPanel = vehicleSubInfoPanel(mileageImage, "Mileage", Integer.toString(myCar.getMileage()));
        vehicleSeatCountLabelPanel = vehicleSubInfoPanel(seatCountImage, "No of Seats", Integer.toString(myCar.getSeatCount()));
        vehicleRatingsLabelPanel = vehicleSubInfoPanel(ratingsImage, "Ratings", Integer.toString(myCar.getRatings()));

        vehicleInfoPanel.add(vehicleInfoLabelPanel, 0);
        vehicleInfoPanel.add(vehicleConditionLabelPanel, 1);
        vehicleInfoPanel.add(vehicleEngineLabelPanel, 2);
        vehicleInfoPanel.add(vehicleTransmissionLabelPanel, 3);
        vehicleInfoPanel.add(vehicleVINLabelPanel, 4);
        vehicleInfoPanel.add(vehicleFuelLabelPanel, 5);
        vehicleInfoPanel.add(vehicleColorLabelPanel, 6);
        vehicleInfoPanel.add(vehicleStockNumberLabelPanel, 7);
        vehicleInfoPanel.add(vehicleMileageLabelPanel, 8);
        vehicleInfoPanel.add(vehicleSeatCountLabelPanel, 9);
        vehicleInfoPanel.add(vehicleRatingsLabelPanel, 10);
        //vehicleInfoBoxLayoutPanel ends here
    }

    private JPanel vehicleSubInfoPanel(ImageIcon image, String imageText, String dataText) {
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.X_AXIS));
        panel.setMinimumSize(labelPanelDimension);
        panel.setMaximumSize(labelPanelDimension);
        panel.setPreferredSize(labelPanelDimension);

        panel.add(Box.createRigidArea(new Dimension(5, 0)));
        panel.add(vehicleIconLabel(image));
        panel.add(vehicleImageLabel(imageText));
        panel.add(vehicleDataLabel(dataText));
        return panel;
    }

    private JLabel vehicleIconLabel(ImageIcon image) {
        JLabel label = new JLabel();
        label.setIcon(image);
        label.setPreferredSize(iconLabelDimension);
        label.setMaximumSize(iconLabelDimension);
        label.setMinimumSize(iconLabelDimension);
        return label;
    }

    private JLabel vehicleDataLabel(String text) {
        JLabel label = new JLabel();
        label.setText(text);
        label.setPreferredSize(dataLabelDimension);
        label.setMinimumSize(dataLabelDimension);
        label.setMinimumSize(dataLabelDimension);
        label.setFont(new Font("Calibri", Font.BOLD, 16));
        return label;
    }

    private JLabel vehicleImageLabel(String text) {
        JLabel label = new JLabel();
        label.setText(text);
        label.setPreferredSize(imageLabelDimension);
        label.setMaximumSize(imageLabelDimension);
        label.setMinimumSize(imageLabelDimension);
        label.setFont(new Font("Calibri", Font.BOLD, 16));
        return label;
    }

    public void createVehicleDescriptionPanel(Car myCar) {
        //vehicleDescriptionPanel start
        vehicleDescriptionPanel = new JPanel();
        vehicleDescriptionPanel.setLayout(new BoxLayout(vehicleDescriptionPanel, BoxLayout.Y_AXIS));
        vehicleDescriptionPanel.setMaximumSize(new Dimension(916, 140));
        vehicleDescriptionPanel.setMinimumSize(new Dimension(916, 140));
        vehicleDescriptionPanel.setPreferredSize(new Dimension(916, 140));

        vehicleDescriptionPanel.setBackground(new Color(187, 187, 187));
        vehicleDescriptionPanel.setBorder(new LineBorder(Color.BLACK));

        vehicleDescriptionLabel = new JLabel();
        vehicleDescriptionLabel.setText("Vehicle Description");
        vehicleDescriptionLabel.setFont(new Font("Calibri", Font.BOLD, 16));

        vehicleDescriptionPane = new JScrollPane();
        vehicleDescriptionPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        vehicleDescriptionPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        vehicleDescriptionPane.setMaximumSize(new Dimension(916, 120));
        vehicleDescriptionPane.setMinimumSize(new Dimension(916, 120));
        vehicleDescriptionPane.setPreferredSize(new Dimension(916, 120));
        vehicleDescriptionPane.setBackground(new Color(187, 187, 187));
//        vehicleDescriptionPane1.setBorder(new LineBorder(new Color(0, 0, 0)));

        vehicleDescriptionTextArea = new JTextArea();
        vehicleDescriptionTextArea.setMaximumSize(new Dimension(916, 120));
        vehicleDescriptionTextArea.setMinimumSize(new Dimension(916, 120));
        vehicleDescriptionTextArea.setPreferredSize(new Dimension(916, 120));
        vehicleDescriptionTextArea.setWrapStyleWord(true);
        vehicleDescriptionTextArea.setVisible(true);
        vehicleDescriptionTextArea.setLineWrap(true);
        vehicleDescriptionTextArea.setBackground(new Color(238, 238, 238));
        vehicleDescriptionTextArea.setText(myCar.getVehicleDescription());
        vehicleDescriptionTextArea.setFont(new Font("Calibri", Font.PLAIN, 13));

        vehicleDescriptionPane.setViewportView(vehicleDescriptionTextArea);

        vehicleDescriptionPanel.add(vehicleDescriptionLabel, 0);
        vehicleDescriptionPanel.add(vehicleDescriptionPane, 1);

        //vehicleDescriptionPanel ends here

    }

    public void createDealersInformationPanel(Car myCar) {
        dealersInformationPanel = new JPanel();
        dealersInformationPanel.setLayout(new BoxLayout(dealersInformationPanel, BoxLayout.Y_AXIS));
        dealersInformationPanel.setMaximumSize(new Dimension(916, 70));
        dealersInformationPanel.setMinimumSize(new Dimension(916, 70));
        dealersInformationPanel.setPreferredSize(new Dimension(916, 70));

        dealersInformationPanel.setBackground(new Color(187, 187, 187));
        dealersInformationPanel.setBorder(new LineBorder(new Color(0, 0, 0)));

        dealersInformationLabel = new JLabel();
        dealersInformationLabel.setText("Dealership Information");
        dealersInformationLabel.setFont(new Font("Calibri", Font.BOLD, 16));

        dealersInformationPane = new JScrollPane();
        dealersInformationPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        dealersInformationPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
        dealersInformationPane.setMaximumSize(new Dimension(916, 60));
        dealersInformationPane.setMinimumSize(new Dimension(916, 60));
        dealersInformationPane.setPreferredSize(new Dimension(916, 60));
        dealersInformationPane.setBackground(new Color(187, 187, 187));

        dealersInformationTextArea = new JTextArea();
        dealersInformationTextArea.setMaximumSize(new Dimension(916, 60));
        dealersInformationTextArea.setMinimumSize(new Dimension(916, 60));
        dealersInformationTextArea.setPreferredSize(new Dimension(916, 60));
        dealersInformationTextArea.setBackground(new Color(238, 238, 238));
//        dealersInformationTextArea.setBorder(new LineBorder(new Color(187, 187, 187)));
        dealersInformationTextArea.setText(myCar.getDealersInformation());
        dealersInformationTextArea.setFont(new Font("Calibri", Font.PLAIN, 13));

        dealersInformationPane.setViewportView(dealersInformationTextArea);

        dealersInformationPanel.add(dealersInformationLabel, 0);
        dealersInformationPanel.add(dealersInformationPane, 1);
    }
}
