package be;

/**
 * SolverImpl
 * Implements Solver interface
 */
public class SolverImpl implements Solver {
    public double solve(Function function, double x1, double x2) throws UnableToFindSolutionException {
        
        if (function != null) {
            
            return function.getValue(1.0);
        } 
        
        throw new UnableToFindSolutionException("Funciton object can't be null null.");
    }
}