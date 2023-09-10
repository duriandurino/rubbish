class Child0 extends Parent{
    
    private String gender = "F";

    String getGender(){
        return this.gender;
    }
    void setGender(String gender){
        this.gender = gender;
    }

    void name(){
        System.out.println("Budrenks "+familyName);
    }

}
