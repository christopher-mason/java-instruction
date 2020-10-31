package mason.business;

public class Conversion {

	// Fields
	private String fromUnit;
	private double fromValue;
	private String toUnit;
	private double conversionRatio;
	
	//Constructors
	public Conversion() {
		fromUnit = "";
		fromValue = 0.0;
		toUnit = "";
		conversionRatio = 0.0;
	}
	
	public Conversion(String fromUnit, double fromValue, String toUnit, double conversionRatio ) {
		this.fromUnit = fromUnit;
		this.fromValue = fromValue;
		this.toUnit = toUnit;
		this.conversionRatio = conversionRatio;
	}

	public String getFromUnit() {
		return fromUnit;
	}

	public void setFromUnit(String fromUnit) {
		this.fromUnit = fromUnit;
	}

	public double getFromValue() {
		return fromValue;
	}

	public void setFromValue(double fromValue) {
		this.fromValue = fromValue;
	}

	public String getToUnit() {
		return toUnit;
	}

	public void setToUnit(String toUnit) {
		this.toUnit = toUnit;
	}

	public double getConversionRatio() {
		return conversionRatio;
	}

	public void setConversionRatio(double conversionRatio) {
		this.conversionRatio = conversionRatio;
	}
	
	public double getToValue() {
		return fromValue * conversionRatio;
	} 
	
	@Override
	public String toString() {
		String str = fromUnit + " to " + toUnit + ": " + conversionRatio;
		return str;
	}
}

