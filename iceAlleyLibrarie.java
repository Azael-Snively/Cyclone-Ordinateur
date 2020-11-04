/**
 * 
 */
package Librarie;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToolBar;

/**
 * @author Axel
 * @version 1.1
 *
 */
public class iceAlleyLibrarie {
	
	private static JPanel Contain = new JPanel();
	private static JPanel bar = new JPanel();
	private static JPanel tool = new JPanel();
	
	private static JButton Home = new JButton();
	private static JToolBar Edition = new JToolBar();
	private static JButton Bibliotheque = new JButton();
	private static JButton Video = new JButton();
	private static JButton Chercher = new JButton();
	private static JButton MiseAJour = new JButton();
	private static JButton Aide = new JButton();
	private static JButton Parametre = new JButton();
	private static JButton Extend = new JButton();
	private static JButton Suivant = new JButton();
	private static JButton Precedent = new JButton();
	private static JButton Pause = new JButton();
	private static JButton Play = new JButton();
	private static JButton PassD = new JButton();
	private static JButton PassG = new JButton();
	private static JButton SoundP = new JButton();
	private static JButton SoundM = new JButton();
	private static JButton Stop = new JButton(); 
	private static JButton lookB = new JButton();
	private static JTextField LookT = new JTextField();
	private static JTextPane livre = new JTextPane();
	
	
	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HouseD();
		
		JFrame fenetre = new JFrame("Ice Alley Book");
		fenetre.setSize(new Dimension (500,500));
		fenetre.setVisible(true);
		fenetre.setLocationRelativeTo(null);
		fenetre.setDefaultCloseOperation(1);
		
		
		
		bar.setPreferredSize (new Dimension(50, fenetre.getWidth() ));
		bar.setBackground(new Color(180,180,180));
		fenetre.add(bar, BorderLayout.WEST);
		
		tool.setPreferredSize (new Dimension(  fenetre.getHeight(),50 ));
		tool.setBackground(new Color(180,180,180));
		fenetre.add(tool, BorderLayout.NORTH);
		
		Contain.setBackground(new Color(127, 149, 230));
		Contain.setPreferredSize(new Dimension(fenetre.getHeight()- 150, fenetre.getWidth()));
		fenetre.add(Contain, BorderLayout.CENTER);
		
		
		Home.setBackground(bar.getBackground());
		Home.setBorderPainted(false);
		ImageIcon maison = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Maison.png");
		Home.setIcon(maison);
		Home.getIcon();
		
