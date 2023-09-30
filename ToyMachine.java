import java.util.LinkedList;
import java.util.PriorityQueue;

public class ToyMachine {

    public LinkedList<Toy> toysList = new LinkedList<>();

    private PriorityQueue <Toy> drawList = new PriorityQueue<>();

    public int getSizeList(){
        return toysList.size();
    }

    public void addToy(String input){
        String[] newInput = input.split(";");
        toysList.add(new Toy(getSizeList(),newInput[0],Integer.parseInt(newInput[1]),Integer.parseInt(newInput[2])));
    }

    public void getList(){
        for (Toy toy :toysList) {
            System.out.println("ID: " + toy.getId() + "\n Name: " + toy.getToyName() + "\n Count: " + toy.getCount() + "\n Chance: " + toy.getChance());
        }
    }


    public void createQueue(){
        for (Toy elem:toysList) {
            for (int i = 0; i < elem.getCount(); i++) {
                drawList.add(new Toy(elem.getId(),elem.getToyName(),elem.getCount(),elem.getChance()));
                System.out.println(elem);
            }
        }
    }

    public String draw(){
        Toy element = drawList.poll();
        return ("ID: " + element.getId() +", Name:"+ element.getToyName());

    }
    public int getSizeDrawList(){
        return drawList.size();

    }



}
