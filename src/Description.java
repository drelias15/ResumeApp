public class Description {
    String duty;


    public Description() {
    }

    public Description(String duty) {
        this.duty = duty;
    }

    public String getDuty() {
        return duty;
    }

    public void setDuty(String duty) {
        this.duty = duty;
    }

    @Override
    public String toString() {
        return  duty;
    }
}
