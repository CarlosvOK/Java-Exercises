Algoritmo viajes
	//Variables
	continuar="SI"
	num_pasaje=0
	ciudad_ori=""
	ciudad_des=""
	num_coche=0
	cont_coche1=0
	cont_coche2=0
	cont_coche3=0
	precio_pasaje=0
	precio_con_iva=0
	montototalpasajes=0
	iva=10.5
	cant_pasaje_caba=0
	cant_pasaje_rosario=0
	max=0
	
	
	
	Escribir "Ingrese numero de pasaje comprados: "Sin Saltar
	leer num_pasaje
	
	mientras num_pasaje <>0 hacer
		Escribir "ingrese ciudad origen: "Sin Saltar
		leer ciudad_ori
		
		Mostrar ""
		mostrar "Coche N1 - CABA (Ciudad de Buenos Aires)"
		mostrar "Coche N2 - Rosario (Santa fe)"
		mostrar "Coche N3 - Resistencia (Chaco)"
		mostrar""
		
		Escribir  "Ingrese ciudad destino: "Sin Saltar
		leer ciudad_des
		
		si ciudad_des="rosario" y ciudad_ori="caba" Entonces
			cant_pasaje_rosario= cant_pasaje_rosario +1
		FinSi
		
		mostrar ""
		
		Escribir "Ingrese el numero del coche: "Sin Saltar
		Leer num_coche
		
		si num_coche =1 Entonces
			cont_coche1 = cont_coche1 + 1
			si cont_coche1>cont_coche2 y cont_coche1>cont_coche3 Entonces
				max=num_coche
			FinSi
		finsi
		si num_coche=2 Entonces
			cont_coche2 = cont_coche2 + 1 
			si cont_coche2>cont_coche1 y cont_coche2>cont_coche3 Entonces
				max=num_coche
			FinSi
		FinSi
			
		si num_coche=3 Entonces
			cont_coche3 = cont_coche3 + 1 
			si cont_coche3>cont_coche1 y cont_coche3>cont_coche2 Entonces
				max=num_coche
			FinSi
		FinSi
		
		mostrar""
		
		Escribir "Ingrese el precio del pasaje: "Sin Saltar
		leer precio_pasaje   
		
		Mostrar ""
		
		montototalpasajes=num_pasaje*precio_pasaje 
		Mostrar "Tramitando pasaje...."
		Esperar 2 segundos
		
		Escribir "Ingrese otro numero de pasaje comprados: "Sin Saltar
		leer num_pasaje

	fin mientras
	
	Escribir "Cantidad de pasajes con origen CABA y destino ROSARIO: ",cant_pasaje_rosario
	Escribir "Monto total de pasajes(En Pesos): ",montototalpasajes
	Escribir "Número de coche que más viajes realizó en la semana: ", max
FinAlgoritmo

//Prueba de escritorio
//num_pasaje         ciudad_ori       ciudad_des      cant_pasaje_rosario     num_coche   cont_coche1  cont_coche2   cont_coche3     max
//   2                  caba             rosario              1                   2             0           1            0            2(coche)


//precio_pasaje      montototalpasajes
//	10                   20