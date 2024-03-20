package com.retail.product.service;

import com.retail.product.dao.ProductDao;
import com.retail.product.model.Product;
import com.retail.product.model.RentalTool;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("")
public class ProductService implements ProductServiceIface {

    public static Logger logger = Logger.getLogger(String.valueOf(ProductService.class));
    private final ProductDao productDao;

    public ProductService(ProductDao productDao) {
        this.productDao = productDao;
    }


    /**
     *
     * @param type
     * @param query
     * @return List of products
     */
    @Override
    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(
            @RequestParam(name="type") Optional<String> type,
            @RequestParam String query) {

        logger.info(String.format("Request received for product lookup %s %s", type, query));

        List<Product> products = new ArrayList<>();

        try {
            if(type.isPresent()) {

                switch (type.get()) {
                    case "code" -> {
                        products = productDao.getByCode(query);
                    }
                    case "type" -> {
                        products = productDao.getByType(query);
                    }
                    case "brand" -> {
                        products = productDao.getByBrand(query);
                    }

                }
            }

            if(products.isEmpty()){
                logger.info(String.format("No Product Found for product request %s %s", type, query));
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            logger.info(String.format("Request completed for product lookup %s %s", type, query));
            return new ResponseEntity<>(products, HttpStatus.OK);

        } catch (Exception e) {
            logger.info(String.format("Error when looking up product %s %s", type, query));
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



    @Override
    @GetMapping("/rentaltool")
    public ResponseEntity<List<Product>> getRentalTool(
            @RequestParam String code) {

        List<Product> products = productDao.getByCode(code);
        List<RentalTool> rentalToolList = productDao.getRentalTool(products);


        return new ResponseEntity<>(null, HttpStatus.NOT_IMPLEMENTED);

    }


    @Override
    @PutMapping
    public ResponseEntity<List<Product>> addProduct(Product tool) {
        return null;
    }

    @Override
    @PostMapping
    public ResponseEntity<List<Product>> updateProduct(Product tool) {
        return null;
    }

    @Override
    @DeleteMapping
    public ResponseEntity<List<Product>> deleteProduct(Product tool) {
        return null;
    }


}
