package com.spring.mvc;


import javax.validation.constraints.*;

public class Car {

    @Size(min = 2, max = 15, message = "name less than 2 characters or more than 15")
    private String brand;

    @Size(min = 2, max = 15, message = "name less than 2 characters or more than 15")
    private String model;
    private String engine;
    @Min(value = 100,message = "at least 100 ls")
    private int ls;
    @NotBlank(message = "no transmission selected")
    private String transmission;

    private String[] addOptions;
    @NotBlank(message = "field cannot be empty")

    @Pattern(regexp = "^((8|\\+7)[\\- ]?)?(\\(?\\d{3}\\)?[\\- ]?)?[\\d\\- ]{7}$", message = "Please, user pattern +7XXX-XXX-XX-XX")
    private String phoneNumber;
    @NotBlank(message = "field cannot be empty")
    @Email(message = "isn't email")
    private String email;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public int getLs() {
        return ls;
    }

    public void setLs(int ls) {
        this.ls = ls;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String[] getAddOptions() {
        return addOptions;
    }

    public void setAddOptions(String[] addOptions) {
        this.addOptions = addOptions;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
