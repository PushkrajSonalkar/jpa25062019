package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book 
{
	@Id
	@Column(name="book_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	

	 @Column(name = "book_name")
	 private String name;

	 @Column(name = "auther_name")
	 private String authername;

	 @Column(name = "publication_name")
	 private String publicationname;

	 @Column(name = "book_price")
	 private int price;

	 @Column(name = "book_stock")
	 private int stock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthername() {
		return authername;
	}

	public void setAuthername(String authername) {
		this.authername = authername;
	}

	public String getPublicationname() {
		return publicationname;
	}

	public void setPublicationname(String publicationname) {
		this.publicationname = publicationname;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", authername=" + authername + ", publicationname="
				+ publicationname + ", price=" + price + ", stock=" + stock + "]";
	}
	 
	 
}
