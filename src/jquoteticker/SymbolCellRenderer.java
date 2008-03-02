/*
 * SymbolCellRenderer.java
 *
 * Created on 01 December 2007, 21:11
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package jquoteticker;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author gerry
 */
public class SymbolCellRenderer  extends DefaultTableCellRenderer {

    @Override
    public Component getTableCellRendererComponent(JTable table, Object value,
                          boolean isSelected, boolean hasFocus, int row, int column) {
        
        this.setText(value.toString());
        this.setBackground(Color.getHSBColor(0,3,86));
        
        return this;
    }
    
}
