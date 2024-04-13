package org.example.service;

import org.example.model.Questions;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class QuestionsServices {
    public List<Questions> getQuestions(){
            List<Questions> lst = new ArrayList<>();
            lst.add(new Questions(1, "A equipe de desenvolvimento conclui todas as tarefas planejadas."));
            lst.add(new Questions(2, "Um membro da equipe encontra um obstáculo inesperado que atrasa o progresso."));
            lst.add(new Questions(3, "O Product Owner solicita uma mudança de requisitos durante a sprint."));
            lst.add(new Questions(4, "Um novo bug é descoberto em uma funcionalidade já implementada."));
            lst.add(new Questions(5, "Uma história de usuário é considerada muito complexa e precisa ser dividida em tarefas menores."));
            lst.add(new Questions(6, "Um membro da equipe precisa ausentar-se por um tempo devido a uma emergência pessoal."));
            lst.add(new Questions(7, "Um novo recurso é adicionado ao backlog de produto durante a sprint."));
            lst.add(new Questions(8, "O Scrum Master facilita uma reunião de retrospectiva para identificar melhorias."));
            lst.add(new Questions(9, "Um conflito surge entre membros da equipe sobre a melhor abordagem para implementar uma funcionalidade."));
            lst.add(new Questions(10, "Um item do backlog de sprint é descartado devido a mudanças nas prioridades."));
            lst.add(new Questions(11, "Um membro da equipe enfrenta dificuldades técnicas e solicita ajuda dos colegas."));
            lst.add(new Questions(12, "A equipe realiza uma demonstração das funcionalidades concluídas no sprint para o Product Owner e demais stakeholders."));
            lst.add(new Questions(13, "O Product Owner não está disponível para fornecer feedback durante a revisão do sprint."));
            lst.add(new Questions(14, "Um novo membro junta-se à equipe e requer treinamento para se integrar ao fluxo de trabalho."));
            lst.add(new Questions(15, "Uma dependência externa não é atendida, afetando o progresso do sprint."));
            lst.add(new Questions(16, "A equipe experimenta problemas de comunicação que resultam em mal-entendidos sobre os requisitos do usuário."));
            lst.add(new Questions(17, "Um teste de regressão revela um problema em uma funcionalidade que já estava funcionando anteriormente."));
            lst.add(new Questions(18, "Um membro da equipe descobre uma nova tecnologia ou ferramenta que pode melhorar a eficiência do desenvolvimento."));
            lst.add(new Questions(19, "O Scrum Master facilita uma sessão de planejamento de sprint para selecionar as próximas tarefas."));
            lst.add(new Questions(20, "Uma história de usuário é rejeitada pelo Product Owner durante a revisão do sprint devido a não atender aos critérios de aceitação."));
            lst.add(new Questions(21, "A equipe alcança uma melhoria significativa na velocidade de desenvolvimento em comparação com sprints anteriores."));
            lst.add(new Questions(22, "Um impedimento é levantado durante a reunião diária e a equipe colabora para resolvê-lo."));
            lst.add(new Questions(23, "Um membro da equipe fica doente e não pode contribuir para as tarefas planejadas."));
            lst.add(new Questions(24, "Uma funcionalidade concluída é elogiada pelos stakeholders durante a revisão do sprint."));
            lst.add(new Questions(25, "Um problema de qualidade é identificado durante a revisão do código e requer ajustes adicionais."));
            lst.add(new Questions(26, "A equipe decide realizar um trabalho adicional para melhorar a usabilidade de uma funcionalidade antes da conclusão do sprint."));
            lst.add(new Questions(27, "O Product Owner ajusta as prioridades do backlog de produto com base no feedback dos stakeholders."));
            lst.add(new Questions(28, "A equipe atinge um marco significativo, como a conclusão de um grande conjunto de funcionalidades planejadas."));
            lst.add(new Questions(29, "Um novo método de estimativa é introduzido pela equipe para melhorar a precisão das estimativas de tempo."));
            lst.add(new Questions(30, "Um membro da equipe faz uma apresentação sobre uma nova tecnologia ou técnica durante a reunião de compartilhamento de conhecimento."));

            return lst;
        }

        public Questions getQuestion(){
            int randomNumber = (int) (Math.random() * 30) + 1;
            for (Questions question : this.getQuestions()){
                if (question.getId() == randomNumber) {
                    return question;
                }
            }
            return null;
        }
}
