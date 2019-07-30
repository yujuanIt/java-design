package cn.com.jake.observer;

import java.util.Observable;
import java.util.Random;

/**
 * The type Clown.
 *
 * @author yujuan
 * @time 2019 /07/30 18:56:58
 */
public class Clown extends Observable {

    /**
     * The constant PERFORM_GOOD.
     */
    public static final int PERFORM_GOOD = 0;

    /**
     * The constant PERFORM_BAD.
     */
    public static final int PERFORM_BAD = 1;

    /**
     * The constant PERFORM_COMPLETE.
     */
    public static final int PERFORM_COMPLETE = 2;

    /**
     * Perform.
     *
     * @author yujuan
     * @time 2019 /07/30 18:56:58
     */
    public void perform() {
        System.out.println("小丑开始表演");
        int random = new Random().nextInt(2);
        switch (random) {
            case PERFORM_GOOD:
                System.out.println("小丑状态很好，表演的很精彩！");
                break;
            case PERFORM_BAD:
                System.out.println("小丑状态不好，出了点篓子");
                break;
            default:
                break;
        }
        setChanged();
        notifyObservers(random);
    }

    /**
     * Exit.
     *
     * @author yujuan
     * @time 2019 /07/30 18:56:58
     */
    public void exit() {
        System.out.println("表演结束，小丑退场！");
        setChanged();
        notifyObservers(PERFORM_COMPLETE);
    }
}
