import java.util.*;
public abstract class AbstractEntity {
    private int Id;

    private ArrayList<AbstractEntity> entities;

    public AbstractEntity() {
        entities = new ArrayList<AbstractEntity>();
        Id = (int) (Math.random() * 99999999) + 10000000;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public ArrayList<AbstractEntity> getEntities() { 
        return entities;
    }

    //set unique ids if duplicates exist

    public void checkIds() { 
        for (int i = 0; i < entities.size(); i++) {
            for (int j = i; j < entities.size(); j++) {
                if (entities.get(i).getId() == entities.get(j).getId()) {
                    int a = (int) (Math.random() * 99999999) + 10000000;
                    entities.get(i).setId(a);
                }            
            }
    
        }
    }

    
}
