package com.techelevator;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;

import com.techelevator.dao.JDBCParkDAO;
import com.techelevator.dao.ParkDAO;
import com.techelevator.model.Park;

public class CampgroundCLI {

	public static void main(String[] args) {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl("jdbc:postgresql://localhost:5432/campground");
		dataSource.setUsername("postgres");
		dataSource.setPassword("postgres1");
		
		CampgroundCLI application = new CampgroundCLI(dataSource);
		
		application.run();
	}
	
	private Menu menu;
	private ParkDAO parkDao;

	public CampgroundCLI(DataSource datasource) {
		menu = new Menu(System.in, System.out);
		parkDao = new JDBCParkDAO(datasource);
	}
	
	private static final String QUIT = "Quit";
	
	public void run() {
		while (true) {
			System.out.println("Select a Park for Further Details");
			List<Park> parks = parkDao.getAllParks();
			List<String> selections = new ArrayList<>();
			for (Park park : parks)
			{
				selections.add(park.getName());
			}
			selections.add(QUIT);
			String selection = (String)menu.getChoiceFromOptions(selections.toArray());
			
			if (QUIT.equals(selection))
			{
				break;
			}
			else
			{
				for (Park park : parks) {
					if (park.getName().equals(selection)) {
						showParkInfo(park);
					}
				}
			}
		}
	}

	private void showParkInfo(Park park) {
		// TODO Auto-generated method stub
		
	}
}
