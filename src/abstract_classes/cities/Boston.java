package abstract_classes.cities;

public class Boston extends City {

	public Boston() {
		super(3000, 0.1);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return (0.5*population)*growthRate;
	}

}
