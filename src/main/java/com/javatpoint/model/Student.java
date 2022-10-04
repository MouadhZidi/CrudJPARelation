package com.javatpoint.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private int studentid;
	@Column
	private String name;
	@Column
	private String lastname;
	@Column
	private String age;

	@OneToMany(mappedBy = "student", fetch = FetchType.LAZY, cascade = CascadeType.ALL)

	private List<Books> BooksList;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public Student(int studentid, String name, String lastname, String age) {
		super();
		this.studentid = studentid;
		this.name = name;
		this.lastname = lastname;
		this.age = age;
	}

	public Student() {
		super();
	}

	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", name=" + name + ", lastname=" + lastname + ", age=" + age + "]";
	}

}
