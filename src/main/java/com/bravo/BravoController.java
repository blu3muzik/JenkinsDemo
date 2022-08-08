package com.bravo;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController class BravoController {
	@RequestMapping(value = "/")
	public String bravobanner() {
		return "DEMONSTRANDO AUTOMATIZACION DEL PIPELINE - v002";
	}
}
