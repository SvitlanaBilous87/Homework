package com.company.hometask_07;

public class robot {
    private String name;
    public robot(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void work(){
        System.out.println("Я "+name+ " - я просто працюю");
    }
}
