package com.diardon.springcrud;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Entidad con los atributos necesarios.
 */
@Entity
public class MyProduct
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // ID autogenerado
	private Long id;

	private String name;
	private double price;

	// Constructor vacío
	public MyProduct(){
	}
	// Constructor con parámetros
	public MyProduct(String name, double price)
	{
		this.name = name;
		this.price = price;
	}
	// Getters y Setters
	public void setId(Long id)
	{
		this.id = id;
	}
	public Long getId()
	{
		return id;
	}
	public void setName(String nombre)
	{
		this.name = nombre;
	}
	public String getName()
	{
		return name;
	}
	public void setPrice(double precio)
	{
		this.price = precio;
	}
	public double getPrice()
	{
		return price;
	}
}
