package com.exercise42ws.model;

public class Invoice {
	private int idInvoice;
	private String nameClient;
	private int numberArticles;
	private double priceArticles;
	private double total;
	
	public Invoice() {
		
	}
	public Invoice(int idInvoice, String nameClient, int numberArticles, double priceArticles, double totalInvoice) {
		this.idInvoice = idInvoice;
		this.nameClient = nameClient;
		this.numberArticles = numberArticles;
		this.priceArticles = priceArticles;
		this.total = totalInvoice;
	}
	
	public void setInvoice(int idInvoice) {
		this.idInvoice = idInvoice;
	}
	public int getInvoice() {
		return this.idInvoice;
	}
	
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	public String getNameClient() {
		return this.nameClient;
	}
	
	
	public void setNumberArticles(int numberArticles) {
		this.numberArticles = numberArticles;
	}
	public int getNumberArticles() {
		return this.numberArticles;
	}
	
	public void setPriceArticles(double priceArticles) {
		this.priceArticles = priceArticles;
	}
	public double getPriceArticles() {
		return this.priceArticles;
	}
	
	public void setTotal(double totalInvoice) {
		this.total = totalInvoice;
	}
	public double getTotal() {
		return this.total;
	}
	public double CalculateTotal(int numberArticles, double priceArticles) {
		this.total = numberArticles * priceArticles;
		return this.total;
	}
	
}
