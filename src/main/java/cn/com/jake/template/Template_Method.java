package cn.com.jake.template;

/**
 * @Classname Template_Method
 * @Description TODO
 * @Date 19-2-1 下午3:20
 * @Created by yujuan
 */
public class Template_Method {
    public static void main(String[] args) {

        //炒菜---手撕包菜
        ConcreteClass_BaoCai concreteClass_baoCai = new ConcreteClass_BaoCai();
        concreteClass_baoCai.cookProcess();

        //炒菜---蒜蓉菜心
        ConcreteClass_CaiXin concreteClass_caiXin = new ConcreteClass_CaiXin();
        concreteClass_caiXin.cookProcess();

    }
}
