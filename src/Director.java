public class Director {
    private String name;
    private String lastName;

    public Director(String name, String lastName, Cast cast) {
        this.name = name;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "" + name +
                "" + lastName +
                "";
    }
}
