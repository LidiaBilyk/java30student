package telran.java30.student.confuguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import telran.java30.student.service.StudentService;
import telran.java30.student.service.StudentServiceImpl;
@Configuration
public class StudentConfiguration {
	
//	@Bean // or @Service in the class StudentServiceImpl
	public StudentService getStudentService() {
		return new StudentServiceImpl();
	}

}
