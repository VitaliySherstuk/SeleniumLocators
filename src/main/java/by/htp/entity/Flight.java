package by.htp.entity;

import java.util.ArrayList;

public class Flight {
	
	private String data;
	private ArrayList timeDeparture;
	private ArrayList timeArrive;
	private ArrayList costEconomy;
	
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public ArrayList getTimeDeparture() {
		return timeDeparture;
	}
	public void setTimeDeparture(ArrayList timeDeparture) {
		this.timeDeparture = timeDeparture;
	}
	public ArrayList getTimeArrive() {
		return timeArrive;
	}
	public void setTimeArrive(ArrayList timeArrive) {
		this.timeArrive = timeArrive;
	}
	public ArrayList getCostEconomy() {
		return costEconomy;
	}
	public void setCostEconomy(ArrayList costEconomy) {
		this.costEconomy = costEconomy;
	}
	@Override
	public String toString() {
		return "Дата вылета: "+data+ " "+ "Время вылета: "+timeDeparture+" "+"Время прилета: "+timeArrive+"Стоимость econom: "+costEconomy;
	}
	
}
