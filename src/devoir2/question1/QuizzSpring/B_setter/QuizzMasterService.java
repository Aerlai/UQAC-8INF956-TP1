package devoir2.question1.QuizzSpring.B_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class QuizzMasterService {
	private JFrame ecran;
	private JRadioButton [] lesBoutons;

	public Quizz getQuizMaster() {
		return quizMaster;
	}

	public void setQuizMaster(Quizz quizMaster) {
		this.quizMaster = quizMaster;
	}

	private Quizz quizMaster;
	public void lancerQuizz()
	{
		this.ecran = new JFrame();
		lesBoutons = new JRadioButton [4];
		ecran.setSize( 450, 200 );
		this.ecran.setTitle(quizMaster.getType());
		// Fermeture de la fenetre
		ecran.addWindowListener( new WindowAdapter() {
		public void windowClosing( WindowEvent we ) {
			QuizzMasterService.this.terminer();
		}
		} );
		// Le panneau central
		JPanel panneauCentral = new JPanel( new BorderLayout() );
		ecran.add( panneauCentral );
		ActionListener listener = new ActionListener() {
	         public void actionPerformed (ActionEvent e) {
	        	 AbstractButton aButton = (AbstractButton) e.getSource();
	        	 String message=aButton.getText();
	        	 if(message.equals(quizMaster.getChoix(quizMaster.getReponse())))
	        		 JOptionPane.showMessageDialog( ecran, "bonne réponse" );
	        	 else
	        		 JOptionPane.showMessageDialog( ecran, "mauvaise réponse" );
	        	 
	         };
	      };
		JPanel panneauQuestion= new JPanel( new FlowLayout( FlowLayout.LEADING ) );
		panneauQuestion.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder()));
		JLabel monlabel=new JLabel(quizMaster.getQuestion());
		panneauQuestion.add(monlabel);
		panneauCentral.add( panneauQuestion, BorderLayout.NORTH );
		JPanel panneauChoix = new JPanel( new FlowLayout( FlowLayout.LEFT ) );
		ButtonGroup groupe = new ButtonGroup ();
		for(int i=0; i<4; i++)
		{
			lesBoutons[i] = new JRadioButton (quizMaster.getChoix(i));
			groupe.add(lesBoutons[i]);
			panneauChoix.add(lesBoutons[i]);
			lesBoutons[i].addActionListener(listener);
		}
		panneauCentral.add( panneauChoix, BorderLayout.CENTER);
		ecran.setVisible( true );
	}
	private void terminer() {
		
		this.ecran.dispose();			
		System.exit( 0 );
	}
}
