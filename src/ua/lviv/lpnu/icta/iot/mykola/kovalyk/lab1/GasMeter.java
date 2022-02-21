package ua.lviv.lpnu.icta.iot.mykola.kovalyk.lab1;

public record GasMeter(float nominalDistanceInMillimeters, String name, float maxVolumeConsumpltion, float width, float height, float length) {
	
	private static final float energyConsumptionInWatts = 5.f;
	
	
	
	public GasMeter()
	{
		this(2.5f, "DefaultGasMeter", 5.5f);
	}
	
	public GasMeter(float nominalDistanceInMillimeters, String name, float maxVolumeConsumpltion)
	{
		this(nominalDistanceInMillimeters, name, maxVolumeConsumpltion, 1.f, 2.f, 3.f);
	}
	
	
	
	public String toString() { 
		return 
			"GasMeter: "
			+ "\n\tname: " + name 
			+ "\n\tnominalDistanceInMillimeters: " + nominalDistanceInMillimeters
			+ "\n\tmaxVolumeConsumpltion: " + maxVolumeConsumpltion
			+ "\n\tdimensions: x - " + width + " y - " + length + " z - " + height; 
	}	
	
	
	
	public static float getEnergyConsumptionInWatts()
	{
		return energyConsumptionInWatts;
	}
}
