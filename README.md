<div align="center">

# ☕ Lista de Exercícios — Coleções, Repetição e Decisão

**Quatro programas em Java que trabalham leitura interativa com `Scanner`, coleções dinâmicas com `ArrayList`, laços de repetição, validação de entrada e classificação por regras.**

![Java](https://img.shields.io/badge/Java-17+-ED8B00?style=flat-square&logo=openjdk&logoColor=white)
![Exercícios](https://img.shields.io/badge/exerc%C3%ADcios-4-7C3AED?style=flat-square)
![Console](https://img.shields.io/badge/tipo-aplica%C3%A7%C3%A3o%20console-0EA5E9?style=flat-square)

</div>

---

## 📖 Sobre

Lista de exercícios de lógica de programação em Java com foco em **estruturas de repetição**, **coleções** e **validação de dados de entrada**. Todos os programas rodam em console e tratam entradas inválidas sem quebrar a execução.

## 📚 Exercícios

| Arquivo | Classe | O que faz |
|:---|:---|:---|
| `Analisenotas.java` | `AnaliseNotas` | Lê notas até o usuário digitar `-1` e exibe: quantidade lida, valores na ordem original, valores na ordem inversa (um por linha), soma, média e as notas acima da média |
| `Controlesalariovendedores.java` | `ControleSalariosVendedores` | Calcula o salário de cada vendedor (`R$ 200 + 9% das vendas brutas`) e agrupa a quantidade de vendedores em 9 faixas salariais ($200–$299 até $1000+) |
| `Investigacaocrime.java` | `InvestigacaoCrime` | Faz 5 perguntas de sim/não e classifica a pessoa conforme o número de respostas afirmativas |
| `Temperaturasmensais.java` | `TemperaturasMensais` | Lê a temperatura média dos 12 meses, calcula a média anual e lista os meses acima dela |

### 🕵️ Regras de classificação — `InvestigacaoCrime`

> *"Telefonou para a vítima?" · "Esteve no local do crime?" · "Mora perto da vítima?" · "Devia para a vítima?" · "Já trabalhou com a vítima?"*

| Respostas "Sim" | Classificação |
|:---:|:---|
| 5 | `Assassino` |
| 3 ou 4 | `Cúmplice` |
| 2 | `Suspeita` |
| 0 ou 1 | `Inocente` |

## 🧠 Conceitos aplicados

- `Scanner` para leitura interativa e `scanner.next()` para limpar entradas inválidas
- `ArrayList<Double>` e `ArrayList<String>` como coleções dinâmicas
- `while` / `for` / `for` reverso para percorrer coleções
- `switch` para classificação por faixas
- `try/catch` com `InputMismatchException` para validação de entrada
- `System.out.printf` para formatação de valores monetários e decimais

## ▶️ Como executar

```bash
git clone https://github.com/rafaellfsouza/Exerc-cio-Lista.git
cd Exerc-cio-Lista

javac AnaliseNotas.java      # compila
java AnaliseNotas            # executa
```

> 💡 Repita o processo para cada exercício, usando o nome da classe indicado na tabela acima.

---

<div align="center">

<sub>Desenvolvido por <a href="https://github.com/rafaellfsouza"><b>Rafael Luiz Ferreira de Souza</b></a> · <code>Java</code> <code>Lógica de Programação</code></sub>

</div>
