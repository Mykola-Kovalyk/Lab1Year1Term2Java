package ua.lviv.lpnu.icta.iot.mykola.kovalyk.lab1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var gasMeter1 =  new GasMeter();
		var gasMeter2 =  new GasMeter(3.f, "VasyaGasMeter", 5.2f);
		var gasMeter3 =  new GasMeter(3.5f, "PetyaGasMeter", 10.3f, 5, 6, 7);
		
		
		
		
		System.out.println(gasMeter1);
		System.out.println(gasMeter2);
		System.out.println(gasMeter3);
		
		System.out.println("GasMeter energy consumption: " + GasMeter.getEnergyConsumptionInWatts());
	}

}

