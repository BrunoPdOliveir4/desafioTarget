# Exercício 1.
    A tecnologia escolhida foi python por ser simples e versátil. O fibonacci foi feito de forma recursiva e a mensagem é exibida no terminal.
    Seria fácil implementar um input se fosse necessário. Seguindo a ideia do principio YAGNI, optei por não utilizar inputs pois exigiria muito tratamento de excessões.

# Exercício 2.
    Foi feito em java, foi o exercício que teve um pouco mais de requinte e me permiti fazer algumas funções extras para garantir uma melhor experiência com o que foi pedido pelo aplicativo. 

# Exercício 3.
    Segui a risca a ideia do que foi descrito. Seguindo o principio KISS, "keep it simple, stupid" mantive o código na simplicidade pedida, sem inventar modas.

# Exercício 4.
-   a) 1, 3, 5, 7, _ - É uma progressão aritmética de razão 2, ou seja, soma 2. Os próximos elementos são 9, 11, 13... Também sendo os números naturais impares.
-   b) 2, 4, 8, 16, 32, 64, _ - neste caso é uma progressão geométrica de razão 2 começando do 2, então  (n+1) = a*2, ou seja, os próximos números serão 128, 256... Também pode ser escrito como 2^n, sendo n os números naturais > 0.
-   c) 0, 1, 4, 9, 16, 25, 36, _ - Neste caso estamos somando a sequência dos números impares aos resultados = 0, 1(0+1), 4(0+1+3), 9(0+1+3+5), ..., 36(0+1+3+5+7+9+11), se 36 é a coleção dos ultimos números impares, o próximo será 36 + o próximo número impar após 11, ou seja, 13. 36+13 = 49. Então o próximo número da sequência seria 49.
-   d) 4, 16, 36, 64, _ - 4, (4+12), (4+12+20), (4+12+20+28), os próximos números aumentam 8 na soma, então o próximo número seria (4+12+20+28+(28+8)) = 4+12+20+28+36 = 100.
-   e) 1, 1, 2, 3, 5, 8, _ - Aqui é fibonacci, n = n-1+n-2, então o número sempre será a soma dos dois ultimos, o próximo digito é 13.
-   f) 2, 10, 12, 16, 17, 18, 19 - Dois, dez, doze, dezesseis... o próximo número é 200(duzentos). Todos começam com d.

# Exercício 5.

    Basta ligar um dos interruptores e esperar um pouco, após um tempo deslige-o, ligue outro e entre em uma sala
    - há três possibilidades: Se a lampada estiver acesa, é o interruptor ligado, caso esteja apagada, encoste nela (lampadas ligadas por um grande periodo de tempo aquecem), então se estiver quente, ela é a do interruptor que foi desligado, se estiver fria ela é o interruptor que não foi encostado.
    - Após descobrir a primeira é só ir para outra sala e descobrir a próxima com base nas opções restantes.