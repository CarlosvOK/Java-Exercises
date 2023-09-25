Algoritmo sin_titulo
	//variables
	continuar="L"
	cajones_cervesa=0
	cont_cervesa=0
	cont_gaseosa=0
	cajones_gaseosa=0
	caj_ambos=0
	porc_caj_cervesa=0
	
	mostrar""
	mostrar"MENU"
	mostrar"A: Cargar cajones de cerveza"
	Mostrar"B: Cargar cajones de gaseosas"
	mostrar"C: Reportes"
	mostrar"D: Salir"
	
	
	mostrar""
	Escribir "Ingrese una opcion: "
	leer continuar
	
	mientras continuar <> "D" y continuar<>"d" Hacer
		
		si continuar="A" o continuar="a" Entonces
			mostrar""
			Escribir "Cargar cajones de cerveza: " Sin Saltar
			leer cajones_cervesa
			cont_cervesa=cont_cervesa+1
			caj_ambos=cajones_cervesa+cajones_gaseosa
			
		FinSi
		
		porc_caj_cervesa=(cajones_cervesa/caj_ambos)*100
		
		si continuar="B" o continuar="b" Entonces
			mostrar""
			Escribir "Cargar cajones de gaseosas: " Sin Saltar
			leer cajones_gaseosa
			cont_gaseosa=cont_gaseosa+1
			caj_ambos=cajones_cervesa+cajones_gaseosa
			
			//porc_caj_cervesa=cajones_cervesa/caj_ambos*100.00
		FinSi
		
		
		si continuar="C" o continuar="c" Entonces
			mostrar""
			Mostrar "Cantidad total de cajones de cerveza: ",cajones_cervesa
			Mostrar "Cantidad total de cajones de gaseosa: ",cajones_gaseosa
			Mostrar "Cantidad total de cajones de todos los productos: ",caj_ambos
			Mostrar "Porcentaje que representan los cajones de cerveza sobre el total de cajones: ",porc_caj_cervesa,"%"
		FinSi
		
		mostrar""
		Escribir "Decea continuar con la carga cajones..." Sin Saltar
		leer continuar
	FinMientras
FinAlgoritmo
