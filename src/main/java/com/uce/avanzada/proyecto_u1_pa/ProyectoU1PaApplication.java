package com.uce.avanzada.proyecto_u1_pa;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Inventario;
import com.uce.avanzada.proyecto_u1_pa.bodega.modelo.Producto;
import com.uce.avanzada.proyecto_u1_pa.bodega.service.IGestorInventario;
import com.uce.avanzada.proyecto_u1_pa.bodega.service.IInventarioService;
import com.uce.avanzada.proyecto_u1_pa.bodega.service.IProductoService;


/**
 *	Yo lo tome desde el punto que deben haber 5 productos de un distribuidor, y que de ahi cuando mandamos
 * 	a importarlos se crea un inventario
 */
@SpringBootApplication
public class ProyectoU1PaApplication implements CommandLineRunner{
	
	
	@Autowired
	private IProductoService productoService;

	@Autowired 
	private IInventarioService inventarioService;

	@Autowired
	private IGestorInventario gestorInventario;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoU1PaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Producto p1 = new Producto();
		Producto p2 = new Producto();
		Producto p3 = new Producto();
		Producto p4 = new Producto();
		Producto p5 = new Producto();

		p1.setNombre("Coca Cola");
		p1.setPrecio(new BigDecimal("2"));

		
		p2.setNombre("Pepsi");
		p2.setPrecio(new BigDecimal("3"));

		p3.setNombre("Lunchis");
		p3.setPrecio(new BigDecimal("1.5"));

		p4.setNombre("Papel");
		p4.setPrecio(new BigDecimal("5"));

		p5.setNombre("Pan");
		p5.setPrecio(new BigDecimal("0.1"));

		this.productoService.insertar(p1);
		this.productoService.insertar(p2);
		this.productoService.insertar(p3);
		this.productoService.insertar(p4);
		this.productoService.insertar(p5);

		

		// i1.setCantidad(200);
		// i1.setProducto(p2);
		// i1.setFechaIngreso(LocalDateTime.of(2022, 06, 24, 01, 01, 01));

		// this.inventarioService.insertar(i1);
		
		// i1.setCantidad(150);
		// i1.setProducto(p3);
		// i1.setFechaIngreso(LocalDateTime.of(2022, 06, 22, 01, 01, 01));

		// this.inventarioService.insertar(i1);
		
		// i1.setCantidad(20);
		// i1.setProducto(p4);
		// i1.setFechaIngreso(LocalDateTime.of(2022, 06, 02, 01, 01, 01));

		// this.inventarioService.insertar(i1);
		
		// i1.setCantidad(199);
		// i1.setProducto(p5);
		// i1.setFechaIngreso(LocalDateTime.of(2022, 06, 01, 01, 01, 01));

		// this.inventarioService.insertar(i1);


		Inventario i1 = new Inventario();
		

		i1.setNombreBodega("Santa Maria");
		i1.setCantidad(50);
		i1.setProducto(p1);
		i1.setFechaIngreso(LocalDateTime.of(2022, 05, 29, 01, 01, 01));
		
		
		this.inventarioService.insertar(i1);

		Inventario i2 = new Inventario();

		i2.setCantidad(200);
		i2.setProducto(p2);
		i2.setFechaIngreso(LocalDateTime.of(2022, 06, 24, 01, 01, 01));

		this.inventarioService.insertar(i2);

		Inventario i3 = new Inventario();
		
		i3.setCantidad(150);
		i3.setProducto(p3);
		i3.setFechaIngreso(LocalDateTime.of(2022, 06, 22, 01, 01, 01));

		this.inventarioService.insertar(i3);

		Inventario i4 = new Inventario();
		
		i4.setCantidad(20);
		i4.setProducto(p4);
		i4.setFechaIngreso(LocalDateTime.of(2022, 06, 02, 01, 01, 01));

		this.inventarioService.insertar(i4);

		Inventario i5 = new Inventario();
		
		i5.setCantidad(199);
		i5.setProducto(p5);
		i5.setFechaIngreso(LocalDateTime.of(2022, 06, 01, 01, 01, 01));

		this.inventarioService.insertar(i5);

		
		


		this.gestorInventario.realizarReporte(LocalDateTime.of(2022, 06, 01, 01, 01, 01));

		
		
			}	

}
