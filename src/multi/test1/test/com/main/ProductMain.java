package multi.test1.test.com.main;

import test.com.product.ProductVO;

import java.util.ArrayList;

public class ProductMain {
    public static void main(String[] args) {
        ArrayList<ProductVO> products = new ArrayList<>();
        products.add(new ProductVO(1, "상품1", 10000));
        products.add(new ProductVO(2, "상품2", 20000));

        System.out.println("번호\t이름\t가격");
        for (ProductVO product : products) {
            System.out.println(product.getId() + "\t" + product.getName() + "\t" + product.getPrice());
        }
    }
}
