package com.company;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);


        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));

        MotherBoard theMotherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(theCase, theMonitor, theMotherBoard);
//        thePC.getMonitor().drawPixelAt(1500,1200,"red"); /////////// Tim le-a sters ptr ca sters si geterururile din PC class
//        thePC.getMotherBoard().loadProgram("Windows 1.0");
//        thePC.getTheCase().pressPowerButton();

        thePC.powerUp();


        Wall wall1 = new Wall("WEST");
        Wall wall2 = new Wall("EAST");
        Wall wall3 = new Wall("SOUTH");
        Wall wall4 = new Wall("NORTH");

        Celing ceiling = new Celing(12, "55");

        Bed bed = new Bed("modern", 4, 3, 2, 1);

        Lamp lamp = new Lamp("Classic", false, 75);

        Bedroom bedRoom = new Bedroom("Tims", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
        bedRoom.makeBed();
        bedRoom.getLamp().turnOn();

    }

}
