/*
 * Symbols.java
 *
 * Created on 30 November 2007, 13:11
 *
 */
package jquoteticker;

import java.util.Vector;
import java.io.*;

/**
 *
 * @author gerry
 */
public class Symbols {

    private Vector<QuoteUpdate> symVect = new Vector<QuoteUpdate>();
    private String fileName;

    /** Creates a new instance of Symbols */
    public Symbols(String fileName) {
        this.fileName = fileName;
    }

    public Vector<QuoteUpdate> loadSymsFromFile() throws FileNotFoundException, IOException {

        BufferedReader inSymsStream = null;
        String tmp;

        inSymsStream = new BufferedReader(new FileReader(this.fileName));

        System.out.println("Reading File \"" + fileName + "\"");

        while ((tmp = inSymsStream.readLine()) != null) {
            symVect.add(new QuoteUpdate(tmp));
        }

        System.out.println("Read " + symVect.size() + " symbols from file");

        return symVect;

    }
}
