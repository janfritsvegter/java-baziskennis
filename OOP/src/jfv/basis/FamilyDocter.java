package jfv.basis;

public class FamilyDocter extends Person {
    private String hospitalName;

    public FamilyDocter(String firstName, String lastName, String streetName, String bsnNumber, String hospitalName) {
        super(firstName, lastName, streetName, bsnNumber);
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    @Override
    public String info(){
        String s = super.info();
        String info = s + "Local info";
        return info;
    }
}
