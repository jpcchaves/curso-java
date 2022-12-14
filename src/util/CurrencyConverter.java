package util;

public class CurrencyConverter {

	public static final double IOF = 6.0;

	public static double convertCurrency(double dollarPrice,
		double currencyAmount) {
		return (dollarPrice * currencyAmount)
			+ (dollarPrice * currencyAmount) * (IOF / 100.0);
	}

}
