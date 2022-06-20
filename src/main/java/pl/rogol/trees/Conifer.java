package pl.rogol.trees;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class Conifer extends Tree {
    Logger logger = LoggerFactory.getLogger(Conifer.class);

    public Conifer(double heightInMeters, double widthInMeters, double trunkThicknessInMeters, double growRate,
                   boolean isHydrated, List<Branch> branches) {
        super(heightInMeters, widthInMeters, trunkThicknessInMeters, growRate, isHydrated, branches);
    }

    @Override
    public void grow(int passedDays) {
        heightInMeters += 0.02 * growRate * passedDays;
        logger.info("Conifer is getting bigger! ");
    }

    @Override
    public void photosynthesis() {
        logger.info("Conifer photosynthesis :o");

    }
}
