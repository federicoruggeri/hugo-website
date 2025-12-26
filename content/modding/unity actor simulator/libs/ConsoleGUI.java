package it.unibo.console.gui;

import java.awt.Component;
import java.awt.Cursor;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JSlider;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import it.unibo.is.interfaces.IActivity;
import it.unibo.is.interfaces.IActivityBase;
import it.unibo.is.interfaces.IBasicEnvAwt;
import it.unibo.is.interfaces.IOutputEnvView;
import it.unibo.is.interfaces.IOutputView;

/**
 * Simple interface for the interaction with the robot.
 * Current implemented actions:
 * 
 *  1. WASD movement
 *  2. Speed control
 *  3. Stop	
 * 
 * 
 * @author Dario Pasquali (1.0)
 * 
 * @author Federico Ruggeri 
 * @version 1.1
 * 
 * @see https://github.com/dariopasquali
 *
 */
public class ConsoleGUI implements IOutputEnvView, IBasicEnvAwt{

	private static final int DEFAULT_WIDTH = 900;
	private static final int DEFAULT_HEIGHT = 500;
	private static final String DEFAULT_TITLE = "Console";
	
	private JFrame frmConsole;
	private IActivityBase controller;
	private JTextField txtSpeed;
	private JTextArea txtOut;
	
	private int speed;
	private int width;
	private int height;
	private String title;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ConsoleGUI window = new ConsoleGUI();
					window.frmConsole.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public ConsoleGUI(String title) 
	{
		this.width = DEFAULT_WIDTH;
		this.height = DEFAULT_HEIGHT;
		this.title = title;
		initialize();
	}
	
	public ConsoleGUI()
	{
		this(DEFAULT_TITLE);
	}
		
	public ConsoleGUI(IActivityBase controller, int width, int height)
	{
		this.width = width;
		this.height = height;
		this.controller = controller;
		initialize();
	}
	
