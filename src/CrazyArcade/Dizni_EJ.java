package CrazyArcade;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Dizni_EJ extends JFrame implements KeyListener, Runnable {
	
	int LRTurn1 = 0;		// 0 : 왼쪽->오른쪽  1 : 오른쪽 -> 왼쪽
	int LRTurn2 = 0;
	int LRTurn3 = 0;
	int TBTurn1 = 0;
	int TBTurn2 = 0;		// 0 : 위 -> 아래     1 : 아래 -> 위
	int Turn1 = 0;
	int shape = 0;		// 꼬물이 이미지 변경 ( 0 : enemy1   1 : enemy2    2 : enemy3    3 : enemy4)
	int shapeM1 = 0;
	int shapeM2 = 2;
	int shapeM3 = 3;
	int shapeM4 = 0;
	int count = 0;
//	String enemyName = "enemy1";
	
	JLabel Dizni1 = new JLabel(new ImageIcon("imgs/Dizni1.png"));
	JLabel Ground = new JLabel(new ImageIcon("imgs/Ground.png"));
	JLabel Flower1 = new JLabel(new ImageIcon("imgs/Flower.png"));
	JLabel Flower2 = new JLabel(new ImageIcon("imgs/Flower.png"));
	JLabel Flower3 = new JLabel(new ImageIcon("imgs/Flower.png"));
	JLabel Flower4 = new JLabel(new ImageIcon("imgs/Flower.png"));
	JLabel blue = new JLabel(new ImageIcon("imgs/blue.png"));
	JLabel score = new JLabel(new ImageIcon("imgs/score.png"));
	JLabel score1 = new JLabel(new ImageIcon("imgs/score1.png"));
	JLabel score2 = new JLabel(new ImageIcon("imgs/score2.png"));
	JLabel score3 = new JLabel(new ImageIcon("imgs/score3.png"));
	JLabel score4 = new JLabel(new ImageIcon("imgs/score4.png"));
	JLabel life1 = new JLabel(new ImageIcon("imgs/life.png"));
	JLabel life2 = new JLabel(new ImageIcon("imgs/life.png"));
	JLabel life3 = new JLabel(new ImageIcon("imgs/life.png"));
	JLabel dead1 = new JLabel(new ImageIcon("imgs/dead.png"));
	JLabel dead2 = new JLabel(new ImageIcon("imgs/dead.png"));
	JLabel dead3 = new JLabel(new ImageIcon("imgs/dead.png"));
	JLabel timer = new JLabel(new ImageIcon("imgs/timer.png"));
	JLabel top = new JLabel(new ImageIcon("imgs/top.png"));
	JLabel bottom = new JLabel(new ImageIcon("imgs/top.png"));
	JLabel sideL = new JLabel(new ImageIcon("imgs/side.png"));
	JLabel sideR = new JLabel(new ImageIcon("imgs/side.png"));
	JLabel stoneLT1 = new JLabel(new ImageIcon("imgs/stone.png"));
	JLabel stoneLT2 = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneLT3 = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneLT4 = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneLT5 = new JLabel(new ImageIcon("imgs/stone.png"));
	JLabel stoneLT6 = new JLabel(new ImageIcon("imgs/stone3.png"));
	JLabel stoneRT1 = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneRT2 = new JLabel(new ImageIcon("imgs/stone.png"));
	JLabel stoneRT3 = new JLabel(new ImageIcon("imgs/stone3.png"));
	JLabel stoneRT4 = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneLC = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneRC = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneB1 = new JLabel(new ImageIcon("imgs/stone.png"));
	JLabel stoneB2 = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneB3 = new JLabel(new ImageIcon("imgs/stone2.png"));
	JLabel stoneB4 = new JLabel(new ImageIcon("imgs/stone3.png"));
	JLabel stoneB5 = new JLabel(new ImageIcon("imgs/stone.png"));
	
	JLabel time = new JLabel("2 : 00");
	JLabel enemyT1 = new JLabel(new ImageIcon("imgs/enemy1.png"));
	JLabel enemyT2 = new JLabel(new ImageIcon("imgs/enemy1.png"));
	JLabel enemyB1 = new JLabel(new ImageIcon("imgs/enemy1.png"));
	JLabel enemyB2 = new JLabel(new ImageIcon("imgs/enemy1.png"));
	JLabel enemyB3 = new JLabel(new ImageIcon("imgs/enemy1.png"));
	JLabel moneyT1 = new JLabel(new ImageIcon("imgs/money1.png"));
	JLabel moneyT2 = new JLabel(new ImageIcon("imgs/money2.png"));
	JLabel moneyB1 = new JLabel(new ImageIcon("imgs/money4.png"));
	JLabel moneyB2 = new JLabel(new ImageIcon("imgs/money1.png"));
	//JPanel ground = new JPanel();
	//JLabel Ground = new JLabel(new ImageIcon("imgs/Ground.png"));
	//Image Ground = Toolkit.getDefaultToolkit().getImage("imgs/Ground");
	
	public Dizni_EJ() {

		initilize();
		ready();
		threadStart();
		
	}
	
	public void initilize() {
		
		setLayout(null); 	
		
		time.setFont(new Font("휴면편지체", Font.BOLD, 22));
		time.setForeground(Color.YELLOW);
				
		add(score);
		add(score1);
		add(score2);
		add(score3);
		add(score4);
		add(time);
		add(timer);
		add(life1);
		add(life2);
		add(life3);
		add(dead1);
		add(dead2);
		add(dead3);
		add(blue);
		add(Dizni1);
		add(enemyT1);
		add(enemyT2);
		add(enemyB1);
		add(enemyB2);
		add(enemyB3);
		add(moneyT1);
		add(moneyT2);
		add(moneyB1);
		add(moneyB2);
		add(Flower3);
		add(Flower4);
		add(sideL);
		add(sideR);
		add(Flower1);
		add(Flower2);
		add(top);
		add(bottom);
		add(stoneLT6);
		add(stoneLT5);
		add(stoneLT4);
		add(stoneLT3);
		add(stoneLT2);
		add(stoneLT1);
		add(stoneRT4);
		add(stoneRT3);
		add(stoneRT2);
		add(stoneRT1);
		add(stoneLC);
		add(stoneRC);
		add(stoneB5);
		add(stoneB4);
		add(stoneB3);
		add(stoneB2);
		add(stoneB1);
		add(Ground);

		addKeyListener(this);
		setTitle("EUNJIN Arcade");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(700, 50, 600, 800);
		setVisible(true);
		moneyT2.setVisible(false);
		moneyB1.setVisible(false);
		moneyB2.setVisible(false);
		
		// Ground = Toolkit.getDefaultToolkit().getImage("imgs/Ground.png");
		
	}
	
	public void ready() {
		
		Ground.setBounds(0, 0, 600, 800);
		Flower1.setBounds(0,50,60,70);
		Flower2.setBounds(520,50,60,70);
		Flower3.setBounds(0,690,60,70);
		Flower4.setBounds(520,690,60,70);
		blue.setBounds(0, 0, 586, 49);
		score.setBounds(0, 10, 220, 60);
		score1.setBounds(0, 10, 220, 60);
		score2.setBounds(0, 10, 220, 60);
		score3.setBounds(0, 10, 220, 60);
		score4.setBounds(0, 10, 220, 60);
		life1.setBounds(420, 5, 50, 40);
		life2.setBounds(470, 5, 50, 40);
		life3.setBounds(520, 5, 50, 40);
		dead1.setBounds(420, 5, 50, 40);
		dead2.setBounds(470, 5, 50, 40);
		dead3.setBounds(520, 5, 50, 40);
		timer.setBounds(240, 10, 160, 35);
		top.setBounds(50, 60, 480, 50);
		bottom.setBounds(50, 700, 480, 50);
		sideL.setBounds(10, 100, 45, 620);
		sideR.setBounds(530, 100, 45, 620);
		stoneLT1.setBounds(100, 160, 43, 132);
		stoneLT2.setBounds(140, 160, 82, 52);
		stoneLT3.setBounds(101, 282, 82, 52);
		stoneLT4.setBounds(180, 282, 82, 52);
		stoneLT5.setBounds(219, 322, 43, 132);
		stoneLT6.setBounds(260, 403, 42, 52);
		stoneRT1.setBounds(400, 160, 82, 52);
		stoneRT2.setBounds(360, 160, 43, 132);
		stoneRT3.setBounds(361, 282, 42, 52);
		stoneRT4.setBounds(402, 281, 82, 52);
		stoneLC.setBounds(90, 430, 82, 52);
		stoneRC.setBounds(410, 430, 82, 52);
		stoneB1.setBounds(150, 520, 43, 132);
		stoneB2.setBounds(190, 599, 82, 52);
		stoneB3.setBounds(270, 599, 82, 52);
		stoneB4.setBounds(350, 599, 42, 52);
		stoneB5.setBounds(390, 520, 43, 132);
		Dizni1.setBounds(250, 300, 100, 100);
		
		time.setBounds(320, 4, 100, 50);
		
		enemyT1.setBounds(230, 220, 40, 45);
		enemyT2.setBounds(490, 320, 40, 45);
		enemyB1.setBounds(50, 560, 40, 45);
		enemyB2.setBounds(220, 540, 40, 45);
		enemyB3.setBounds(450, 650, 40, 45);
		moneyT1.setBounds(250, 220, 30, 45);
		moneyT2.setBounds(490, 160, 30, 45);
		moneyB1.setBounds(60, 640, 30, 45);
		moneyB2.setBounds(340, 540, 30, 45);
		
	}
	
	Thread dizniThread = null;
	
	public void threadStart() {
		
		dizniThread = new Thread(this);
		dizniThread.start();
		
		EunJin_Timer timerTh = new EunJin_Timer(time);
		timerTh.start();
		
	}

//	public void threadStop() {
//		
//		if(dizniThread != null) {
//			dizniThread.stop();
//		}
//		
//	}
	
	@Override
	public void run() {

		while(true) {
			try {
				if(shape == 0) {
					//enemyName = "enemy1";	// 아래로 이동
					shape = 3;
				}
				else if(shape == 1) {
					//enemyName = "enemy2";   // 왼쪽 이동
					shape = 2;
				}
				else if(shape == 2) {
					//enemyName = "enemy3"; 	// 오른쪽 이동
					shape = 1;
				}
				else if(shape == 3) {
					//enemyName = "enemy4";	//위로 이동
					shape = 0;
				}
				
				Thread.sleep(70);
				
				// 꼬물이1
				if(enemyT1.getX() == 140) {
					LRTurn1 = 0;
					shape = 2;
				}
				else if(enemyT1.getX() == 320) {
					LRTurn1 = 1;
					shape = 1;
				}
				if(LRTurn1 == 0) {
					enemyT1.setIcon(new ImageIcon("imgs/enemy3.png"));
					//enemyName = "enemy3";
					enemyT1.setLocation(enemyT1.getX() + 10, enemyT1.getY());
				}
				else if(LRTurn1 == 1) {
					enemyT1.setIcon(new ImageIcon("imgs/enemy2.png"));
					//enemyName = "enemy2";
					enemyT1.setLocation(enemyT1.getX() - 10, enemyT1.getY());
				}
				if(enemyT1.getX() == Dizni1.getX() + 20 && enemyT1.getY() == Dizni1.getY() + 40) {
					count ++;
					alive();
				}
				
				// 꼬물이2
				if(enemyT2.getY() == 100) {
					TBTurn1 = 0;
					shape = 3;
				}
				else if(enemyT2.getY() == 650) {
					TBTurn1 = 1;
					shape = 0;
				}
				if(TBTurn1 == 0) {
					enemyT2.setIcon(new ImageIcon("imgs/enemy1.png"));
					enemyT2.setLocation(enemyT2.getX(), enemyT2.getY() + 10);
				}
				else if(TBTurn1 == 1) {
					enemyT2.setIcon(new ImageIcon("imgs/enemy4.png"));
					enemyT2.setLocation(enemyT2.getX(), enemyT2.getY() - 10);
				}
				if(enemyT2.getX() == Dizni1.getX() + 30 && enemyT2.getY() == Dizni1.getY() + 40) {
					count ++;
					alive();
				}
				
				// 꼬물이3
				if(enemyB1.getY() == 450) {
					TBTurn2 = 0;
					shape = 3;
				}
				else if(enemyB1.getY() == 650) {
					TBTurn2 = 1;
					shape = 0;
				}
				if(TBTurn2 == 0) {
					enemyB1.setIcon(new ImageIcon("imgs/enemy1.png"));
					enemyB1.setLocation(enemyB1.getX(), enemyB1.getY() + 10);
				}
				else if(TBTurn2 == 1) {
					enemyB1.setIcon(new ImageIcon("imgs/enemy4.png"));
					enemyB1.setLocation(enemyB1.getX(), enemyB1.getY() - 10);
				}
				if(enemyB1.getX() == Dizni1.getX() + 20 && enemyB1.getY() == Dizni1.getY() + 40) {
					count ++;
					alive();
				}
				
				// 꼬물이4
				if(enemyB2.getX() == 200) {
					LRTurn2 = 0;
					shape = 2;
				}
				else if(enemyB2.getX() == 350) {
					LRTurn2 = 1;
					shape = 1;
				}
				if(LRTurn2 == 0) {
					enemyB2.setIcon(new ImageIcon("imgs/enemy3.png"));
					enemyB2.setLocation(enemyB2.getX() + 10, enemyB2.getY());
				}
				else if(LRTurn2 == 1) {
					enemyB2.setIcon(new ImageIcon("imgs/enemy2.png"));
					enemyB2.setLocation(enemyB2.getX() - 10, enemyB2.getY());
				}
				if(enemyB2.getX() == Dizni1.getX() + 20 && enemyB2.getY() == Dizni1.getY() + 40) {
					count ++;
					alive();
				}
				
				// 꼬물이5
				if(enemyB3.getX() == 50) {
					LRTurn3 = 0;
					shape = 2;
				}
				else if(enemyB3.getX() == 480) {
					LRTurn3 = 1;
					shape = 1;
				}
				if(LRTurn3 == 0) {
					enemyB3.setIcon(new ImageIcon("imgs/enemy3.png"));
					enemyB3.setLocation(enemyB3.getX() + 10, enemyB3.getY());
				}
				else if(LRTurn3 == 1) {
					enemyB3.setIcon(new ImageIcon("imgs/enemy2.png"));
					enemyB3.setLocation(enemyB3.getX() - 10, enemyB3.getY());
				}
				if(enemyB3.getX() == Dizni1.getX() + 20 && enemyB3.getY() == Dizni1.getY() + 40) {
					count ++;
					alive();
				}
				
				// 동전1
				if(moneyT1.getX() == 250) {
					if(moneyT1.getY() == Dizni1.getY() + 40 && Dizni1.getX() == 230) {
						score.setVisible(false);
						moneyT1.setVisible(false);
						moneyT2.setVisible(true);
					}
					if(shapeM1 == 0) {
						moneyT1.setIcon(new ImageIcon("imgs/money1.png"));
						shapeM1 = 1;
					}
					else if(shapeM1 == 1) {
						moneyT1.setIcon(new ImageIcon("imgs/money2.png"));
						shapeM1 = 2;
					}
					else if(shapeM1 == 2) {
						moneyT1.setIcon(new ImageIcon("imgs/money3.png"));
						shapeM1 = 3;
					}
					else if(shapeM1 == 3) {
						moneyT1.setIcon(new ImageIcon("imgs/money4.png"));
						shapeM1 = 0;
					}
				}
				
				// 동전2
				if(moneyT2.getX() == 490) {
					if(moneyT2.getY() == Dizni1.getY() + 40 && Dizni1.getX() == 460) {
						score1.setVisible(false);
						moneyT2.setVisible(false);
						moneyB1.setVisible(true);
					}
					if(shapeM2 == 0) {
						moneyT2.setIcon(new ImageIcon("imgs/money1.png"));
						shapeM2 = 1;
					}
					else if(shapeM2 == 1) {
						moneyT2.setIcon(new ImageIcon("imgs/money2.png"));
						shapeM2 = 2;
					}
					else if(shapeM2 == 2) {
						moneyT2.setIcon(new ImageIcon("imgs/money3.png"));
						shapeM2 = 3;
					}
					else if(shapeM2 == 3) {
						moneyT2.setIcon(new ImageIcon("imgs/money4.png"));
						shapeM2 = 0;
					}
				}
				
				// 동전3
				if(moneyB1.getX() == 60) {
					if(moneyB1.getY() == Dizni1.getY() + 40 && Dizni1.getX() == 30) {
						score2.setVisible(false);
						moneyB1.setVisible(false);
						moneyB2.setVisible(true);
					}
					if(shapeM3 == 0) {
						moneyB1.setIcon(new ImageIcon("imgs/money1.png"));
						shapeM3 = 1;
					}
					else if(shapeM3 == 1) {
						moneyB1.setIcon(new ImageIcon("imgs/money2.png"));
						shapeM3 = 2;
					}
					else if(shapeM3 == 2) {
						moneyB1.setIcon(new ImageIcon("imgs/money3.png"));
						shapeM3 = 3;
					}
					else if(shapeM3 == 3) {
						moneyB1.setIcon(new ImageIcon("imgs/money4.png"));
						shapeM3 = 0;
					}
				}
				
				// 동전4
				if(moneyB2.getX() == 340) {
					if(moneyB2.getY() == Dizni1.getY() + 40 && Dizni1.getX() == 310) {
						score3.setVisible(false);
						moneyB2.setVisible(false);
						int win = JOptionPane.showConfirmDialog(null, "Game Clear!! \n You are the winner.", "EunJin Arcade", JOptionPane.CLOSED_OPTION);
						if(win == JOptionPane.YES_OPTION) {
							System.exit(0);
						}
//						int win = JOptionPane.showConfirmDialog(null, "Game Clear!! \n Do you want to restart?", "EunJin Arcade", JOptionPane.YES_NO_OPTION);
//						if(win == JOptionPane.YES_OPTION) {
//							threadStop();
//							initilize();
//							ready();
//							run();
//							threadStart();
//						}
//						else if(win == JOptionPane.NO_OPTION) {
//							System.exit(0);
//						}
					}
					if(shapeM4 == 0) {
						moneyB2.setIcon(new ImageIcon("imgs/money1.png"));
						shapeM4 = 1;
					}
					else if(shapeM4 == 1) {
						moneyB2.setIcon(new ImageIcon("imgs/money2.png"));
						shapeM4 = 2;
					}
					else if(shapeM4 == 2) {
						moneyB2.setIcon(new ImageIcon("imgs/money3.png"));
						shapeM4 = 3;
					}
					else if(shapeM4 == 3) {
						moneyB2.setIcon(new ImageIcon("imgs/money4.png"));
						shapeM4 = 0;
					}
				}
				
				repaint();
				
//				for(int j = 1; j >= 0; j--) {
//					for(int i = 60; i>=0; i--) {
//						if( i >= 1 && i <= 9) {
//							Thread.sleep(1000);
//							time.setText(j + " : 0" + i);
//						}
//						else if(i == 60) {
//							Thread.sleep(1000);
//						}
//						else {
//							Thread.sleep(1000);
//							time.setText(j + " : " + i);
//						}
//						if(j == 0 && i == 0) {
//							time.setText(j + " : 0" + i);
//							int result = JOptionPane.showConfirmDialog(null, "Game Over!!", "EunJin Arcade", JOptionPane.CLOSED_OPTION);
//							if(result == JOptionPane.YES_OPTION) {
//								System.exit(0);
//							}
//						}
//						if(i == 0) {
//							time.setText(j + " : 0" + i);
//							j--;
//							i = 60;
//						}
//					}
//				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}
	
	public void alive() {
		
		if(count == 1) {
			life1.setVisible(false);
		}
		else if(count == 2) {
			life2.setVisible(false);
		}
		else if(count == 3) {
			life3.setVisible(false);
			int lose = JOptionPane.showConfirmDialog(null, "Game Over!! \n You are a loser.", "EunJin Arcade", JOptionPane.CLOSED_OPTION);
			if(lose == JOptionPane.YES_OPTION) {
				System.exit(0);
			}
//			int lose = JOptionPane.showConfirmDialog(null, "Game Over!! \n Do you want to restart?", "EunJin Arcade", JOptionPane.YES_NO_OPTION);
//			if(lose == JOptionPane.YES_OPTION) {
//				threadStop();
//				initilize();
//				ready();
//				run();
//				threadStart();
//			}
//			else if(lose == JOptionPane.NO_OPTION) {
//				System.exit(0);
//			}
		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {

		switch (e.getKeyCode()) {
		case KeyEvent.VK_RIGHT:		// 오른쪽 방향키 눌린 경우
			Dizni1.setIcon(new ImageIcon("imgs/Dizni3.png"));
			if(Dizni1.getX() <= 450) {
				
				if(Dizni1.getX() >= stoneLT1.getX() - 70 && Dizni1.getX() <= 100) {
					if(Dizni1.getY() >= 90 && Dizni1.getY() <= stoneLT1.getY() + 100)
						break;
				}
				
				if(Dizni1.getX() >= stoneRT2.getX() - 70 && Dizni1.getX() <= 300) {
					if(Dizni1.getY() >= 90 && Dizni1.getY() <= stoneRT3.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneLT5.getX() - 70 && Dizni1.getX() <= 150) {
					if(Dizni1.getY() >= 210 && Dizni1.getY() <= stoneLT5.getY() + 60)
						break;
				}
				
				if(Dizni1.getX() >= stoneLC.getX() - 70 && Dizni1.getX() <= 90) {
					if(Dizni1.getY() >= 360 && Dizni1.getY() <= stoneLC.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneRC.getX() - 70 && Dizni1.getX() <= 400) {
					if(Dizni1.getY() >= 360 && Dizni1.getY() <= stoneRC.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneB1.getX() - 70 && Dizni1.getX() <= 120) {
					if(Dizni1.getY() >= 450 && Dizni1.getY() <= stoneB1.getY() + 60)
						break;
				}
				
				if(Dizni1.getX() >= stoneB5.getX() - 70 && Dizni1.getX() <= 320) {
					if(Dizni1.getY() >= 450 && Dizni1.getY() <= stoneB5.getY() + 60)
						break;
				}
				
				Dizni1.setLocation(Dizni1.getX() + 10, Dizni1.getY());
			}
			Dizni1.setSize(100, 100);
			break;
			
		case KeyEvent.VK_LEFT:		// 왼쪽 방향키 눌린 경우
			Dizni1.setIcon(new ImageIcon("imgs/Dizni2.png"));
			if(Dizni1.getX() >= 30) {
				
				if(Dizni1.getX() >= stoneLT2.getX() - 70 && Dizni1.getX() <= 190) {
					if(Dizni1.getY() >= 90 && Dizni1.getY() <= stoneLT2.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneLT1.getX() - 70 && Dizni1.getX() <= 110) {
					if(Dizni1.getY() >= 90 && Dizni1.getY() <= stoneLT1.getY() + 100)
						break;
				}
				
				if(Dizni1.getX() >= stoneLT4.getX() + 20 && Dizni1.getX() <= 230) {
					if(Dizni1.getY() >= 210 && Dizni1.getY() <= stoneLT4.getY() + 100)
						break;
				}
				
				if(Dizni1.getX() >= stoneLT6.getX() - 70 && Dizni1.getX() <= 270) {
					if(Dizni1.getY() >= 330 && Dizni1.getY() <= stoneLT6.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneRT1.getX() - 70 && Dizni1.getX() <= 450) {
					if(Dizni1.getY() >= 90 && Dizni1.getY() <= stoneRT1.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneRT2.getX() - 30 && Dizni1.getX() <= 370) {
					if(Dizni1.getY() >= 90 && Dizni1.getY() <= stoneRT2.getY() + 100)
						break;
				}
				
				if(Dizni1.getX() >= stoneRT4.getX() - 70 && Dizni1.getX() <= 450) {
					if(Dizni1.getY() >= 210 && Dizni1.getY() <= stoneRT4.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneLC.getX() - 70 && Dizni1.getX() <= 140) {
					if(Dizni1.getY() >= 360 && Dizni1.getY() <= stoneLC.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneRC.getX() - 60 && Dizni1.getX() <= 460) {
					if(Dizni1.getY() >= 360 && Dizni1.getY() <= stoneRC.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneB1.getX() - 50 && Dizni1.getX() <= 160) {
					if(Dizni1.getY() >= 450 && Dizni1.getY() <= stoneB1.getY() + 60)
						break;
				}
				
				if(Dizni1.getX() >= stoneB5.getX() - 40 && Dizni1.getX() <= 400) {
					if(Dizni1.getY() >= 450 && Dizni1.getY() <= stoneB5.getY() + 60)
						break;
				}
				
				Dizni1.setLocation(Dizni1.getX() - 10, Dizni1.getY());
			}
			Dizni1.setSize(100, 100);
			break;
		
		case KeyEvent.VK_UP:		// 위쪽 방향키 눌린 경우
			Dizni1.setIcon(new ImageIcon("imgs/Dizni4.png"));
			if(Dizni1.getY() >= 60) {
				
				if(Dizni1.getX() >= stoneLT2.getX() - 70 && Dizni1.getX() <= 180) {
					if(Dizni1.getY() >= 90 && Dizni1.getY() <= stoneLT2.getY() - 10)
						break;
				}

				if(Dizni1.getX() >= stoneLT3.getX() - 60 && Dizni1.getX() <= 200) {
					if(Dizni1.getY() >= 210 && Dizni1.getY() <= stoneLT3.getY() - 10)
						break;
				}

				if(Dizni1.getX() >= stoneLT6.getX() - 100 && Dizni1.getX() <= 270) {
					if(Dizni1.getY() >= 330 && Dizni1.getY() <= stoneLT6.getY() - 10)
						break;
				}
				
				if(Dizni1.getX() >= stoneRT1.getX() - 70 && Dizni1.getX() <= 440) {
					if(Dizni1.getY() >= 90 && Dizni1.getY() <= stoneRT1.getY() - 10)
						break;
				}
				
				if(Dizni1.getX() >= stoneRT4.getX() - 110 && Dizni1.getX() <= 440) {
					if(Dizni1.getY() >= 210 && Dizni1.getY() <= stoneRT4.getY() - 10)
						break;
				}	
				
				if(Dizni1.getX() >= stoneLC.getX() - 60 && Dizni1.getX() <= 140) {
					if(Dizni1.getY() >= 360 && Dizni1.getY() <= stoneLC.getY() - 10)
						break;
				}
				
				if(Dizni1.getX() >= stoneRC.getX() - 60 && Dizni1.getX() <= 450) {
					if(Dizni1.getY() >= 360 && Dizni1.getY() <= stoneRC.getY() - 10)
						break;
				}
				
				if(Dizni1.getX() >= stoneB2.getX() - 100 && Dizni1.getX() <= 400) {
					if(Dizni1.getY() >= 550 && Dizni1.getY() <= stoneB4.getY() - 10)
						break;
				}
				
				Dizni1.setLocation(Dizni1.getX(), Dizni1.getY() - 10);
			}
			Dizni1.setSize(100, 100);
			break;
		
		case KeyEvent.VK_DOWN:		// 아래쪽 방향키 눌린 경우
			Dizni1.setIcon(new ImageIcon("imgs/Dizni1.png"));
			if(Dizni1.getY() <= 610) {
				
				if(Dizni1.getX() >= stoneLT2.getX() - 100 && Dizni1.getX() <= 180) {
					if(Dizni1.getY() >= 80 && Dizni1.getY() <= stoneLT2.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneLT3.getX() - 70 && Dizni1.getX() <= 220) {
					if(Dizni1.getY() >= 200 && Dizni1.getY() <= stoneLT3.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneLT6.getX() - 100 && Dizni1.getX() <= 260) {
					if(Dizni1.getY() >= 320 && Dizni1.getY() <= stoneLT6.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneRT1.getX() - 100 && Dizni1.getX() <= 440) {
					if(Dizni1.getY() >= 80 && Dizni1.getY() <= stoneRT1.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneRT4.getX() - 110 && Dizni1.getX() <= 440) {
					if(Dizni1.getY() >= 200 && Dizni1.getY() <= stoneRT4.getY() - 20)
						break;
				}	
				
				if(Dizni1.getX() >= stoneLC.getX() - 60 && Dizni1.getX() <= 140) {
					if(Dizni1.getY() >= 350 && Dizni1.getY() <= stoneLC.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneRC.getX() - 60 && Dizni1.getX() <= 450) {
					if(Dizni1.getY() >= 350 && Dizni1.getY() <= stoneRC.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneB1.getX() - 60 && Dizni1.getX() <= 160) {
					if(Dizni1.getY() >= 440 && Dizni1.getY() <= stoneB1.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneB2.getX() - 100 && Dizni1.getX() <= 360) {
					if(Dizni1.getY() >= 520 && Dizni1.getY() <= stoneB4.getY() - 20)
						break;
				}
				
				if(Dizni1.getX() >= stoneB5.getX() - 60 && Dizni1.getX() <= 390) {
					if(Dizni1.getY() >= 440 && Dizni1.getY() <= stoneB5.getY() - 20)
						break;
				}
				
				Dizni1.setLocation(Dizni1.getX(), Dizni1.getY() + 10);
			}
			Dizni1.setSize(100, 100);
			break;
		
//		case KeyEvent.VK_SPACE:		// F1키 눌린 경우
//			Dizni1.setIcon(new ImageIcon("imgs/Dizni4.png"));
//			break;
			
//		case KeyEvent.VK_F2:		// F1키 눌린 경우	
//			Dizni1.setIcon(new ImageIcon("imgs/Alice_pink_l.jpg"));
//			break;
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		new Dizni_EJ();
	}

}
