package Res_Calc;

import javax.swing.*;
import java.awt.event.*;

public class Fenster implements WindowListener
{	

	@Override public void windowClosing(WindowEvent event)
	{
		int Option = JOptionPane.showConfirmDialog (null, "Applikation beenden?");
		if(JOptionPane.OK_OPTION == Option)
			System.exit(0);
	}
	public static void main(String[] args)
	{
		JFrame f = new JFrame("Uhrzeit");
		f.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		f.setSize(550, 300);
//		f.setOpacity(.5F);
		f.add(new JLabel("Die ist ein verdammter Test!"));
		f.setVisible(true);
	}
	@Override public void windowClosed( WindowEvent event ) { /*Empty*/ }
  	@Override public void windowDeiconified( WindowEvent event ) { /*Empty*/ }
	@Override public void windowIconified( WindowEvent event ) { /*Empty*/ }
   	@Override public void windowActivated( WindowEvent event ) { /*Empty*/ }
    	@Override public void windowDeactivated( WindowEvent event ) { /*Empty*/ }
	@Override public void windowOpened( WindowEvent event ) { /*Empty*/ }
}
