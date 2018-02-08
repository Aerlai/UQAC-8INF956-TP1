package devoir2.question1.QuizzSpring.B_setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class QuizProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new FileSystemXmlApplicationContext( "src/devoir2/question1/QuizzSpring/B_setter/spring-config.xml" );
		QuizzMasterService quizz = (QuizzMasterService)context.getBean("quizz");
		quizz.lancerQuizz();
	}

}
