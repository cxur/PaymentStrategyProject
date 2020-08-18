package paymentStrategy.question16;

public class CashPaymentStrategy implements OldWayPaymentStrategy {

	@Override
	public double pay(double amount) {
		System.out.println("paid using CASH " +amount);
		return amount;
	}

}
