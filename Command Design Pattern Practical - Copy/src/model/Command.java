package model;

import gui.Editor;

public abstract class Command {

    protected Editor editor;
    private String backup;

    public Command(Editor editor) {
        this.editor = editor;
    }

    void backup() {
        backup = editor.getEditorArea().getText();
    }

    public void undo() {
        editor.getEditorArea().setText(backup);
    }

    public abstract boolean execute();
}
