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

public class PCTester {
    public static void main(String[] args) {
        Dimension dimension = new Dimension(18.35,9.06,17.83);
        Case theCase = new Case("Corsair","4000D AIRFLOW ATX", "Steel, Glass, & Plastic",dimension);
        Monitor monitor = new Monitor("Acer", "Nitro XZ320Q", new Resolution(1920,1080),31.5,165);
        Motherboard motherboard = new Motherboard("ASUS","ROG MAXIMUS Z790 HERO", "ATX","Socket LGA 1700","Windows 10 & Windows 11 Home",6,4,128);
        PC myPC = new PC(theCase,monitor,motherboard);
        System.out.println(myPC);

    }

}
