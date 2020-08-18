package paymentStrategy.question16;

import java.util.function.Supplier;

public class MainQuestion16 {

	public static void main(String[] args) {
		Supplier<PaymentStrategyFactory> paymentStrategyFactory = PaymentStrategyFactory::new;

		OldWayPaymentStrategy creditCardPayment = paymentStrategyFactory.get().getPaymentStrategy("CreditCard");
		OldWayPaymentStrategy cashPayment = paymentStrategyFactory.get().getPaymentStrategy("Cash");

		cashPayment.pay(50);
		creditCardPayment.pay(100);

	}

}
