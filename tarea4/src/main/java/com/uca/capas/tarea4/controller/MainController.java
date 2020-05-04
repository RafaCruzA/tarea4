package com.uca.capas.tarea4.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.uca.capas.tarea4.domain.Producto;

@Controller
public class MainController {
	
	@RequestMapping("/producto")
	public ModelAndView producto() {
		ModelAndView mav = new ModelAndView();
		mav.addObject("producto", new Producto());
		mav.setViewName("producto");
		return mav;
	}
	
	@RequestMapping("/procesar")
	public ModelAndView procesar(@Valid @ModelAttribute Producto producto, BindingResult result) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("nombreProducto", producto.getNombreProducto());
		
		if(result.hasErrors()) {
			mav.setViewName("producto");
		}
		else {
			mav.addObject("nombreProducto", producto.getNombreProducto());
			mav.setViewName("exito");
		}	
		return mav;
	}
	


}