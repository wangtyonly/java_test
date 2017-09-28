package org.ty;

public class HelloService {
    //测试测试提交
    //测试 cherry-pick
    private String msg;
    public String sayHello(){
        return "hello " + msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
