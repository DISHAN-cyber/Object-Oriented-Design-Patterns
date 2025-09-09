package model;

import gui.Editor;

public class CutCommand extends Command {

    public CutCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if (editor.getEditorArea().getSelectedText().isEmpty()) {
            return false;
        }

        backup();
        String source = editor.getEditorArea().getText();
        editor.setClipboardText(editor
                .getEditorArea().getSelectedText());
        editor.getEditorArea().setText(cutString(source));
        return true;
    }

    private String cutString(String source) {
        String start = source.substring(0, 
                editor.getEditorArea()
                        .getSelectionStart());
        String end = source.substring(editor.getEditorArea().getSelectionEnd());
        return start + end;
    }
}
