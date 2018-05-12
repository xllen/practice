package com.xielei;

interface OutInterface{

}

public class example {

}
class OuterClass{
    public OutInterface doit(){
        return new OutInterface() {
            private int i =1;
            public int getValue(){
                return i;
            }
        };
    }
}