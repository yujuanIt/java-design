package cn.com.jake.facade;

/**
 * @Classname Facade
 * @Description TODO
 * @Date 19-2-1 下午3:43
 * @Created by yujuan
 */
public class Facade {
    SubSystemA_Light subSystemA_light;
    SubSystemB_Television subSystemB_television;
    SubSystemC_Aircondition subSystemC_aircondition;

    public Facade(SubSystemA_Light subSystemA_light, SubSystemB_Television subSystemB_television, SubSystemC_Aircondition subSystemC_aircondition) {
        this.subSystemA_light = subSystemA_light;
        this.subSystemB_television = subSystemB_television;
        this.subSystemC_aircondition = subSystemC_aircondition;
    }

    public void on() {
        System.out.println("起床了");
        subSystemA_light.on();
        subSystemB_television.on();
        subSystemC_aircondition.on();
    }

    public void off() {
        System.out.println("睡觉了");
        subSystemA_light.off();
        subSystemB_television.off();
        subSystemC_aircondition.off();
    }
}
