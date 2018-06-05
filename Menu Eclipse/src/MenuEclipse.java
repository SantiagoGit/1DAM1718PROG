import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;

public class MenuEclipse extends JFrame implements ActionListener{

	public MenuEclipse() {
		super("Eclipse");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setPreferredSize(new Dimension(500, 500));
		
		ImageIcon open =  new ImageIcon(getClass().getResource("/img/folder.png"));
		ImageIcon save = new ImageIcon(getClass().getResource("/img/save.png"));
		ImageIcon saveas = new ImageIcon(getClass().getResource("/img/saveas.png"));
		ImageIcon saveall = new ImageIcon(getClass().getResource("/img/saveall.png"));
		ImageIcon rename = new ImageIcon(getClass().getResource("/img/rename.png"));
		ImageIcon refresh = new ImageIcon(getClass().getResource("/img/refresh.png"));
		ImageIcon print = new ImageIcon(getClass().getResource("/img/print.png"));
		ImageIcon importa = new ImageIcon(getClass().getResource("/img/import.png"));
		ImageIcon export = new ImageIcon(getClass().getResource("/img/export.png"));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu menu;
		JMenuItem menuItem;
		menu = new JMenu("File");
		menu.setMnemonic(KeyEvent.VK_F);
		menuBar.add(menu);
		
		menuItem = new JMenuItem("New");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.ALT_MASK | KeyEvent.SHIFT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpnew");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Open file...");
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpopenfile");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Open Projects from File System...", open);
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpopenprojects");
		menu.add(menuItem);
		
		menu.add(new JSeparator());
		
		menuItem = new JMenuItem("Close");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpclose");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Close All");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_W, KeyEvent.CTRL_MASK | KeyEvent.SHIFT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpcloseall");
		menu.add(menuItem);
		
		menu.add(new JSeparator());
		
		menuItem = new JMenuItem("Save", save);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpsave");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save As...", saveas);
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpsaveas");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Save All", saveall);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.ALT_MASK | KeyEvent.SHIFT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpsaveall");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Revert");
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mprevert");
		menu.add(menuItem);
		
		menu.add(new JSeparator());
		
		menuItem = new JMenuItem("Move");
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpmove");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Rename", rename);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, KeyEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mprename");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Refresh", refresh);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, KeyEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mprefresh");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Convert Line Delimiters To");
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpconvert");
		menu.add(menuItem);
		
		menu.add(new JSeparator());
		
		menuItem = new JMenuItem("Print", print);
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, KeyEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpprint");
		menu.add(menuItem);
		
		menu.add(new JSeparator());
		
		menuItem = new JMenuItem("Import", importa);
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpimport");
		menu.add(menuItem);
		
		menu.add(new JSeparator());
		
		menuItem = new JMenuItem("Export", export);
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpexport");
		menu.add(menuItem);
		
		menuItem = new JMenuItem("Properties");
		menuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, KeyEvent.ALT_MASK));
		menuItem.addActionListener(this);
		menuItem.setActionCommand("mpproperties");
		menu.add(menuItem);
		
		
		JToolBar toolBar = new JToolBar();
		
		JButton op = new JButton(open);
		op.addActionListener(this);
		op.setActionCommand("mpopenprojects");
		toolBar.add(op);
		add(toolBar, BorderLayout.NORTH);
		
		JButton sa = new JButton(save);
		sa.addActionListener(this);
		sa.setActionCommand("mpsave");
		toolBar.add(sa);
		add(toolBar, BorderLayout.NORTH);
		
		JButton saas = new JButton(saveas);
		saas.addActionListener(this);
		saas.setActionCommand("mpsaveas");
		toolBar.add(saas);
		add(toolBar, BorderLayout.NORTH);
		
		JButton saall = new JButton(saveall);
		saall.addActionListener(this);
		saall.setActionCommand("mpsaveall");
		toolBar.add(saall);
		add(toolBar, BorderLayout.NORTH);
		
		JButton re = new JButton(rename);
		re.addActionListener(this);
		re.setActionCommand("mprename");
		toolBar.add(re);
		add(toolBar, BorderLayout.NORTH);
		
		JButton ref = new JButton(refresh);
		ref.addActionListener(this);
		ref.setActionCommand("mprefresh");
		toolBar.add(ref);
		add(toolBar, BorderLayout.NORTH);
		
		JButton pr = new JButton(print);
		pr.addActionListener(this);
		pr.setActionCommand("mpprint");
		toolBar.add(pr);
		add(toolBar, BorderLayout.NORTH);
		
		JButton im = new JButton(importa);
		im.addActionListener(this);
		im.setActionCommand("mpimport");
		toolBar.add(im);
		add(toolBar, BorderLayout.NORTH);
		
		JButton ex = new JButton(export);
		ex.addActionListener(this);
		ex.setActionCommand("mpexport");
		toolBar.add(ex);
		add(toolBar, BorderLayout.NORTH);
		
		toolBar.setFloatable(false);
		
		pack();
	}
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(
			new Runnable() {
				@Override
				public void run() {
					new MenuEclipse().setVisible(true);
				}
			}
		);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String ac = e.getActionCommand();
		
		if (ac.equals("mpnew")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'New'", "New", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpopenfile")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Open file...'", "Open file...", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpopenprojects")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Open Projects from File System...'", "Open Projects from File System...", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpclose")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Close'", "Close", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpcloseall")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Close All'", "Close All", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpsave")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Save'", "Save", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpsaveas")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Save As...'", "Save As...", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpsaveall")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Save All...'", "Save All...", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mprevert")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Revert'", "Revert", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpmove")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'move'", "Move", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mprename")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Rename'", "Rename", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mprefresh")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Refresh'", "Refresh", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpconvert")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Convert Line Delimiters To'", "Convert Line Delimiters To", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpprint")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Print'", "Print", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpimport")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Import'", "Import", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpexport")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Export'", "Export", JOptionPane.INFORMATION_MESSAGE);
		}
		
		else if (ac.equals("mpproperties")) {
			JOptionPane.showMessageDialog(this, "Has seleccionado la opción 'Properties'", "Properties", JOptionPane.INFORMATION_MESSAGE);
		}
	}

}


