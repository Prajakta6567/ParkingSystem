package comp.design.parkingsystem;

import java.io.Serializable;
import java.math.BigDecimal;
//import java.util.Currency;

public final class Money implements Serializable {
    private static final long serialVersionUID = 1L;
	private static final BigDecimal oneHundred = new BigDecimal(100);

    public static final Money ZERO = new Money();

    public BigDecimal currencyUnit;

    // TODO: If we support multiple currencies.
    //public Currency currency;

    public Money() {
        this(0L);
    }


    public Money(BigDecimal amount) {
        currencyUnit = amount;
    }

    private Money(long pennies) {
        currencyUnit = new BigDecimal(pennies);
    }

    public double toDouble() {
        return currencyUnit.doubleValue();
    }

    public static Money fromString(String s) {
        // take "$50.23" and make a money object from it.
    	// TODO: Parse other currencies.
        s = s.trim();
        if (s.charAt(0) == '$') {
            s = s.substring(1);
        }
        return new Money(new BigDecimal(Double.parseDouble(s) * 100));
    }

    public Money add(Money other) {
        return new Money(currencyUnit.add(other.currencyUnit));
    }

    // DRY principle -- don't repeat yourself. Copy-and-paste
    // with edits is a code smell.
    public Money subtract(Money other) {
        return this.add(other.negate());
    }

    public Money negate() {
        return new Money(currencyUnit.negate());
    }

    public Money multiply(double factor) {
        return new Money(currencyUnit.multiply(new BigDecimal(factor)));
    }

    public Money divide(double divisor) {
        return new Money(currencyUnit.divide(new BigDecimal(divisor)));
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d",
        		currencyUnit.divide(oneHundred),
        		currencyUnit.remainder(oneHundred));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }
        return this.equals((Money)obj);
    }

    public boolean equals(Money other) {
        return this.currencyUnit == other.currencyUnit;
    }
}
