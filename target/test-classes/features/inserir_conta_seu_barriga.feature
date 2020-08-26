# language: pt
Funcionalidade: Operaões com contas no servidor do Seu Barriga
	Como um usuário no site do Seu Barriga
	Eu quero realizar operações de CRUD de contas no servidor do Seu Barriga
	Para gerenciar gerenciar minhas contas
	 
@smoke	 
Esquema do Cenário: Inserir uma conta com sucesso
	Dado que eu estou acessando a aplicação
	Quando informar o usuario <usuario>
	E informar a senha <senha>
	E clicar no botão de entrar
	Então visualizo a página inicial
	Quando clicar no botão Contas
	E clicar no botão Adicionar
	E informar uma conta com nome <nomeConta>
	E clicar no botão Salvar
	Então a conta é inserida com sucesso
	
	Exemplos: 
	| usuario      | senha    | nomeConta     |
	| jose@jose.com| josejose | Conta do Jose |