package org.um.feri.ears.problems.unconstrained.cec2010;

import org.um.feri.ears.problems.unconstrained.cec.Functions;
import org.um.feri.ears.util.Util;

import java.util.ArrayList;
import java.util.Collections;

public class F1 extends CEC2010 {

    int[] P;

    public F1(int d) {
        super(d, 1);

        lowerLimit = new ArrayList<Double>(Collections.nCopies(numberOfDimensions, -100.0));
        upperLimit = new ArrayList<Double>(Collections.nCopies(numberOfDimensions, 100.0));

        name = "F01 Shifted Elliptic Function";
        OShift = new double[numberOfDimensions];

        for (int i = 0; i < numberOfDimensions; i++) {
            OShift[i] = Util.nextDouble(lowerLimit.get(i), upperLimit.get(i));
        }

    }

    public double eval(double[] x) {
        return Functions.ellips_func(x, numberOfDimensions, OShift, M, 1, 0);
    }

}
