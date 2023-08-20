import  java.io.*;
import java.io.File;
import java.io.FileNotFoundException;

public class CitizensVaccinationTesting {

    public static void main(String[] args) {

        CitizensList citizenList = new CitizensList();

        //add citizens to the list
        citizensInfo citizen3 = new citizensInfo("2", "Ali", 20, "male");
        citizenList.addCitizenToList(citizen3);
        citizensInfo citizen2 = new citizensInfo("3", "Mohamed", 25, "Male");
        citizenList.addCitizenToList(citizen2);
        citizensInfo citizen1 = new citizensInfo("1", "Rana", 28, "Female");
        citizenList.addCitizenToList(citizen1);
        citizensInfo citizen4 = new citizensInfo("5", "Mariam", 34, "female");
        citizenList.addCitizenToList(citizen4);
        citizensInfo citizen5 = new citizensInfo("4", "Adel", 22, "Male");
        citizenList.addCitizenToList(citizen5);
        //This citizen did not sort because he has the same Id as another citizen
        citizensInfo citizen6 = new citizensInfo("4", "Ahmed", 50, "Male");
        citizenList.addCitizenToList(citizen6);
        citizensInfo citizen7 = new citizensInfo("7", "Alaa", 30, "female");
        citizenList.addCitizenToList(citizen7);

        //Add dose to citizen
        vaccineInfo vaccineInfo;
        CitizensList.addDoseToList("3", vaccineInfo = new vaccineInfo("pfizer",
                "gize", "2 juan", "mohamed", "5", 4));
        CitizensList.addDoseToList("3", vaccineInfo = new vaccineInfo("pfizer",
                "giza", "23 juan", "mohamed", "5", 4));

        CitizensList.addDoseToList("1", vaccineInfo = new vaccineInfo("pfizer",
                "cairo", "29 April", "mohamed", "6", 4));
        CitizensList.addDoseToList("1", vaccineInfo = new vaccineInfo("pfizer",
                "cairo", "13 May", "mohamed", "6", 4));

        CitizensList.addDoseToList("2", vaccineInfo = new vaccineInfo("pfizer",
                "Mansoura", "20 April", "mohamed", "7", 2));
        CitizensList.addDoseToList("2", vaccineInfo = new vaccineInfo("pfizer",
                "Mansoura", "3 May", "mohamed", "7", 2));

        CitizensList.addDoseToList("5", vaccineInfo = new vaccineInfo("pfizer",
                "cairo", "2 April", "mohamed", "5", 4));


        //that method storing list of citizens by Id
        CitizensList.sort(citizenList.citizenArrayList);

        //sort date in file
        File dataFile = new File("citizensData.txt");
        PrintWriter dataFileWriter;
        try {
            dataFileWriter = new PrintWriter(dataFile);
            dataFileWriter.println(citizenList);
            dataFileWriter.close();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\nNumber of fully vaccinated persons: " + CitizensList.retrievingNumbers());
    }
}
