package be;

/** Interface for an equation solver. */
public interface Solver
{
    /** Find solution x such that f(x) = 0 (For x1 < x < x2).
     *
     * If the solver is unable to find a solution an
     * UnableToFindSolutionException exception is thrown.
     *
     * @param function Reference to Function-object.
     * @param x1 Start of interval.
     * @param x2 End of interval.
     *
     * @return Solution such that f(x) = 0.
     */
    public double solve(Function function, double x1, double x2) throws UnableToFindSolutionException;
}
