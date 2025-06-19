# Multiply Num String

def MultiplyStr(num1, num2):
    n = 0
    base = 1
    
    while num1>0:
        n = n + (num1%10) * base
        base = base * 10
        num1 = int(num1/10)

    m = 0
    base = 1
    
    while num2>0:
        m = m + (num2%10) * base
        base = base * 10
        num2 = int(num2/10)
        
    return n*m
        

num1 = 100
num2 = 150

result = MultiplyStr(num1, num2)

print(result)
