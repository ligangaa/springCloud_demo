package com.ligang;

import java.util.Date;
import java.util.Stack;

public class myStack {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(Runtime.getRuntime().availableProcessors());
    }
    private Stack<Integer> stackData=new Stack<>();
    private Stack<Integer> stackMin=new Stack<>();
    public void push(Integer value){
        stackData.push(value);
        if(stackMin.isEmpty()){
            stackMin.push(value);
        }else if(value<=getMin()){
            stackMin.push(value);
        }

    }
    public Integer pop(){
        if (stackData.isEmpty()){
            throw new RuntimeException("kong");
        }
        Integer value=stackData.pop();
        if(value==getMin()){
            stackMin.pop();
        }
        return value ;


    }
    public Integer getMin(){
        if (stackMin.isEmpty()){
            throw new RuntimeException("堆栈为空");
        }
        return stackMin.peek();
    }
}
