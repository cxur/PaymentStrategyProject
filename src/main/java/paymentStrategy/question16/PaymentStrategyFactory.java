package paymentStrategy.question16;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentStrategyFactory {

	public OldWayPaymentStrategy getPaymentStrategy(String paymentStrategy) {

		Map<String, Supplier<OldWayPaymentStrategy>> map = new HashMap<>();

		map.put("CreditCard", CreditCardStrategy::new);
		map.put("Cash", CashPaymentStrategy::new);

		Supplier<OldWayPaymentStrategy> paymentStrategySupplier = map.get(paymentStrategy);

		if (paymentStrategySupplier != null) {
			return paymentStrategySupplier.get();
		}
		return null;
	}
}
