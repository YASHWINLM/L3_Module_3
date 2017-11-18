package abstract_classes.cities;

public class LosAngeles extends City{

	public LosAngeles() {
		super(2000, 0.4);
		// TODO Auto-generated constructor stub
	}

	@Override
	double getAnnualTaxes() {
		// TODO Auto-generated method stub
		return (growthRate/2)*population;
	}

}
