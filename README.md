JavaDoc em Português
====

Este projeto contém os arquivos que são necessários para gerar javadocs em português. Ou seja, palavras estáticas como "Tree" e "All Classes" são traduzidas.

Por que?
=====
Resolvi fazer este projeto como parte de meu TCC em ensino de Orientação a Objetos pois identifiquei que o primeiro contato com javadoc já é difícil. Quando os alunos não dominam o português, é pior ainda.

Como fazer?
=====
Para gerar o javadoc em português é preciso mexer nos arquivos compilados do java. Seguem abaixo os passos para fazer funcionar.

1. Compile os fontes com sua IDE favorita, isso vai gerar 2 arquivos .class
2. Na pasta de build, pegue os dois arquivos finalizados com _pt_BR que contém as Strings Traduzidas:
    - com / sun / tools / doclets / formats / html / resources / standard_pt_BR.class
	- com / sun / tools / doclets / internal / toolkit / resources / doclets_pt_BR.class
	
3. Localiza a pasta do seu JDK (no meu windows: C:\Arquivos de programas\Java\jdk1.7.0_41);
4. Localize agora o arquivo **lib/tools.jar**
5. Abra o arquivo utilizando o WinRar (isso mesmo, .jar é só um zip);
6. Feche qualquer ambiente de desenvolvimento ainda aberto (NetBeans, Eclipse, etc). 
Estes programas frequentemente usam este arquivo em background e não nos deixariam mexer nele.
7. Agora, use a mesma estrutura de diretórios mostrada no item 1 e coloque os dois arquivos dentro do jar (outra opção é arrastar diretamente a pasta "com" para a raiz do tools.jar, assim os arquivos são colocados na pasta correta automaticamente).
8. Feche o tools.jar e abra novamente seu ambiente de programação (ou a linha de comando se for usá-la para gerar o .jar)
9. execute o comando do javadoc colocando o parâmetro **-locale "pt_BR"**

É isso.
Dúvidas?? problemas??
Abra issues..

Fontes
=====

* http://stackoverflow.com/questions/5538586/generate-localized-javadoc
* http://stackoverflow.com/questions/12074244/how-to-generate-a-translated-javadoc-with-javadoc-exe-not-the-content-but-the