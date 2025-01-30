package com.diardon.springcrud;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyProductService
{
	@Autowired
	private MyRepository myProductRepository;

	// Crear un producto
	public MyProduct createProduct(MyProduct product)
	{
		return myProductRepository.save(product);
	}
	// Obtener todos los productos
	public List<MyProduct> getAllProducts()
	{
		return myProductRepository.findAll();
	}
	// Obtener un producto por ID
	public Optional<MyProduct> getProductById(Long id)
	{
		return myProductRepository.findById(id);
	}
	// Actualizar un producto
	public MyProduct updateProduct(Long id, MyProduct productDetails)
	{
		MyProduct product = myProductRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found"));
		product.setName(productDetails.getName());
		product.setPrice(productDetails.getPrice());
		return myProductRepository.save(product);
	}
	// Eliminar un producto
	public void deleteProduct(Long id)
	{
		myProductRepository.deleteById(id);
	}
}
