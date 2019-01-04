package currencyConverter;

/**
 * Class responsible for all information about determined Currency
 * @author usuario
 *
 */
public class InformationCurrency {
	
	private String labelOriginalCurreny;
	private String labelDestinyCurrency;
	private Double ratio;
	
	
	public InformationCurrency(String labelOriginalCurreny, String lableDestinyCurrency, Double ratio) {
		super();
		this.labelOriginalCurreny = labelOriginalCurreny;
		this.labelDestinyCurrency = lableDestinyCurrency;
		this.ratio = ratio;
	}

	public String getLabelOriginalCurreny() {
		return labelOriginalCurreny;
	}


	public void setLabelOriginalCurreny(String labelOriginalCurreny) {
		this.labelOriginalCurreny = labelOriginalCurreny;
	}


	public String getLabelDestinyCurrency() {
		return labelDestinyCurrency;
	}

	public void setLabelDestinyCurrency(String labelDestinyCurrency) {
		this.labelDestinyCurrency = labelDestinyCurrency;
	}

	public Double getRatio() {
		return ratio;
	}


	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}
}