package com.thinh.entily;

import java.time.LocalDate;

public class Question {
	public static int COUNT = 0;
	public int id;
	public String content;
	public CategoryQuestion categoryId;
	public TypeQuestion typeId;
	public LocalDate createDate;
	public Exam[] exams;
	
	public Question( String content, CategoryQuestion categoryId, TypeQuestion typeId, LocalDate createDate) {
		super();
		COUNT++;
		this.id = COUNT;
		this.content = content;
		this.categoryId = categoryId;
		this.typeId = typeId;
		this.createDate = createDate;
	}
	@Override
	public String toString() {
		return "Question [id=" + id + ", content=" + content + ", categoryId=" + categoryId + ", typeId=" + typeId
				+ ", createDate=" + createDate + "]";
	}
	

}
