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




    public void diplayDescription(){
        for (int i = 0; i < descriptionList.size(); i++) {
            System.out.println(descriptionList.get(i).toString());
        }
    }

    @Override
    public String toString() {
        return "Experience \n" + jobTitle + "\n" + company + ", " + startDate + "-" + endDate + "\n"
                + displayDescription();
    }
}
