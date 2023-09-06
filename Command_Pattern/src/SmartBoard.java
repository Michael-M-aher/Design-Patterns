import java.util.Stack;

public class SmartBoard {
    Command command;
    Stack<Command> history = new Stack<>();

    void setCommand(Command c) {
        this.command = c;
    }

    void executeCommand() {
        command.execute();
        history.push(command);
    }

    void showHistory() {
        Stack<Command> temp = new Stack<Command>();
        temp.addAll(history);
        int size = temp.size();
        for (int i = 0; i < size; i++) {
            Command comm = temp.pop();
            System.out.println(comm);
        }
    }
}
