package Review23rdFebruary;
public class PrivateClient {
// THIS IS THE WAY DOING IT THROUGH CONSTRUCTOR
    private String name;
    private long ssn;

    PrivateClient (String name, long ssn) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        }
        if (ssn != 0) {
            this.ssn = ssn;
        }
    }
    public String getName () {
        return name;
    }
    public long getSsn () {
        return ssn;
    }
}
