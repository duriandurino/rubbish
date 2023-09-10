class Child extends Parent{

    private String gender = "M";

    String getGender(){
        return this.gender;
    }
    void setGender(String gender){
        this.gender = gender;
    }

    void name(){
        System.out.println("Droi "+familyName);
    }
    
}