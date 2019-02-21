package cn.com.jake.builder;


public abstract class Builder {
   public abstract void BuildCPU();
   public abstract void BuildMainboard();
   public abstract void BuildHD();
   public abstract Computer GetComputer();



}
