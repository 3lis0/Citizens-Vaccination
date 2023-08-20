public class vaccineInfo{
    private String manufacturerOfVaccine;
    private String placeOfVaccination;
    private String dataOfVaccination;
    private healthProfessionaInfo nurse;

    public vaccineInfo() {
    }

    public vaccineInfo(String manufacturerOfVaccine, String placeOfVaccination, String dataOfVaccination,
                       String nameOfNurse, String idOfNurse, int experienceYears) {
        this.manufacturerOfVaccine = manufacturerOfVaccine;
        this.placeOfVaccination = placeOfVaccination;
        this.dataOfVaccination = dataOfVaccination;
        this.nurse = new healthProfessionaInfo(nameOfNurse , idOfNurse , experienceYears);
    }

    //set method
    public void setManufacturerOfVaccine(String manufacturerOfVaccine) {
        this.manufacturerOfVaccine = manufacturerOfVaccine;
    }
    public void setPlaceOfVaccination(String placeOfVaccination) {
        this.placeOfVaccination = placeOfVaccination;
    }
    public String getDataOfVaccination() {
        return dataOfVaccination;
    }
    public void setDataOfVaccination(String dataOfVaccination) {
        this.dataOfVaccination = dataOfVaccination;
    }

    //get method
    public String getManufacturerOfVaccine() {
        return manufacturerOfVaccine;
    }
    public String getPlaceOfVaccination() {
        return placeOfVaccination;
    }

    public healthProfessionaInfo getNurse() {
        return nurse;
    }

    public void setNurse(healthProfessionaInfo nurse) {
        this.nurse = nurse;
    }

    @Override
    public String toString() {
        return "dose{" +
                "manufacturer='" + manufacturerOfVaccine + '\'' +
                ", Place Of Vaccination='" + placeOfVaccination + '\'' +
                ", Data Of Vaccination='" + dataOfVaccination + '\'' +
                ", Nurse=" + nurse +
                '}';
    }
}
