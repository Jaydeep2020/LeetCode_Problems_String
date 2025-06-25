# Multiply Num String

def MultiplyStr(num1, num2):
    n1 = int(num1)
    n2 = int(num2)

    return str(n1 * n2)

# def MultiplyStr(num1, num2):
#     n1 = 0
#         for n in num1:
#             n1 = n1 * 10 + int(n)

#     n2 = 0 
#         for m in num2:
#             n2 = n2 * 10 + int(m)

#     return str(n1*n2)

        

num1 = '100'
num2 = '150'

result = MultiplyStr(num1, num2)

print(result)
