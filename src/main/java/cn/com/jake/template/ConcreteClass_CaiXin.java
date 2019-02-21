package cn.com.jake.template;

/**
 * @Classname ConcreteClass_CaiXin
 * @Description 创建模板具体类 蒜蓉菜心
 * @Date 19-2-1 下午3:19
 * @Created by yujuan
 */
public class ConcreteClass_CaiXin extends Cook {
    @Override
    void pourVegetable() {
        System.out.println("下锅的蔬菜是菜心");
    }

    @Override
    void pourSauce() {
        System.out.println("下锅的酱料是蒜蓉");
    }
}