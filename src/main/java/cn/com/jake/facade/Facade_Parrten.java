package cn.com.jake.facade;

/**
 * @Classname Facade_Parrten
 * @Description TODO
 * @Date 19-2-1 下午3:47
 * @Created by yujuan
 */
public class Facade_Parrten {
    public static void main(String[] args) {
        SubSystemA_Light subSystemA_light = new SubSystemA_Light();
        SubSystemB_Television subSystemB_television = new SubSystemB_Television();
        SubSystemC_Aircondition subSystemC_aircondition = new SubSystemC_Aircondition();
        Facade facade = new Facade(subSystemA_light, subSystemB_television, subSystemC_aircondition);
        facade.on();
        System.out.println("可以看电视了");
        facade.off();
        System.out.println("可以睡觉了");
    }
}
