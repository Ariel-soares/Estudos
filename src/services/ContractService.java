package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePaymentService ops;

	public ContractService() {
	}
	
	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}

	public void processContract(Contract contract, Integer months) {
		for(int i = 1; i <= months; i++) {
			Double interest = ops.interest(contract.getTotalValue()/months, i);
			Double payFee = ops.paymentFee(interest + contract.getTotalValue()/months);
			
			System.out.println("interest: " + interest);
			System.out.println("payFee: " + payFee);
			LocalDate dueDate = contract.getDue().plusMonths(i);
			
			contract.getInstallments().add(new Installment(dueDate, contract.getTotalValue()/months + interest + payFee));
		}	
	}
}
