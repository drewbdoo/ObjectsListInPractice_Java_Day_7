public class Animal {
    private String name;
    private Boolean isDog;

    public  Animal(String name, Boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName(){
        return name;
    }

    public String getIsDog(){
        return isDog.toString();
    }

    public String toString(){
        return getName() + " is a dog = " + getIsDog();
    }


}
