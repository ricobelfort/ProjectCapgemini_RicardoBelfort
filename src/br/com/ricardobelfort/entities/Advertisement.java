package br.com.ricardobelfort.entities;


import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Advertisement {
	
	private String name;
	private Client client;
	private LocalDate startDay;
	private LocalDate endDay;
	private Double investmentPerDay;
	
	public Advertisement(String name, Client client, LocalDate startDay, LocalDate endDay, Double investmentPerDay) {
		super();
		this.name = name;
		this.client = client;
		this.startDay = startDay;
		this.endDay = endDay;
		this.investmentPerDay = investmentPerDay;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public LocalDate getStartDay() {
		return startDay;
	}

	public void setStartDay(LocalDate startDay) {
		this.startDay = startDay;
	}

	public LocalDate getEndDay() {
		return endDay;
	}

	public void setEndDay(LocalDate endDay) {
		this.endDay = endDay;
	}

	public Double getInvestmentPerDay() {
		return investmentPerDay;
	}

	public void setInvestmentPerDay(Double investmentPerDay) {
		this.investmentPerDay = investmentPerDay;
	}
	
	public Report generateReport() {
       	
		long daysBetween = ChronoUnit.DAYS.between(startDay, endDay);

		double totalAppliedValue = investmentPerDay * daysBetween;
        double originalViews = totalAppliedValue * 30; 

        int maximumSharing = 4; 
        double auxViews = originalViews; 
        double sumViewsFromShared = 0;
        double sumClicks = 0;
        double sumSharedAdv = 0;
        int i = 0;

        while (i < maximumSharing) {
        	double clickedAdv = (auxViews / 100) * 12;
            double sharedAdv = (clickedAdv / 20) * 3; 
            double newViews = sharedAdv * 40;
            
            sumViewsFromShared += newViews;
            sumClicks += clickedAdv;
            sumSharedAdv += sharedAdv;
            i++;
            auxViews = newViews;
        }

        double finalViews = originalViews + sumViewsFromShared;
        return new Report(totalAppliedValue,finalViews,sumClicks,sumSharedAdv);
	}
	
}

