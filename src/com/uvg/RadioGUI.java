package com.uvg;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;
import javax.swing.border.BevelBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.Font;
import java.awt.Color;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.SwingConstants;
import java.text.DecimalFormat;
import javax.swing.JToggleButton;
import javax.swing.JCheckBox;


public class RadioGUI{

	private DecimalFormat formato;
	private Radio radio;
	private JFrame frame;
	private JButton btnEncender;
	private JButton btnAmFm;
	private JLabel lblAmFm;
	private JSlider slider;
	private JLabel lblRadioActual;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton btnSiguiente;
	private JButton btnAnterior;
	private JCheckBox chckbxMemorizar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioGUI window = new RadioGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public RadioGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		radio = new Radio();
		formato = new DecimalFormat("0.0");
		
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 0));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 13));
		frame.setBounds(100, 100, 813, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnEncender = new JButton("Encender");
		btnEncender.setBounds(31, 13, 97, 25);
		frame.getContentPane().add(btnEncender);
		btnEncender.addActionListener(new Botones());
		
		btnAmFm = new JButton("AM/FM");
		btnAmFm.setEnabled(false);
		btnAmFm.setBounds(140, 13, 97, 25);
		frame.getContentPane().add(btnAmFm);
		btnAmFm.addActionListener(new Botones());
		
		lblAmFm = new JLabel("AM");
		lblAmFm.setEnabled(false);
		lblAmFm.setBounds(249, 17, 56, 16);
		frame.getContentPane().add(lblAmFm);
		
		int min = 528;
		int max = 1612;
		slider = new JSlider(530, 1610);
		slider.setPaintLabels(true);
		slider.setSnapToTicks(true);
		slider.setPaintTicks(true);
		slider.setBorder(null);
		slider.setEnabled(false);
		slider.setValue(530);
		slider.setBounds(59, 142, 683, 54);
		slider.setMajorTickSpacing(100);
		slider.setMinorTickSpacing(10);
		frame.getContentPane().add(slider);
		slider.addChangeListener(new SliderListener());
		
		
		lblRadioActual = new JLabel("530");
		lblRadioActual.setHorizontalAlignment(SwingConstants.CENTER);
		lblRadioActual.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblRadioActual.setEnabled(false);
		lblRadioActual.setBounds(321, 92, 157, 37);
		frame.getContentPane().add(lblRadioActual);
		
		button = new JButton("1");
		button.setEnabled(false);
		button.setBounds(81, 209, 97, 25);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("2");
		button_1.setEnabled(false);
		button_1.setBounds(190, 209, 97, 25);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("3");
		button_2.setEnabled(false);
		button_2.setBounds(299, 209, 97, 25);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("4");
		button_3.setEnabled(false);
		button_3.setBounds(408, 209, 97, 25);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("5");
		button_4.setEnabled(false);
		button_4.setBounds(517, 209, 97, 25);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("6");
		button_5.setEnabled(false);
		button_5.setBounds(626, 209, 97, 25);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("7");
		button_6.setEnabled(false);
		button_6.setBounds(81, 244, 97, 25);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("8");
		button_7.setEnabled(false);
		button_7.setBounds(190, 244, 97, 25);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("9");
		button_8.setEnabled(false);
		button_8.setBounds(299, 244, 97, 25);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("10");
		button_9.setEnabled(false);
		button_9.setBounds(408, 244, 97, 25);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("11");
		button_10.setEnabled(false);
		button_10.setBounds(517, 247, 97, 25);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("12");
		button_11.setEnabled(false);
		button_11.setBounds(626, 247, 97, 25);
		frame.getContentPane().add(button_11);
		
		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setEnabled(false);
		btnSiguiente.setBounds(490, 104, 97, 25);
		frame.getContentPane().add(btnSiguiente);
		btnSiguiente.addActionListener(new Botones());
		
		btnAnterior = new JButton("Anterior");
		btnAnterior.setEnabled(false);
		btnAnterior.setBounds(190, 103, 97, 25);
		frame.getContentPane().add(btnAnterior);
		
		chckbxMemorizar = new JCheckBox("Memorizar");
		chckbxMemorizar.setBounds(81, 278, 113, 25);
		frame.getContentPane().add(chckbxMemorizar);
		btnAnterior.addActionListener(new Botones());
		frame.getContentPane().setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{btnEncender, btnAmFm, lblAmFm, slider, lblRadioActual, button, button_1, button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_11}));
	}
	
	private class Botones implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			int position = 0;
			
			if (event.getSource().equals(btnEncender)){
				radio.OnOff();
				if(radio.isOn){
					btnEncender.setText("Apagar");
					btnAmFm.setEnabled(true);
					lblAmFm.setEnabled(true);
					slider.setEnabled(false);
					lblRadioActual.setEnabled(true);
					button.setEnabled(true);
					button_1.setEnabled(true);
					button_2.setEnabled(true);
					button_3.setEnabled(true);
					button_4.setEnabled(true);
					button_5.setEnabled(true);
					button_6.setEnabled(true);
					button_7.setEnabled(true);
					button_8.setEnabled(true);
					button_9.setEnabled(true);
					button_10.setEnabled(true);
					button_11.setEnabled(true);
					btnSiguiente.setEnabled(true);
					btnAnterior.setEnabled(true);
				}else{
					btnEncender.setText("Encender");
					btnAmFm.setEnabled(false);
					lblAmFm.setEnabled(false);
					slider.setEnabled(false);
					lblRadioActual.setEnabled(false);
					button.setEnabled(false);
					button_1.setEnabled(false);
					button_2.setEnabled(false);
					button_3.setEnabled(false);
					button_4.setEnabled(false);
					button_5.setEnabled(false);
					button_6.setEnabled(false);
					button_7.setEnabled(false);
					button_8.setEnabled(false);
					button_9.setEnabled(false);
					button_10.setEnabled(false);
					button_11.setEnabled(false);
					btnSiguiente.setEnabled(false);
					btnAnterior.setEnabled(false);
				}
				
			}else if (event.getSource().equals(btnAmFm)){
				radio.changeFrecuency();
				lblAmFm.setText(radio.getFrecuency());
				
				if(radio.getFrecuency().equals("AM")){
					Integer Station = 530;
					radio.setStation(Station.toString());
					slider.setMaximum(1610);
					slider.setMinimum(530);
					slider.setValue(530);
					slider.setMajorTickSpacing(100);
					slider.setMinorTickSpacing(10);
				}else{
					Double Station = 87.9;
					radio.setStation(formato.format(Station));
					slider.setMaximum(1079);
					slider.setMinimum(879);
					slider.setValue(879);
					slider.setMajorTickSpacing(10);
					slider.setMinorTickSpacing(2);
				}
				
			}else if (event.getSource().equals(btnSiguiente)){
				if(radio.getFrecuency().equals("AM")){
					slider.setValue(slider.getValue()+10);
				}else{
					slider.setValue(slider.getValue()+2);
				}
				
			}else if (event.getSource().equals(btnAnterior)){
				if(radio.getFrecuency().equals("AM")){
					slider.setValue(slider.getValue()-10);
				}else{
					slider.setValue(slider.getValue()-2);
				}
			}else if (event.getSource().equals(button)){
				position = 0;
			}else if (event.getSource().equals(button_1)){
				position = 1;
			}else if (event.getSource().equals(button_2)){
				position = 2;
			}else if (event.getSource().equals(button_3)){
				position = 3;
			}else if (event.getSource().equals(button_4)){
				position = 4;
			}else if (event.getSource().equals(button_5)){
				position = 5;
			}else if (event.getSource().equals(button_6)){
				position = 6;
			}else if (event.getSource().equals(button_7)){
				position = 7;
			}else if (event.getSource().equals(button_8)){
				position = 8;
			}else if (event.getSource().equals(button_9)){
				position = 9;
			}else if (event.getSource().equals(button_10)){
				position = 10;
			}else if (event.getSource().equals(button_11)){
				position = 11;
			}
			
			if(chckbxMemorizar.isSelected()){
				radio.setMemory(position);
			}else{
				
			}
		
		}
	}
	
	private class SliderListener implements ChangeListener{

		@Override
		public void stateChanged(ChangeEvent arg0) {
			// TODO Auto-generated method stub
			
			if (radio.getFrecuency().equals("AM")){
				if(Integer.parseInt(radio.getStation()) < slider.getValue()){
					radio.Forward();
				}else if(Integer.parseInt(radio.getStation()) > slider.getValue()){
					radio.Backward();
				}
				lblRadioActual.setText(radio.getStation());
			}else{
				if(Double.parseDouble(radio.getStation()) < ((double) slider.getValue())/10){
					radio.Forward();
				}else if(Double.parseDouble(radio.getStation()) > ((double) slider.getValue())/10){
					radio.Backward();
				}
				lblRadioActual.setText(formato.format(Double.parseDouble(radio.getStation())));
				
			}
			
			System.out.println(radio.getStation());
			
			
			
		}

		
	}
}
