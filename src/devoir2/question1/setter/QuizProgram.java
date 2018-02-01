package devoir2.question1.setter;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class QuizProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QuizzMasterService quizMasterService = new QuizzMasterService();
		 //new FileSystemXmlApplicationContext( "src/devoir2/question1/setter/spring-config.xml" );
		//BeanFactory bf = new ClassPathXmlApplicationContext("src/devoir2/question1/setter/spring-config.xml");

		ApplicationContext applicationContext = new FileSystemXmlApplicationContext("src/devoir2/question1/setter/spring-config.xml");
		QuizzMasterService quizz = (QuizzMasterService) applicationContext.getBean("quizzM");
		quizz.lancerQuizz();
	}

}
