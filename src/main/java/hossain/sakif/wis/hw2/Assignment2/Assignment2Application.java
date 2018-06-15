package hossain.sakif.wis.hw2.Assignment2;

import java.util.HashMap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Assignment2Application {
	public static HashMap<Long, Student> hmStudent;

	public static void main(String[] args) {
		hmStudent = new HashMap<Long, Student>();
		Student one = new Student("Sakif Hossain2", "WIS");
		hmStudent.put(new Long(one.getId()), one);
		
		Student one2 = new Student("Sakif Hossain", "WIS");
		hmStudent.put(new Long(one2.getId()), one2);

		SpringApplication.run(Assignment2Application.class, args);
	}
}
