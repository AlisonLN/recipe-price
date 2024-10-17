package controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/produtos")
public class ProductController {

    @PostMapping
    public ResponseEntity<String> registerProduct() {
        return ResponseEntity.ok("Product Save");
    }

}
