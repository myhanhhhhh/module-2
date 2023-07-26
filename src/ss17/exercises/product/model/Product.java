package ss17.exercises.product.model;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private  int price;
    private  String company;
    private String description;

    public Product() {
    }

    public Product(int id, String name, int price, String company, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.company = company;
        this.description = description;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
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

    public String getIntoCsv(){
        return this.id + "," + this.name +","+this.price +"," + this.company +"," + this.description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", company='" + company + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
