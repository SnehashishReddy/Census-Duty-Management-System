package backend.actors;

public class GeneralPublic {

    public boolean viewStats(boolean isPublished) {
        if (isPublished) {
            return true;
        }
        return false;
    }

}
