import java.awt.print.Book;
import java.util.ArrayList;

public class Experience {

    private String jobTitle;
    private String company;
    private String startDate;
    private String endDate;
    private ArrayList<Description> descriptionList;

    public Experience() {
    }

    public Experience(String jobTitle, String company, String startDate, String endDate, ArrayList<Description> descriptionList) {
        this.jobTitle = jobTitle;
        this.company = company;
        this.startDate = startDate;
        this.endDate = endDate;
        this.descriptionList = descriptionList;
    }

    public ArrayList<Description> getDescriptionList() {
        return descriptionList;
    }

    public void setDescriptionList(ArrayList<Description> descriptionList) {
        this.descriptionList = descriptionList;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }




    public String diplayDescription(){
       // StringBuilder sb = new StringBuilder();
        String result = "";
        int counter = 1;
        for (int i = 0; i < descriptionList.size(); i++) {
            result += " -Duty" + counter++ + ", " + descriptionList.get(i) + "\n";
        }
        return result;
    }

//    public String  print(ArrayList<Description> descriptionList) {
//        String result = "+"
//        for (int i = 0; i < descriptionList.size(); i++) {
//            System.out.println(descriptionList.get(i));
//        }
//    }
////


    @Override
    public String toString() {
        return jobTitle + "\n" + company + ", " + startDate + "-" + endDate + "\n"
                + diplayDescription();
    }
}
