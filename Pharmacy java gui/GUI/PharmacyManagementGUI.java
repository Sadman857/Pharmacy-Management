package GUI;

import Entity.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import javax.swing.*;
import manager.PharmacyInventory;

public class PharmacyManagementGUI extends JFrame implements ActionListener {
    private Container c;
    private JLabel lbName, lbPrice, lbQuantity, lbExpiry, lbType, lbId, lbVolume, lbStripSize, lbTitle;
    private JTextField tfName, tfPrice, tfQuantity, tfExpiry, tfType, tfId, tfVolume, tfStripSize;
    private JButton btnAdd, btnUpdate, btnRemove, btnRemoveAll ,btnLoad, btnSave;
    private JTextArea output;

    private PharmacyInventory inventory;

    // Colors
    private Color bgColor = Color.LIGHT_GRAY;
    private Color textColor = Color.BLACK;

    //  Fonts
    private Font labelFont = new Font("Arial", Font.BOLD, 16);
    private Font btnFont = new Font("Verdana", Font.BOLD, 16);
    private Font titleFont = new Font("Arial", Font.BOLD, 22);
    private Font outputFont = new Font("Monospaced", Font.BOLD, 14);

    public PharmacyManagementGUI() {
        super("Pharmacy Management System");
        this.setSize(900, 700);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        inventory = new PharmacyInventory();



        // Container 
        c = this.getContentPane();
        c.setLayout(null);
        c.setBackground(bgColor);

        lbTitle = new JLabel("Pharmacy Management System", JLabel.CENTER);
        lbTitle.setBounds(200, 10, 500, 30);
        lbTitle.setFont(titleFont);
        lbTitle.setForeground(Color.BLACK);
        c.add(lbTitle);

        // Labels and TextFields 
        lbId = new JLabel("ID:");
        lbId.setBounds(20, 60, 120, 25);
        lbId.setFont(labelFont);
        lbId.setForeground(textColor);
        c.add(lbId);
        tfId = new JTextField();
        tfId.setBounds(150, 60, 150, 25);
        c.add(tfId);

        lbName = new JLabel("Name:");
        lbName.setBounds(20, 100, 120, 25);
        lbName.setFont(labelFont);
        lbName.setForeground(textColor);
        c.add(lbName);
        tfName = new JTextField();
        tfName.setBounds(150, 100, 150, 25);
        c.add(tfName);

        lbPrice = new JLabel("Price:");
        lbPrice.setBounds(20, 140, 120, 25);
        lbPrice.setFont(labelFont);
        lbPrice.setForeground(textColor);
        c.add(lbPrice);
        tfPrice = new JTextField();
        tfPrice.setBounds(150, 140, 150, 25);
        c.add(tfPrice);

        lbQuantity = new JLabel("Quantity:");
        lbQuantity.setBounds(20, 180, 120, 25);
        lbQuantity.setFont(labelFont);
        lbQuantity.setForeground(textColor);
        c.add(lbQuantity);
        tfQuantity = new JTextField();
        tfQuantity.setBounds(150, 180, 150, 25);
        c.add(tfQuantity);

        lbExpiry = new JLabel("Expiry:");
        lbExpiry.setBounds(20, 220, 120, 25);
        lbExpiry.setFont(labelFont);
        lbExpiry.setForeground(textColor);
        c.add(lbExpiry);
        tfExpiry = new JTextField();
        tfExpiry.setBounds(150, 220, 150, 25);
        c.add(tfExpiry);

        lbType = new JLabel("Type:");
        lbType.setBounds(20, 260, 120, 25);
        lbType.setFont(labelFont);
        lbType.setForeground(textColor);
        c.add(lbType);
        tfType = new JTextField();
        tfType.setBounds(150, 260, 150, 25);
        c.add(tfType);

        lbVolume = new JLabel("Volume (ml):");
        lbVolume.setBounds(20, 300, 120, 25);
        lbVolume.setFont(labelFont);
        lbVolume.setForeground(textColor);
        c.add(lbVolume);
        tfVolume = new JTextField();
        tfVolume.setBounds(150, 300, 150, 25);
        c.add(tfVolume);

        lbStripSize = new JLabel("Strip Size:");
        lbStripSize.setBounds(20, 340, 120, 25);
        lbStripSize.setFont(labelFont);
        lbStripSize.setForeground(textColor);
        c.add(lbStripSize);
        tfStripSize = new JTextField();
        tfStripSize.setBounds(150, 340, 150, 25);
        c.add(tfStripSize);

        
        btnAdd = new JButton("Add");
        btnAdd.setFont(btnFont);
        btnAdd.setBackground(new Color(34, 139, 34)); // Forest Green
        btnAdd.setForeground(Color.WHITE);
        btnAdd.setOpaque(true);
        btnAdd.setBorderPainted(false);
        btnAdd.addActionListener(this);
        btnAdd.setBounds(500, 80, 150, 40);
        c.add(btnAdd);

        btnUpdate = new JButton("Update");
        btnUpdate.setFont(btnFont);
        btnUpdate.setBackground(Color.BLUE);
        btnUpdate.setForeground(Color.WHITE);
        btnUpdate.setOpaque(true);
        btnUpdate.setBorderPainted(false);
        btnUpdate.addActionListener(this);
        btnUpdate.setBounds(500, 140, 150, 40);
        c.add(btnUpdate);

        btnRemove = new JButton("Remove");
        btnRemove.setFont(btnFont);
        btnRemove.setBackground(new Color(229,57,53));
        btnRemove.setForeground(Color.WHITE);
        btnRemove.setOpaque(true);
        btnRemove.setBorderPainted(false);
        btnRemove.addActionListener(this);
        btnRemove.setBounds(500, 200, 150, 40);
        c.add(btnRemove);

        btnRemoveAll = new JButton("Remove All");
        btnRemoveAll.setFont(btnFont);
        btnRemoveAll.setBackground(new Color(183,28,28));
        btnRemoveAll.setForeground(Color.WHITE);
        btnRemoveAll.setOpaque(true);
        btnRemoveAll.setBorderPainted(false);
        btnRemoveAll.addActionListener(this);
        btnRemoveAll.setBounds(500, 260, 150, 40);
        c.add(btnRemoveAll);
 
        btnLoad = new JButton("Load File");
        btnLoad.setFont(btnFont);
        btnLoad.setBackground(Color.BLUE);
        btnLoad.setForeground(Color.WHITE);
        btnLoad.setOpaque(true);
        btnLoad.setBorderPainted(false); 
        btnLoad.addActionListener(this);
        btnLoad.setBounds(700, 80, 150, 40);
        c.add(btnLoad);

       btnSave = new JButton("Save File");
       btnSave.setFont(btnFont);
       btnSave.setBackground(new Color(34, 139, 34));
       btnSave.setForeground(Color.BLACK);
       btnSave.setOpaque(true);
       btnSave.setBorderPainted(false);
       btnSave.addActionListener(this);
       btnSave.setBounds(700, 140, 150, 40);
       c.add(btnSave);

        
        output = new JTextArea();
        output.setEditable(false);
        output.setFont(outputFont);
        output.setBackground(Color.WHITE);
        output.setForeground(Color.BLACK);
        
        JScrollPane scroll = new JScrollPane(output);
        scroll.setBounds(20, 400, 840, 230);
        c.add(scroll);

        this.setVisible(true);
    }

    
    public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnAdd) addMedicine();
    else if (e.getSource() == btnUpdate) updateMedicine();
    else if (e.getSource() == btnRemove) removeMedicine();
    else if (e.getSource() == btnRemoveAll) removeAllMedicines();
    else if (e.getSource() == btnLoad) loadFromFile();
    else if (e.getSource() == btnSave) saveToFile();
}

