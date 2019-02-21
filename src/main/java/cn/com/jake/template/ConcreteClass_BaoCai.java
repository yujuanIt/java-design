package cn.com.jake.template;

/**
 * @Classname ConcreteClass_BaoCai
 * @Description 创建模板具体类 手撕包菜
 * @Date 19-2-1 下午3:18
 * @Created by yujuan
 */
public class ConcreteClass_BaoCai extends Cook{
    @Override
    void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜");
    }

    @Override
    void pourSauce() {
        System.out.println("下锅的酱料是辣椒");
    }
}
