package CarRent;

/**
 * 汽车类
 */
public abstract class Vehicle {
    private String id;//车牌号
    private String brand;//品牌
    private int dayRent;//日租金

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getDayRent() {
        return dayRent;
    }

    public void setDayRent(int dayRent) {
        this.dayRent = dayRent;
    }

    public Vehicle(String id, String brand, int dayRent) {
        this.id = id;
        this.brand = brand;
        this.dayRent = dayRent;
    }

    //计算租金的方法
    public abstract double carRent(int days);
}
