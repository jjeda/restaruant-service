package me.jjeda.restaruant.domain;

public class Restaruant {

    private final Long id;
    private final String name;
    private final String address;

    public Restaruant(Long id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }


}
