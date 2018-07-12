package comp.design.parkingsystem;

import java.io.Serializable;

public final class Money implements Serializable {
    private static final long serialVersionUID = 1L;

    private final long pennies;

    public static final Money ZERO = new Money();

    public Money() {
        this(0L);
    }

    public Money(double dollars) {
        this((long)(Math.round(dollars * 100)));
    }

    private Money(long pennies) {
        this.pennies = pennies;
    }

    public double toDouble() {
        return pennies / 100.0;
    }

    public static Money fromString(String s) {
        // take "$50.23" and make a money object from it.
        s = s.trim();
        if (s.charAt(0) == '$') {
            s = s.substring(1);
        }
        return new Money(Double.parseDouble(s));
    }

    public Money add(Money other) {
        return new Money(this.pennies + other.pennies);
    }

    // DRY principle -- don't repeat yourself. Copy-and-paste
    // with edits is a code smell.
    public Money sub(Money other) {
        return this.add(other.negate());
    }

    public Money negate() {
        return new Money(-this.pennies);
    }

    public Money mul(double factor) {
        return new Money(this.pennies * factor / 100);
    }

    public Money div(double factor) {
        return this.mul(1 / factor);
    }

    @Override
    public String toString() {
        return String.format("$%d.%02d", pennies / 100, Math.abs(pennies % 100));
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Money)) {
            return false;
        }
        return this.equals((Money)obj);
    }

    public boolean equals(Money other) {
        return this.pennies == other.pennies;
    }
}