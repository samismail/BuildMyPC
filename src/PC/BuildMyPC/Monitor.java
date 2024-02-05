package PC.BuildMyPC;

/** Acer - Nitro XZ320Q P3bmiiphx 31.5”
 * LED Curved FHD FreeSync Premium Monitor - Black
 */

public class Monitor {

    // manufacture - string
    // model
    // resolution - resolution
    // sreensize - double
    // refresh rate - int

    private String manufacturer;
    private String model;
    private Resolution resolution;
    private double screenSize;
    private int refreshRate;

    public Monitor(String manufacturer, String model, Resolution resolution, double screenSize, int refreshRate) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.resolution = resolution;
        this.screenSize = screenSize;
        this.refreshRate = refreshRate;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Resolution getResolution() {
        return resolution;
    }

    public void setResolution(Resolution resolution) {
        this.resolution = resolution;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRefreshRate() {
        return refreshRate;
    }

    public void setRefreshRate(int refreshRate) {
        this.refreshRate = refreshRate;
    }
}
