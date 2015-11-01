/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adocaolp;



/**
 *
 * @author luan
 */
public class Adocao {
    private Crianca crianca;
    private AssistenteSocial assistenteSocial;
    private Orfanato orfanato;
    private Candidato candidato;
    
    /**
     *
     * @param crianca
     * @param assistenteSocial
     */
    public void adocao(Crianca crianca,AssistenteSocial assistenteSocial,Orfanato orfanato,Candidato candidato){
        
    }
    public void listaEspera(Candidato candidato){
        
    }

    public Crianca getCrianca() {
        return crianca;
    }

    public void setCrianca(Crianca crianca) {
        this.crianca = crianca;
    }

    public AssistenteSocial getAssistenteSocial() {
        return assistenteSocial;
    }

    public void setAssistenteSocial(AssistenteSocial assistenteSocial) {
        this.assistenteSocial = assistenteSocial;
    }

    public Orfanato getOrfanato() {
        return orfanato;
    }

    public void setOrfanato(Orfanato orfanato) {
        this.orfanato = orfanato;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }
}
