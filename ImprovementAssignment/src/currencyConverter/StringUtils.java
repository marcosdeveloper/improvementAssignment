package currencyConverter;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * This class helps with the options list when starts the process and there are some methods to work with Strings which validates the Strings.
 * @author Marcos.
 *
 */
public class StringUtils {
	
	private static final String CONSTANT_TRACE = " - ";
	private static final String CONSTANT_TO = " to ";
	
	private static final String CONSTANT_1 = "1";
	private static final String CONSTANT_2 = "2";
	private static final String CONSTANT_3 = "3";
	private static final String CONSTANT_4 = "4";
	private static final String CONSTANT_5 = "5";
	private static final String CONSTANT_6 = "6";
	private static final String CONSTANT_7 = "7";
	private static final String CONSTANT_8 = "8";
	private static final String CONSTANT_9 = "9";
	private static final String CONSTANT_10 = "10";
	private static final String CONSTANT_11 = "11";
	private static final String CONSTANT_12 = "12";
	private static final String CONSTANT_13 = "13";
	private static final String CONSTANT_14 = "14";
	private static final String CONSTANT_15 = "15";
	private static final String CONSTANT_16 = "16";
	private static final String CONSTANT_17 = "17";
	private static final String CONSTANT_18 = "18";
	private static final String CONSTANT_19 = "19";
	private static final String CONSTANT_20 = "20";
	
	private static final String CAD = "CAD";
	private static final String USD = "USD";
	private static final String EUR = "EUR";
	private static final String BRL = "BRL";
	private static final String MXN = "MXN";
	private static final String KRW = "KRW";
	private static final String CNY = "CNY";
	private static final String GBP = "GBP";
	private static final String PHP = "PHP";
	private static final String AUD = "AUD";
	private static final String NZD = "NZD";
	
	private static final String USD_CAD = CONSTANT_1 + CONSTANT_TRACE + USD + CONSTANT_TO + CAD;
	private static final String CAD_USD = CONSTANT_2 + CONSTANT_TRACE + CAD + CONSTANT_TO + USD;
	private static final String CAD_EUR = CONSTANT_3 + CONSTANT_TRACE + CAD + CONSTANT_TO + EUR;
	private static final String EUR_CAD = CONSTANT_4 + CONSTANT_TRACE + EUR + CONSTANT_TO + CAD;
	private static final String CAD_BRL = CONSTANT_5 + CONSTANT_TRACE + CAD + CONSTANT_TO + BRL;
	private static final String BRL_CAD = CONSTANT_6 + CONSTANT_TRACE + BRL + CONSTANT_TO + CAD;
	private static final String CAD_MXN = CONSTANT_7 + CONSTANT_TRACE + CAD + CONSTANT_TO + MXN;
	private static final String MXN_CAD = CONSTANT_8 + CONSTANT_TRACE + MXN + CONSTANT_TO + CAD;
	private static final String CAD_KRW = CONSTANT_9 + CONSTANT_TRACE + CAD + CONSTANT_TO + KRW;
	private static final String KRW_CAD = CONSTANT_10 + CONSTANT_TRACE + KRW + CONSTANT_TO + CAD;
	private static final String CAD_CNY = CONSTANT_11 + CONSTANT_TRACE + CAD + CONSTANT_TO + CNY;
	private static final String CNY_CAD = CONSTANT_12 + CONSTANT_TRACE + CNY + CONSTANT_TO + CAD;
	private static final String CAD_GBP = CONSTANT_13 + CONSTANT_TRACE + CAD + CONSTANT_TO + GBP;
	private static final String GBP_CAD = CONSTANT_14 + CONSTANT_TRACE + GBP + CONSTANT_TO + CAD;
	private static final String CAD_PHP = CONSTANT_15 + CONSTANT_TRACE + CAD + CONSTANT_TO + PHP;
	private static final String PHP_CAD = CONSTANT_16 + CONSTANT_TRACE + PHP + CONSTANT_TO + CAD;
	private static final String CAD_AUD = CONSTANT_17 + CONSTANT_TRACE + CAD + CONSTANT_TO + AUD;
	private static final String AUD_CAD = CONSTANT_18 + CONSTANT_TRACE + AUD + CONSTANT_TO + CAD;
	private static final String CAD_NZD = CONSTANT_19 + CONSTANT_TRACE + CAD + CONSTANT_TO + NZD;
	private static final String NZD_CAD = CONSTANT_20 + CONSTANT_TRACE + NZD + CONSTANT_TO + CAD;
	
