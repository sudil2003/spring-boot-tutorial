package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


    @RestController
    @RequestMapping
   public class ProductController {
        @GetMapping("/product")
        public Product  getproduct(){
            Product p = new Product(1L, "ok", 140);
            return p;
        }

        @GetMapping("/example")
        public Product getexample(){
            Product p = new Product(1L, "ok", 140);
            return p;
        }

        @GetMapping("/product{id}")
        public Product getproduct(@PathVariable Long id){
            Product p = new Product(1L, "ok", 140);
            return p;
        }

    }

