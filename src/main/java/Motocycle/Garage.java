package Motocycle;

import java.util.*;

public class Garage {
	private List<Motorcycle> motorcycleList;
	Garage(){
		motorcycleList = new ArrayList<>();
	}
	public List<Motorcycle> getMotorcycleList(){
		return motorcycleList;
	}
	public void addMotorcycle(Motorcycle car){
		motorcycleList.add(car);
	}
}