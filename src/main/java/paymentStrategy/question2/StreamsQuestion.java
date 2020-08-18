package paymentStrategy.question2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsQuestion {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4);
		
		list.stream().filter(number -> number % 2 == 0).
				collect(Collectors.toList()).forEach(System.out::println);
	}

}
