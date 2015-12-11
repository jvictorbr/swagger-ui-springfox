package com.jv;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel("Book")
public class Book implements Serializable {
	
	private static final long serialVersionUID = 498435419677375106L;
	
	@ApiModelProperty("The book ISBN code")
	private Long isbn;
	@ApiModelProperty("The book title")
	private String title;
	@ApiModelProperty("The book oficial author")
	private String author;
	@ApiModelProperty("The book edition")
	private String edition;
	@ApiModelProperty("The book release year")
	private Integer year;
	
	public Long getIsbn() {
		return isbn;
	}
	public void setIsbn(Long isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getEdition() {
		return edition;
	}
	public void setEdition(String edition) {
		this.edition = edition;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}

}
