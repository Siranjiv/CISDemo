package GUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



public class Interface {

	int minutes;
	int seconds;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Interface window = new Interface();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	public void timer() {
		
		int timet= 1 * 60; // Convert to seconds
	    long delay = timet * 1000;

	   // lblMinute.setText("Hello");
	    do
	    {
	     minutes = timet / 60;
	     seconds = timet % 60;
	      
	     
	     //lblMinute.setText("hello");
	      System.out.println(minutes +" minute(s), " + seconds + " second(s)");
	      
	      try {
			Thread.sleep(1000);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	      timet = timet - 1;
	      delay = delay - 1000;

	    }
	    while (delay != 0);
	    System.out.println("Time's Up!");
	}

	/**
	 * Create the application.
	 */
	public Interface() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Timer :");
		lblNewLabel.setBounds(61, 67, 88, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblMinute = new JLabel("00");
		lblMinute.setBounds(95, 111, 54, 14);
		frame.getContentPane().add(lblMinute);
		
		JLabel lblSecond = new JLabel("00");
		lblSecond.setBounds(196, 111, 115, 14);
		frame.getContentPane().add(lblSecond);
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				timer();
			    lblMinute.setText(String.valueOf(minutes));

			     lblSecond.setText("text");
			}
			}
			
		);
		btnStart.setBounds(140, 189, 89, 23);
		frame.getContentPane().add(btnStart);
	}

}
