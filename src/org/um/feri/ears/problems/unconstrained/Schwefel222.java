package org.um.feri.ears.problems.unconstrained;

import org.um.feri.ears.problems.Problem;

import java.util.ArrayList;
import java.util.Collections;

import static java.lang.Math.abs;

/*
http://infinity77.net/global_optimization/test_functions_nd_S.html#go_benchmark.Schwefel22
http://benchmarkfcns.xyz/benchmarkfcns/schwefel222fcn.html
https://www.al-roomi.org/benchmarks/unconstrained/n-dimensions/190-schwefel-s-function-2-22
 */
public class Schwefel222 extends Problem {
    public Schwefel222(int d) {
        super(d, 0);
        lowerLimit = new ArrayList<Double>(Collections.nCopies(numberOfDimensions, -100.0));
        upperLimit = new ArrayList<Double>(Collections.nCopies(numberOfDimensions, 100.0));
        name = "Schwefel222";
    }

    @Override
    public double eval(double[] x) {
        double sum = 0, prod = 1.0;
        for (int i = 0; i < numberOfDimensions; i++) {
            sum += abs(x[i]);
            prod *= abs(x[i]);
        }
        return sum + prod;
    }
}
