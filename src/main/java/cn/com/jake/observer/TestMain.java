package cn.com.jake.observer;

/**
 * The type Test main.
 *
 * @author yujuan
 * @time 2019 /07/30 18:57:01
 */
public class TestMain {

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @author yujuan
     * @time 2019 /07/30 18:57:01
     */
    public static void main(String[] args) {

        Clown clown = new Clown();
        for (int i = 0; i < 20; i++) {
            Viewer viewer = new Viewer(i);
            clown.addObserver(viewer);
            System.out.println("座位号为" + viewer.getSeatNo() + "的观众入座");
        }
        clown.perform();
        clown.exit();
    }

}
