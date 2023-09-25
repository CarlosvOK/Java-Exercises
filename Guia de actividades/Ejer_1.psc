Algoritmo club_social
	//Variables
	nombre=""
	monto_fijo=1500.00
	cuota=0
	total=0.00
	pago=-1
	num=0
	e=0.00
	re=0.00
	total_pagar=0.00
	saldo_deber=0.00
	continuar="SI"
	
	Mostrar "*********************BIENVENIDO CLUB SOCIAL*********************"
	mostrar "                    ¡Nuevos metodos de pago!                     "
	Mostrar ""
	//Ingreso de nombre usuario
	mientras continuar =="SI" Hacer
		//Ingreso y validacion del nombre
		mientras(nombre == "")
			//Ingreso del nombre
			Escribir "Ingrese un nombre " Sin Saltar
			leer nombre

			//Mensaje de error 
			si(nombre == "") entonces
				mostrar "Error - Ingrese un nombre"
			fin si
			
		fin mientras 
		
		mostrar ""
		Mientras (cuota <1 o cuota >6)
			Escribir "En cuantas cuotas: "Sin Saltar
			leer cuota
			
			si (cuota <1 o cuota >6) Entonces
				mostrar "Error, Ingrese un rango valido 1-6 "
			FinSi
		FinMientras
		
		Mostrar ""
		total_pagar = monto_fijo/cuota
		Mostrar "Espere, un momento..."
		Mostrar ""
		Esperar 2 segundos
		
		Mostrar ""
		
		mostrar "*******************************"
		mostrar ""
		
		mostrar "METODOS DE PAGOS"
		mostrar ""
		mostrar "1: Efectivo  - 10% Descuento"
		mostrar "2: Tarjeta Debito  - 7% Recargo"
		mostrar "3: Tarjeta Cretido  - Recargos"
		
		mostrar ""
		mostrar "*******************************"
		mostrar ""
		
		Escribir "Digite un N°"
		leer num
		
		si num==1 Entonces
			mostrar "Procesando pago..."
			Esperar 1 Segundos
			
			e=10*monto_fijo/100
			r=total_pagar-e
			
			mostrar ""
			mostrar " * * * Resumen de su pago * * * "
			mostrar " *                             *"
			mostrar " * * * * * * * * * * * * * * * *"
			mostrar "       Descuento: ",e
			mostrar "       Total: ",r
		FinSi
		
	

		
		si num==2 Entonces
			mostrar "Procesando pago..."
			Esperar 1 Segundos
			
			re=total_pagar+150
			
			mostrar ""
			mostrar " * * * Resumen de su pago *  * *"
			mostrar " *                             *"
			Mostrar " * * * * * * * * * * * * * * * *"
			mostrar " - - - - Total: ",re, "- - - -"
		FinSi
		
		mostrar ""
		
		Mientras (pago<0)
			Escribir "Ingrese el monto a pagar: " Sin Saltar
			leer pago
			
			si pago<0 Entonces
				mostrar "Error, Ingrese un monto valido"
			FinSi
		FinMientras
	
		saldo_deber = monto_fijo - pago
		Mostrar ""
		
		mostrar ""
		
		//salidas por pantalla
		Mostrar  "Usted debe: ",e
		
		Mostrar ""
		
		Escribir "Desea continuar: SI/NO"
		leer continuar
		
		nombre=""
	FinMientras
	
	
FinAlgoritmo
