public class Account
{
private String username; // To be initialized in part (a)
/**
* Creates a username based on the parameter requestedName. If the
* username is unavailable, appends successive integers, beginning
* with 1, to requestedName until an available username is found,
* as described in part (a).
*/
public Account(String requestedName)
{ /* to be implemented in part (a) */ }
/**
* Returns true if the parameter str is an available username;
* returns false otherwise.
*/
public static boolean isAvailable(String str)
{ /* implementation not shown */ }
/**
* Returns a shortened version of username with each hyphen ("-")
* and the character before it removed, as described in part (b)
* Preconditions: username does not start or end with a hyphen.
* username does not contain consecutive hyphens.
* username.length() >= 2
* Postcondition: username is unchanged.
*/
public String getShortenedName()
{ /* to be implemented in part (b) */ }
/* There may be instance variables, constructors, and methods
that are not shown. */
}
