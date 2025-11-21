package theater;

/**
 * Represents a play with a name and type.
 */
public class Play {
    private final String name;
    private final String type;

    /**
     * Constructs a Play with the given name and type.
     *
     * @param name the name of the play
     * @param type the type of the play (e.g., tragedy, comedy)
     */
    public Play(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}