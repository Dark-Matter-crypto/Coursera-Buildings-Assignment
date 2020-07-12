package mooc.vandy.java4android.buildings.logic;

/**
 * This is the Building class file.
 */
public class Building {
    
    // TODO - Put your code here.
    private int mLength;
    private int mWidth;
    private int lotLength;
    private int lotWidth;

    public Building(int length, int width, int lotLength, int lotWidth){
        mLength = length;
        mWidth = width;
        this.lotLength = lotLength;
        this.lotWidth = lotWidth;
    }


    public int getLength() {
        return mLength;
    }

    public void setLength(int mLength) {
        this.mLength = mLength;
    }

    public int getWidth() {
        return mWidth;
    }

    public void setWidth(int mWidth) {
        this.mWidth = mWidth;
    }

    public int getLotLength() {
        return lotLength;
    }

    public void setLotLength(int lotLength) {
        this.lotLength = lotLength;
    }

    public int getLotWidth() {
        return lotWidth;
    }

    public void setLotWidth(int lotWidth) {
        this.lotWidth = lotWidth;
    }

    public int calcBuildingArea(){
        return mWidth * mLength;
    }

    public int calcLotArea(){
        return lotWidth * lotLength;
    }

    public String toString(){
        return "Owner: n/a";
    }
}
