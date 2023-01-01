import java.util.ArrayList;

public class Waitor {

    private ArrayList<Command> commands;//可以持有很多的命令对象

    public Waitor() {
        commands = new ArrayList();
    }

    public void setCommand(Command cmd){
        commands.add(cmd);
    }

    // Waiter发出命令 喊 Orders来了，Chef开始执行
    public void orderUp() {
        System.out.println("Waiter：Here are the Orders!");
        for (int i = 0; i < commands.size(); i++) {
            Command cmd = commands.get(i);
            if (cmd != null) {
                cmd.execute();
            }
        }
    }
}
