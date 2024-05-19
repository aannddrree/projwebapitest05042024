package org.example.service;

import org.example.model.Game;
import org.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@Service
public class GameServices {

    private static List<Game> lst = new ArrayList<>();

    public List<Game> getGames() {

        lst.add(new Game(1, "O servidor foi hackeado e tomou hansomwave pague a empresa de backup", "ruim - problema financeiro"));
        lst.add(new Game(2, "O canal no telegram levantou suspeitas, mas as pessoas ainda usam", "neutro"));
        lst.add(new Game(3, "Um familiar ficou doente com Covid 3 dias em quarentena.", "ruim - problema dias"));
        lst.add(new Game(4, "A idéia foi melhorada e o Product owner gostou. O SM Liberou horário mais cedo", "Bom - Adiantou Dias"));
        lst.add(new Game(5, "Sexto feira de Cosplay todo mundo veio e foi animada", "Bom - Organização"));
        lst.add(new Game(6, "Sexto feira de Cosplay todo mundo veio e foi animada", "ruim - problema financeiro"));
        lst.add(new Game(7, "Alguem usou engenharia social e roubou parte da documentação do projeto", "Bom - Organização"));
        lst.add(new Game(8, "O banco de dados do site não apresentou vulnerabilidades", "ruim - problema dias"));
        lst.add(new Game(9, "Um ente querido morreu 1 dia de luto", "neutro"));
        lst.add(new Game(10, "Um dia cinza e chuvoso, mas todos trabalham movidos a café", "ruim - problema financeiro"));
        lst.add(new Game(11, "Todos tiveram que fazer serão o scrum master pagou a janta.", "Bom - Adiantou Dias"));
        lst.add(new Game(12, "Todo mundo se alinhou e se entendeu ( 2 dias da Sprint em 1)", "Bom - Organização"));
        lst.add(new Game(13, "O PO Gestou do site e os clientes gostaram da facilidade", "neutro"));
        lst.add(new Game(14, "Mias um dia normal de trabalho, mas todos estão entendidos", "ruim - problema dias"));
        lst.add(new Game(15, "Você teve que resolver pendencias com a justiça", "Bom - Adiantou Dias"));
        lst.add(new Game(16, "O Backup dos arquivos foi realizado isso ajudou na revisão (1 dia)", "Bom - Organização"));
        lst.add(new Game(17, "3 computadores da empresa queimaram durante a tempestade", "ruim - problema financeiro"));
        lst.add(new Game(18, "O atendimento ao cliente foi terceirizado mas o call center agradeceu o contato", "neutro"));
        lst.add(new Game(19, "O QA nao encontrou nenhum bug de primeira ( 1 dia a menos)", "Bom - Adiantou Dias"));
        lst.add(new Game(20, "Você ficou de atestado 2 dias intoxicação alimentar do caio lanches.", "ruim - problema dias"));

        return lst;
    }

    public Game sortearGame(){
        int id = new Random().nextInt(20) + 1;
        System.out.println("Sorteio: " + id);
        if (lst.size() == 0) lst = this.getGames();
        return lst.stream().filter(g -> g.getId() == id).findFirst().get();
    }
}
