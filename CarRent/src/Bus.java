package CarRent;

/**
 * 客车类
 */
public class Bus extends CarRent.Vehicle {
    private int seatCount;//座位数

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    public Bus(String id, String brand, int dayRent) {
        super(id, brand, dayRent);
    }

    public Bus(String id, String brand, int seatCount, int dayRent) {
        super(id, brand, dayRent);
        this.seatCount = seatCount;
    }

    @Override
    public double carRent(int days) {//重写计算租金的方法
        if (days >= 1 && days <3) {
            System.out.println("不打折");
            return getDayRent() * days;
        }else if (days >= 3 && days <7){
            System.out.println("打9折");
            return getDayRent() * days * 0.9;
        }
        else if (days >= 7 && days <30){
            System.out.println("打8折");
            return getDayRent() * days * 0.8;
        }
        else if (days >= 30 && days <150){
            System.out.println("打7折");
            return getDayRent() * days * 0.7;
        }
        else if (days >= 150){
            System.out.println("打6折");
            return getDayRent() * days * 0.6;
        }
        return 0;
    }
}
