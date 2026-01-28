# ✅ Checklist — Aula08 (SOLID completo + arquitetura)

## 📦 Estrutura / Pacotes (mantidos e organizados)
- [x] `controller`
- [x] `service`
- [x] `service.impl`
- [x] `repository`
- [x] `dto`
- [x] `model`
- [x] `exception`
- [x] `mapper`
- [x] (extra para OCP) `service.rules`

---

## S — SRP (Single Responsibility Principle)
- [x] **Controller**: apenas HTTP (recebe DTO, retorna DTO, sem regra de negócio)
- [x] **Service**: regra de negócio + orquestração
- [x] **Repository**: acesso aos dados (Spring Data JPA)
- [x] **DTO**: transporte de dados
- [x] **Mapper**: conversão DTO ↔ Entity
- [x] **Exception/Handler**: erros e respostas HTTP (404/400)
- [x] **Rules**: validações isoladas (cada regra com 1 responsabilidade)

---

## O — OCP (Open/Closed Principle)
- [x] Pipeline de validações extensível via interface `ProdutoRule`
- [x] Service apenas **itera regras registradas** (pode adicionar novas regras sem mexer no service)
- [x] Regras implementadas:
  - [x] `NomeObrigatorioRule`
  - [x] `PrecoPositivoRule`
  - [x] `QuantidadeNaoNegativaRule`

---

## L — LSP (Liskov Substitution Principle)
- [x] Serviços definidos por interfaces (`ProdutoService`, `ProdutoCommandService`, `ProdutoQueryService`)
- [x] Existe mais de uma implementação substituível:
  - [x] `service.impl.ProdutoServiceImpl` (implementação alternativa)
  - [x] `service.impl.ProdutoServiceV2Impl` (marcada como `@Primary`)
- [x] Controller não conhece classes concretas (só interfaces)

---

## I — ISP (Interface Segregation Principle)
- [x] Interfaces menores criadas:
  - [x] `ProdutoCommandService` (salvar/atualizar/remover)
  - [x] `ProdutoQueryService` (listar/buscarPorId/buscarPorNome)
- [x] `ProdutoService` virou uma interface agregadora (`extends Command + Query`) apenas para compatibilidade
- [x] Controller depende de `ProdutoCommandService` e `ProdutoQueryService` (não de uma interface grande)

---

## D — DIP (Dependency Inversion Principle)
- [x] Controller depende de **abstrações** (`ProdutoCommandService`, `ProdutoQueryService`)
- [x] Service depende de **abstrações** (`ProdutoRepository`, `List<ProdutoRule>`)
- [x] Nenhuma dependência instanciada com `new` dentro das camadas principais (injeção via Spring)

---

## 🌐 Frontend (design mantido)
- [x] Nenhuma mudança de layout/tema necessária
- [x] Endpoints continuam compatíveis (`/produtos`, `/produtos/busca`)

---

## 🧪 Testes (extra desejável)
- [x] Teste unitário simples para Service validando regra de negócio:
  - [x] `ProdutoServiceV2ImplTest` (lança `BusinessRuleException` quando nome vazio)


