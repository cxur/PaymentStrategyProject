package paymentStrategy.question16;

public class CreditCardStrategy implements OldWayPaymentStrategy {

	@Override
	public double pay(double amount) {
		System.out.println("paid using CREDIT CARD " +amount);
		return amount;
	}

}
