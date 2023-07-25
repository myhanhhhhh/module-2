package ss16.exercises.read_file;

public class People {
    private int id;
    private String code;
    private String name;

    public People() {

    }

    public People(int id, String code, String name) {
        this.id = id;
        this.code = code;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getIntoCsv(){
        return id + "," + code +","+name;
    }

    @Override
    public String toString() {
        return "List{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
