import java.util.Scanner;

public class Menu {
    ToyMachine toyMachine = new ToyMachine();
    public void startMenu(){
        while (true){
            System.out.println("1. Добавить игрушку \n 2. Список игрушек \n 3. Розыгрыш \n 4. Выход");
            Scanner sc = new Scanner(System.in);
            int inputUser = sc.nextInt();

            if(inputUser == 1){
                toyMachine.addToy(getName());
            } else if (inputUser == 2){
                toyMachine.getList();
            }else if (inputUser == 3){
                toyMachine.createQueue();
                while (true){
                    sc.nextLine();
                    int input = sc.nextInt();
                    if (input != 0){
                        System.out.println("Вы выйграли:");
                        System.out.println(toyMachine.draw());
                        System.out.println("Игрушек осталось: " + toyMachine.getSizeDrawList());
                    } else if(input == 0){
                        return;
                    }
                }
            }else if (inputUser == 4){
                return;
            }

        }
    }
    public String getName(){
        System.out.println("Введите разыгрываемый товар в виде:\n Название товара; количество товара; шанс");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        return input;
    }

}
