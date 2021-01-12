package CrazyArcade;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class EunJin_Timer extends Thread {
	
	JLabel time = new JLabel("2 : 00");
	int SLEEP_TIME = 1000;
	
	public EunJin_Timer(JLabel time) {
	
		this.time = time;
	}
	
	@Override
	public void run() {

		for(int j = 1; j >= 0; j--) {
			for(int i = 60; i>=0; i--) {
				if( i >= 1 && i <= 9) {
					try {
						sleep(SLEEP_TIME);
					} catch (InterruptedException e) {
						
					}
					time.setText(j + " : 0" + i);
				}
				else if(i == 60) {
					try {
						sleep(SLEEP_TIME);
					} catch (InterruptedException e) {
						
					}
				}
				else {
					try {
						sleep(SLEEP_TIME);
					} catch (InterruptedException e) {
						
					}
					time.setText(j + " : " + i);
				}
				if(j == 0 && i == 0) {
					time.setText(j + " : 0" + i);
					int result = JOptionPane.showConfirmDialog(null, "Game Over!! \n Time is over.", "EunJin Arcade", JOptionPane.CLOSED_OPTION);
					if(result == JOptionPane.YES_OPTION) {
						System.exit(0);
					}
				}
				if(i == 0) {
					time.setText(j + " : 0" + i);
					j--;
					i = 60;
				}
			}
		}
		
	}

		
	
}
