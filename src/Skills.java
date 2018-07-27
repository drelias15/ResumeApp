public class Skills {

    private String skillName;
    private String rating;

    public Skills() {
    }

    public Skills(String skillName, String rating) {
        this.skillName = skillName;
        this.rating = rating;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "Skills \n" + skillName + ", " + rating;
    }
}
