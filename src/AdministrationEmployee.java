public class AdministrationEmployee extends Person {
    private String job;
    public AdministrationEmployee(String name, String id,String job) {
        super(name, id);
        this.job=job;
    }

    public String getJob(){
        return job;
    }

    public void setJob(String job){
        this.job=job;
    }
}
