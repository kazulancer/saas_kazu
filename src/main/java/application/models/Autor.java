package application.models;


import javax.persistece.Entity;
import javax.persistece.Table;
import javax.persistece.Id;


@Entity
@Table(name = "autores")

public class Autor{

    private int id;
    private String nome;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return Id;
    }

}