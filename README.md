# 🧮 Projeto Calculadora

Este projeto implementa uma calculadora simples em Java, com operações matemáticas básicas e tratamento de erros. Ele foi desenvolvido para fins de aprendizado, aplicando boas práticas de programação, refatoração e documentação.

---

## Alterações realizadas

### 1. Correção de sintaxe
- Removidos parâmetros nomeados (`a:`, `b:`, `operador:`), que não existem em Java.
- Substituídos por chamadas posicionais: `calc.calcular(10, 2, "+")`.

### 2. Estrutura da classe principal
- O método `main` foi colocado corretamente dentro da classe `TesteCalculadora`.
- Organização do pacote `calculadora` mantida.

### 3. Métodos puros
- Criados métodos separados: `somar`, `subtrair`, `multiplicar`, `dividir`.
- O método `calcular` centraliza a lógica e chama os métodos conforme o operador.

### 4. Tratamento de exceções
- Adicionado `try-catch` para capturar:
  - Divisão por zero (`IllegalArgumentException`).
  - Operador inválido (`IllegalArgumentException`).

### 5. Documentação
- Comentários Javadoc explicando cada método, parâmetros e exceções.
- Melhor legibilidade e suporte para geração automática de documentação.

---
### 6. Comparações de Resultados
Antes <img width="492" height="205" alt="image" src="https://github.com/user-attachments/assets/fae5b668-68ef-4f2b-be16-8cc0b016f2af" />
Depois <img width="451" height="147" alt="image" src="https://github.com/user-attachments/assets/383e72af-2027-44f5-bf82-bf9194c64529" />

## 📂 Estrutura do Projeto

