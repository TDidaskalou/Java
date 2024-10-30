package main;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

import javax.swing.*;

public class ChargeCalculator extends JFrame{

	private JButton calculateChargeButton;
	private JPanel panel;
	private Ship  ship;
	private JButton createContainerButton;
	private ArrayList<Ship> ships;
	private JList shipList;
	private JTextField totalChargeField;
	private JScrollPane scrollPane;
	
	
	public ChargeCalculator(ArrayList<Ship> someShips) {
		
		ships = someShips;
		
		
		panel = new JPanel();
		calculateChargeButton = new JButton("Calculate Charge");
		createContainerButton = new JButton("Create Container");
		shipList= new JList();
		totalChargeField = new JTextField();
		
		
		BorderLayout border = new BorderLayout();
		
		
		
		
		DefaultListModel model = new DefaultListModel();
		
		for(Ship ship:ships)
			model.addElement(ship);
		
		shipList.setModel(model);
		
		
		
		
		scrollPane = new JScrollPane(shipList);
		
		
		panel.setLayout(border);
		panel.add(scrollPane);
		panel.add(totalChargeField,BorderLayout.EAST);
		panel.add(calculateChargeButton,BorderLayout.NORTH);
		panel.add(createContainerButton,BorderLayout.SOUTH);
		panel.add(shipList,BorderLayout.CENTER);
		
		this.setContentPane(panel);

	
		ChargeButtonListener chargeListener = new ChargeButtonListener();
		calculateChargeButton.addActionListener(chargeListener);
		
		
		
		
		
		CreateButtonListener createListener = new CreateButtonListener();
		createContainerButton.addActionListener(createListener);
		
		
		
		
		
		
		
		this.setVisible(true);
		this.setSize(400,400);
		this.setTitle("Charge Calculator");
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	
	
	class ChargeButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			
			
			Ship selectedShip=(Ship) shipList.getSelectedValue();

			
			totalChargeField.setText("Total charge   "+selectedShip.getName()+" "+selectedShip.getTotalCharge());
			
			
			System.out.println("Total charge   "+selectedShip.getName()+" "+selectedShip.getTotalCharge());
			
		}
		
		
	}
	
	
	class CreateButtonListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			ContainerFrame cf = new ContainerFrame(ships);
			
		}
		
		
	}
	
	
}
