package lesson6;

public class Adults extends Person{

    private String maidenName;

    public Adults(String name, int age, String idNum, double height){
        super(name, age, idNum, height);
    }

    public String getMaidenName() {
        return maidenName;
    }

    public void setMaidenName(String maidenName) {
        this.maidenName = maidenName;
    }
}
