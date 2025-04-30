#Sergio Octavio Lopez Sainz 
#24040636

#solicito un valor
num = int(input("\nIngresa un numero: "))
#pregunto si el residuo de la division es 0 para determinar que el numero sea divible o no
if num % 5 == 0:
    print("\nEl numero si es divisible entre 5")
else:
    print("\nEl numero no es divisible entre 5")

# Imprimir todos los números desde 1 hasta num
print("\nNúmeros desde 1 hasta", num, ":")
for i in range(1, num + 1):
    print(i, end=" ")  
