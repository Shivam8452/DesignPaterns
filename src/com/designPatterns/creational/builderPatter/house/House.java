package com.designPatterns.creational.builderPatter.house;

public class House {
	
	private String foundation;
	private String roof;
	private String Structure;
	private boolean hasSwimmingpool;
	private boolean hasGarage;
	private boolean hasGarden;
	
	private House(HouseBuilder builder) {
		this.foundation=builder.foundation;
		this.roof=builder.roof;
		this.Structure=builder.Structure;
		this.hasSwimmingpool=builder.hasSwimmingpool;
		this.hasGarage=builder.hasGarage;
		this.hasGarden=builder.hasGarden;
	}
	
	@Override
	public String toString() {
		return "House{ foundation: "+foundation+" roof: "+roof+" Structure: "+Structure+" hasGarage: "+hasGarage+" hasSwimming: "+hasSwimmingpool+" hasGarden: "+hasGarden;
	}
	
	public static class HouseBuilder{
		private String foundation;
		private String roof;
		private String Structure;
		private boolean hasSwimmingpool;
		private boolean hasGarage;
		private boolean hasGarden;
		
		public HouseBuilder(String foundation,String roof, String Structure) {
			this.foundation=foundation;
			this.roof=roof;
			this.Structure=Structure;
		}
		
		public HouseBuilder setHaspool(boolean hasSwimmingpool) {
			this.hasSwimmingpool=hasSwimmingpool;
			return this;
		}
		
		public HouseBuilder setHasGarage(boolean hasGarage) {
			this.hasGarage=hasGarage;
			return this;
		}
		
		public HouseBuilder setHasGarden(boolean hasGarden) {
			this.hasGarden=hasGarden;
			return this;
		}
		
		public House build() {
			return new House(this);
		}
	}

}
