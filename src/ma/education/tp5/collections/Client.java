package ma.education.tp5.collections;

import java.util.Objects;

public class Client implements Comparable{
    public int code;
    public String name;

    public Client(int code, String name) {
        this.code = code;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Client{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return code == client.code && Objects.equals(name, client.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code);
    }

    @Override
    public int compareTo(Object o) {
        Client client = (Client) o;
        return -client.code+this.code;
    }
}
