package ua.lviv.lpnu.icta.iot.mykola.kovalyk.lab1;

public record GasMeter(float nominalDistanceInMillimeters, String name, float maxVolumeConsumpltion) {
	
	private static float width = 1.f;
	private static float height = 2.f;
	private static float length = 3.f;
	
	
	
	public GasMeter()
	{
		this(2.5f, "DefaultGasMeter", 5.5f);
	}
	
	public GasMeter(float nominalDistanceInMillimeters, String name, float maxVolumeConsumpltion)
	{
		System.out.println("This is a chained constructor!");
		
		this.nominalDistanceInMillimeters = nominalDistanceInMillimeters;
		this.maxVolumeConsumpltion = maxVolumeConsumpltion;
		this.name = name;
	}
	
	
	
	public String toString() { 
		return 
			"GasMeter: "
			+ "\n\tname: " + name 
			+ "\n\tnominalDistanceInMillimeters: " + nominalDistanceInMillimeters
			+ "\n\tmaxVolumeConsumpltion: " + maxVolumeConsumpltion; 
	}	
	
	
	
	public static float[] getDimensions()
	{
		return new float[]{width, height, length};
	}
}
