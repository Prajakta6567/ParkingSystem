package comp.design.parkingsystem;

public class PaymentService {

	public class CreditCard {
	}

	public class PaymentInformation {
	}

	public boolean checkCardValidity(CreditCard card) {
		return false;
	}

	public Transaction makePayment(Reservation reservation, PaymentInformation paymentInformation) {
		return new Transaction();
	}
}
