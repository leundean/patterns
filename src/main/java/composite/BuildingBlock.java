package composite;

import java.util.List;

public interface BuildingBlock {

    public void addChild(BuildingBlock child);

    public void removeChild(BuildingBlock child);

    public List<BuildingBlock> getChildren();

    public void print();

}
