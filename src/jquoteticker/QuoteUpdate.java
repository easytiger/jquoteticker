/*
 * QuoteUpdate.java
 *
 * Created on 30 November 2007, 14:55
 */

package jquoteticker;

/**
 *
 * @author gerry
 */
public class QuoteUpdate {
    
    private String symbolID;
    
    private double bidSize;
    private double bidPrice;
    
    private double askSize;
    private double askPrice;
    
    private String time;
    private long seqNum;
    
    private String type;
    
    /** Creates a new instance of QuoteUpdate */
    public QuoteUpdate(String symbolID,
                       double bidSize,
                       double bidPrice,
                       double askSize,
                       double askPrice,
                       String time,
                       long seqNum,
                       String type) {
        
        this.askPrice = askPrice;
        this.askSize = askSize;
        
        this.bidPrice = bidPrice;
        this.bidSize = bidSize;
        
        this.seqNum = seqNum;
        this.symbolID = symbolID;
        
        this.time = time;
        this.type = type;
        
   }
    
    @Override
    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("Symbol : " + this.getSymbolID() + "\n");
        sb.append("\tbidSize : " + this.getBidSize() + "\n");
        sb.append("\tbidPrice: " + this.getBidPrice() + "\n");
        sb.append("\taskSize : " + this.getAskSize() + "\n");
        sb.append("\taskPrice: " + this.getAskPrice() + "\n");
        sb.append("\tSeq Num : " + this.getSeqNum() + "\n");
        sb.append("\tTime    : " + this.getTime() + "\n");
        return sb.toString();
    }
    
    public QuoteUpdate(String symbolID){
        this.symbolID = symbolID;
    }

    public double getBidSize() {
        return bidSize;
    }

    public void setBidSize(double bidSize) {
        this.bidSize = bidSize;
    }

    public double getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(double bidPrice) {
        this.bidPrice = bidPrice;
    }

    public double getAskSize() {
        return askSize;
    }

    public void setAskSize(double askSize) {
        this.askSize = askSize;
    }

    public double getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(double askPrice) {
        this.askPrice = askPrice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public long getSeqNum() {
        return seqNum;
    }

    public void setSeqNum(long seqNum) {
        this.seqNum = seqNum;
    }

    public String getSymbolID() {
        return symbolID;
    }

    public void setSymbolID(String symbolID) {
        this.symbolID = symbolID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
