package backend.actors;

public class Headmaster extends Manager {
    private String schoolName;
    private int SchoolID;

    /**
     * @return String return the schoolName
     */
    public String getSchoolName() {
        return schoolName;
    }

    /**
     * @param schoolName the schoolName to set
     */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    /**
     * @return int return the SchoolID
     */
    public int getSchoolID() {
        return SchoolID;
    }

    /**
     * @param SchoolID the SchoolID to set
     */
    public void setSchoolID(int SchoolID) {
        this.SchoolID = SchoolID;
    }

}
