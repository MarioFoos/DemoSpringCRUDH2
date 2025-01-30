package com.diardon.springcrud;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/prod")
public class MyProductController
{
	@Autowired
	private MyProductService myProductService;

	// Crear un producto
	@PostMapping
	public MyProduct createProduct(@RequestBody MyProduct product)
	{
		return myProductService.createProduct(product);
	}
	// Obtener todos los productos
	@GetMapping
	public List<MyProduct> getAllProducts()
	{
		return myProductService.getAllProducts();
	}
	// Obtener un producto por ID
	@GetMapping("/{id}")
	public Optional<MyProduct> getProductById(@PathVariable Long id)
	{
		return myProductService.getProductById(id);
	}
	// Actualizar un producto
	@PutMapping("/{id}")
	public MyProduct updateProduct(@PathVariable Long id, @RequestBody MyProduct productDetails)
	{
		return myProductService.updateProduct(id, productDetails);
	}
	// Eliminar un producto
	@DeleteMapping("/{id}")
	public void deleteProduct(@PathVariable Long id)
	{
		myProductService.deleteProduct(id);
	}
}
