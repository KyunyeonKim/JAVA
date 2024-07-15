package multi.product;

import java.util.ArrayList;
import java.util.List;

public class ProductDAOImpl implements ProductDAO{

   private List<ProductVO> productList = new ArrayList<>();

    @Override
    public int insert(ProductVO vo) {
        productList.add(vo);
        System.out.println("insert"+vo);
        return 1 ;
    }

    @Override
    public int update(ProductVO vo) {
        for (int i = 0; i <productList.size() ; i++) {
            ProductVO productVo = productList.get(i);
            if (productVo.getNum() == vo.getNum()) {
                productVo.setCount(vo.getCount());
                productVo.setPname(vo.getPname());
                productVo.setModel(vo.getModel());
                productVo.setPrice(vo.getPrice());
                System.out.println("update"+vo);
            }

        }
        return 2;
    }

    @Override
    public int delete(ProductVO vo) {
        for (int i = 0; i <productList.size(); i++) {
            ProductVO productVO = productList.get(i);
            if (productVO.getNum() == vo.getNum()) {
                productList.remove(i);
                System.out.println("delete id"+ vo.getNum());

            }

        }
        return 3;
    }

    @Override
    public ProductVO selectOne(ProductVO vo) {
        for (int i = 0; i < productList.size(); i++) {
            ProductVO productVO = productList.get(i);
            if (productVO.getNum() == vo.getNum()) {
                return productVO;

            }
        }
        return null;
    }

    @Override
    public List<ProductVO> selectAll() {
        return new ArrayList<>(productList);
    }

    @Override
    public List<ProductVO> searchList(String searchKey, String searchWord) {

        System.out.println("searchList()..");
        System.out.println("Search Key: " + searchKey);
        System.out.println("Search Word: " + searchWord);
        List<ProductVO> vo = new ArrayList<>();

        if (searchKey.equals("pname")){
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getPname().contains(searchWord)) {
                    vo.add(productList.get(i));

                }
            }
        }else if(searchKey.equals("model")){
            for (int i = 0; i < productList.size(); i++) {
                if (productList.get(i).getModel().contains(searchWord)) {
                    vo.add(productList.get(i));
                }
            }
        }
        return vo;
    }


}
