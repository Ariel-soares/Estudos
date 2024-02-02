package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	
	private int number;
	private LocalDate due;
	private Double totalValue;
	
	private List<Installment> installments = new ArrayList<>();
	
	public Contract() {
	}

	public Contract(int number, LocalDate due, Double totalValue) {
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

	public LocalDate getDue() {
		return due;
	}

	public void setDue(LocalDate due) {
		this.due = due;
	}

	public Double getTotalValue() {
		return totalValue;
	}


	public List<Installment> getInstallments() {
		return installments;
	}

}
