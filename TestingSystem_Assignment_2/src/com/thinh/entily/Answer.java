package com.thinh.entily;

public class Answer {
public static int COUNT = 0;
int id;
String content;
Question quesId;
isCorrect isCorrect;
public Answer( String content, Question quesId, com.thinh.entily.isCorrect isCorrect) {
	super();
	COUNT++;
	this.id = COUNT;
	this.content = content;
	this.quesId = quesId;
	this.isCorrect = isCorrect;
}
@Override
public String toString() {
	return "Answer [id=" + id + ", content=" + content + ", quesId=" + quesId + ", isCorrect=" + isCorrect + "]";
}


}
