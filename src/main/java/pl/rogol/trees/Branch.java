package pl.rogol.trees;

public class Branch {

    private boolean isLeafy;
    private int noOfSubbranches;
    // ...other features


    public Branch(boolean isLeafy, int noOfSubbranches) {
        this.isLeafy = isLeafy;
        this.noOfSubbranches = noOfSubbranches;
    }

    public boolean isLeafy() {
        return isLeafy;
    }

    public void setLeafy(boolean leafy) {
        isLeafy = leafy;
    }

    public int getNoOfSubbranches() {
        return noOfSubbranches;
    }

    public void setNoOfSubbranches(int noOfSubbranches) {
        this.noOfSubbranches = noOfSubbranches;
    }
}
