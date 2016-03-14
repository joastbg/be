package be;

/** Exception class that extends java.lang.Exception. */
public class UnableToFindSolutionException extends java.lang.Exception
{
    /** Constructor that takes a diagnostic message as argument. */
    public UnableToFindSolutionException(String message)
    {
	super(message);
    }
}
