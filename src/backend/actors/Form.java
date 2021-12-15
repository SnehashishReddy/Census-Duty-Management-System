package backend.actors;

import java.util.ArrayList;

public class Form {
    protected ArrayList<String> schema;

    /**
     * @return ArrayList<String> return the schema
     */
    public ArrayList<String> getSchema() {
        return schema;
    }

    /**
     * @param schema the schema to set
     */
    public void setSchema(ArrayList<String> schema) {
        this.schema = schema;
    }

}
