import java.util.*;

public class CitizensList  {
    public static ArrayList<citizensInfo> citizenArrayList;

    public CitizensList(){
        citizenArrayList = new ArrayList<citizensInfo>();
    }

    //check if id that user input is in the list or not
    public boolean equals(String citizenId){
        boolean isUniqueId = false;
        for(citizensInfo x: citizenArrayList){
            if(x.getIdOfCitizen().equals(citizenId)){
                isUniqueId = true;
            }
        }
        return isUniqueId;
    }

    //add citizen in the list
    //check first if this citizen stored before or not
    //if citizen stored before the program will show Error message
    //if the new citizen has unique id will store with success message
    public void addCitizenToList(citizensInfo citizen){
        if(equals(citizen.getIdOfCitizen())){
            System.out.println("Citizen that has ID: " + citizen.idOfCitizen + " is stored before!!");
        } else{
            citizenArrayList.add(citizen);
            System.out.println("Citizen that has ID: " + citizen.idOfCitizen + " Added successfully!");
        }
    }

    //Add Dose to specified citizen
    public static void addDoseToList(String citizenNum, vaccineInfo dose){
        for(citizensInfo x: citizenArrayList){
            if(x.getIdOfCitizen().equals(citizenNum)){
                System.out.println("Dose was Added to ID: " + x.getIdOfCitizen() + " successfully!");
                x.getDoseArrayList().add(dose);
            }
        }

    }

    //method retrieving Number of fully vaccinated persons who toke at least 2 doses
    public static int retrievingNumbers(){
        int counter = 0;
        for(citizensInfo O: citizenArrayList){
            if(O.doseArrayList.size() == 2){
                counter++;
            }
        }
        return counter;
    }

    // sort using citizen id
    public static void sort(ArrayList<citizensInfo> list)
    {
        list.sort(Comparator.comparing(citizensInfo::getIdOfCitizen));
    }

    @Override
    public String toString() {
        return "CitizensList{" + "\n"+ citizenArrayList + "}";
    }
}
