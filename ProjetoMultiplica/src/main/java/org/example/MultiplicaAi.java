package org.example;

public class MultiplicaAi {
    private int a;

    public MultiplicaAi(int a){
        this.a=a;

    }

    public void multiplicar(){
        for(int i=1;i<=10;i++){
            System.out.println(a+"*"+i+" = "+a*i);
        }
    }

}
