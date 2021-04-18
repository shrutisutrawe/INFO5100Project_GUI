package GUI_SelfPractice;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.StyleContext;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class ViewVehicleDetails {
    private JFrame frame = new JFrame();
    private List<String> vehicleImageList;
    private JPanel outerPanel;
    private JPanel innerPanel;
    private JPanel vehicleShortDescriptionPanel;
    private JPanel vehicleDetailsPanel;
    private JPanel vehicleImageAndLeadFormPanel;
    private JPanel vehicleInfoPanel;
    private JScrollPane vehicleDescriptionPane;
    private JPanel vehicleDescriptionPanel;
    private JPanel dealersInformationPanel;
    private JLabel vehicleMSRPLabel;
    private JPanel vehicleImagePanel;
    private JButton leadFormButton;
    private JLabel vehicleInfoLabel;
    private JLabel carConditionImageLabel;
    private JLabel carConditionDataLabel;
    private JLabel engineImageLabel;
    private JLabel engineDataLabel;
    private JLabel transmissionDataLabel;
    private JLabel transmissionImageLabel;
    private JLabel VINImageLabel;
    private JLabel VINDataLabel;
    private JLabel fuelImageLabel;
    private JLabel fuelDataLabel;
    private JLabel colorImageLabel;
    private JLabel colorDataLabel;
    private JLabel stockNumberImageLabel;
    private JLabel stockNumberDataLabel;
    private JLabel seatCountImageLabel;
    private JLabel seatCountDataLabel;
    private JLabel ratingsImageLabel;
    private JLabel ratingDataLabel;
    private JLabel vehicleDescriptionLabel;
    private JLabel dealersInformationLabel;
    private JTextArea vehicleDescriptionTextArea;
    private JTextArea dealersInformationTextArea;
    private JLabel mileageImageLabel;
    private JLabel mileageDataLabel;
    private JLabel vehicleNameLabel;
    private JScrollPane scrollPane;
    private JLabel carConditionIconLabel;
    private JLabel mileageIconLabel;
    private JLabel engineIconLabel;
    private JLabel transmissionIconLabel;
    private JLabel vinIconLabel;
    private JLabel fuelIconLabel;
    private JLabel colorIconLabel;
    private JLabel stockNumberIconLabel;
    private JLabel seatCountIconLabel;
    private JLabel ratingsIconLabel;
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


    public ViewVehicleDetails(Car myCar) {
        vehicleImageList = new ArrayList<>();
        vehicleImageList.add("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\CarImages\\img1.jpg");
        vehicleImageList.add("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\CarImages\\img2.jpg");
        vehicleImageList.add("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\CarImages\\img3.jpg");
        vehicleImageList.add("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\CarImages\\img4.jpg");


        createVehicleShortDescriptionPanel(myCar);
        createVehicleDetailsPanel(myCar);
        createVehicleDescriptionPanel(myCar);
        createDealersInformationPanel(myCar);
        createOuterPanel();
    }

    public void createOuterPanel() {
        JFrame frame = new JFrame();

        scrollPane = new JScrollPane();
        scrollPane.setBackground(new Color(-4473925));
        scrollPane.setMaximumSize(new Dimension(916, 1150));
        scrollPane.setMinimumSize(new Dimension(916, 1150));
        scrollPane.setPreferredSize(new Dimension(916, 1150));
//        scrollPane.setBorder(new LineBorder(new Color(255,0,0)));

        innerPanel = new JPanel();
        innerPanel.setLayout(new BoxLayout(innerPanel,BoxLayout.Y_AXIS));
        innerPanel.setPreferredSize(new Dimension(916, 950));
        innerPanel.setMaximumSize(new Dimension(916, 950));
        innerPanel.setMinimumSize(new Dimension(916, 950));
//        innerPanel.setBorder(new LineBorder(new Color(0,0,0)));
        scrollPane.setViewportView(innerPanel);

        innerPanel.add(vehicleShortDescriptionPanel, 0);
        innerPanel.add(vehicleDetailsPanel, 1);
        innerPanel.add(vehicleDescriptionPanel, 2);
        innerPanel.add(dealersInformationPanel, 3);


        frame.setSize(new Dimension(916, 1150));
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
        vehicleShortDescriptionPanel.setBorder(new LineBorder(new Color(0,0,0)));

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
        vehicleDetailsPanel.setBorder(new LineBorder(new Color(0, 0, 0)));

        createVehicleImageAndLeadFormPanel();
        createVehicleInfoDetailsPanel(myCar);
        vehicleDetailsPanel.add(vehicleImageAndLeadFormPanel, 0);
        vehicleDetailsPanel.add(vehicleInfoPanel, 1);
    }

    public void createVehicleImageAndLeadFormPanel(){
        vehicleImageAndLeadFormPanel = new JPanel();
        vehicleImageAndLeadFormPanel.setLayout(new BoxLayout(vehicleImageAndLeadFormPanel, BoxLayout.Y_AXIS));
        vehicleImageAndLeadFormPanel.setPreferredSize(new Dimension(540, 600));
        vehicleImageAndLeadFormPanel.setMinimumSize(new Dimension(540, 600));
        vehicleImageAndLeadFormPanel.setMaximumSize(new Dimension(540, 600));

        vehicleImagePanel = new VehicleImagePanel(vehicleImageList).imagePanel();

        requestLeadFormPanel = new JPanel();
        requestLeadFormPanel.setLayout(new BoxLayout(requestLeadFormPanel, BoxLayout.X_AXIS));
        requestLeadFormPanel.setPreferredSize(new Dimension(540, 100));
        requestLeadFormPanel.setMinimumSize(new Dimension(540, 100));
        requestLeadFormPanel.setMaximumSize(new Dimension(540, 100));

        leadFormButton = new JButton();
        leadFormButton.setText("Lead Form");
        leadFormButton.setPreferredSize(new Dimension(100, 20));
        leadFormButton.setMaximumSize(new Dimension(100, 20));
        leadFormButton.setMinimumSize(new Dimension(100, 20));
        requestLeadFormPanel.setAlignmentX(Component.CENTER_ALIGNMENT);
        leadFormButton.setAlignmentX(Component.CENTER_ALIGNMENT);
        requestLeadFormPanel.add(leadFormButton, 0);

        vehicleImageAndLeadFormPanel.add(vehicleImagePanel, 0);
        vehicleImageAndLeadFormPanel.add(requestLeadFormPanel, 1);
    }

    public void createVehicleInfoDetailsPanel(Car myCar){

        vehicleInfoPanel = new JPanel();
        vehicleInfoPanel.setLayout(new BoxLayout(vehicleInfoPanel, BoxLayout.Y_AXIS));

//        vehicleInfoBoxLayoutPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
        vehicleInfoPanel.setPreferredSize(new Dimension(370, 600));
        vehicleInfoPanel.setMaximumSize(new Dimension(370, 600));
        vehicleInfoPanel.setMaximumSize(new Dimension(370, 600));

        vehicleInfoLabelPanel = new JPanel();
        vehicleInfoLabelPanel.setLayout(new BoxLayout(vehicleInfoLabelPanel, BoxLayout.X_AXIS));
        vehicleInfoLabelPanel.setPreferredSize(labelPanelDimension);
        vehicleInfoLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleInfoLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleInfoLabel = new JLabel();
        vehicleInfoLabel.setFont(new Font("Calibri",Font.BOLD,24));
        vehicleInfoLabel.setText("Vehicle Info");

        vehicleInfoLabelPanel.add(vehicleInfoLabel, 0);

         carImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\carcondition.jpg");
         engineImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\CarEngine.jpg");
         transmissionImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\Transmission.jpg");
         vinImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\VIN.jpg");
         fuelImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\Fuel.jpg");
         exteriorColorImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\CarColor.jpg");
         stockNumberImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\vehicleid.jpg");
         mileageImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\Mileage.jpg");
         seatCountImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\carseat.jpg");
         ratingsImage = new ImageIcon("C:\\Users\\Shruti\\Desktop\\NEU\\INFO_5100_AED_2021\\Project\\Pictures\\new_Pictures\\Ratings.jpg");


        //vehicleConditionLabelPanel starts here
        vehicleConditionLabelPanel = new JPanel();
        vehicleConditionLabelPanel.setLayout(new BoxLayout(vehicleConditionLabelPanel, BoxLayout.X_AXIS));
        vehicleConditionLabelPanel.setPreferredSize(labelPanelDimension);
        vehicleConditionLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleConditionLabelPanel.setMaximumSize(labelPanelDimension);

        carConditionIconLabel = new JLabel();
        carConditionIconLabel.setIcon(carImage);
        carConditionIconLabel.setPreferredSize(iconLabelDimension);
        carConditionIconLabel.setMaximumSize(iconLabelDimension);
        carConditionIconLabel.setMinimumSize(iconLabelDimension);

        carConditionDataLabel = new JLabel();
        carConditionDataLabel.setText(myCar.getCarCategory());
        carConditionDataLabel.setPreferredSize(dataLabelDimension);
        carConditionDataLabel.setMinimumSize(dataLabelDimension);
        carConditionDataLabel.setMinimumSize(dataLabelDimension);

        carConditionImageLabel = new JLabel();
        carConditionImageLabel.setText("Car Condition");
        carConditionImageLabel.setPreferredSize(imageLabelDimension);
        carConditionImageLabel.setMaximumSize(imageLabelDimension);
        carConditionImageLabel.setMinimumSize(imageLabelDimension);

        vehicleConditionLabelPanel.add(carConditionIconLabel, 0);
        vehicleConditionLabelPanel.add(carConditionImageLabel, 1);
        vehicleConditionLabelPanel.add(carConditionDataLabel, 2);
        //vehicleConditionLabelPanel ends here

        //vehicleEngineLabelPanel starts here
        vehicleEngineLabelPanel = new JPanel();
        vehicleEngineLabelPanel.setLayout(new BoxLayout(vehicleEngineLabelPanel, BoxLayout.X_AXIS));
        vehicleEngineLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleEngineLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleEngineLabelPanel.setPreferredSize(labelPanelDimension);

        engineIconLabel = new JLabel();
        engineIconLabel.setIcon(engineImage);
        engineIconLabel.setPreferredSize(iconLabelDimension);
        engineIconLabel.setMaximumSize(iconLabelDimension);
        engineIconLabel.setMinimumSize(iconLabelDimension);

        engineDataLabel = new JLabel();
        engineDataLabel.setText(myCar.getEngine());
        engineDataLabel.setPreferredSize(dataLabelDimension);
        engineDataLabel.setMinimumSize(dataLabelDimension);
        engineDataLabel.setMinimumSize(dataLabelDimension);

        engineImageLabel = new JLabel();
        engineImageLabel.setText("Engine");
        engineImageLabel.setPreferredSize(imageLabelDimension);
        engineImageLabel.setMaximumSize(imageLabelDimension);
        engineImageLabel.setMinimumSize(imageLabelDimension);

        vehicleEngineLabelPanel.add(engineIconLabel, 0);
        vehicleEngineLabelPanel.add(engineImageLabel, 1);
        vehicleEngineLabelPanel.add(engineDataLabel, 2);
        //vehicleEngineLabelPanel ends here

        vehicleTransmissionLabelPanel = new JPanel();
        vehicleTransmissionLabelPanel.setLayout(new BoxLayout(vehicleTransmissionLabelPanel, BoxLayout.X_AXIS));
        vehicleTransmissionLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleTransmissionLabelPanel.setPreferredSize(labelPanelDimension);
        vehicleTransmissionLabelPanel.setMinimumSize(labelPanelDimension);

        transmissionIconLabel = new JLabel();
        transmissionIconLabel.setIcon(transmissionImage);
        transmissionIconLabel.setPreferredSize(iconLabelDimension);
        transmissionIconLabel.setMaximumSize(iconLabelDimension);
        transmissionIconLabel.setMinimumSize(iconLabelDimension);

        transmissionImageLabel = new JLabel();
        transmissionImageLabel.setText("Transmission");
        transmissionImageLabel.setPreferredSize(imageLabelDimension);
        transmissionImageLabel.setMaximumSize(imageLabelDimension);
        transmissionImageLabel.setMinimumSize(imageLabelDimension);

        transmissionDataLabel = new JLabel();
        transmissionDataLabel.setText(myCar.getTransmission());
        transmissionDataLabel.setPreferredSize(dataLabelDimension);
        transmissionDataLabel.setMinimumSize(dataLabelDimension);
        transmissionDataLabel.setMinimumSize(dataLabelDimension);

        vehicleTransmissionLabelPanel.add(transmissionIconLabel, 0);
        vehicleTransmissionLabelPanel.add(transmissionImageLabel, 1);
        vehicleTransmissionLabelPanel.add(transmissionDataLabel, 2);

        //vehicleVINLabelPanel starts here
        vehicleVINLabelPanel = new JPanel();
        vehicleVINLabelPanel.setLayout(new BoxLayout(vehicleVINLabelPanel, BoxLayout.X_AXIS));
        vehicleVINLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleVINLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleVINLabelPanel.setPreferredSize(labelPanelDimension);

        vinIconLabel = new JLabel();
        vinIconLabel.setIcon(vinImage);
        vinIconLabel.setPreferredSize(iconLabelDimension);
        vinIconLabel.setMaximumSize(iconLabelDimension);
        vinIconLabel.setMinimumSize(iconLabelDimension);

        VINImageLabel = new JLabel();
        VINImageLabel.setText("VIN");
        VINImageLabel.setPreferredSize(imageLabelDimension);
        VINImageLabel.setMaximumSize(imageLabelDimension);
        VINImageLabel.setMinimumSize(imageLabelDimension);

        VINDataLabel = new JLabel();
        VINDataLabel.setText(myCar.getVIN());
        VINDataLabel.setPreferredSize(dataLabelDimension);
        VINDataLabel.setMinimumSize(dataLabelDimension);
        VINDataLabel.setMinimumSize(dataLabelDimension);

        vehicleVINLabelPanel.add(vinIconLabel, 0);
        vehicleVINLabelPanel.add(VINImageLabel, 1);
        vehicleVINLabelPanel.add(VINDataLabel, 2);
        //vehicleVINLabelPanel ends here

        //vehicleFuelLabelPanel starts here
        vehicleFuelLabelPanel = new JPanel();
        vehicleFuelLabelPanel.setLayout(new BoxLayout(vehicleFuelLabelPanel, BoxLayout.X_AXIS));
        vehicleFuelLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleFuelLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleFuelLabelPanel.setPreferredSize(labelPanelDimension);
//        vehicleFuelLabelPanel.add(Box.createRigidArea(labelPanelDimension));

//        fuelIconLabel.setHorizontalAlignment(SwingConstants.CENTER);
        fuelIconLabel = new JLabel();
        fuelIconLabel.setIcon(fuelImage);
        fuelIconLabel.setPreferredSize(iconLabelDimension);
        fuelIconLabel.setMaximumSize(iconLabelDimension);
        fuelIconLabel.setMinimumSize(iconLabelDimension);

        fuelImageLabel = new JLabel();
        fuelImageLabel.setText("Fuel");
        fuelImageLabel.setPreferredSize(imageLabelDimension);
        fuelImageLabel.setMaximumSize(imageLabelDimension);
        fuelImageLabel.setMinimumSize(imageLabelDimension);

        fuelDataLabel = new JLabel();
        fuelDataLabel.setText(myCar.getFuel());
        fuelDataLabel.setPreferredSize(dataLabelDimension);
        fuelDataLabel.setMinimumSize(dataLabelDimension);
        fuelDataLabel.setMinimumSize(dataLabelDimension);

        vehicleFuelLabelPanel.add(fuelIconLabel, 0);
        vehicleFuelLabelPanel.add(fuelImageLabel, 1);
        vehicleFuelLabelPanel.add(fuelDataLabel, 2);
        //vehicleFuelLabelPanel ends here

        //vehicleColorLabelPanel starts here
        vehicleColorLabelPanel = new JPanel();
        vehicleColorLabelPanel.setLayout(new BoxLayout(vehicleColorLabelPanel, BoxLayout.X_AXIS));
        vehicleColorLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleColorLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleColorLabelPanel.setPreferredSize(labelPanelDimension);

        colorIconLabel = new JLabel();
        colorIconLabel.setIcon(exteriorColorImage);
        colorIconLabel.setPreferredSize(iconLabelDimension);
        colorIconLabel.setMaximumSize(iconLabelDimension);
        colorIconLabel.setMinimumSize(iconLabelDimension);

        colorImageLabel = new JLabel();
        colorImageLabel.setText("Color");
        colorImageLabel.setPreferredSize(imageLabelDimension);
        colorImageLabel.setMaximumSize(imageLabelDimension);
        colorImageLabel.setMinimumSize(imageLabelDimension);

        colorDataLabel = new JLabel();
        colorDataLabel.setText(myCar.getExteriorColor());
        colorDataLabel.setPreferredSize(dataLabelDimension);
        colorDataLabel.setMinimumSize(dataLabelDimension);
        colorDataLabel.setMinimumSize(dataLabelDimension);

        vehicleColorLabelPanel.add(colorIconLabel, 0);
        vehicleColorLabelPanel.add(colorImageLabel, 1);
        vehicleColorLabelPanel.add(colorDataLabel, 2);
        //vehicleColorLabelPanel ends here

        //vehicleStockNumberLabelPanel starts here
        vehicleStockNumberLabelPanel = new JPanel();
        vehicleStockNumberLabelPanel.setLayout(new BoxLayout(vehicleStockNumberLabelPanel, BoxLayout.X_AXIS));
        vehicleStockNumberLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleStockNumberLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleStockNumberLabelPanel.setPreferredSize(labelPanelDimension);

        stockNumberIconLabel = new JLabel();
        stockNumberIconLabel.setIcon(stockNumberImage);
        stockNumberIconLabel.setPreferredSize(iconLabelDimension);
        stockNumberIconLabel.setMaximumSize(iconLabelDimension);
        stockNumberIconLabel.setMinimumSize(iconLabelDimension);

        stockNumberImageLabel = new JLabel();
        stockNumberImageLabel.setText("Stock #");
        stockNumberImageLabel.setPreferredSize(imageLabelDimension);
        stockNumberImageLabel.setMaximumSize(imageLabelDimension);
        stockNumberImageLabel.setMinimumSize(imageLabelDimension);

        stockNumberDataLabel = new JLabel();
        stockNumberDataLabel.setText(Integer.toString(myCar.getStockNumber()));
        stockNumberDataLabel.setPreferredSize(dataLabelDimension);
        stockNumberDataLabel.setMinimumSize(dataLabelDimension);
        stockNumberDataLabel.setMinimumSize(dataLabelDimension);

        vehicleStockNumberLabelPanel.add(stockNumberIconLabel, 0);
        vehicleStockNumberLabelPanel.add(stockNumberImageLabel, 1);
        vehicleStockNumberLabelPanel.add(stockNumberDataLabel, 2);
        //vehicleStockNumberLabelPanel ends here

        //vehicleMileageLabelPanel starts here
        vehicleMileageLabelPanel = new JPanel();
        vehicleMileageLabelPanel.setLayout(new BoxLayout(vehicleMileageLabelPanel, BoxLayout.X_AXIS));
        vehicleMileageLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleMileageLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleMileageLabelPanel.setPreferredSize(labelPanelDimension);

        mileageIconLabel = new JLabel();
        mileageIconLabel.setIcon(mileageImage);
        mileageIconLabel.setPreferredSize(iconLabelDimension);
        mileageIconLabel.setMaximumSize(iconLabelDimension);
        mileageIconLabel.setMinimumSize(iconLabelDimension);

        mileageImageLabel = new JLabel();
        mileageImageLabel.setText("Mileage");
        mileageImageLabel.setPreferredSize(imageLabelDimension);
        mileageImageLabel.setMaximumSize(imageLabelDimension);
        mileageImageLabel.setMinimumSize(imageLabelDimension);

        mileageDataLabel = new JLabel();
        mileageDataLabel.setText(Integer.toString(myCar.getMileage()));
        mileageDataLabel.setPreferredSize(dataLabelDimension);
        mileageDataLabel.setMinimumSize(dataLabelDimension);
        mileageDataLabel.setMinimumSize(dataLabelDimension);

        vehicleMileageLabelPanel.add(mileageIconLabel, 0);
        vehicleMileageLabelPanel.add(mileageImageLabel, 1);
        vehicleMileageLabelPanel.add(mileageDataLabel, 2);
        //vehicleMileageLabelPanel ends here

        //vehicleSeatCountLabelPanel starts here
        vehicleSeatCountLabelPanel = new JPanel();
        vehicleSeatCountLabelPanel.setLayout(new BoxLayout(vehicleSeatCountLabelPanel, BoxLayout.X_AXIS));
        vehicleSeatCountLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleSeatCountLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleSeatCountLabelPanel.setPreferredSize(labelPanelDimension);

        seatCountIconLabel = new JLabel();
        seatCountIconLabel.setIcon(seatCountImage);
        seatCountIconLabel.setPreferredSize(iconLabelDimension);
        seatCountIconLabel.setMaximumSize(iconLabelDimension);
        seatCountIconLabel.setMinimumSize(iconLabelDimension);

        seatCountImageLabel = new JLabel();
        seatCountImageLabel.setText("No of Seats");
        seatCountImageLabel.setPreferredSize(imageLabelDimension);
        seatCountImageLabel.setMaximumSize(imageLabelDimension);
        seatCountImageLabel.setMinimumSize(imageLabelDimension);

        seatCountDataLabel = new JLabel();
        seatCountDataLabel.setText(Integer.toString(myCar.getSeatCount()));
        seatCountDataLabel.setPreferredSize(dataLabelDimension);
        seatCountDataLabel.setMinimumSize(dataLabelDimension);
        seatCountDataLabel.setMinimumSize(dataLabelDimension);

        vehicleSeatCountLabelPanel.add(seatCountIconLabel, 0);
        vehicleSeatCountLabelPanel.add(seatCountImageLabel, 1);
        vehicleSeatCountLabelPanel.add(seatCountDataLabel, 2);
        //vehicleSeatCountLabelPanel ends here

        //vehicleRatingsLabelPanel starts here
        vehicleRatingsLabelPanel = new JPanel();
        vehicleRatingsLabelPanel.setLayout(new BoxLayout(vehicleRatingsLabelPanel, BoxLayout.X_AXIS));
        vehicleRatingsLabelPanel.setMinimumSize(labelPanelDimension);
        vehicleRatingsLabelPanel.setMaximumSize(labelPanelDimension);
        vehicleRatingsLabelPanel.setPreferredSize(labelPanelDimension);

        ratingsIconLabel = new JLabel();
        ratingsIconLabel.setIcon(ratingsImage);
        ratingsIconLabel.setPreferredSize(iconLabelDimension);
        ratingsIconLabel.setMaximumSize(iconLabelDimension);
        ratingsIconLabel.setMinimumSize(iconLabelDimension);

        ratingsImageLabel = new JLabel();
        ratingsImageLabel.setText("Ratings");
        ratingsImageLabel.setPreferredSize(imageLabelDimension);
        ratingsImageLabel.setMaximumSize(imageLabelDimension);
        ratingsImageLabel.setMinimumSize(imageLabelDimension);

        ratingDataLabel = new JLabel();
        ratingDataLabel.setText(Integer.toString(myCar.getRatings()));
        ratingDataLabel.setPreferredSize(dataLabelDimension);
        ratingDataLabel.setMinimumSize(dataLabelDimension);
        ratingDataLabel.setMinimumSize(dataLabelDimension);

        vehicleRatingsLabelPanel.add(ratingsIconLabel, 0);
        vehicleRatingsLabelPanel.add(ratingsImageLabel, 1);
        vehicleRatingsLabelPanel.add(ratingDataLabel, 2);
        //vehicleRatingsLabelPanel ends here

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

    public void createVehicleDescriptionPanel(Car myCar) {
        //vehicleDescriptionPanel start
        vehicleDescriptionPanel = new JPanel();
        vehicleDescriptionPanel.setLayout(new BoxLayout(vehicleDescriptionPanel, BoxLayout.Y_AXIS));
        vehicleDescriptionPanel.setMaximumSize(new Dimension(916, 140));
        vehicleDescriptionPanel.setMinimumSize(new Dimension(916, 140));
        vehicleDescriptionPanel.setPreferredSize(new Dimension(916, 140));

        vehicleDescriptionPanel.setBackground(new Color(187, 187, 187));
        vehicleDescriptionPanel.setBorder(new LineBorder(new Color(0, 0, 0)));

        vehicleDescriptionLabel = new JLabel();
        vehicleDescriptionLabel.setText("Vehicle Description");

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

        dealersInformationTextArea = new JTextArea();
        dealersInformationTextArea.setMaximumSize(new Dimension(916, 60));
        dealersInformationTextArea.setMinimumSize(new Dimension(916, 60));
        dealersInformationTextArea.setPreferredSize(new Dimension(916, 60));
        dealersInformationTextArea.setBackground(new Color(238, 238, 238));
//        dealersInformationTextArea.setBorder(new LineBorder(new Color(187, 187, 187)));
        dealersInformationTextArea.setText(myCar.getDealersInformation());

        dealersInformationPanel.add(dealersInformationLabel, 0);
        dealersInformationPanel.add(dealersInformationTextArea, 1);
    }
}
