import java.util.ArrayList;

public class  citizensInfo {
    protected String idOfCitizen;
    protected String nameOfCitizen;
    private int ageOfCitizen;
    private String gander;
    public ArrayList<vaccineInfo> doseArrayList = new ArrayList<>();

    public citizensInfo() {
        doseArrayList = new ArrayList<vaccineInfo>();
    }

    public citizensInfo(String idOfCitizen, String nameOfCitizen, int ageOfCitizen, String gander) {
        this.idOfCitizen = idOfCitizen;
        this.nameOfCitizen = nameOfCitizen;
        this.ageOfCitizen = ageOfCitizen;
        this.gander = gander;
    }

    public citizensInfo(String idOfCitizen, String nameOfCitizen, int ageOfCitizen, String gander, ArrayList<vaccineInfo> doseArrayList) {
        this.idOfCitizen = idOfCitizen;
        this.nameOfCitizen = nameOfCitizen;
        this.ageOfCitizen = ageOfCitizen;
        this.gander = gander;
        this.doseArrayList = doseArrayList;
    }


    public ArrayList<vaccineInfo> getDoseArrayList() {
        return doseArrayList;
    }

    public void setDoseArrayList(ArrayList<vaccineInfo> doseArrayList) {
        this.doseArrayList = doseArrayList;
    }

    public String getIdOfCitizen() {
        return idOfCitizen;
    }
    public void setIdOfCitizen(String idOfCitizen) {
        this.idOfCitizen = idOfCitizen;
    }

    public String getNameOfCitizen() {
        return nameOfCitizen;
    }
    public void setNameOfCitizen(String nameOfCitizen) {
        this.nameOfCitizen = nameOfCitizen;
    }

    public int getAgeOfCitizen() {
        return ageOfCitizen;
    }
    public void setAgeOfCitizen(int ageOfCitizen) {
        this.ageOfCitizen = ageOfCitizen;
    }

    public String getGander() {
        return gander;
    }
    public void setGander(String gander) {
        this.gander = gander;
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "Id='" + idOfCitizen + '\'' +
                ", Name='" + nameOfCitizen + '\'' +
                ", Age=" + ageOfCitizen +
                ", Gander='" + gander + '\'' +
                ", Doses List=" + doseArrayList +
                '}' + "\n";
    }
}
