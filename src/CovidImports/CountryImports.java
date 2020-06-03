package CovidImports;

public class CountryImports {

	private double numberOfImports;
	private String country;
	
	public CountryImports() {
		numberOfImports = 0;
		country = "";
	}
	
	public CountryImports(double newNumberOfImports, String newCountry) {
		numberOfImports = newNumberOfImports;
		country = newCountry;
	}
//-----------gettersSetters-------------
	public double getNumberOfImports() {
		return numberOfImports;
	}

	public void setNumberOfImports(double newNumberOfImports) {
		numberOfImports = newNumberOfImports;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String newCountry) {
		country = newCountry;
	}
	

}
