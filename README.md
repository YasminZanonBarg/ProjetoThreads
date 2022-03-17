# Prova Prática - Threads
Prova prática disponibilizada pela professora Tatiana Perereira Filgueiras.

## 1. Objetivo
Consolidar o conhecimento sobre Sistemas Operacionais e garantir uma boatransição da fase teórica para a implementação prática.

## 2. Visão Geral do Sistema
O sistema a ser implementado objetiva simular um site de vendas por atacado. Sempre que há uma novidade, o site disponibiliza um lote limitado do produtoa umpreço imperdível, gerando assim uma grande concorrência entre distribuidores.

## 3. Requisitos Funcionais
**3.1.** O sistema deve simular um site com N lotes de um determinado produto(nomínimo 200 e no máximo 1500);
**3.2.** Ao serem “lançados” os lotes, o sistema deve simular no mínimo4distribuidores que tentarão comprar ao mesmo tempo o máximo de lotes possível;
**3.3.** Ao final do programa, o sistema deve mostrar quantos lotes cada distribuidor
conseguiu adquirir. Lembrando que o estoque do site, ao fim do programa, deveestar zerado;

## 4. Requisitos Arquiteturais
**4.1.** O sistema deve usar o conceito de Threads e exclusão mútua;
    **4.1.1** O uso de Semáforos ou Monitores fica a critério da equipe
**4.2.** Para que uma Thread não monopolize a região crítica, sugere-se o uso do método sleep().


