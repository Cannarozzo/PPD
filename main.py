n = 1 << int(input())
primos = 0
primosEspeciais = 0
crivo = [True for i in range(n+1)]

for i in range(2,n+1):
    if crivo[i] == True:
        primos = primos + 1
        if i % 4 != 3:
            primosEspeciais = primosEspeciais + 1
        for j in range(i*2,n+1,i):
            crivo[j] = False
      
print("Total primos {0}" . format(primos) )
print("Total primosEspeciais {0}" . format(primosEspeciais)) 

