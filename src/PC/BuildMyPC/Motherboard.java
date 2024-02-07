package PC.BuildMyPC;

/**
 * ASUS - ROG MAXIMUS Z790 HERO (Socket LGA 1700) USB 3.2 Intel Motherboard
 * Model:ROG MAXIMUS Z790 HEROSKU:6523718
 * Form Factor: ATX
 * Processor Socket: Socket LGA 1700
 * Operating System Compatibility: Windows 10, Windows 11 Home
 * Number Of PCI Slots: 6
 * Number Of Memory Slots: 4
 * Maximum Memory Supported: 128 gigabytes
 */
public class Motherboard {//
    private String model;
    private int PCI;
    private int memSlots;
    private int maxMem;


    public Motherboard(String model, int PCI, int memSlots, int maxMem) {
        this.model = model;
        this.PCI = PCI;
        this.memSlots = memSlots;
        this.maxMem = maxMem;
    }

    public String getModel() {
        return model;
    }

    public int getPCI() {
        return PCI;
    }

    public int getMemSlots() {
        return memSlots;
    }

    public int getMaxMem() {
        return maxMem;
    }
    
}


