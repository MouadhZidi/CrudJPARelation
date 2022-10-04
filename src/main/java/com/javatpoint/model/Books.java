package com.javatpoint.model;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//mark class as an Entity 
@Entity
//defining class name as Table name
@Table
public class Books {
//Defining book id as primary key
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int bookid;
	@Column
	private String bookname;
	@Column
	private String author;
	@Column
	private int price;

	@ManyToOne
	@JoinColumn(name = "student_id")
	private Student student;

	@JsonIgnoreProperties("books")

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public Books(int bookid, String bookname, String author, int price) {
		super();
		this.bookid = bookid;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}

	public Books() {
		super();
	}

	@Override
	public String toString() {
		return "Books [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price + "]";
	}

}