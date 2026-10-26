package com.advance;

public class Book {

	private int bookId;
	private String title;
	private String author;
	private boolean isIssued;

	public void setDetails(int bookId, String title, String author) {
		if (bookId > 0 && title != null && !title.trim().isEmpty() && author != null && !author.trim().isEmpty()) {
			this.bookId = bookId;
			this.title = title;
			this.author = author;
		} else {
			System.out.println("Please enter a valid book details!");
		}

	}

	public boolean issueBook() {
		if (isIssued) {
			System.out.println(title + " is already issued.");
			return false;
		}
		isIssued = true;
		System.out.println(title + " has been issued successfully.");
		return true;
	}

	public boolean returnBook() {
		if (!isIssued) {
			System.out.println(title + " is not issued.");
			return false;
		}
		isIssued = false;
		System.out.println(title + " has been returned successfully.");
		return true;
	}

	public void displayDetails() {
		System.out.println("Book ID: " + bookId);
		System.out.println("Book title: " + title);
		System.out.println("Book  author: " + author);
		System.out.println("Status: " + (isIssued ? "Issued" : "Available"));

	}

}
