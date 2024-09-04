# Exercício 1

def exercise_1(num):
    try:
        num = int(num)
    except ValueError:
        print("Input invalido.")
    if(num == 0 | num == 1):
        return "Pertence a sequência"
    result = fibonacci(num, 1, 0)
    if(result):
        return "Pertence a sequência"
    return "Não pertence a sequência"    
    
    
def fibonacci(num, last, beforeLast):
    current = last + beforeLast
    if(num < current):
        return False
    elif(num == current):
        return True
    return fibonacci(num, current, last)
    
        
print(exercise_1(14))


