package entities;

import java.util.Date;
import java.util.List;

public class Contract {
	
	private int number;
	private Date due;
	private Double totalValue;
	
	private List<Installment> installments;
	
	public Contract() {
	}

	public Contract(int number, Date due, Double totalValue) {
		this.number = number;
		this.due = due;
		this.totalValue = totalValue;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getDue() {
		return due;
	}

	public void setDue(Date due) {
		this.due = due;
	}

	public Double getTotalValue() {
		return totalValue;
	}


	public List<Installment> getInstallments() {
		return installments;
	}

	public void addInstallment(Installment installment) {
		this.installments.add(installment);
	}
}
