package seedu.bigpp.component.storage;

import seedu.bigpp.component.Component;

public class Storage extends Component {
    public static final String COMPONENT_STRING = "storage";
    private String type;
    private int size; // in GB
    private float power;

    public Storage(String name, String brand, float price, String type, int size, float power) {
        super.setName(name);
        super.setBrand(brand);
        super.setPrice(price);
        this.type = type;
        this.size = size;
        this.power = power;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Storage{" +
                "name='" + super.getName() + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                ", price=" + super.getPrice() +
                ", type='" + type + '\'' +
                ", size=" + size +
                ", power=" + power +
                '}';
    }
}
