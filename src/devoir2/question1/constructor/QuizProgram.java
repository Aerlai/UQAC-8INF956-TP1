package devoir2.question1.constructor;

import org.springframework.context.support.FileSystemXmlApplicationContext;
public class QuizProgram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//QuizzMasterService quizMasterService = new QuizzMasterService();
		new FileSystemXmlApplicationContext( "src/devoir2/question1/constructor/spring-config.xml" );
	}

}
