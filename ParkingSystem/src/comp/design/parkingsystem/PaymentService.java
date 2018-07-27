package comp.design.parkingsystem;

import java.math.BigInteger;

public class PaymentService {

	private String cardNumber;
	private BigInteger
	accountNumber,
	routingNumber;
	
	public class CreditCard {
	}

	public class PaymentInformation {
	}

	public boolean checkCardValidity(CreditCard card) {
		return false;
	}

	public Transaction makePayment(Reservation reservation, 
						PaymentInformation paymentInformation) {
		return new Transaction();
	}
}
