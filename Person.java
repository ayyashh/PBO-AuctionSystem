public class Person
{
    // The name of this user.
    private final String name;

    /**
     * Create a new user with the given name.
     * @param name The user's name.
     */
    public Person(String name)
    {
        this.name = name;
    }

    /**
     * @return The user's name.
     */
    public String getName()
    {
        return name;
    }
}