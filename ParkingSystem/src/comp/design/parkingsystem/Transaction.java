package comp.design.parkingsystem;

import java.math.BigInteger;
import java.sql.Date;

public class Transaction {

	BigInteger id;
	public Date time;
	public Money amount;
	public double tax;
	public BigInteger
		accountNumber,
		routingNumber;

	public Money total () { return new Money(); }
}
