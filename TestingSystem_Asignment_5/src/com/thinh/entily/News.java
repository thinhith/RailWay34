package com.thinh.entily;

public class News implements INews {
	public static int COUNT;
	private int id;
	private String title;
	private String publistDate;
	private String author;
	private String content;
	private float averageRate;
	private int[] rate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublistDate() {
		return publistDate;
	}

	public void setPublistDate(String publistDate) {
		this.publistDate = publistDate;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public float getAverageRate() {
		return averageRate;
	}

	public int[] getRate() {
		return rate;
	}

	public void setRate(int[] rate) {
		this.rate = rate;
	}

	public News(String title, String publistDate, String author, String content, int[] rate) {
		super();
		COUNT++;
		this.id = COUNT;
		this.title = title;
		this.publistDate = publistDate;
		this.author = author;
		this.content = content;
		this.averageRate = averageRate;
		this.rate = rate;
	}

	@Override
	public void Display() {
		System.out.println("Title : " + title + "\n" + "PublistDate : " + publistDate + "\n" + "Author : " + author
				+ "\n" + "Content : " + content + "\n" + "AverageRate : " + averageRate);

	}

	@Override
	public float Calculate() {
		averageRate = (float) ((rate[0] + rate[1] + rate[2]) / 3);
		return averageRate;
	}

}
