package br.com.ricardobelfort.entities;

public class Report {
	
	private double totalInvestedValue;
	private double maxViews;
	private double maxClicks;
	private double maxShared;
	
	public Report(double totalInvestedValue, double maxViews, double maxClicks, double maxShared) {
		super();
		this.totalInvestedValue = totalInvestedValue;
		this.maxViews = maxViews;
		this.maxClicks = maxClicks;
		this.maxShared = maxShared;
	}

	public double getTotalInvestedValue() {
		return totalInvestedValue;
	}

	public void setTotalInvestedValue(double totalInvestedValue) {
		this.totalInvestedValue = totalInvestedValue;
	}

	public double getMaxViews() {
		return maxViews;
	}

	public void setMaxViews(double maxViews) {
		this.maxViews = maxViews;
	}

	public double getMaxClicks() {
		return maxClicks;
	}

	public void setMaxClicks(double maxClicks) {
		this.maxClicks = maxClicks;
	}

	public double getMaxShared() {
		return maxShared;
	}

	public void setMaxShared(double maxShared) {
		this.maxShared = maxShared;
	}
	
	public void printReport() {
		System.out.printf("Valor total investido: %.2f\n", totalInvestedValue);
		System.out.printf("Quantidade máxima de visualizações: %.2f\n", maxViews);
		System.out.printf("Quantidade máxima de cliques: %.2f\n", maxClicks);
		System.out.printf("Quantidade máxima de compartilhamentos: %.2f\n", maxShared);
	}
	
	

}
