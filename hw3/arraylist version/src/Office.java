/**
 * This class contains data about Offices, with the extension of Building superclass
 */
public class Office extends Building{
    private String jobType;

   
    public Office(int position, int length, int height, String owner, String jobType){
        super(position, length, height, owner);
        this.jobType = jobType;
    }
/**
 * This returns the job type of the current Office
 * @return
 */
    public String getJobType() {
        return this.jobType;
    }
/**
 * This sets the job type of the current Office
 * @param jobType
 */
    public void setJobType(String jobType) {
        this.jobType = jobType;
    }
    
}