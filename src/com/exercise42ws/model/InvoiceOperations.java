package com.exercise42ws.model;
import com.exercise42ws.model.Invoice;
public class InvoiceOperations {
	public double CalculateInvoiceTotal(Invoice invoice) {
		invoice.setTotal(invoice.getNumberArticles() * invoice.getPriceArticles());
		return invoice.getTotal();
	}
}
