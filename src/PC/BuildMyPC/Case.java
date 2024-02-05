package PC.BuildMyPC;

/** CORSAIR - 4000D AIRFLOW ATX MidTower Case - Black
 *Product Height 18.35 inches
 * Product Width 9.06 inches
 * Product Depth 17.83 inches
 * Case Material Steel, Glass, Plastic
 */
public class Case {

    private String model;
    private String brand;
    private String material;
    private Dimension dimension;

    public Case(String brand, String model, String material, Dimension dimension) {
        this.brand = brand;
        this.model = model;
        this.material = material;
        this.dimension = dimension;
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

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Dimension getDimension() {
        return dimension;
    }

    public void setDimension(Dimension dimension) {
        this.dimension = dimension;
    }

    @Override
    public String toString() {
        return "Brand: " + brand + 'n/' +
                "Model: " + model + 'n/' +
                "Material:" + material + 'n/' +
                "Dimension: " + dimension;
    }
}
