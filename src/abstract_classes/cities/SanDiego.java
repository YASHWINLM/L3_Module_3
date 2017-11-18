package abstract_classes.cities;

public class SanDiego extends City {

	public SanDiego() {
		super(1000, 0.5);
		
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return growthRate*population+1_000_000;
	}

}
