package com.example.hackbmu.model;



public class Register {

    String Name ;
    String Address ;
    String BloodGroup ;
    String Height ;
    String Weight ;
    String EmergencyContact ;
    String Email;

    public void setName(String name) {
        Name = name;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setBloodGroup(String bloodGroup) {
        BloodGroup = bloodGroup;
    }

    public void setHeight(String height) {
        Height = height;
    }

    public void setWeight(String weight) {
        Weight = weight;
    }

    public void setEmergencyContact(String emergencyContact) {
        EmergencyContact = emergencyContact;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    String Phone ;

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public String getHeight() {
        return Height;
    }

    public String getWeight() {
        return Weight;
    }

    public String getEmergencyContact() {
        return EmergencyContact;
    }

    public String getEmail() {
        return Email;
    }

    public String getPhone() {
        return Phone;
    }
}
