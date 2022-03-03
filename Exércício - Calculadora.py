operador = input('Escolha o Operador + ou *: ')

valor1 = float(input('Digite o valor 1: '))
valor2 = float(input('Digite o valor 2: '))

if operador == '+':
    print('Adição')
    soma = valor1 + valor2
    print(soma)

if operador == '*':
    print('Multiplicação')
    produto = valor1 * valor2
    print(produto)
