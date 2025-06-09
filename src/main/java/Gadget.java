package yesodot;

public class DigitalGadget {
    private String modelName;
    private int batteryLifeHours;
    private int price;
    
    public DigitalGadget(String modelName, int batteryLifeHours, int price) {
        this.modelName = modelName;
        this.batteryLifeHours = batteryLifeHours;
        this.price = price;
    }
    
    public String getModelName() {
        return modelName;
    }

    public int getBatteryLifeHours() {
        return batteryLifeHours;
    }

    public int getPrice() {
        return price;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setBatteryLifeHours(int batteryLifeHours) {
        this.batteryLifeHours = batteryLifeHours;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public boolean isPremium() {
    	if (batteryLifeHours>10 && price> 500)
    		return true;
    	return false;
	
    }
    
    
}
