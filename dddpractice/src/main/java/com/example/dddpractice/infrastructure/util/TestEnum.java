package com.example.dddpractice.infrastructure.util;

public enum TestEnum {

    T1("t1" ,11){
        public void dothing(){
            System.out.println(this.name + " " + this.age);
        }
    } , T2("t2" , 12){
        public void dothing(){
            System.out.println(this.name + " " + this.age);
        }
    } ,T3("t3" , 13){
        public void dothing(){
            System.out.println(this.name + " " + this.age);
        }
    };

    protected String name;

    protected int age;

    TestEnum(String ok , int age){

        this.name = ok;
        this.age = age;
    }

    public void dothing(){
        System.out.println("ok , default");
    }
}
