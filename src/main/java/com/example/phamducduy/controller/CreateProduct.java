package com.example.phamducduy.controller;

import com.example.phamducduy.entity.Product;
import com.example.phamducduy.model.ProductModel;
import com.example.phamducduy.model.ProductService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.HashMap;

public class CreateProduct extends HttpServlet {

    private ProductModel productModel;

    public CreateProduct() {
        this.productModel = new ProductService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        // trả về form.
        req.setAttribute("product", new Product());
        req.getRequestDispatcher("/view/CreateProduct.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        // xử lý validate và save.
        int id = 1;
        String name = req.getParameter("name");
        int price = Integer.parseInt(req.getParameter("price"));
        int quantity = Integer.parseInt(req.getParameter("quantity"));
        int status = 1;
        Product product = new Product(id, name, price, quantity, status);
        if (productModel.save(product) != null) {
            resp.sendRedirect("/list");
        } else {
            req.getRequestDispatcher("/view/CreateProduct.jsp").forward(req, resp);
        }
    }
}
