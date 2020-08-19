package CarRent;

/**
 * 轿车类
 */
public class Car extends CarRent.Vehicle {
    private String type;//型号

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Car(String id, String brand, String type, int dayRent) {
        super(id, brand, dayRent);
        this.type = type;
    }

    @Override
    public double carRent(int days) {//重写计算租金的方法
        if (days >= 1 && days <= 7) {
            System.out.println("不打折");
            return getDayRent() * days;
        }else if (days > 7 && days <= 30){
            System.out.println("打9折");
            return getDayRent() * days * 0.9;
        }
        else if (days >=30 && days <= 150){
            System.out.println("打8折");
            return getDayRent() * days * 0.8;
        }
        else if (days > 150){
            System.out.println("打7折");
            return getDayRent() * days * 0.7;
        }
        return 0;
    }
}
