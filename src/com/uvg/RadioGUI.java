package com.uvg;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class RadioGUI{

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
		frame = new JFrame();
		frame.setBounds(100, 100, 811, 626);
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
		
		slider = new JSlider();
		slider.setEnabled(false);
		slider.setValue(0);
		slider.setBounds(139, 142, 200, 26);
		frame.getContentPane().add(slider);
		
		lblRadioActual = new JLabel("New label");
		lblRadioActual.setEnabled(false);
		lblRadioActual.setBounds(210, 113, 56, 16);
		frame.getContentPane().add(lblRadioActual);
		
		button = new JButton("1");
		button.setEnabled(false);
		button.setBounds(444, 13, 97, 25);
		frame.getContentPane().add(button);
		
		button_1 = new JButton("2");
		button_1.setEnabled(false);
		button_1.setBounds(444, 51, 97, 25);
		frame.getContentPane().add(button_1);
		
		button_2 = new JButton("3");
		button_2.setEnabled(false);
		button_2.setBounds(444, 91, 97, 25);
		frame.getContentPane().add(button_2);
		
		button_3 = new JButton("4");
		button_3.setEnabled(false);
		button_3.setBounds(444, 125, 97, 25);
		frame.getContentPane().add(button_3);
		
		button_4 = new JButton("5");
		button_4.setEnabled(false);
		button_4.setBounds(444, 163, 97, 25);
		frame.getContentPane().add(button_4);
		
		button_5 = new JButton("6");
		button_5.setEnabled(false);
		button_5.setBounds(444, 201, 97, 25);
		frame.getContentPane().add(button_5);
		
		button_6 = new JButton("7");
		button_6.setEnabled(false);
		button_6.setBounds(553, 13, 97, 25);
		frame.getContentPane().add(button_6);
		
		button_7 = new JButton("8");
		button_7.setEnabled(false);
		button_7.setBounds(553, 51, 97, 25);
		frame.getContentPane().add(button_7);
		
		button_8 = new JButton("9");
		button_8.setEnabled(false);
		button_8.setBounds(553, 91, 97, 25);
		frame.getContentPane().add(button_8);
		
		button_9 = new JButton("10");
		button_9.setEnabled(false);
		button_9.setBounds(553, 125, 97, 25);
		frame.getContentPane().add(button_9);
		
		button_10 = new JButton("11");
		button_10.setEnabled(false);
		button_10.setBounds(553, 163, 97, 25);
		frame.getContentPane().add(button_10);
		
		button_11 = new JButton("12");
		button_11.setEnabled(false);
		button_11.setBounds(553, 201, 97, 25);
		frame.getContentPane().add(button_11);
	}
	
	private class Botones implements ActionListener, IRadio{

		@Override
		public void actionPerformed(ActionEvent event) {
			// TODO Auto-generated method stub
			
			if (event.getSource().equals(btnEncender)){
				if(btnEncender.getText().equals("Encender")){
					btnEncender.setText("Apagar");
					btnAmFm.setEnabled(true);
					lblAmFm.setEnabled(true);
					slider.setEnabled(true);
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
				}
				
			}else if (event.getSource().equals(btnAmFm))
				if (lblAmFm.getText().equals("AM")){
					lblAmFm.setText("FM");
				}else {
					lblAmFm.setText("AM");
				}
				
			}
		
	}
}