public  void addMedicine() {
    String id = tfId.getText();
    String name = tfName.getText();
    String priceText = tfPrice.getText();
    String qtyText = tfQuantity.getText();
    String expiry = tfExpiry.getText();
    String type = tfType.getText();

    if (id.isEmpty() || name.isEmpty() || priceText.isEmpty() || qtyText.isEmpty() || expiry.isEmpty() || type.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required!");
        return;
    }

    double price = Double.parseDouble(priceText);
    double qty = Double.parseDouble(qtyText);

    Medicine med = null;
    if (type.equalsIgnoreCase("Syrup")) {
        double volume = Double.parseDouble(tfVolume.getText());
        med = new Syrup(id, name, price, qty, expiry, volume);
    } else if (type.equalsIgnoreCase("Tablet")) {
        int stripSize = Integer.parseInt(tfStripSize.getText());
        med = new Tablet(id, name, price, qty, expiry, stripSize);
    } else {
        JOptionPane.showMessageDialog(this, "Type must be Syrup or Tablet");
        return;
    }

    inventory.addMedicine(med);
    refreshOutput();
    JOptionPane.showMessageDialog(this, "Medicine added!");
}

public  void updateMedicine() {
    String id = tfId.getText();
    Medicine old = inventory.getMedicineById(id);
    if (old == null) {
        JOptionPane.showMessageDialog(this, "Medicine not found!");
        return;
    }

    String name = tfName.getText();
    String type = tfType.getText();
    double price = Double.parseDouble(tfPrice.getText());
    double qty = Double.parseDouble(tfQuantity.getText());
    String expiry = tfExpiry.getText();

    Medicine med = null;
    if (type.equalsIgnoreCase("Syrup")) {
        double volume = Double.parseDouble(tfVolume.getText());
        med = new Syrup(id, name, price, qty, expiry, volume);
    } else if (type.equalsIgnoreCase("Tablet")) {
        int stripSize = Integer.parseInt(tfStripSize.getText());
        med = new Tablet(id, name, price, qty, expiry, stripSize);
    }

    inventory.updateMedicine(med);
    refreshOutput();
    JOptionPane.showMessageDialog(this, "Medicine updated!");
}

