package calculadora;
/**
 * <strong>Projeto Calculadora</strong>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração e
 * multiplicação. Ela é projetada para ser simples e eficiente, permitindo que selecione a operação
 * desejada com base em um operador informado pelo usuário.</p>
 *
 * <ul>
 * <li>Técnicas de refatoração</li>
 * <li>Técnicas de revisão estática (caixa branca)</li>
 * <li>Técnicas de revisão funcional (caixa branca)</li>
 * <li>Testes de unidade com assertivas em código Java</li>
 * <li>Documentação com Javadoc</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *
 * @author Herick Marlon da Silva Garcia
 * @version 1.1
 */

public class Calculadora {

    /**
     * Soma dois números inteiros.
    *
    * @param a primeiro operando
    * @param b segundo operando
    * @return retorna a soma de {@code a} e {@code b}
    */
    public int somar(int a, int b) {
        return a + b;
    }
 /**
     * Subtrai dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return retorna a subtração de {@code a} e {@code b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }
/**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return retorna a multiplicação de {@code a} e {@code b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }
    /**
 * Realiza a divisão entre dois números inteiros.
 *
 * @param a primeiro operando
 * @param b segundo operando
 * @return resultado da divisão de {@code a} por {@code b}
 * @throws IllegalArgumentException se {@code b} for zero
 */

    public int dividir(int a, int b) {
        if (b == 0) {
            // tratamento de erro para divisão por zero
            throw new IllegalArgumentException("Divisão por zero não é permitida");
        }
        return a / b;
    }

  /**
 * Executa a operação matemática solicitada com base no operador informado.
 * <p>
 * Operadores aceitos:
 * <ul>
 * <li>"+": Somas</li>
 * <li>"-": Subtrações</li>
 * <li>"*": Multiplicações</li>
 * <li>"/": Divisões</li>
 * </ul>
 * </p>
 *
 * @param a primeiro operando
 * @param b segundo operando
 * @param operador símbolo da operação desejada
 * @return resultado da operação
 * @throws IllegalArgumentException se o operador não for um símbolo válido
 */
    public int calcular(int a, int b, String operador) {
        switch (operador) {
            case "+": 
                return somar(a, b);
            case "-": 
                return subtrair(a, b);
            case "*": 
                return multiplicar(a, b);
            case "/": 
                return dividir(a, b);
            default: 
                throw new IllegalArgumentException("Operador inválido: " + operador);
        }
    }
}
