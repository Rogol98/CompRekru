package pl.rogol.trees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class LeafyTree extends Tree {
    Logger logger = LoggerFactory.getLogger(LeafyTree.class);

    public LeafyTree(double heightInMeters, double widthInMeters, double trunkThicknessInMeters, double growRate,
                     boolean isHydrated, List<Branch> branches, Logger logger) {
        super(heightInMeters, widthInMeters, trunkThicknessInMeters, growRate, isHydrated, branches);
    }

    @Override
    public void grow(int passedDays) {
        heightInMeters += growRate * passedDays;
        trunkThicknessInMeters += 0.02 * growRate * passedDays / 50;
        logger.info("Leafy tree is getting bigger! ");
    }

    @Override
    public void photosynthesis() {
        logger.info("Leafy photosynthesis :-)");
    }
}
