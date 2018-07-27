public class Education {
    private String degree;
    private String major;
    private String universityName;
    private int year;

    public Education() {
    }

    public Education(String degree, String major, String universityName, int year) {
        this.degree = degree;
        this.major = major;
        this.universityName = universityName;
        this.year = year;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return  degree + " in " + major + ", \n" + universityName + ", " + year  ;
    }
}
