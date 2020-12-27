package org.um.feri.ears.benchmark;

import org.um.feri.ears.problems.DoubleSolution;
import org.um.feri.ears.problems.EnumStopCriterion;
import org.um.feri.ears.problems.Problem;
import org.um.feri.ears.problems.Task;
import org.um.feri.ears.problems.unconstrained.cec2014.*;


public class RatingCEC2014 extends RatingBenchmark {
    public static final String name = "Benchmark CEC 2014";
    protected int dimension;


    public boolean resultEqual(DoubleSolution a, DoubleSolution b) {
        if ((a == null) && (b == null)) return true;
        if (a == null) return false;
        if (b == null) return false;
        if (Math.abs(a.getEval() - b.getEval()) < drawLimit) return true;
        return false;
    }

    public RatingCEC2014() {
        this(1e-7);
    }

    public RatingCEC2014(double drawLimit) {
        super();
        this.drawLimit = drawLimit;
        maxEvaluations = 30000;
        dimension = 30;
        timeLimit = 0;
        maxIterations = 0;
        initFullProblemList();
        addParameter(EnumBenchmarkInfoParameters.DIMENSION, "" + dimension);
        addParameter(EnumBenchmarkInfoParameters.EVAL, String.valueOf(maxEvaluations));
        addParameter(EnumBenchmarkInfoParameters.DRAW_PARAM, "abs(evaluation_diff) < " + drawLimit);
    }

    /* (non-Javadoc)
     * @see org.um.feri.ears.benchmark.RatingBenchmark#registerTask(org.um.feri.ears.problems.Problem)
     */
    @Override
    protected void registerTask(Problem p, EnumStopCriterion sc, int eval, long time, int maxIterations, double epsilon) {
        listOfProblems.add(new Task(sc, eval, time, maxIterations, epsilon, p));
    }

    /* (non-Javadoc)
     * @see org.um.feri.ears.benchmark.RatingBenchmark#initFullProblemList()
     */
    @Override
    protected void initFullProblemList() {

        registerTask(new F1(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F2(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F3(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F4(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F5(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F6(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F7(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F8(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F9(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F10(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F11(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F12(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F13(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F14(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F15(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F16(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F17(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F18(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F19(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F20(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F21(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F22(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F23(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F24(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F25(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F26(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F27(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F28(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F29(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);
        registerTask(new F30(dimension), stopCriterion, maxEvaluations, timeLimit, maxIterations, 0.001);

    }

    /* (non-Javadoc)
     * @see org.um.feri.ears.benchmark.RatingBenchmark#getName()
     */
    @Override
    public String getName() {
        return name;
    }

    /* (non-Javadoc)
     * @see org.um.feri.ears.benchmark.RatingBenchmark#getAcronym()
     */
    @Override
    public String getAcronym() {
        return "CEC2014";
    }

    /* (non-Javadoc)
     * @see org.um.feri.ears.benchmark.RatingBenchmark#getInfo()
     */
    @Override
    public String getInfo() {
        return "";
    }

}