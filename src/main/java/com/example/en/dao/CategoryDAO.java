package com.example.en.dao;

import com.example.en.pojo.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryDAO extends JpaRepository<Category, Integer>
{
//不需要额外构造方法，使用JPA默认方法
}
