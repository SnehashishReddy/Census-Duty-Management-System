package backend.actors;

public class Headmaster extends Manager {

    String schoolName;
    int schoolID;
    int districtID;

    public String getSchoolName() {
        return this.schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public int getSchoolID() {
        return this.schoolID;
    }

    public void setSchoolID(int schoolID) {
        this.schoolID = schoolID;
    }

    public int getDistrictID() {
        return this.districtID;
    }

    public void setDistrictID(int districtID) {
        this.districtID = districtID;
    }

}
