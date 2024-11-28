package PrajwalPrograms.immutable;

public final class Location {

    private String name;
    private int code;

    Location(String name, int code){

        this.name=name;
        this.code=code;
    }

    public int getCode() {
        return code;
    }

    public String getName(){
        return name;
    }

}
