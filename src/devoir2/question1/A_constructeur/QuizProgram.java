package devoir2.question1.A_constructeur;

import org.springframework.context.support.FileSystemXmlApplicationContext;

public class QuizProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FileSystemXmlApplicationContext( "src/devoir2/question1/A_constructeur/spring-config.xml" );
	}

}
