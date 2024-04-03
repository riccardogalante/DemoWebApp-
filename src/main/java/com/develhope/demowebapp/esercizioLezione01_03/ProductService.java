package com.develhope.demowebapp.esercizioLezione01_03;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    private List<Product> listaproduct;
    public Product addProduct(Product product){
        listaproduct.add(product);
        return product;
    }
    public Product getProductById(String idDaCercare){
        Product productCollegamento = null;
        for(Product product : listaproduct){
            if(product.getId().equals(idDaCercare)){
                productCollegamento = product;
            }
        }
        return productCollegamento;
    }
    public List<Product> getAllProducts(){
//        List<Product> collegamento = null;
//        for(Product product : listaproduct){
//            collegamento.add(product);
//        }
//        return collegamento;
        return listaproduct;
    }

    public void updateProduct(Product product){
        for(Product product1 : listaproduct){
            if(product1.getId().equals(product.getId())){
                product1.setId(product.getId());
                product1.setDescrizione(product.getDescrizione());
                product1.setNome(product.getNome());
                product1.setPrezzo(product.getPrezzo());
            }
        }
    }
    public Product deleteProduct(Product product){
        listaproduct.remove(product);
        return product;
    }


}
