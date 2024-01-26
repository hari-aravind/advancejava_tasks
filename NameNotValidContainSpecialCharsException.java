// Problem 1

package tasksfour;
public class NameNotValidContainSpecialCharsException extends Exception{
    public NameNotValidContainSpecialCharsException (String str)
    {
        super(str);
    }
}