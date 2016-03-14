package be;

/**
 * BoseEinstein
 *
 */
public class BoseEinstein 
{
    public static void main( String[] args )
    {        
        System.out.println( "Bose-Einstein" );
        
        SinFunction sinFunction = new SinFunction();
        System.out.println( sinFunction.getValue(1.0) );
        
        SolverImpl solver = new SolverImpl();
        try {
            double value = solver.solve(sinFunction, 0.0, 1.0);
            System.out.println(value);
        } catch (UnableToFindSolutionException ufse) {
            System.err.println("Exception: " + ufse.getMessage());
        }        
    }
}
