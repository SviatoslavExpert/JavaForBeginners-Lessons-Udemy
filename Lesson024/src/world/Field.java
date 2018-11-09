package world;

public class Field {
    private Plant plant = new Plant();

    //  size is protected, and the Field is in the same package as Plant
    public Field() {
        System.out.println(plant.size);
    }
}

