package demodaojdbc.application;

import demodaojdbc.model.dao.DaoFactory;
import demodaojdbc.model.dao.SellerDao;
import demodaojdbc.model.entities.Department;
import demodaojdbc.model.entities.Seller;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("--- Test 1: seller findById---");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);
        System.out.println("\n--- Test 2: seller findByDepartment---");
        List<Seller> list = sellerDao.findByDepartment(new Department(2, null));
        for (Seller s : list) {
            System.out.println(s);
        }


    }
}
