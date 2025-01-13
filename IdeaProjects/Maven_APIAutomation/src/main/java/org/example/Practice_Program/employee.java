package org.example.Practice_Program;



public class employee {
//
//
//    @JsonProperty("name")
//    String name;
//    @JsonProperty("gender")
//    String gender;
//
//    @JsonProperty("age")
//    String age;
//
//    @JsonProperty("address")
//    String address;
//
//    @JsonProperty("ocupation")
//    String ocupation;
//
//    @JsonProperty("mobileNo")
//    String mobileNo;

    private String name ;
    private String gender ;
    private String age ;
    private String address ;
    private String ocupation ;
    private String mobileNo ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getOcupation() {
        return ocupation;
    }

    public void setOcupation(String ocupation) {
        this.ocupation = ocupation;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
       this.mobileNo = mobileNo;
    }



    public  String toString(){

        return "Employee+{name="+name+'\''+",gender="+gender+'}';
    }

}
