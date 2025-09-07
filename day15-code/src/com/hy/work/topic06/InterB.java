package com.hy.work.topic06;

public interface InterB {
    void showB();
}

class B {
    InterB b;
    public B(InterB b){
        this.b = b;
    }
    public void methodB(){
        b.showB();
    }
}
