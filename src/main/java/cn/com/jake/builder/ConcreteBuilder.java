package cn.com.jake.builder;

public class ConcreteBuilder extends Builder {
    Computer computer = new Computer();

    @Override
    public void BuildCPU() {
        computer.addPart("组装CPU");
    }

    @Override
    public void BuildMainboard() {
        computer.addPart("组装主板");
    }

    @Override
    public void BuildHD() {
        computer.addPart("组装硬盘");
    }

    @Override
    public Computer GetComputer() {
        return computer;
    }
}
