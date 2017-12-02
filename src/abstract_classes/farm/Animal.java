package abstract_classes.farm;

public abstract class Animal {
	protected String noise;
	protected boolean isAlive;
	
	public Animal(String noise, boolean isAlive){
		this.noise=noise;
		this.isAlive=isAlive;
		
	}
	
	public String getNoise() {
		return noise;
	}

	public void setNoise(String noise) {
		this.noise = noise;
	}

	public boolean isAlive() {
		return isAlive;
	}

	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}

	public abstract String makeNoise(); 
	
	public boolean vivir() {
		
		return isAlive;
	}
		
		
		
	
}
