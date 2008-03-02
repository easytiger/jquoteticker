/*
 * QuoteTableModel.java
 *
 * Created on 30 November 2007, 14:31 
 */

package jquoteticker;

import java.util.Vector;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;
import javax.swing.table.AbstractTableModel;

/**
 * @author gerry
 */
public class QuoteTableModel extends AbstractTableModel implements TableModelListener {
    Vector<QuoteUpdate> symbols = null;
    
    /** Creates a new instance of QuoteTableModel */
    public QuoteTableModel(Vector<QuoteUpdate> syms) {
        this.symbols = syms;        
    } 
    
    @Override
    public int getRowCount() {
        return symbols.size();
    }
    
    @Override
    public int getColumnCount() {
        return 8;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        QuoteUpdate tmp = symbols.get(rowIndex);
         
        switch (columnIndex){
            case 0: return  tmp.getSymbolID();
            case 1: return tmp.getAskPrice();
            case 2: return tmp.getAskSize();
            case 3: return tmp.getBidPrice();
            case 4: return tmp.getBidSize();
            case 5: return tmp.getTime();
            case 6: return tmp.getSeqNum();
            case 7: return tmp.getType();
            default: return "err";
        }
    }
    
    /**
     * take a QuoteUpdate object with a new quote and replace the existing 
     * quote data for it and call the table update
     */
    public void updateSymbolEntry(QuoteUpdate newQU){
        int c;

        for (c = 0; c < symbols.size(); c++){
            if (symbols.get(c).getSymbolID().equals(newQU.getSymbolID())){
                symbols.setElementAt(newQU,c);
                this.fireTableDataChanged();
                return;
            }
        }   
    }//ends updateSymEntry

    @Override
    public void tableChanged(TableModelEvent e) {
            
    }

    @Override
    public String getColumnName(int column) {
           switch (column){
            case 0: return "Symbol";
            case 1: return "askPrice";
            case 2: return "askSize";
            case 3: return "bidPrice";
            case 4: return "bidSize";
            case 5: return "Time";
            case 6: return "Seq Num";
            case 7: return "Type";
            default: return "err";
        }
    }
}
