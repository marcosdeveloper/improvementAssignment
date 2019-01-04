package currencyConverter;

/**
 * Class responsible for execute the calculus
 * @author usuario
 *
 */
public class CalculateCurrency {
	
	private Double ratio;
	private String labelOriginalCurreny;
	private String labelDestinyCurrency;
	private Double amount;
	
	public CalculateCurrency(InformationCurrency informationCurrency, Double amount) {
		super();
		this.ratio = informationCurrency.getRatio();
		this.labelOriginalCurreny = informationCurrency.getLabelOriginalCurreny();
		this.labelDestinyCurrency = informationCurrency.getLabelDestinyCurrency();
		this.amount = amount;
	}

	public void calculate() {
		System.out.println(amount + " " + this.labelOriginalCurreny + " is " + this.amount * this.ratio + " " + labelDestinyCurrency);
	}

	public Double getRatio() {
		return ratio;
	}

	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
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
}
