package util;

import java.awt.Component;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

public class Utilidades {
    public void limparTelalp(JLayeredPane container){
        Component components[] = container.getComponents();
        for(Component component : components){
            if(component instanceof JTextField){
                ((JTextField) component).setText(null);
            }
            if(component instanceof JFormattedTextField){
                ((JFormattedTextField) component).setText(null);
            }
            if(component instanceof JCheckBox){
                ((JCheckBox) component).setSelected(false);
            }
            if(component instanceof JComboBox){
                ((JComboBox) component).setSelectedItem("0");
            }
        }
    }
    public void limpaAreaAdmadm(JLayeredPane container){
        Component components[] = container.getComponents();
        for(Component component : components){
            if(component instanceof JTextField){
                ((JTextField) component).setText(null);
            }
            if(component instanceof JComboBox){
                ((JComboBox) component).setSelectedItem("ALL");
            }
            if(component instanceof JCheckBox){
                ((JCheckBox) component).setSelected(false);
            }
        }
    }
}
