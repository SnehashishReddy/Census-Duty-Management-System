package backend.actors;

public class CustomErrors {

    public int errorID;

    public int getErrorID() {
        return this.errorID;
    }

    public void setErrorID(int errorID) {
        this.errorID = errorID;
    }

    public boolean handleAuthenticationError() {
        // Handle Authentication Error
        return true;
    }

    public boolean handleRegionError() {
        // Handle Region Error
        return true;
    }

    public boolean handleHierarchyError() {
        // Handle Hierarchy Error
        return true;
    }

    public boolean handlePublishError() {
        // Handle Publishing Error
        return true;
    }

}
