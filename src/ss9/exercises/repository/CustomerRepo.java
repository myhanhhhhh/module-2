package ss9.exercises.repository;

import ss9.exercises.model.Customer;

public class CustomerRepo1 implements ICustomerRepo {
    private static Customer[] customerlist = new Customer[3];
    private int size = 0;

    static {
        customerlist[0] = new Customer(1, "A", 10, "nho");
        customerlist[1] = new Customer(2, "B", 20, "nho");
        customerlist[2] = new Customer(3, "C", 30, "lon");
    }

    @Override
    public Customer[] display() {
        return customerlist;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerlist[size] = customer;
        size++;
    }

    @Override
    public boolean deleteCustomer(int id) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bạn có chắn chắn muốn xoá ID " + id + " Của Học Viên Không :" +
                "\n1.Có" +
                "\n2.Không");
        int check = Integer.parseInt(scanner.nextLine());
        if (check == 1) {
            for (int i = 0; i < students.size(); i++) {
                if (id == students.get(i).getId()) {
                    students.remove(i);
                }
            }
        }
    }
}
