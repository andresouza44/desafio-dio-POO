package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    Set<Conteudo> conteudoIncritos = new LinkedHashSet<>();
    Set<Conteudo> conteudoConcluidos = new LinkedHashSet<>();

    public void increverBootcamp(Bootcamp bootcamp){
        this.conteudoIncritos.addAll(bootcamp.getConteudos());
        bootcamp.getDevsIncritos().add(this);


    }

    public void progredir(){
        Optional<Conteudo> conteudo = this.conteudoIncritos.stream().findFirst();
        if (conteudo.isPresent()) {
            this.conteudoConcluidos.add(conteudo.get());
            this.conteudoIncritos.remove(conteudo.get());

        }else {
            System.err.println("Você não está matriculado em nenhum conteúdo");
        }

    }

    public double calcularXp(){
        return this.conteudoConcluidos
                .stream()
                .mapToDouble(Conteudo::calcularXP)
                .sum();

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoIncritos() {
        return conteudoIncritos;
    }

    public void setConteudoIncritos(Set<Conteudo> conteudoIncritos) {
        this.conteudoIncritos = conteudoIncritos;
    }

    public Set<Conteudo> getConteudoConcluidos() {
        return conteudoConcluidos;
    }

    public void setConteudoConcluidos(Set<Conteudo> conteudoConcluidos) {
        this.conteudoConcluidos = conteudoConcluidos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(nome, dev.nome) && Objects.equals(conteudoIncritos, dev.conteudoIncritos) && Objects.equals(conteudoConcluidos, dev.conteudoConcluidos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, conteudoIncritos, conteudoConcluidos);
    }
}
