package backend.actors;

public class Director extends Manager {
    private String stateName;

    /**
     * @return String return the stateName
     */
    public String getStateName() {
        return stateName;
    }

    /**
     * @param stateName the stateName to set
     */
    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

}
