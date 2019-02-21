package cn.com.jake.strategy;

/**
 * @Classname Context_SalesMan
 * @Description TODO
 * @Date 19-2-1 下午3:29
 * @Created by yujuan
 */
public class Context_SalesMan {
    //持有抽象策略角色的引用
    private Strategy strategy;

    //生成销售员实例时告诉销售员什么节日(构造方法)
    //使得让销售员根据传入的参数(节日)选择促销活动(这里选择一个简单的工厂模式)
    public Context_SalesMan(String festival) {

        switch (festival) {
            case "A":
                strategy = new StrategyA();
                break;
            case "B":
                strategy = new StrategyB();
                break;
            case "C":
                strategy = new StrategyC();
                break;
            default:
                break;
        }
    }

    //向客户展示促销活动
    public void salesManShow() {
        strategy.show();
    }
}