public  void removeMedicine() {
    String id = tfId.getText();
    if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Enter ID to remove.");
        return;
    }
    inventory.removeMedicine(id);
    refreshOutput();
    JOptionPane.showMessageDialog(this, "Medicine removed!");
}

public  void removeAllMedicines() {
    inventory.clearAll();
    refreshOutput();
    JOptionPane.showMessageDialog(this, "All medicines removed!");
}

public  void refreshOutput() {
    output.setText(""); 
    for (Medicine m : inventory.getAllMedicines()) {
        if (m != null) {
            output.append(m.toString() + "\n");
        }
    }
}  

//file io 

public  void saveToFile() {
    try (PrintWriter pw = new PrintWriter("medicines.txt")) {
        for (Medicine m : inventory.getAllMedicines()) {
            if (m != null) pw.println(m.toFileString());
        }
        JOptionPane.showMessageDialog(this, "Data saved successfully!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error saving file: " + ex.getMessage());
    }
}

public  void loadFromFile() {
    try (Scanner sc = new Scanner(new File("medicines.txt"))) {
        inventory.clearAll();
        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            String[] parts = line.split(",");
            String id = parts[0];
            String name = parts[1];
            double price = Double.parseDouble(parts[2]);
            double qty = Double.parseDouble(parts[3]);
            String expiry = parts[4];
            String type = parts[5];

            Medicine med = null;
            if (type.equalsIgnoreCase("Tablet")) {
                int stripSize = Integer.parseInt(parts[6]);
                med = new Tablet(id, name, price, qty, expiry, stripSize);
            } else if (type.equalsIgnoreCase("Syrup")) {
                double volume = Double.parseDouble(parts[6]);
                med = new Syrup(id, name, price, qty, expiry, volume);
            }

            if (med != null) inventory.addMedicine(med);
        }
        refreshOutput();
        JOptionPane.showMessageDialog(this, "Data loaded successfully!");
    } catch (Exception ex) {
        JOptionPane.showMessageDialog(this, "Error loading file: " + ex.getMessage());
    }
}
}