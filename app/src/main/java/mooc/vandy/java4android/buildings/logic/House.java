package mooc.vandy.java4android.buildings.logic;

/**
 * This is the House class file that extends Building.
 */
public class House extends Building {
    // TODO - Put your code here.

    private String mOwner;
    private boolean mPool;

    public House(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        mPool = false;
        mOwner = null;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner){
        this(length, width, lotLength, lotWidth);
        mOwner = owner;
    }

    public House(int length, int width, int lotLength, int lotWidth, String owner, boolean pool){
        this(length, width, lotLength, lotWidth, owner);
        mPool = pool;
    }


    public String getOwner() {
        return mOwner;
    }

    public void setOwner(String mOwner) {
        this.mOwner = mOwner;
    }

    public boolean hasPool() {
        return mPool;
    }

    public void setPool(boolean mPool) {
        this.mPool = mPool;
    }

    public String toString(){
        if(mOwner != null) {
            String outPut = "Owner: " + mOwner;
            if (hasPool()) {
                outPut += "; has a pool";
            }
            if (calcLotArea() > calcBuildingArea()) {
                outPut += "; has a big open space";
            }
            return outPut;
        }
        else{
            return "Owner: n/a";
        }
    }

    public boolean equals(Object anotherObject){
        House anotherHouse = (House)anotherObject;
        return mPool == anotherHouse.hasPool() && this.calcBuildingArea() == anotherHouse.calcBuildingArea();
    }
}
