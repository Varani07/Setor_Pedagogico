# Setor_Pedagogico
Sistema para o pedagógico de um ambiente escolar.

Ao iniciar você pode entrar como Adm com as seguintes credenciais:
Usuário: Faro
Senha: qqq11!

Em usuários - Consegue ver todos os usuários cadastrados, clicando em algum usuário na tabela você pode alterar seu nome de usuário, email, cpf e senha. Também existe a possibilidade de pesquisar pelos usuários pelo ID, nome e CPF (necessário digitar pontos e traço para que a busca utilizando o CPF funcione).

Em Administradores - Pode persquisar por nome, permissão e cargo. Ao clicar em algum Adm pode alterar seu nome de usuário, permissão, cargo e senha (A senha deve conter no mínimo 6 caracteres, sendo: 3 letras, 2 números e 1 caracter especial. Adm's podem alterar a senha do usuário sem seguir este padrão para que o mesmo possa logar e alterar para uma outra senha). O adm só pode alterar as informações de outros adm's que tiverem um cargo menor que o seu.

Em Cad. Admin. - É feito o cadastro de adm's.

Em Log - Contem uma lista com todas as ações efetuadas tanto por administradores quanto usuários.

Para ter acesso a Administradores é necessário ter o cargo 1 ou superior, para acessar Cad. Adm. cargo 2 ou superior e para ter acesso ao Log de eventos é necessário ter o cargo 3.


Em Signin pode ser efetuado o cadastro de um novo usuário, caso já tenha é só logar para ter acesso ao sistema.

Na área do usuário pode ser feito o cadastro de Cursos, Módulos, Unidades Curriculares, Turmas, Alunos, Professores e Cronogramas.

O Cronograma é moldado a partir da carga horária de cada unidade currícular presente em cada módulo, pulando feriados e fins de semana.

Ferramentas ainda não implementadas: 
- Adição de feriado após a criação de um cronograma. (em progresso)
- Adição de incidentes.
- Finalizar turma após chegada a data final.
- Alterar informações de cadastro do professor e aluno.
- Usuário conseguir alterar sua senha.

