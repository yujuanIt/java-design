package cn.com.jake.builder;

public class Pattern {
    public static void main(String[] args) {
        Director director = new Director();
        Builder builder = new ConcreteBuilder();
        director.Construct(builder);
        Computer computer = builder.GetComputer();
        computer.show();
    }

}
