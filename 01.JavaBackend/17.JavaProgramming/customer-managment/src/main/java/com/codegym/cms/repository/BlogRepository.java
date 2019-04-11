package com.codegym.cms.repository;

import com.codegym.cms.model.Blog;
import com.codegym.cms.model.Category;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category category);
}
