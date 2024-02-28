package com.company.a_kaibi;

public class SouGouInput {
    private AbstarctSkin abstarctSkin;

    public void setAbstarctSkin(AbstarctSkin abstarctSkin) {
        this.abstarctSkin = abstarctSkin;
    }

    public void display(){
        abstarctSkin.display();
    }
}
