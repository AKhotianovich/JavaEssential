package Lesson9.Package2;

public class Animal {
    private String name;
    private int old;
    private boolean hvost;

    public Animal(String name, int old, boolean hvost) {
        this.name = name;
        this.old = old;
        this.hvost = hvost;
    }

    public String getName() {
        return name;
    }

    public int getOld() {
        return old;
    }

    public boolean isHvost() {
        return hvost;
    }

    @Override
    public String toString(){
        if (isHvost()) {
            return "Name:" + getName() + ", Years old:" + getOld() + ", Hvost: Yes";
        }else {
            return "Name:" + getName() + ", Years old:" + getOld() + ", Hvost: No";
        }
    }

    @Override
    public boolean equals(Object obj){
        return super.equals(obj);
    }

    @Override
    public int hashCode(){
        return super.hashCode();
    }
}