	public ConsoleGUI(IActivityBase controller)
	{
		this.controller = controller;
		this.width = DEFAULT_WIDTH;
		this.height = DEFAULT_HEIGHT;
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmConsole = new JFrame();
		frmConsole.getContentPane().setCursor(Cursor.getPredefinedCursor(Cursor.TEXT_CURSOR));
		frmConsole.setTitle(title);
		frmConsole.setBounds(100, 100, width, height);
		frmConsole.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnW = new JButton("W");
		btnW.addActionListener(new DefaultInputHandler());
		btnW.addKeyListener(new KeyHandler());
				
		JButton btnA = new JButton("A");
		btnA.addActionListener(new DefaultInputHandler());
		btnA.addKeyListener(new KeyHandler());
		
		JButton btnS = new JButton("S");
		btnS.addActionListener(new DefaultInputHandler());
		btnS.addKeyListener(new KeyHandler());
		
		JButton btnD = new JButton("D");
		btnD.addActionListener(new DefaultInputHandler());
		btnD.addKeyListener(new KeyHandler());
		
		JButton btnStop = new JButton("STOP");
		btnStop.addActionListener(new DefaultInputHandler());
		btnStop.addKeyListener(new KeyHandler());
		
		JLabel lblSpeed = new JLabel("Speed");
		lblSpeed.setHorizontalAlignment(SwingConstants.CENTER);
		lblSpeed.setFont(new Font("Tahoma", Font.PLAIN, 15));
		
		JSlider sliderSpeed = new JSlider();
		int minimum = 5;
		int maximum = 15;
		sliderSpeed.setMinimum(minimum);
		sliderSpeed.setMaximum(maximum);
		sliderSpeed.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sliderSpeed.setValue(minimum);
		
		sliderSpeed.addChangeListener(new ChangeListener() {
			
			@Override
			public void stateChanged(ChangeEvent e) {
				txtSpeed.setText(""+sliderSpeed.getValue());
				speed = sliderSpeed.getValue();
			}
		});
		
		
		txtSpeed = new JTextField();
		txtSpeed.setFont(new Font("Tahoma", Font.PLAIN, 15));
		txtSpeed.setEditable(false);
		txtSpeed.setColumns(10);
		txtSpeed.setText(""+sliderSpeed.getValue());
		
		txtOut = new JTextArea();
		txtOut.setRows(21);
		txtOut.setFont(new Font("Monospaced", Font.PLAIN, 14));
		txtOut.setEditable(false);		
		
		JScrollPane scrollPane = new JScrollPane(txtOut);
		//scrollPane.setColumnHeaderView(txtOut);
		JScrollBar scrollBar = new JScrollBar();
		scrollPane.add(scrollBar);
		
		GroupLayout groupLayout = new GroupLayout(frmConsole.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(42)
							.addComponent(btnA)
							.addGap(18)
							.addComponent(btnS)
							.addGap(18)
							.addComponent(btnD))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(76)
							.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 85, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(89)
							.addComponent(btnW, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(20)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(lblSpeed, GroupLayout.PREFERRED_SIZE, 75, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtSpeed, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
								.addComponent(sliderSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addComponent(scrollPane, GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(53)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblSpeed, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)
						.addComponent(txtSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(sliderSpeed, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addGap(30)
					.addComponent(btnW, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnS, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnA, GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
						.addComponent(btnD, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnStop, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(177, Short.MAX_VALUE))
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(scrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(18, Short.MAX_VALUE))
		);
		
		
		frmConsole.getContentPane().setLayout(groupLayout);
		
		speed = minimum;
	}

	
	private class DefaultInputHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {

			switch(arg0.getActionCommand())
			{
			case "W":
				controller.execAction("W "+speed);
				break;
			
			case "S":
				controller.execAction("S "+speed);
				break;
				
			case "A":
				controller.execAction("A "+speed);
				break;
				
			case "D":
				controller.execAction("D "+speed);
				break;
				
			case "STOP":
				controller.execAction("SPACE "+speed);
				break;
				
			default:
				addOutput("Invalid command");
			}			
			
		}		
		
	}
	
	private class KeyHandler implements KeyListener{

		@Override
		public void keyPressed(KeyEvent e) {
			
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_W:
				controller.execAction("W "+speed);
				break;
			
			case KeyEvent.VK_S:
				controller.execAction("S "+speed);
				break;
				
			case KeyEvent.VK_A:
				controller.execAction("A "+speed);
				break;
				
			case KeyEvent.VK_D:
				controller.execAction("D "+speed);
				break;
			
			case KeyEvent.VK_SPACE:
				controller.execAction("SPACE "+speed);
				break;
				
			default:
				addOutput("Invalid command");
			}			
			
		}

		@Override
		public void keyReleased(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void keyTyped(KeyEvent e) {
			// TODO Auto-generated method stub
			
		}

			
		
	}
	
	
	public void setController(IActivityBase controller) {
		this.controller = controller;		
	}
	
		
	@Override
	public String getCurVal() {
		return txtOut.getText();
	}

	@Override
	public void addOutput(String msg) {
		txtOut.append(msg+"\n");
		txtOut.validate();
		txtOut.setCaretPosition(txtOut.getDocument().getLength());
	}

	@Override
	public void setOutput(String msg) {
		txtOut.setText(msg);
		txtOut.validate();
		txtOut.setCaretPosition(txtOut.getDocument().getLength());
	}

	@Override
	public void init() {
		//TODO
	}

	@Override
	public String readln() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IOutputView getOutputView() {
		return this;
	}

	@Override
	public void println(String msg) {
		addOutput(msg);		
	}

	@Override
	public void close() {
		frmConsole.setVisible(false);
	}

	@Override
	public void initNoFrame() {
		// TODO Auto-generated method stub		
	}

	@Override
	public IOutputEnvView getOutputEnvView() {
		return this;
	}

	@Override
	public void writeOnStatusBar(String s, int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isStandAlone() {
		return true;
	}

	@Override
	public void addInputPanel(int size) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPanel(Panel p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addPanel(Component p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Panel addCmdPanel(String name, String[] commands, IActivity activity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Panel addCmdPanel(String name, String[] commands, IActivityBase activity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removePanel(Panel p) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getNumOfPanels() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setEnvVisible(boolean b) {
		frmConsole.setVisible(true);
	}

	@Override
	public IBasicEnvAwt getEnv() {
		return this;
	}

	@Override
	public void addInputPanel(String msg) {
		// TODO Auto-generated method stub
		
	}
}
