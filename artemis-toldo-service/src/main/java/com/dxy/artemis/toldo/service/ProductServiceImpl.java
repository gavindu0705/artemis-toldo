package com.dxy.artemis.toldo.service;

import com.dxy.artemis.toldo.dao.mapper.ProductMapper;
import com.dxy.artemis.toldo.dao.pojo.Product;
import com.dxy.artemis.toldo.dao.pojo.ProductExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductMapper productMapper;

    public List<Product> findProducts() {
        return productMapper.selectByExample(new ProductExample());
    }
}
