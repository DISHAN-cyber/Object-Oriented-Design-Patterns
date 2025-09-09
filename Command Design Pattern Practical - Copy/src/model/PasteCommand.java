package model;

import gui.Editor;

public class PasteCommand extends Command {

    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.getClipboardText() == null || 
                editor.getClipboardText().isEmpty()) {
            return false;
        }
        backup();
        editor.getEditorArea()
                .insert(editor
                        .getClipboardText(),
                        editor.getEditorArea()
                                .getCaretPosition());
        return true;
    }

}
