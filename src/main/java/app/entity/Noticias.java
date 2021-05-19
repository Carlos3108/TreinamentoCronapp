package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
* Classe que representa a tabela NOTICIAS
* @generated
*/
@Entity
@Table(name = "\"NOTICIAS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Noticias")
public class Noticias implements Serializable {

    /**
    * UID da classe, necessário na serialização
    * @generated
    */
    private static final long serialVersionUID = 1L;

    /**
    * @generated
    */
    @Id
    @Column(name = "id", nullable = false, insertable=true, updatable=true)
        private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

    /**
    * @generated
    */
    @Column(name = "titulo", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String titulo;

    /**
    * @generated
    */
    @Column(name = "Texto", nullable = false, unique = false, insertable=true, updatable=true)
        
        private java.lang.String texto;

    /**
    * @generated
    */
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "datapubl", nullable = false, unique = false, insertable=true, updatable=true, columnDefinition = "TIMESTAMP")
        
        private java.util.Date datapubl = Calendar.getInstance().getTime();

    /**
    * Construtor
    * @generated
    */
    public Noticias(){
    }

    /**
    * Obtém id
    * return id
    * @generated
    */
    
    public java.lang.String getId(){
        return this.id;
    }

    /**
    * Define id
    * @param id id
    * @generated
    */
    public Noticias setId(java.lang.String id){
        this.id = id;
        return this;
    }
    /**
    * Obtém titulo
    * return titulo
    * @generated
    */
    
    public java.lang.String getTitulo(){
        return this.titulo;
    }

    /**
    * Define titulo
    * @param titulo titulo
    * @generated
    */
    public Noticias setTitulo(java.lang.String titulo){
        this.titulo = titulo;
        return this;
    }
    /**
    * Obtém texto
    * return texto
    * @generated
    */
    
    public java.lang.String getTexto(){
        return this.texto;
    }

    /**
    * Define texto
    * @param texto texto
    * @generated
    */
    public Noticias setTexto(java.lang.String texto){
        this.texto = texto;
        return this;
    }
    /**
    * Obtém datapubl
    * return datapubl
    * @generated
    */
    
    public java.util.Date getDatapubl(){
        return this.datapubl;
    }

    /**
    * Define datapubl
    * @param datapubl datapubl
    * @generated
    */
    public Noticias setDatapubl(java.util.Date datapubl){
        this.datapubl = datapubl;
        return this;
    }

    /**
    * @generated
    */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
Noticias object = (Noticias)obj;
        if (id != null ? !id.equals(object.id) : object.id != null) return false;
        return true;
    }

    /**
    * @generated
    */
    @Override
    public int hashCode() {
        int result = 1;
        result = 31 * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

}