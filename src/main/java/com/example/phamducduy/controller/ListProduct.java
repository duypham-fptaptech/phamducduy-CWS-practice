package com.example.phamducduy.controller;

import com.example.phamducduy.entity.Product;
import com.example.phamducduy.model.ProductModel;
import com.example.phamducduy.model.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListProduct extends HttpServlet {
    private ProductModel productModel;

    public ListProduct() {
        this.productModel = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> list = productModel.findAll();
        req.setAttribute("listProduct", list);
        req.getRequestDispatcher("/view/ListProduct.jsp").forward(req, resp);
    }
}
