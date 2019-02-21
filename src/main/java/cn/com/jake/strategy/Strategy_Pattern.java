package cn.com.jake.strategy;

/**
 * @Classname Strategy_Pattern
 * @Description TODO
 * @Date 19-2-1 下午3:34
 * @Created by yujuan
 */
public class Strategy_Pattern {
    public static void main(String[] args) {
        Context_SalesMan context_salesMan;
        //春节来了，使用春节的促销活动
        System.out.println("对于春节：");
        context_salesMan = new Context_SalesMan("A");
        context_salesMan.salesManShow();

        System.out.println("对于中秋节：");
        context_salesMan = new Context_SalesMan("B");
        context_salesMan.salesManShow();

        System.out.println("对于圣诞节");
        context_salesMan = new Context_SalesMan("C");
        context_salesMan.salesManShow();
    }
}
