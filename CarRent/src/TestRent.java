package CarRent;

/**
 * 汽车租赁管理类
 * 程序入口
 */

import java.util.Scanner;

public class TestRent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CarRent.VehicleOperation vo = new CarRent.VehicleOperation();//初始化
        vo.initial();

        //定义一个为空的容器
        CarRent.Vehicle vehicle = null;

        System.out.println("--------欢迎光临秋名山守望者汽车租赁公司--------");
        System.out.println("1、轿车           2、客车");
        System.out.println("请输入你要租赁的汽车类型：");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("请选择你要租赁的汽车品牌：1.别克  2.宝马");
            int brand = sc.nextInt();
            if (brand == 1) {
                System.out.println("请选择你要租赁的汽车类型：1、林荫大道  2、GL8");
                int type = sc.nextInt();
                if (type == 1) {
                    vehicle = vo.getVehicle("别克","林荫大道",4);
                }else if (type == 2) {
                    vehicle = vo.getVehicle("别克", "GL8", 4);
                }
            }else if (brand == 2) {
                System.out.println("请选择你要租赁的汽车类型：1、X6  2、550i");
                int type = sc.nextInt();
                if (type == 1) {
                    vehicle = vo.getVehicle("宝马","X6",4);
                }else if (type == 2) {
                    vehicle = vo.getVehicle("宝马", "550i", 4);
                }
            }
        }else if (num == 2) {
            System.out.println("请选择你要租赁的汽车品牌：1.金龙  2.金杯");
            int brand = sc.nextInt();
            if (brand == 1) {
                System.out.println("请选择你要租赁的汽车类型：1、16座  2、34座");
                int type = sc.nextInt();
                if (type == 1) {
                    vehicle = vo.getVehicle("金龙","",16);
                }else if (type == 2) {
                    vehicle = vo.getVehicle("金龙", "", 34);
                }
            }else if (brand == 2) {
                System.out.println("请选择你要租赁的汽车类型：1、16座  2、34座");
                int type = sc.nextInt();
                if (type == 1) {
                    vehicle = vo.getVehicle("金杯","",16);
                }else if (type == 2) {
                    vehicle = vo.getVehicle("金杯", "", 34);
                }
            }
        }
        if (vehicle != null) {
            System.out.println("请输入您的租车天数");
            int days =sc.nextInt();
            double money = vehicle.carRent(days);
            System.out.println("您租得的汽车牌号是" + vehicle.getId());
            System.out.println("您需要支付的租赁费用是" + money + "元");
        }else{
            System.out.println("抱歉，暂无您所需要的汽车类型，请重新选择");
        }
    }
}
