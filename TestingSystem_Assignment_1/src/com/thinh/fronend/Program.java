package com.thinh.fronend;

import java.time.LocalDate;
import java.util.Locale.Category;

import com.thinh.enity.Account;
import com.thinh.enity.Answer;
import com.thinh.enity.CategoryQuestion;
import com.thinh.enity.Department;
import com.thinh.enity.ECategoryQuestion;
import com.thinh.enity.ETypeQuestion;
import com.thinh.enity.Exam;
import com.thinh.enity.ExamQuestion;
import com.thinh.enity.Group;
import com.thinh.enity.GroupAccount;
import com.thinh.enity.Position;
import com.thinh.enity.PositionName;
import com.thinh.enity.Question;
import com.thinh.enity.TypeQuestion;
import com.thinh.enity.isCorrect;

public class Program {

	public static void main(String[] args) {
//  TẠO DEPARTMENT
	Department department1 = new Department("PB1");
	Department department2 = new Department("PB2");
	Department department3 = new Department("PB3");
//	System.out.println(department1);
	
// TẠO POSITION
	Position position1 = new Position(PositionName.DEV);
	Position position2 = new Position(PositionName.PM);
	Position position3 = new Position(PositionName.SCRUM_MASTER);
//	System.out.println(position3);
	
// TẠO ACCOUNT
	Account account1 = new Account("email1@gmail.com", "thinh", "Nguyễn Quang Thịnh", department2, position2, LocalDate.now());
	Account account2 = new Account("email2@gmail.com", "hanh", "Từ Hồng Hạnh", department3, position1, LocalDate.now());
	Account account3 = new Account("email3@gmail.com", "nguyen", "Nguyễn Khôi Nguyên", department3, position3, LocalDate.now());
//	System.out.println(account1);
	
// TẠO GROUP
	Group group1 = new Group("GR1", account2, LocalDate.now());
	Group group2 = new Group("GR2", account3, LocalDate.now());
	Group group3 = new Group("GR3", account1, LocalDate.now());
//	System.out.println(group1);
	
// TẠO GROUPACCOUNT
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
	
	
// TẠO TYPEQUESTION 
	TypeQuestion typeQuestion1 = new TypeQuestion(ETypeQuestion.ESSAY);
	TypeQuestion typeQuestion2 = new TypeQuestion(ETypeQuestion.MULTIPLE_CHOICE);
	
// TẠO CATEGORYQUESTION
	CategoryQuestion categoryQuestion1 = new CategoryQuestion(ECategoryQuestion.JAVA);
	CategoryQuestion categoryQuestion2 = new CategoryQuestion(ECategoryQuestion.NET);
	CategoryQuestion categoryQuestion3 = new CategoryQuestion(ECategoryQuestion.POSTMAN);
	CategoryQuestion categoryQuestion4 = new CategoryQuestion(ECategoryQuestion.RUBY);
	CategoryQuestion categoryQuestion5 = new CategoryQuestion(ECategoryQuestion.SQL);
	
// TẠO QUESTION 
	Question question1 = new Question("Bạn hiểu Java là ngôn ngữ lập trình như thế nào", categoryQuestion1, typeQuestion2, LocalDate.of(2022, 2, 19));
	Question question2 = new Question("Bạn hiểu SQL là ngôn ngữ lập trình như thế nào", categoryQuestion5, typeQuestion1, LocalDate.of(2022, 2, 19));
	Question question3 = new Question("Bạn hiểu RUBY là ngôn ngữ lập trình như thế nào", categoryQuestion4, typeQuestion1, LocalDate.of(2022, 2, 19));

// TẠO ANSWER
	Answer answer1 = new Answer("Câu trả lời số 1", question1,isCorrect.is_true);
	Answer answer2 = new Answer("Câu trả lời số 2", question2,isCorrect.is_false);
	Answer answer3 = new Answer("Câu trả lời số 3", question1,isCorrect.is_true);
	
// TẠO BẢNG EXAM
	Exam exam1 = new Exam("COD001", "Test01", categoryQuestion1, 90, account3, LocalDate.of(2022, 4, 12));
	Exam exam2 = new Exam("COD002", "Test02", categoryQuestion4, 60, account2, LocalDate.of(2022, 4, 12));
	Exam exam3 = new Exam("COD003", "Test03", categoryQuestion2, 120, account1, LocalDate.of(2022, 4, 12));
	
// TẠO EXAMQUESTION
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
		}
	
}
