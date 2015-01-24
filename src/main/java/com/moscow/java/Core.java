package main.java.com.moscow.java;

/**
 * Created by messi on 23.01.2015.
 */

public class Core {

    private String name;

    public Core() {
    }

    public Core(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Core core = new Core();
        core.setName("Moscow");
        System.out.print(core.getName());
    }

}
