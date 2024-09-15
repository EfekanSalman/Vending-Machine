import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;
import java.awt.event.ActionListener;

public class VendingMachine extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textFieldTotal;
	private JTextField textField;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	
	
	private double totalAmount = 0.0;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VendingMachine frame = new VendingMachine();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public VendingMachine() {
		setTitle("Vending Machine");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 707, 589);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panelTotal = new JPanel();
		panelTotal.setBounds(526, 11, 155, 92);
		contentPane.add(panelTotal);
		panelTotal.setLayout(null);
		
		textFieldTotal = new JTextField();
		textFieldTotal.setEditable(false);
		textFieldTotal.setBounds(0, 48, 155, 20);
		panelTotal.add(textFieldTotal);
		textFieldTotal.setColumns(10);
		
		JLabel lblTotal = new JLabel("           Total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTotal.setBounds(10, 11, 135, 26);
		panelTotal.add(lblTotal);
		
		JPanel panelProducts = new JPanel();
		panelProducts.setBounds(10, 11, 511, 496);
		contentPane.add(panelProducts);
		panelProducts.setLayout(null);
		
		
	    addProduct(panelProducts, "/images/Sprite (1).jpg", 10, 23, 1.50);
	    addProduct(panelProducts, "/images/snickers (1).jpeg", 10, 160, 1.00);
	    addProduct(panelProducts, "/images/lays (1).jpg", 10, 312, 1.25);
	    addProduct(panelProducts, "/images/Sprite (1).jpg", 149, 23, 1.50);
	    addProduct(panelProducts, "/images/Sprite (1).jpg", 307, 23, 1.50);
	    addProduct(panelProducts, "/images/snickers (1).jpeg", 149, 160, 1.00);
	    addProduct(panelProducts, "/images/snickers (1).jpeg", 307, 160, 1.00);
	    addProduct(panelProducts, "/images/lays (1).jpg", 149, 312, 1.25);
	    addProduct(panelProducts, "/images/lays (1).jpg", 307, 312, 1.25);
		
		
		JPanel panelProductsCategory = new JPanel();
		panelProductsCategory.setBounds(526, 114, 155, 245);
		contentPane.add(panelProductsCategory);
		panelProductsCategory.setLayout(null);
	    
	    
		JLabel Sprite = new JLabel("");
		Sprite.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/Sprite (1).jpg")));
		Sprite.setBounds(10, 23, 111, 114);
		panelProducts.add(Sprite);
		
		JLabel Snickers = new JLabel("");
		Snickers.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/snickers (1).jpeg")));
		Snickers.setBounds(10, 160, 111, 114);
		panelProducts.add(Snickers);
		
		JLabel Lays = new JLabel("");
		Lays.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/lays (1).jpg")));
		Lays.setBounds(10, 312, 111, 114);
		panelProducts.add(Lays);
		
		JLabel Sprite_1 = new JLabel("");
		Sprite_1.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/Sprite (1).jpg")));
		Sprite_1.setBounds(149, 23, 111, 114);
		panelProducts.add(Sprite_1);
		
		JLabel Sprite_2 = new JLabel("");
		Sprite_2.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/Sprite (1).jpg")));
		Sprite_2.setBounds(307, 23, 111, 114);
		panelProducts.add(Sprite_2);
		
		JLabel Snickers_1 = new JLabel("");
		Snickers_1.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/snickers (1).jpeg")));
		Snickers_1.setBounds(149, 160, 111, 114);
		panelProducts.add(Snickers_1);
		
		JLabel Snickers_2 = new JLabel("");
		Snickers_2.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/snickers (1).jpeg")));
		Snickers_2.setBounds(307, 160, 111, 114);
		panelProducts.add(Snickers_2);
		
		JLabel Lays_1 = new JLabel("");
		Lays_1.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/lays (1).jpg")));
		Lays_1.setBounds(149, 312, 111, 114);
		panelProducts.add(Lays_1);
		
		JLabel Lays_2 = new JLabel("");
		Lays_2.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/lays (1).jpg")));
		Lays_2.setBounds(307, 312, 111, 114);
		panelProducts.add(Lays_2);
		
		
		JLabel spriteLogo = new JLabel("");
		spriteLogo.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/Lays-Logo-2019-present-2551805602 (1).jpg")));
		spriteLogo.setBounds(0, 11, 145, 78);
		panelProductsCategory.add(spriteLogo);
		
		JLabel SnickersLogo = new JLabel("");
		SnickersLogo.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/snickersLogo (1).jpg")));
		SnickersLogo.setBounds(21, 100, 100, 71);
		panelProductsCategory.add(SnickersLogo);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(VendingMachine.class.getResource("/images/sprite-logo_1024x1024-986707063 (1).jpg")));
		lblNewLabel_2.setBounds(21, 182, 112, 52);
		panelProductsCategory.add(lblNewLabel_2);
		
		JPanel panelBuy = new JPanel();
		panelBuy.setBounds(531, 370, 150, 140);
		contentPane.add(panelBuy);
		panelBuy.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("         Enter Amount");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 0, 150, 41);
		panelBuy.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(0, 42, 150, 26);
		panelBuy.add(textField);
		textField.setColumns(10);
		
		JButton btnPay = new JButton("Pay");
		btnPay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					double amountEntered = Double.parseDouble(textField.getText());
					if (amountEntered >= totalAmount) {
					
						double change = amountEntered - totalAmount;
						textFieldTotal.setText(String.format("Paid: $%.2f, Change: $%.2f", amountEntered, change));
						totalAmount = 0.0;
					} else {
						textFieldTotal.setText("Insufficient funds");
					}
				} catch (NumberFormatException ex) {
					textFieldTotal.setText("Invalid amount");
				}

			}
		});
		btnPay.setAction(action);
		btnPay.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPay.setBounds(0, 67, 150, 35);
		panelBuy.add(btnPay);
		
		JButton btnClear = new JButton("Clear ");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				totalAmount = 0.0;
				textFieldTotal.setText("");
				textField.setText("");
			}
		});
		btnClear.setAction(action_1);
		btnClear.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnClear.setBounds(0, 99, 150, 41);
		panelBuy.add(btnClear);
	}
	
	
	private void addProduct(JPanel panel, String imagePath, int x, int y, double price) {
		
		JLabel productLabel = new JLabel("");
		productLabel.setIcon(new ImageIcon(VendingMachine.class.getResource(imagePath)));
		productLabel.setBounds(x, y, 111, 114);
		panel.add(productLabel);
		
		productLabel.addMouseListener(new java.awt.event.MouseAdapter() {
			
			public void mouseClicked(java.awt.event.MouseEvent evt) {
				totalAmount += price;
				textFieldTotal.setText(String.format("Total: $%.2f", totalAmount));
			}	
		});
}
	

	
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Pay");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Clear");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
