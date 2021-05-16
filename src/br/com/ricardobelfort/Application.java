package br.com.ricardobelfort;

import java.time.LocalDate;

import br.com.ricardobelfort.entities.Advertisement;
import br.com.ricardobelfort.entities.Client;
import br.com.ricardobelfort.entities.Report;

public class Application {

	public static void main(String[] args) {
		Client client = new Client("Ricardo","rico@gmail.com");
		
		LocalDate endDate = LocalDate.now().plusDays(3);
		
		Advertisement adv = new Advertisement("Propaganda", client, LocalDate.now(), endDate, 100.00);
		Report report = adv.generateReport();
		report.printReport();

	}

}
