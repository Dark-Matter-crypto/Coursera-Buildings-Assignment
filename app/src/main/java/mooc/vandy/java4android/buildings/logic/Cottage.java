package mooc.vandy.java4android.buildings.logic;

/**
 * This is the cottage class file.  It is a subclass of House.
 */
public class Cottage extends House {
    // TODO - Put your code here.

    private boolean mSecondFloor;

    public Cottage(int dimension, int lotLength, int lotWidth){
        super(dimension, dimension, lotLength, lotWidth);
    }

    public Cottage(int dimension, int lotLength, int lotWidth, String owner, boolean secondFloor) {
        super(dimension, dimension, lotLength, lotWidth, owner);
        mSecondFloor = secondFloor;
    }

    public boolean hasSecondFloor() {
        return mSecondFloor;
    }

    public String toString(){
        if(super.getOwner() != null) {
            String outPut = "Owner: " + super.getOwner();
            if (hasPool()) {
                outPut += "; has a pool";
            }
            if (calcLotArea() > calcBuildingArea()) {
                outPut += "; has a big open space";
            }

            if(hasSecondFloor()){
                outPut += "; is a two story cottage";
            }
            else{
                outPut += "; is a cottage";
            }
            return outPut;
        }
        else{
            return "Owner: n/a";
        }
    }
}

