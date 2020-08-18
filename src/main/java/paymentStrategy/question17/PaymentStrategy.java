package paymentStrategy.question17;

public interface PaymentStrategy {

	static double pay(double amount, String paymentType) {
		double serviceCharge = 5.00;
		double creditCardFee = 0.0;
		if (paymentType.equals("creditCard"))
			creditCardFee = 10.00;

		double totalPayment = amount + serviceCharge + creditCardFee;
		System.out.println("Transaction Performed through "+paymentType+" Total amount:"+totalPayment);
		return totalPayment;
	}
}
