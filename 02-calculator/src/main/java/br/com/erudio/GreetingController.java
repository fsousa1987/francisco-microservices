package br.com.erudio;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
public class GreetingController {

	private static final String template = "Hello, %s!";
	private final AtomicLong counter = new AtomicLong();

	@RequestMapping(value = "/sum/numberOne/numberTwo", method = RequestMethod.GET)
	public Double sum(@PathVariable("numberOne") String numberOne,
					  @PathVariable("numberTwo") String numberTwo) {
		return 1D;
	}
}
