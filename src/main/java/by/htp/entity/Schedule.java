package by.htp.entity;

import java.util.ArrayList;
import java.util.List;

public class Schedule {

	private List<Flight> schedule;
	
	public Schedule()
	{
		schedule = new ArrayList<Flight>();
	}
	
	public List<Flight> getSchedule()
	{
		return schedule;
	}
	
	public void addSchedule(Flight flight)
	{
		schedule.add(flight);
	}
	public void display()
	{
		for(Flight flight : schedule)
		{
			System.out.println(flight);
		}
	}
}
