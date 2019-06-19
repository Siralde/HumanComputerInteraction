package es.uv.eu.photeditor;

import es.uv.eu.photoeditor.controller.PhotoEditorController;
import es.uv.eu.photoeditor.model.PhotoEditorModel;
import es.uv.eu.photoeditor.view.PhotoEditorView;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author diaz
 */
public class PhotoEditor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PhotoEditorModel model = new PhotoEditorModel();
        PhotoEditorView view = new PhotoEditorView(model);
        PhotoEditorController controlador = new PhotoEditorController(view, model);

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        view.setVisible(true);
        view.setSize(screenSize.width, screenSize.height);
    }
}
