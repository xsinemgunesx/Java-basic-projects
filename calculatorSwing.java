import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Window.Type;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JPanel screen;
	private JTextField input;
	private double answer,number;
	int operation;
	JLabel lbl = new JLabel("");
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
	}

	public void addInput(String str) {
		input.setText(input.getText()+str);
	}
	public void calculate() {
		switch(operation) {
		case 1: 
			answer = number + Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
	
		case 2:
			answer = number - Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		
		case 3: 
			answer = number * Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		
		case 4:
			answer = number % Double.parseDouble(input.getText());
			input.setText(Double.toString(answer));
			break;
		}	
	}
	/**
	 * Create the frame.
	 */
	public Calculator() {
		setType(Type.UTILITY);
		setTitle("Hesap Makinesi");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 431, 561);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel control = new JPanel(); 
		control.setBounds(10, 92, 403, 422);
		contentPane.add(control);
		control.setLayout(new GridLayout(0, 4, 20, 20));
		
		JButton btnNewButton = new JButton("7");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1);
		
		JButton btnNewButton_1_2 = new JButton("9");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_2);
		
		JButton btnNewButton_1_1_3_2 = new JButton("+");
		btnNewButton_1_1_3_2.addActionListener(new ActionListener() {
			 public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 1;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
				
			}
		});
		btnNewButton_1_1_3_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3_2);
		
		JButton btnNewButton_1_1_1_1 = new JButton("4");
		btnNewButton_1_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_1_1);
		
		JButton btnNewButton_1_1_1 = new JButton("5");
		btnNewButton_1_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_1);
		
		JButton btnNewButton_1_1 = new JButton("6");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1);
		
		JButton btnNewButton_1_1_2 = new JButton("-");
		btnNewButton_1_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 2;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_2);
		
		JButton btnNewButton_1_1_3 = new JButton("1");
		btnNewButton_1_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3);
		
		JButton btnNewButton_1_1_3_1 = new JButton("2");
		btnNewButton_1_1_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_3_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3_1);
		
		JButton btnNewButton_1_1_3_1_1 = new JButton("3");
		btnNewButton_1_1_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3_1_1);
		
		JButton btnNewButton_1_1_3_1_2 = new JButton("*");
		btnNewButton_1_1_3_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 3;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
				
			}
		});
		btnNewButton_1_1_3_1_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3_1_2);
		
		JButton btnNewButton_1_1_3_3 = new JButton("0");
		btnNewButton_1_1_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				addInput(e.getActionCommand());
			}
		});
		btnNewButton_1_1_3_3.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3_3);
		
		JButton btnNewButton_1_1_3_3_1 = new JButton("=");
		btnNewButton_1_1_3_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate();
				input.setText("");
			}
		});
		btnNewButton_1_1_3_3_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3_3_1);
		
		JButton btnNewButton_1_1_3_3_2 = new JButton("C");
		btnNewButton_1_1_3_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				input.setText("");
			}
		});
		btnNewButton_1_1_3_3_2.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3_3_2);
		
		JButton btnNewButton_1_1_3_3_1_1 = new JButton("%");
		btnNewButton_1_1_3_3_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				number = Double.parseDouble(input.getText());
				operation = 4;
				input.setText("");
				lbl.setText(number + e.getActionCommand());
			}
		});
		btnNewButton_1_1_3_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 23));
		control.add(btnNewButton_1_1_3_3_1_1);
		
		screen = new JPanel();
		screen.setBounds(10, 10, 403, 60);
		contentPane.add(screen);
		screen.setLayout(null);
		
		input = new JTextField();
		input.setEditable(false);
		input.setHorizontalAlignment(SwingConstants.RIGHT);
		input.setFont(new Font("Tahoma", Font.BOLD, 23));
		input.setBounds(0, 20, 403, 40);
		screen.add(input);
		input.setColumns(10);
		
		JLabel lbl = new JLabel("");
		lbl.setHorizontalAlignment(SwingConstants.RIGHT);
		lbl.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbl.setBounds(0, 0, 403, 19);
		screen.add(lbl);
	}
}
