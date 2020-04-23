package com.example.chhv.clb.OrganizationsBD.beans;

public class Organization {

    private int id;
    private String name_organization;
    private String year_organization;
    private String phone_organization;
    private String address_organization;
    private String city;
    private String type_organizations;

    private int id_city;
    private int id_type_organization;

    public Organization() {}

    public Organization(int id, String name_organizations, String year_organizations, String phone_organizations,
                        String address_organizations, String city, String type_organizations, int id_city, int id_type_organizations) {
        this.id = id;
        this.name_organization = name_organizations;
        this.year_organization = year_organizations;
        this.phone_organization = phone_organizations;
        this.address_organization = address_organizations;
        this.city = city;
        this.type_organizations = type_organizations;
        this.id_city = id_city;
        this.id_type_organization = id_type_organizations;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_organization() {
        return name_organization;
    }

    public void setName_organization(String name_organization) {
        this.name_organization = name_organization;
    }

    public String getYear_organization() {
        return year_organization;
    }

    public void setYear_organization(String year_organization) {
        this.year_organization = year_organization;
    }

    public String getPhone_organization() {
        return phone_organization;
    }

    public void setPhone_organization(String phone_organization) {
        this.phone_organization = phone_organization;
    }

    public String getAddress_organization() {
        return address_organization;
    }

    public void setAddress_organization(String address_organization) {
        this.address_organization = address_organization;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getType_organizations() {
        return type_organizations;
    }

    public void setType_organizations(String type_organizations) {
        this.type_organizations = type_organizations;
    }

    public int getId_city() {
        return id_city;
    }

    public void setId_city(int id_city) {
        this.id_city = id_city;
    }

    public int getId_type_organizations() {
        return id_type_organization;
    }

    public void setId_type_organizations(int id_type_organizations) {
        this.id_type_organization = id_type_organizations;
    }
}
