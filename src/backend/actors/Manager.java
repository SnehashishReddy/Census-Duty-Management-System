package backend.actors;

public abstract class Manager extends User {
    private int employeeID;
    private int regionID;
    private int hierarchy;
    private int[] region;

    /**
     * @return int return the employeeID
     */
    public int getEmployeeID() {
        return employeeID;
    }

    /**
     * @param employeeID the employeeID to set
     */
    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    /**
     * @return int return the regionID
     */
    public int getRegionID() {
        return regionID;
    }

    /**
     * @param regionID the regionID to set
     */
    public void setRegionID(int regionID) {
        this.regionID = regionID;
    }

    /**
     * @return int return the hierarchy
     */
    public int getHierarchy() {
        return hierarchy;
    }

    /**
     * @param hierarchy the hierarchy to set
     */
    public void setHierarchy(int hierarchy) {
        this.hierarchy = hierarchy;
    }

    /**
     * @return int[] return the region
     */
    public int[] getRegion() {
        return region;
    }

    /**
     * @param region the region to set
     */
    public void setRegion(int[] region) {
        this.region = region;
    }

    public String[] viewUsers(boolean underHierarchy, boolean underRegion) {
        // Give String[] of users
        return new String[10];
    }

    public boolean addUsers(String user, boolean underHierarchy, boolean underRegion) {
        // Add a user
        return true;
    }

    public boolean editUser(String user, boolean underHierarchy, boolean underRegion) {
        // Edit the user
        return true;
    }

    public boolean removeUser(String user, boolean underHierarchy, boolean underRegion) {
        // Remove a user
        return true;
    }

    public boolean modifySubmittedForms(String[] form, boolean underRegion) {
        // Modify the form
        return true;
    }

    public String[] viewLocalRegistry(boolean underHierarchy) {
        // Return the Local RegPart
        return new String[10];
    }

    public boolean underHierarchy() {
        // Return true if under Hierarchy => use the param int hierarchy in this class
        return false;
    }

    public boolean underRegion() {
        // Return true if under Region => use the param int region in this class
        return false;
    }
}
