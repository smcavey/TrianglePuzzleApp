package starting.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import starting.controller.MouseHandler;
import starting.controller.ResetController;
import starting.controller.SwapController;
import starting.controller.UnselectAllController;
import starting.model.Model;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

public class TrianglePuzzleApp extends JFrame {

	private JPanel contentPane;
	Model model;
	TrianglePuzzleDrawer panel;
	
	public TrianglePuzzleDrawer getPanel() { return panel; }

	/**
	 * Create the frame.
	 */
	public TrianglePuzzleApp(Model model) {
		this.model = model;
		setTitle("Triangle Puzzle Application -- CS509");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 650, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel = new TrianglePuzzleDrawer(model);
		
		// connects mouse events...
		panel.addMouseListener(new MouseHandler(model, this));
		
		JButton btnSwap = new JButton("Swap Edges");
		btnSwap.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new SwapController(model, TrianglePuzzleApp.this).process();
			}
		});;
		
		JButton btnUnselectAll = new JButton("Unselect All");
		btnUnselectAll.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new UnselectAllController(model, TrianglePuzzleApp.this).process();
			}
		});
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				new ResetController(model, TrianglePuzzleApp.this).process();
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnUnselectAll, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnSwap, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnReset, GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 400, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addComponent(btnUnselectAll)
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnSwap)
								.addComponent(btnReset))))
					.addContainerGap(193, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void popupVictoryPanel() {
		JFrame victoryFrame = new JFrame();
		victoryFrame.setBounds(100, 100, 100, 100);
		JPanel victoryPanel = new JPanel();
		JLabel victoryLabel = new JLabel("Congrats! You win!");
		victoryLabel.setVisible(true);
		victoryPanel.add(victoryLabel);
		victoryFrame.getContentPane().add(victoryPanel);
		victoryFrame.setVisible(true);
		
	}
}
