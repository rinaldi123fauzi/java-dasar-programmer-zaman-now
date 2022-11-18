package rinaldifauzi.spring.core.service;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import rinaldifauzi.spring.core.repository.CategoryRepository;

@Component
public class CategoryService {

    @Getter
    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }
}
