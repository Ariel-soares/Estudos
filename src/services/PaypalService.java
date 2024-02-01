package services;

public class PaypalService implements OnlinePaymentService{

	@Override
	public Double interest(Double amount, Integer month) {
		return (amount/100) * month;
	}
	
	@Override
	public Double paymentFee(Double amount) {
		return (amount / 100) * 2;
	}
	
}