		Home.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 		Edition.setVisible(true);	
	 		HouseD();
	 		
	 		}
	 	});	   
		
		
		
		
		
		
		Bibliotheque.setBackground(bar.getBackground());
		Bibliotheque.setBorderPainted(false);
		ImageIcon Livre = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Bibliotheque.png");
		Bibliotheque.setIcon(Livre);
	    Bibliotheque.getIcon();
	    
	    Bibliotheque.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 		ReadD();	
	 		
	 						    		
	 		}
	 	});	   
	    
	    
	    
	    
		Video.setBackground(bar.getBackground());
		Video.setBorderPainted(false);
		ImageIcon Film = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Video.png");
		Video.setIcon(Film);
		 Video.getIcon();
		 
		 Video.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			
		 		
		 		AnimD();	
		 		
		 		
		 		}
		 	});	   
	    
		
	    
	    Chercher.setBackground(bar.getBackground());
	    Chercher.setBorderPainted(false);
		ImageIcon Search = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Chercher.png");
		Chercher.setIcon(Search);
		Chercher.getIcon();
		
		Chercher.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 			LookD();
	 			lookB.setVisible(true);
	 			LookT.setVisible(true);
	 					    		
	 		}
	 	});	   
		
		
		MiseAJour.setBackground(bar.getBackground());
		MiseAJour.setBorderPainted(false);
		ImageIcon Uptade = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Mise A Jour.png");
		MiseAJour.setIcon(Uptade);
		 MiseAJour.getIcon();
		 
		 MiseAJour.addActionListener(new ActionListener() {
		 		public void actionPerformed(ActionEvent e) {
		 			
		 		Uptade();
		 		
		 		}

				
		 	});	   
		 
		 
		 
		
		 
		 Aide.setBackground(bar.getBackground());
		 Aide.setBorderPainted(false);
		ImageIcon Help = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\AProps.png");
		Aide.setIcon(Help);
		Aide.getIcon();
		
		Aide.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 			HelpD();
	 			
	 			
	 		}
	 	});	   
		
		
		Parametre.setBackground(bar.getBackground());
		Parametre.setBorderPainted(false);
		ImageIcon Setting = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Fermer.png");
		Parametre.setIcon(Setting);
	    Parametre.getIcon();
		
	    Parametre.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 			System.exit(0);	 							    		
	 		}
	 	});	   
	    
	    
	   
		Extend.setBackground(bar.getBackground());
		Extend.setBorderPainted(false);
		ImageIcon Extension = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Extension.png");
		ImageIcon Detendu = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Detendu.png");
		Extend.setIcon(Extension);
	    Extend.getIcon();
	    boolean extendu = true;
	    
	    Extend.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 			
	 			
	 			
	 			if(extendu == true) {
	 				
	 				Extend.setIcon(Detendu);
	 				Extend.getIcon();
	 				
	 				bar.setPreferredSize(new Dimension(125, fenetre.getWidth() ));
		 			Extend.setText("");
		 			Home.setText("Acceuil");
		 			Bibliotheque.setText("Livre");
		 			Video.setText("Video");
		 			Chercher.setText("Chercher");
		 			MiseAJour.setText("MiseAJour");
		 			Aide.setText("Aide");
		 			Parametre.setText("Quitter");
	 			}
	 			
	 			if(extendu == false) {
	 			
	 				Extend.setIcon(Extension);
	 				Extend.getIcon();
	 				
	 			bar.setPreferredSize(new Dimension(50, fenetre.getWidth() ));
	 			Extend.setText("");
	 			Home.setText("");
	 			Bibliotheque.setText("");
	 			Video.setText("");
	 			Chercher.setText("");
	 			MiseAJour.setText("");
	 			Aide.setText("");
	 			Parametre.setText("");
	 			
	 			}
	 			
	 			
	 					
	 		}
	 	});	   
		
	    
	    
		Suivant.setBackground(bar.getBackground());
		Suivant.setBorderPainted(false);
		ImageIcon next = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\FlesheDroite.png");
		Suivant.setIcon(next);
	    Suivant.getIcon();
		
	    Suivant.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});	   
	    
	    
	    
		Precedent.setBackground(bar.getBackground());
		Precedent.setBorderPainted(false);
		ImageIcon last = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\FlesheGauche.png");
		Precedent.setIcon(last);
	    Precedent.getIcon();
		
	    Precedent.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});	 
	    
	    
		Pause.setBackground(bar.getBackground());
		Pause.setBorderPainted(false);
		ImageIcon stop = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Pause.png");
		Pause.setIcon(stop);
	    Pause.getIcon();
		
	    Pause.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});
	    
	    
		Play.setBackground(bar.getBackground());
		Play.setBorderPainted(false);
		ImageIcon Jouer= new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Play.png");
		Play.setIcon(Jouer);
	    Play.getIcon();
		
	    Play.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});
	    
	   
		PassD.setBackground(bar.getBackground());
		PassD.setBorderPainted(false);
		ImageIcon PaasD= new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\PassDroite.png");
		PassD.setIcon(PaasD);
	    PassD.getIcon();
		
	    PassD.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});
	    
	    
	    
		PassG.setBackground(bar.getBackground());
		PassG.setBorderPainted(false);
		ImageIcon PaasG= new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\PasseGauche.png");
		PassG.setIcon(PaasG);
	    PassG.getIcon();
		
	    PassG.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});
	    
	    
		Stop.setBackground(bar.getBackground());
		Stop.setBorderPainted(false);
		ImageIcon Aret= new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Stop.png");
		Stop.setIcon(Aret);
	    Stop.getIcon();
		
	    Stop.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});
	    

	    SoundM.setBackground(bar.getBackground());
		SoundM.setBorderPainted(false);
		ImageIcon soundminus = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\SonMoin.png");
		SoundM.setIcon(soundminus);
	    SoundM.getIcon();
		
	    SoundM.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});
	    
	    
	    SoundP.setBackground(bar.getBackground());
		SoundP.setBorderPainted(false);
		ImageIcon soundplus = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\SonPlus.png");
		SoundP.setIcon(soundplus);
	    SoundP.getIcon();
		
	    SoundP.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 										    		
	 		}
	 	});
	    
	    
	    lookB.setBackground(bar.getBackground());
	    lookB.setBorderPainted(false);
		ImageIcon Searchi = new ImageIcon("C:\\Users\\Axel\\Pictures\\Edition Image\\Chercher.png");
		lookB.setIcon(Searchi);
		lookB.getIcon();
		
		Chercher.addActionListener(new ActionListener() {
	 		public void actionPerformed(ActionEvent e) {
	 			
	 			LookD();
	 					    		
	 		}
	 	});	   
	    
		Font AireFont = new Font("Arial", Font.BOLD, 22);
		
		LookT.setPreferredSize(new Dimension(5, 220));
		LookT.setBackground(new Color(200, 200, 200));
		LookT.setFont(AireFont);
		
		livre.setEditable(false);
		livre.setBackground(new Color(54,95, 180));
		livre.setPreferredSize(new Dimension(1200, 600));
	    System.out.println(livre.getSize());
	    Edition.setBorderPainted(false);
	    Edition.setPreferredSize(new Dimension(tool.getSize()));
	    Edition.setBackground(new Color (180, 180, 180));
	    
	    bar.add(Extend);
		bar.add(Home);
		bar.add(Bibliotheque);
		bar.add(Video);
		bar.add(Chercher);
		bar.add(MiseAJour);
		bar.add(Aide);
		bar.add(Parametre);
		

		tool.add(Edition);
		
		Edition.add(Suivant);
		Edition.add(Precedent);
		Edition.addSeparator();
        Edition.add(Play);
		Edition.add(Pause);
		Edition.add(Stop);
		Edition.addSeparator();
		Edition.add(SoundM);
		Edition.add(SoundP);
		Edition.addSeparator();
		Edition.add(PassG);
		Edition.add(PassD);
		Edition.addSeparator();
		Edition.add(LookT);
		Edition.add(lookB);
		
		Contain.add(livre);
		
		
	}

	public static void AnimD() {
		// TODO Auto-generated method stub
		
		Contain.setBackground(new Color(23,22, 78));
		Play.setVisible(true);
		Pause.setVisible(true);
		Stop.setVisible(true);
		PassG.setVisible(true);
		PassD.setVisible(true);
		SoundM.setVisible(true);
		SoundP.setVisible(true);
		
		Suivant.setVisible(false);
		Precedent.setVisible(false);
		
		
		livre.setVisible(false);
		lookB.setVisible(false);
		LookT.setVisible(false);
		
	}

	private static void LookD() {
		// TODO Auto-generated method stub
		
		Contain.setBackground(new Color(127, 149, 230));
		Play.setVisible(false);
		Pause.setVisible(false);
		Stop.setVisible(false);
		PassG.setVisible(false);
		PassD.setVisible(false);
		SoundM.setVisible(false);
		SoundP.setVisible(false);
		
		Suivant.setVisible(false);
		Precedent.setVisible(false);
		
		livre.setVisible(false);
		
		
	}

	private static void HelpD() {
		// TODO Auto-generated method stub
		
		Contain.setBackground(new Color(127, 149, 230));
		
		Play.setVisible(false);
		Pause.setVisible(false);
		Stop.setVisible(false);
		PassG.setVisible(false);
		PassD.setVisible(false);
		SoundM.setVisible(false);
		SoundP.setVisible(false);
		
		Suivant.setVisible(false);
		Precedent.setVisible(false);
		
		lookB.setVisible(false);
		LookT.setVisible(false);
		livre.setVisible(false);
		
	}

	private static void ReadD() {
		// TODO Auto-generated method stub
		
		Contain.setBackground(new Color(107, 119, 200));
		Play.setVisible(false);
		Pause.setVisible(false);
		Stop.setVisible(false);
		PassG.setVisible(false);
		PassD.setVisible(false);
		SoundM.setVisible(false);
		SoundP.setVisible(false);
		
		Suivant.setVisible(true);
		Precedent.setVisible(true);
		
		lookB.setVisible(false);
		LookT.setVisible(false);
		
		livre.setVisible(true);
		
		
		
	}

	private static void HouseD() {
		// TODO Auto-generated method stub
		
		Contain.setBackground(new Color(127, 149, 230));
		Play.setVisible(false);
		Pause.setVisible(false);
		Stop.setVisible(false);
		PassG.setVisible(false);
		PassD.setVisible(false);
		SoundM.setVisible(false);
		SoundP.setVisible(false);
		
		Suivant.setVisible(false);
		Precedent.setVisible(false);
		
		lookB.setVisible(false);
		LookT.setVisible(false);
		livre.setVisible(false);
		
	}

	private static void Uptade() {
		// TODO Auto-generated method stub
		
		 JProgressBar barpro  = new JProgressBar(); // if(montrer == false || miseAJour == false) { 
		Contain.add(barpro);
			barpro.setStringPainted(true); 
			barpro.setPreferredSize( new Dimension (500, 35));
			barpro.setValue(0);
			barpro.setBounds(new Rectangle (50, 35, 0, 0));
			int position = 0;
		        barpro.setVisible(true);
		        barpro.setForeground(Color.GRAY);
		        barpro.setBackground(Color.LIGHT_GRAY);
		        barpro.setToolTipText("Chargement...");
		        //load.setVisible(true);
		        while (position < 100) {
		            barpro.setValue(position);
		            try {
		                Thread.sleep(500);
		            } catch (InterruptedException chargement) {
		            }
		            position += 5;
		            
		            if (position == 100) {
		            	
		            	
		            	
		            	barpro.setVisible(false);
		            	
		            	
		            }  
		            
		            	
		            	
		        }
		         
		    
		 
		 
		
	}
	
	
}
