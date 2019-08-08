package composite;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        House house = new House(0, 1, "house");

        Wall front = new Wall(1, 100, "front");
        Door frontDoor = new Door(100, 800, "frontdoor");
        Window frontWindow = new Window(100, 200, "frontwindow");
        front.addChild(frontDoor);
        front.addChild(frontWindow);

        Wall back = new Wall(1,101, "back");
        Window backWindowA = new Window(101, 201, "backwindowA");
        Window backWindowB = new Window(101, 202, "backwindowB");
        back.addChild(backWindowA);
        back.addChild(backWindowB);


        Wall left = new Wall(1,102, "left");
        Wall right = new Wall(1,103, "right");

        Roof roof = new Roof(1,500, "roof");

        house.addChild(front);
        house.addChild(back);
        house.addChild(left);
        house.addChild(right);
        house.addChild(roof);

        traverseAndPrintChildren(house);

    }

    public static void traverseAndPrintChildren(BuildingBlock buildingBlock){
        buildingBlock.print();
        for (BuildingBlock child: buildingBlock.getChildren()){
            traverseAndPrintChildren(child);
        }
    }
}
