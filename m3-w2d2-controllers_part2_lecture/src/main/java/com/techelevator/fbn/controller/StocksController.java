package com.techelevator.fbn.controller;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.techelevator.fbn.model.DollarAmount;
import com.techelevator.fbn.model.Stock;

@Controller
@RequestMapping("/fbn")
@SessionAttributes("stocks")
public class StocksController {
	@RequestMapping(path={"/stocks"}, method=RequestMethod.GET)
	public String showStocksPage(ModelMap map){
		List<Stock> stocks = getStocks();
		
		map.put("stocks", stocks);
		
		return "fbn/stocksLandingPage";
	}
	
	@RequestMapping(path={"/stockPurchase"}, method=RequestMethod.GET)
	public String buyStockForm(){
		return "fbn/stocksPurchasePage";
	}
	
	@RequestMapping(path={"/stockPurchase"}, method=RequestMethod.POST)
	public String buyStock(@RequestParam String ticker, @RequestParam int shares){
		System.out.println("You bought " + shares + " shares of " + ticker + "!");
		return "fbn/stocksLandingPage";
	}
	
	private List<Stock> getStocks() {
		List<Stock> stocks = new ArrayList<Stock>();
		
		Stock stock = new Stock();
		stock.setTicker("AAPL");
		stock.setName("Apple Inc.");
		stock.setPrice(new DollarAmount(16998));
		stock.setChange(-0.17f);
		stocks.add(stock);
		
		stock = new Stock();
		stock.setTicker("GOOG");
		stock.setName("Alphabet Inc.");
		stock.setPrice(new DollarAmount(101838));
		stock.setChange(-0.71f);
		stocks.add(stock);
		
		stock = new Stock();
		stock.setTicker("MSFT");
		stock.setName("Microsoft Corporation");
		stock.setPrice(new DollarAmount(8253));
		stock.setChange(+0.13f);
		stocks.add(stock);
		
		stock = new Stock();
		stock.setTicker("CSCO");
		stock.setName("Cisco Systems, Inc.");
		stock.setPrice(new DollarAmount(3650));
		stock.setChange(+0.60f);
		stocks.add(stock);
		
		stock = new Stock();
		stock.setTicker("TSLA");
		stock.setName("Tesla, Inc.");
		stock.setPrice(new DollarAmount(30874));
		stock.setChange(-6.31f);
		stocks.add(stock);
		
		stock = new Stock();
		stock.setTicker("NFLX");
		stock.setName("NFLX");
		stock.setPrice(new DollarAmount(19410));
		stock.setChange(+0.90f);
		stocks.add(stock);

		/*		Yahoo quote system is dead
  
		String queryUrl = "http://finance.yahoo.com/d/quotes.csv?s=AAPL+GOOG+MSFT+CSCO+TSLA+NFLX&f=snabc1";

		try {
			URLConnection connection = new URL(queryUrl).openConnection();
			connection.setRequestProperty("Accept-Charset", "UTF-8");
			InputStream response = connection.getInputStream();
			
			Scanner input = new Scanner(response);
			while(input.hasNextLine()) {
				Stock stock = new Stock();
				
				String line = input.nextLine();
				String[] nameParts = line.split("\"");
				
				stock.setTicker(nameParts[1]);
				stock.setName(nameParts[3]);
				
				String[] parts = nameParts[4].split(",");
				
				if(!parts[1].equals("N/A")) {
					String[] priceParts = parts[1].split("\\.");
					int dollars = Integer.parseInt(priceParts[0]);
					int cents = Integer.parseInt(priceParts[1].substring(0, 2));
					DollarAmount price = new DollarAmount(dollars * 100 + cents);
					stock.setPrice(price);
				}
				
				if(!parts[3].equals("N/A")) {
					float change = Float.parseFloat(parts[3]);
					stock.setChange(change);
				}
				
				stocks.add(stock);
			}
			input.close();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		
		return stocks;
	}
}
