package model;

import java.util.Stack;

public class CommandHistory {

    private final Stack<Command> history;

    public CommandHistory() {
        this.history = new Stack<>();
    }

    public void setCommand(Command command) {
        this.history.push(command);
    }

    public Command pop() {
        return this.history.pop();
    }

    public boolean isStackEmpty() {
        return this.history.isEmpty();
    }
}
