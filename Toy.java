public class Toy implements Comparable <Toy> {
    private int id;
    private String toyName;
    private int count;
    private int chance;

    ToyMachine toyMachine = new ToyMachine();
    public Toy(int id, String toyName, int count, int chance) {
        this.id = id;
        this.toyName = toyName;
        this.count = count;
        this.chance = chance;
    }

    public Toy(String toyName, int count) {
        this.toyName = toyName;
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getToyName() {
        return toyName;
    }

    public void setToyName(String toyName) {
        this.toyName = toyName;
    }

    public int getChance() {
        return chance;
    }

    public void setChance(int chance) {
        this.chance = chance;
    }
    @Override
    public int compareTo(Toy other) {
        if (other == null) {
            return -1;
        }
        int delta = this.chance - other.chance;
        if (delta != 0) {
            return - delta;
        }
        return this.toyName.compareTo(other.toyName);
    }

    @Override
    public String toString() {
        return "Toy{" +
                "id=" + id +
                ", toyName='" + toyName + '\'' +
                ", count=" + count +
                ", chance=" + chance +
                ", toyMachine=" + toyMachine +
                '}';
    }
    //    private int generateToyId(){
//        return toyMachine.getSizeList() + 100;
//    }
}
