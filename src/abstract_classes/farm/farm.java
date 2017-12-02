package abstract_classes.farm;

import java.util.ArrayList;

import abstract_classes.cities.City;

public class farm {
public static void main(String[] args) {
	ArrayList<Animal> farm = new ArrayList<Animal>();
	pig pig= new pig("oink",true);
	cow cow = new cow("moo", true);
	horse horse= new horse("neigh", false);
	horse otherHorse= new horse("neigh", false);
	chicken chicken = new chicken("cluck", true);
	cow woc = new cow("moo", true);
	
	
	farm.add(chicken);
	farm.add(horse);
	farm.add(cow);
	farm.add(pig);
	farm.add(woc);
	farm.add(otherHorse);
	
	for (Animal animal : farm) {
		animal.makeNoise();
		animal.vivir();
	}
}
}
