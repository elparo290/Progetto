import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

import view.Finestra;
import model.Model;

public class Controller implements ActionListener {
    private Finesta finestra;

    public Controller(Finestra finestra){
        this.finestra = finestra;
    }
}
