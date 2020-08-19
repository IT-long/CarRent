package CarRent;

/**
 * 汽车业务类
 */
public class VehicleOperation {
    CarRent.Vehicle[] vehicles = new CarRent.Vehicle[8];//存储所有的车辆信息

    //车辆信息初始化
    public void initial(){
        vehicles[0] = new CarRent.Car("京NY28558","宝马","X6",800);
        vehicles[1] = new CarRent.Car("京CNY3284","宝马","550i",600);
        vehicles[2] = new CarRent.Car("京NT37465","别克","林荫大道",300);
        vehicles[3] = new CarRent.Car("京NT96968","别克","GL8",600);
        vehicles[4] = new CarRent.Bus("京6566754","金杯",16,800);
        vehicles[5] = new CarRent.Bus("京8696997","金龙",16,800);
        vehicles[6] = new CarRent.Bus("京9696996","金杯",34,1500);
        vehicles[7] = new CarRent.Bus("京8696998","金龙",34,1500);
    }
    //租赁汽车的办法
    public CarRent.Vehicle getVehicle(String brand, String type, int seatCount) {
        //for循环遍历数组
        for(int i = 0; i< vehicles.length; i++){
            if (vehicles[i] instanceof CarRent.Car) {
                // 强转成小汽车car
                CarRent.Car car = (CarRent.Car) vehicles[i];
                if (car.getBrand().equals(brand) && car.getType().equals(type)) {
                    return car;
                }
            }
            if(vehicles[i] instanceof CarRent.Bus){
                // 强转成大客车Bus
                CarRent.Bus bus = (CarRent.Bus) vehicles[i];
                if (bus.getBrand().equals(brand) && bus.getSeatCount()==seatCount) {
                    return bus;
                }
            }
        }
        //如果没有就返回空
        return null;
    }
}
