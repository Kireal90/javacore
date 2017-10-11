package com.kitcenter.app.homework.lesson11;

public class WhiteCollar extends Human {

    private String companyName;

    public WhiteCollar (int age, String name, String companyName) {
        super(age, name);
        setCompanyName(companyName);
    }

    public void setCompanyName(String companyName) {
        boolean valid = companyName.matches("[A-Za-z]+(\\S+|\\s+|\\W+)+");
        System.out.println(valid);
        if (valid) {
            this.companyName = companyName;
        } else {
            System.out.println("Company name is invalid");
        }
    }
}
