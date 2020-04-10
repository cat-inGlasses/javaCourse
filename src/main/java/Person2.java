@Author(name = "Nikita", dateOfCreation = 2020)
public class Person2 {
    private int id;
    private String name;

    public Person2() {
        this.id = -1;
        this.name = "No name";
    }

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void sayHello() {
        System.out.println("Persont with id: " + id + " and name: " + name + " says hello!");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
