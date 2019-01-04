package currencyConverter;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * Class responsible for starts the process.
 * @author Marcos
 *
 */
public class CurrencyConverterDemo {
	
	public static void main(String[] args) throws IOException {
		
		StringUtils.createOptionList();
		HashMap<String, InformationCurrency> optionRatioMap = StringUtils.getOptionRatio();
		
		while(true) {
			System.out.println("Currency Conversions:");
			StringUtils.workOffOptionList();
			System.out.println("Enter option:");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine().trim();
			
			if (! s.equals("") && StringUtils.isInTheRangeOption(s)) {
				
				System.out.println("Enter amount:");
				String amount = br.readLine().trim();
					
				if (StringUtils.isCurrencyValue(amount)) {
					InformationCurrency informationCurrency = optionRatioMap.get(s);
					CalculateCurrency calculateCurrency = new CalculateCurrency(informationCurrency, Double.parseDouble(amount));
					calculateCurrency.calculate();
				} else {
					System.out.println("Invalid Number");
				}
			} else {
				System.out.println("Incorrect menu option " + s);
			}
			
			System.out.println(" ");
		}
	}
}