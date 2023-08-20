public class healthProfessionaInfo extends citizensInfo{
    private int experienceYears;


    public healthProfessionaInfo() {
    }

    public healthProfessionaInfo(String nameOfNurse, String idOfNurse, int experienceYears) {
        this.nameOfCitizen = nameOfNurse;
        this.idOfCitizen = idOfNurse;
        this.experienceYears = experienceYears;
    }

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }

    @Override
    public String toString() {
        return "{" +
                "Id='" + idOfCitizen + '\'' +
                ", Name='" + nameOfCitizen + '\'' +
                ", ExperienceYears=" + experienceYears +
                '}';
    }
}
