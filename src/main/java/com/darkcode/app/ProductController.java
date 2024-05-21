package com.darkcode.app;
import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.darkcode.app.domain.Product;

@Controller
public class ProductController {
    @GetMapping("/product")
    public String informacionProducto(Model model) {
        Product product = new Product();
        product.setProduct_name("Product 1");
        product.setCategory_name("category 1");
        product.setPrice(140000f);
        model.addAttribute("productAttributes", product);
        return "show_product";
    }


    @GetMapping("/products")
    public String listarProductos(Model model) {
        Product product1 = new Product();
        Product product2 = new Product();

        product1.setProduct_name("P1");
        product1.setCategory_name("C2");
        product1.setPrice(15000f);

        product2.setProduct_name("P2");
        product2.setCategory_name("C3");
        product2.setPrice(19000f);

       
        ArrayList<Product> productos = new ArrayList<>();
       productos.add(product1);
       productos.add(product2);

        model.addAttribute("productListAttribute", productos);
        return "products";
    }
}
