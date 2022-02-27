package com.thinh.entily;

import java.time.LocalDate;
import java.util.Arrays;

public class Exam {
public static int COUNT = 0;
public int id;
public String code;
public String title;
public CategoryQuestion categoryID;
public int duration;
public Account creatorId;
public LocalDate createDate;
public Question[] questions;

public Exam( String code, String title, CategoryQuestion categoryID, int duration, Account creatorId,
		LocalDate createDate) {
	super();
	COUNT++;
	this.id = COUNT;
	this.code = code;
	this.title = title;
	this.categoryID = categoryID;
	this.duration = duration;
	this.creatorId = creatorId;
	this.createDate = createDate;
}
@Override
public String toString() {
	return "Exam [id=" + id + ", code=" + code + ", title=" + title + ", categoryID=" + categoryID + ", duration="
			+ duration + ", creatorId=" + creatorId + ", createDate=" + createDate + ", questions="
			+ Arrays.toString(questions) + "]";
}


}
