package cn.com.jake.template;

/**
 * @Classname Cook
 * @Description TODO
 * @Date 19-2-1 下午3:13
 * @Created by yujuan
 */
public abstract class Cook {
    final void cookProcess() {
        //第一步：倒油
        this.pourQil();
        //第二步：热油
        this.heatQil();
        //第三步：倒蔬菜
        this.pourVegetable();
        //第四步：倒调味料
        this.pourSauce();
        //第五步：翻炒
        this.fry();
    }

    //第一步：倒油是一样的，所以直接实现
    void pourQil() {
        System.out.println("倒油");
    }

    //第二步：热油是一样的，所以直接实现
    void heatQil() {
        System.out.println("热油");
    }

    //第三步：倒蔬菜是不一样的（一个下包菜，一个是下菜心）
    //所以声明为抽象方法，具体由子类实现
    abstract void pourVegetable();

    //第四步：倒调味料是不一样的（一个下辣椒，一个是下蒜蓉）
    //所以声明为抽象方法，具体由子类实现
    abstract void pourSauce();

    //第五步：翻炒是一样的，所以直接实现
    void fry() {
        System.out.println("炒菜");
    }
}
