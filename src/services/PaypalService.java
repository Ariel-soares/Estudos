package services;

public class PaypalService implements OnlinePaymentService{
	
	public PaypalService() {
	}

	@Override
	public Double interest(Double amount, Integer month) {
		Double interest = (amount/100) * month;
		return interest;
	}
	
	@Override
	public Double paymentFee(Double amount) {
		return (amount / 100) * 2;
	}
	
}
