package cn.com.jake.builder;

public class Director {
    public void Construct(Builder builder) {
        builder.BuildCPU();
        builder.BuildHD();
        builder.BuildMainboard();
    }
}
