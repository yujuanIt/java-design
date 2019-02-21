package cn.com.jake.simpleFactory;

/**
 * @Classname SimpleFatoryPattern
 * @Description TODO
 * @Date 19-2-1 下午3:10
 * @Created by yujuan
 */
public class SimpleFatoryPattern {
    public static void main(String[] args) {
       Factory.ManuFacture("A").show();
       Factory.ManuFacture("B").show();
       Factory.ManuFacture("C").show();
    }
}
