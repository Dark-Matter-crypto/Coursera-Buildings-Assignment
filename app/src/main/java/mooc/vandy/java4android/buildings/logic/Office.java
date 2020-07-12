package mooc.vandy.java4android.buildings.logic;

/**
 * This is the office class file, it is a subclass of Building.
 */
public class Office extends Building {
    // TODO - Put your code here.

    private String mBusinessName;
    private int mParkingSpaces;
    private static int sTotalOffices = 0;

    public Office(int length, int width, int lotLength, int lotWidth) {
        super(length, width, lotLength, lotWidth);
        mBusinessName = null;
        mParkingSpaces = 0;
        sTotalOffices++;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName){
        this(length, width, lotLength, lotWidth);
        mBusinessName = businessName;
    }

    public Office(int length, int width, int lotLength, int lotWidth, String businessName, int parkingSpaces){
        this(length, width, lotLength, lotWidth, businessName);
        mParkingSpaces = parkingSpaces;
    }


    public String getBusinessName() {
        return mBusinessName;
    }

    public void setBusinessName(String mBusinessName) {
        this.mBusinessName = mBusinessName;
    }

    public int getParkingSpaces() {
        return mParkingSpaces;
    }

    public void setParkingSpaces(int mParkingSpaces) {
        this.mParkingSpaces = mParkingSpaces;
    }

    public String toString(){
        String outPut = "Business: ";
        if(mBusinessName == null){
            outPut += "unoccupied";
        }
        else{
            outPut += mBusinessName;
        }

        if (mParkingSpaces != 0){
            outPut += "; has " + mParkingSpaces + " parking spaces";
        }
        if(sTotalOffices != 0){
            outPut += " (total offices: " + sTotalOffices + ")";
        }
        return outPut;
    }

    public boolean equals(Object anotherObject){
        Office anotherOffice = (Office)anotherObject;
        return this.calcBuildingArea() == anotherOffice.calcBuildingArea() &&
                this.getParkingSpaces() == anotherOffice.getParkingSpaces();
    }
}
