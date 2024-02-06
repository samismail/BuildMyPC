package PC.BuildMyPC;

/** ASUS - ROG MAXIMUS Z790 HERO (Socket LGA 1700) USB 3.2 Intel Motherboard
 * Model - ROG MAXIMUS Z790 HERO
 * Form Factor - ATX
 * Processor Socket - Socket LGA 1700
 * Operating System Compatibility - Windows 10, Windows 11 Home
 * Number Of PCI Slots - 6
 * Number Of Memory Slots - 4
 * Maximum Memory Supported - 128 gigabytes
 */

public class Motherboard {
    private String brand;
    private String model;
    private String formFactor;
    private String processorSocket;
    private String  compatibleOS;
    private int pciSlots;
    private int ramSlots;
    private int maxRAM;

    public Motherboard(String brand, String model, String formFactor, String processorSocket, String compatibleOS, int pciSlots, int ramSlots, int maxRAM) {
        this.brand = brand;
        this.model = model;
        this.formFactor = formFactor;
        this.processorSocket = processorSocket;
        this.compatibleOS = compatibleOS;
        this.pciSlots = pciSlots;
        this.ramSlots = ramSlots;
        this.maxRAM = maxRAM;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFormFactor() {
        return formFactor;
    }

    public void setFormFactor(String formFactor) {
        this.formFactor = formFactor;
    }

    public String getProcessorSocket() {
        return processorSocket;
    }

    public void setProcessorSocket(String processorSocket) {
        this.processorSocket = processorSocket;
    }

    public String getCompatibleOS() {
        return compatibleOS;
    }

    public void setCompatibleOS(String compatibleOS) {
        this.compatibleOS = compatibleOS;
    }

    public int getPciSlots() {
        return pciSlots;
    }

    public void setPciSlots(int pciSlots) {
        this.pciSlots = pciSlots;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public void setRamSlots(int ramSlots) {
        this.ramSlots = ramSlots;
    }

    public int getMaxRAM() {
        return maxRAM;
    }

    public void setMaxRAM(int maxRAM) {
        this.maxRAM = maxRAM;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + '\n' +
                "Model: " + model + '\n' +
                "Form Factor: " + formFactor + '\n' +
                "Processor Socket: " + processorSocket + '\n' +
                "Compatible OS: " + compatibleOS + '\n' +
                "Number of PCI Slots: " + pciSlots + '\n' +
                "Number of RAM Slots: " + ramSlots + '\n' +
                "Max RAM: " + maxRAM + "GB";
    }
}
