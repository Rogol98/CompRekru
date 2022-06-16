package pl.rogol.trees;

import java.util.List;

public abstract class Tree {

    double heightInMeters;
    double widthInMeters;
    double trunkThicknessInMeters;
    double growRate;
    boolean isHydrated;
    List<Branch> branches;

    public abstract void grow(int passedDays);

    public abstract void photosynthesis();

    Tree(double heightInMeters, double widthInMeters, double trunkThicknessInMeters, double growRate, boolean isHydrated, List<Branch> branches) {
        this.heightInMeters = heightInMeters;
        this.widthInMeters = widthInMeters;
        this.trunkThicknessInMeters = trunkThicknessInMeters;
        this.growRate = growRate;
        this.isHydrated = isHydrated;
        this.branches = branches;
    }

    public double getHeightInMeters() {
        return heightInMeters;
    }

    public void setHeightInMeters(double heightInMeters) {
        this.heightInMeters = heightInMeters;
    }

    public double getWidthInMeters() {
        return widthInMeters;
    }

    public void setWidthInMeters(double widthInMeters) {
        this.widthInMeters = widthInMeters;
    }

    public double getTrunkThicknessInMeters() {
        return trunkThicknessInMeters;
    }

    public void setTrunkThicknessInMeters(double trunkThicknessInMeters) {
        this.trunkThicknessInMeters = trunkThicknessInMeters;
    }

    public double getGrowRate() {
        return growRate;
    }

    public void setGrowRate(double growRate) {
        this.growRate = growRate;
    }

    public boolean isHydrated() {
        return isHydrated;
    }

    public void setHydrated(boolean hydrated) {
        isHydrated = hydrated;
    }

    public List<Branch> getBranches() {
        return branches;
    }

    public void setBranches(List<Branch> branches) {
        this.branches = branches;
    }
}
