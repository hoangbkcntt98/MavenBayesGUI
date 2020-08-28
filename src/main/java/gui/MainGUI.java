package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JToolBar;
import javax.swing.JPopupMenu;
import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MainGUI {

	private JFrame frmRiskmanagementApp;

	/**
	 * Launch the application.
	 */
	public static void main() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUI window = new MainGUI();
					window.frmRiskmanagementApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRiskmanagementApp = new JFrame();
		frmRiskmanagementApp.setTitle("RiskManagement App");
		frmRiskmanagementApp.setBounds(100, 100, 532, 276);
		frmRiskmanagementApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRiskmanagementApp.getContentPane().setLayout(null);
		
		JPanel input = new JPanel();
		input.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Input", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 0)));
		input.setBounds(45, 11, 428, 181);
		frmRiskmanagementApp.getContentPane().add(input);
		input.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Project Info :");
		lblNewLabel.setBounds(98, 29, 112, 27);
		input.add(lblNewLabel);
		
		ImportGUI importGUI = new ImportGUI();
		importGUI.setBounds(178, 29, 175, 23);
		input.add(importGUI);
		
		JLabel lblNewLabel_1 = new JLabel("Risk Info");
		lblNewLabel_1.setBounds(98, 54, 112, 27);
		input.add(lblNewLabel_1);
		
		ImportGUI importGUI_1 = new ImportGUI();
		importGUI_1.setBounds(178, 54, 175, 23);
		input.add(importGUI_1);
		
		JLabel lblNewLabel_2 = new JLabel("Risk realations");
		lblNewLabel_2.setBounds(98, 76, 112, 27);
		input.add(lblNewLabel_2);
		
		ImportGUI importGUI_2 = new ImportGUI();
		importGUI_2.setBounds(178, 80, 175, 23);
		input.add(importGUI_2);
		
		JLabel lblNewLabel_3 = new JLabel("Risk distribution");
		lblNewLabel_3.setBounds(98, 101, 85, 27);
		input.add(lblNewLabel_3);
		
		ImportGUI importGUI_3 = new ImportGUI();
		importGUI_3.setBounds(178, 105, 175, 23);
		input.add(importGUI_3);
		
		JLabel lblNewLabel_4 = new JLabel("Demension Info:");
		lblNewLabel_4.setBounds(98, 130, 112, 27);
		input.add(lblNewLabel_4);
		
		ImportGUI importGUI_4 = new ImportGUI();
		importGUI_4.setBounds(178, 134, 175, 23);
		input.add(importGUI_4);
		
		JButton btnNewButton = new JButton("Excute");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(216, 203, 89, 23);
		frmRiskmanagementApp.getContentPane().add(btnNewButton);
		frmRiskmanagementApp.setVisible(b);
	}
	public void setVisible(boolean isOpen) {
		this.frmRiskmanagementApp.setVisible(isOpen);
	}
}
