package com.thinh.fronend;

import java.time.LocalDate;

import com.thinh.entily.Account;
import com.thinh.entily.Answer;
import com.thinh.entily.CategoryQuestion;
import com.thinh.entily.Department;
import com.thinh.entily.ECategoryQuestion;
import com.thinh.entily.ETypeQuestion;
import com.thinh.entily.Exam;
import com.thinh.entily.Group;
import com.thinh.entily.Position;
import com.thinh.entily.PositionName;
import com.thinh.entily.Question;
import com.thinh.entily.TypeQuestion;
import com.thinh.entily.isCorrect;

public class Program {

	public static void main(String[] args) {
//  Táº O DEPARTMENT
	Department department1 = new Department("PB1");
	Department department2 = new Department("PB2");
	Department department3 = new Department("PB3");
//	System.out.println(department3);
	
// Táº O POSITION
	Position position1 = new Position(PositionName.DEV);
	Position position2 = new Position(PositionName.PM);
	Position position3 = new Position(PositionName.SCRUM_MASTER);
//	System.out.println(position3);
	
// Táº O ACCOUNT
	Account account1 = new Account("email1@gmail.com", "thinh", "Nguyá»…n Quang Thá»‹nh", department2, position2, LocalDate.now());
	Account account2 = new Account("email2@gmail.com", "hanh", "Tá»« Há»“ng Háº¡nh", department3, position1, LocalDate.now());
	Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyá»…n KhĂ´i NguyĂªn", department3, position3, LocalDate.now());
//	System.out.println(account1);
	
// Táº O GROUP
	Group group1 = new Group("GR1", account2, LocalDate.now());
	Group group2 = new Group("GR2", account3, LocalDate.now());
	Group group3 = new Group("GR3", account1, LocalDate.now());
//	System.out.println(group1);
	
// Táº O GROUPACCOUNT
	Account[] accountOfGroup1 = {account2,account3};
	Account[] accountOfGroup2 = {account1,account2,account3};
	Account[] accountOfGroup3 = {account2,account3,account1};
	
	group1.accounts = accountOfGroup1;
	group2.accounts = accountOfGroup2;
	group3.accounts = accountOfGroup3;
	
	Group[] groupOfAccount1 = {group2,group3};
	Group[] groupOfAccount2 = {group1,group3};
	Group[] groupOfAccount3 = {group2,group3};
	
	account1.groups = groupOfAccount1 ;
	account2.groups = groupOfAccount2 ;
	account3.groups = groupOfAccount3 ;
	
	
// Táº O TYPEQUESTION 
	TypeQuestion typeQuestion1 = new TypeQuestion(ETypeQuestion.ESSAY);
	TypeQuestion typeQuestion2 = new TypeQuestion(ETypeQuestion.MULTIPLE_CHOICE);
	
// Táº O CATEGORYQUESTION
	CategoryQuestion categoryQuestion1 = new CategoryQuestion(ECategoryQuestion.JAVA);
	CategoryQuestion categoryQuestion2 = new CategoryQuestion(ECategoryQuestion.NET);
	CategoryQuestion categoryQuestion3 = new CategoryQuestion(ECategoryQuestion.POSTMAN);
	CategoryQuestion categoryQuestion4 = new CategoryQuestion(ECategoryQuestion.RUBY);
	CategoryQuestion categoryQuestion5 = new CategoryQuestion(ECategoryQuestion.SQL);
	
// Táº O QUESTION 
	Question question1 = new Question("Báº¡n hiá»ƒu Java lĂ  ngĂ´n ngá»¯ láº­p trĂ¬nh nhÆ° tháº¿ nĂ o", categoryQuestion1, typeQuestion2, LocalDate.of(2022, 2, 19));
	Question question2 = new Question("Báº¡n hiá»ƒu SQL lĂ  ngĂ´n ngá»¯ láº­p trĂ¬nh nhÆ° tháº¿ nĂ o", categoryQuestion5, typeQuestion1, LocalDate.of(2022, 2, 19));
	Question question3 = new Question("Báº¡n hiá»ƒu RUBY lĂ  ngĂ´n ngá»¯ láº­p trĂ¬nh nhÆ° tháº¿ nĂ o", categoryQuestion4, typeQuestion1, LocalDate.of(2022, 2, 19));

// Táº O ANSWER
	Answer answer1 = new Answer("CĂ¢u tráº£ lá»�i sá»‘ 1", question1,isCorrect.is_true);
	Answer answer2 = new Answer("CĂ¢u tráº£ lá»�i sá»‘ 2", question2,isCorrect.is_false);
	Answer answer3 = new Answer("CĂ¢u tráº£ lá»�i sá»‘ 3", question1,isCorrect.is_true);
	
// Táº O Báº¢NG EXAM
	Exam exam1 = new Exam("COD001", "Test01", categoryQuestion1, 90, account3, LocalDate.of(2022, 4, 12));
	Exam exam2 = new Exam("COD002", "Test02", categoryQuestion4, 60, account2, LocalDate.of(2022, 4, 12));
	Exam exam3 = new Exam("COD003", "Test03", categoryQuestion2, 120, account1, LocalDate.of(2022, 4, 12));
	
// Táº O EXAMQUESTION
	Question[] questionOfExam1 = {question1,question2};
	Question[] questionOfExam2 = {question1,question2,question3};
	Question[] questionOfExam3 = {question1};
	exam1.questions = questionOfExam1;
	exam2.questions = questionOfExam2;
	exam3.questions = questionOfExam3;
	Exam[] examOfQuestion1 = {exam1,exam2};
	Exam[] examOfQuestion2 = {exam3};
	Exam[] examOfQuestion3 = {exam3,exam2};
	question1.exams = examOfQuestion1;
	question2.exams = examOfQuestion2;
	question3.exams = examOfQuestion3;
	Account[] accounts = {account1,account2,account3};

	// QUESTION 1
	}

		
	

}
