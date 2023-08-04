package ss_02.model;

public class product {
    private String id ;
    private String name;
    private double price;
    private String  company;
    private String description;

    public product() {
    }

    public product(String id, String name, double price, String company, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.company = company;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
