package rinaldifauzi.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rinaldifauzi.spring.core.repository.ProductRepository;

@Component
public class ProductService {
    @Getter
    private ProductRepository productRepository;

    //    constructor1
    @Autowired
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    //    multiple constructor
    //    constructor2
    public ProductService(ProductRepository productRepository, String name){
        this.productRepository = productRepository;
    }
}
