package composite;

import java.util.ArrayList;
import java.util.List;

public class Wall implements BuildingBlock {

    int parentId;
    int id;
    String name;
    List<BuildingBlock> children = new ArrayList<BuildingBlock>();

    int length = 20;

    public Wall(int parentId, int id, String name){
        this.parentId = parentId;
        this.id = id;
        this.name = name;
    }

    public void addChild(BuildingBlock child){
        children.add(child);
    }

    public void removeChild(BuildingBlock child){
        children.remove(child);
    }

    public List<BuildingBlock> getChildren(){
        return children;
    }

    public void print(){
        System.out.println("Parent: " + parentId + ", ID: " + id + ", Name: " + name + " " +
                ", Type: " + this.getClass().getSimpleName() + ", Children#: " + children.size());
    }

}