	private static final List<String> optionList = new ArrayList<>();
	
	/**
	 * Responsible for create the list of options when the process starts.
	 */
	public static void createOptionList () {
		optionList.add(USD_CAD);
		optionList.add(CAD_USD);
		optionList.add(CAD_EUR);
		optionList.add(EUR_CAD);
		optionList.add(CAD_BRL);
		optionList.add(BRL_CAD);
		optionList.add(CAD_MXN);
		optionList.add(MXN_CAD);
		optionList.add(CAD_KRW);
		optionList.add(KRW_CAD);
		optionList.add(CAD_CNY);
		optionList.add(CNY_CAD);
		optionList.add(CAD_GBP);
		optionList.add(GBP_CAD);
		optionList.add(CAD_PHP);
		optionList.add(PHP_CAD);
		optionList.add(CAD_AUD);
		optionList.add(AUD_CAD);
		optionList.add(CAD_NZD);
		optionList.add(NZD_CAD);
	}
	
	/**
	 * Responsible for only work Off the option list each time
	 */
	public static void workOffOptionList() {
		for (String option : optionList) {
			System.out.println(option);
		}
	}
	
	/**
	 * This method checks if the typed number is between 1 and 20 (the total of options when the process runs). Use of Regex.
	 * @param option
	 * @return
	 */
	public static boolean isInTheRangeOption (String option) {
		boolean isInTheRangeOption = false;
		if (option.matches("^(2[0]|1[0-9]|[1-9])$")) {
			isInTheRangeOption = true;
		}
		return isInTheRangeOption;
	}
	
	/**
	 * This method checks if the value put in "amount" is correct. Don't have letters and other unforeseen characters.
	 * @param option
	 * @return
	 */
	public static boolean isCurrencyValue (String option) {
		boolean isCurrencyValue = false;
		if (option.matches("^[0-9]*[.]{0,1}[0-9]*$")) {
			isCurrencyValue = true;
		}
		return isCurrencyValue;
	}
	
	/**
	 * This method has the Ratio Option according to the choice
	 * @return
	 */
	public static HashMap<String, InformationCurrency> getOptionRatio () {
		HashMap<String, InformationCurrency> optionMap = new HashMap<String, InformationCurrency>();
		optionMap.put(CONSTANT_1, new InformationCurrency(USD, CAD, 1.31));
		optionMap.put(CONSTANT_2, new InformationCurrency(CAD, USD, 0.77));
		optionMap.put(CONSTANT_3, new InformationCurrency(CAD, EUR, 0.65));
		optionMap.put(CONSTANT_4, new InformationCurrency(EUR, CAD, 1.55));
		optionMap.put(CONSTANT_5, new InformationCurrency(CAD, BRL, 2.85));
		optionMap.put(CONSTANT_6, new InformationCurrency(BRL, CAD, 0.35));
		optionMap.put(CONSTANT_7, new InformationCurrency(CAD, MXN, 14.73));
		optionMap.put(CONSTANT_8, new InformationCurrency(MXN, CAD, 0.068));
		optionMap.put(CONSTANT_9, new InformationCurrency(CAD, KRW, 831.57));
		optionMap.put(CONSTANT_10, new InformationCurrency(KRW, CAD, 0.0012));
		optionMap.put(CONSTANT_11, new InformationCurrency(CAD, CNY, 5.10));
		optionMap.put(CONSTANT_12, new InformationCurrency(CNY, CAD, 0.20));
		optionMap.put(CONSTANT_13, new InformationCurrency(CAD, GBP, 0.58));
		optionMap.put(CONSTANT_14, new InformationCurrency(GBP, CAD, 1.71));
		optionMap.put(CONSTANT_15, new InformationCurrency(CAD, PHP, 39.42));
		optionMap.put(CONSTANT_16, new InformationCurrency(PHP, CAD, 0.025));
		optionMap.put(CONSTANT_17, new InformationCurrency(CAD, AUD, 1.04));
		optionMap.put(CONSTANT_18, new InformationCurrency(AUD, CAD, 0.96));
		optionMap.put(CONSTANT_19, new InformationCurrency(CAD, NZD, 1.09));
		optionMap.put(CONSTANT_20, new InformationCurrency(NZD, CAD, 0.91));
		
		return optionMap;
	}
}
