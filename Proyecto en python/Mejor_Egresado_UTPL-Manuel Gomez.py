print("=================================== MEJOR EGRESADO UTPL ===================================")
print("-Ingresar la Cantidad de Estudiantes")
numEstudiantes = int(input())
promedioEgresado = 0
promedioFinalEstudiante = 0
egresadosIguales = False
cont = 1
while cont <= numEstudiantes:
    print("-Ingresar los NOMBRES y APELLIDOS del Estudiante")
    nomEstudiante = input()
    print("-Ingresar el Numero de Ciclos de la Carrera del Estudiante")
    numCiclos = int(input())
    contCiclos = 1
    promCiclos = 0
    while contCiclos <= numCiclos:
        print("-Ingresar el Promedio Final del Ciclo ",contCiclos)
        promCiclo = float(input())
        promCiclos = (promCiclos + promCiclo)
        promedioFinalEstudiante = (promCiclos / numCiclos)
        contCiclos +=1    
    if promedioFinalEstudiante > promedioEgresado:
        estudianteEgresado = nomEstudiante
        promedioEgresado = promedioFinalEstudiante
        egresadosIguales = False
    elif promedioFinalEstudiante == promedioEgresado:
        estudianteEgresado2 = nomEstudiante
        egresadosIguales = True
    cont +=1
print("=================================== MEJOR EGRESADO UTPL ===================================")
if egresadosIguales == True:
    print("Los Mejores Egresados UTPL son:")
    print("El estudiante",estudianteEgresado,"por tener un Promedio Final de",promedioEgresado)
    print("El estudiante",estudianteEgresado2,"por tener un Promedio Final de",promedioEgresado)
else:
    print("El Mejor Egresado UTPL es:")
    print("El estudiante",estudianteEgresado,"por tener un Promedio Final de",promedioEgresado)
print("===========================================================================================")