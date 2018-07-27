public class Description {
    String duty;
    String description;


    public Description() {
    }


    public Description(String duty, String description) {
        this.duty = duty;
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public String toString() {
        return  duty +"," + description;
    }
}
