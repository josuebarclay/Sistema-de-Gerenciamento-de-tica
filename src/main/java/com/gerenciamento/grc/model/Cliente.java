package com.gerenciamento.grc.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataNasc;
    private String endereco;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;
    private String telefone;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dataAle;
//    private String cpf;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate entregaPrev;
    private Double valor;
    private String sinal;
    private Double saldo;

    //longe
    private String longeODESF;
    private String longeOEESF;

    private String longeODCIL;
    private String longeOECIL;

    private String longeODEixo;
    private String longeOEEixo;

    //perto
    private String pertoODESF;
    private String pertoOEESF;

    private String pertoODCIL;
    private String pertoOECIL;

    private String pertoODEixo;
    private String pertoOEEixo;

    private String armacao;
    private String lente;
    private String dp;
    private String od;
    private String oe;
    private String altura;
    private String medico;
    private String convenio;

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public @NotBlank(message = "O nome é obrigatório") String getNome() {
        return nome;
    }

    public void setNome(@NotBlank(message = "O nome é obrigatório") String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public LocalDate getDataAle() {
        return dataAle;
    }

    public void setDataAle(LocalDate dataAle) {
        this.dataAle = dataAle;
    }

    public LocalDate getEntregaPrev() {
        return entregaPrev;
    }

    public void setEntregaPrev(LocalDate entregaPrev) {
        this.entregaPrev = entregaPrev;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getSinal() {
        return sinal;
    }

    public void setSinal(String sinal) {
        this.sinal = sinal;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public String getLongeODESF() {
        return longeODESF;
    }

    public void setLongeODESF(String longeODESF) {
        this.longeODESF = longeODESF;
    }

    public String getLongeOEESF() {
        return longeOEESF;
    }

    public void setLongeOEESF(String longeOEESF) {
        this.longeOEESF = longeOEESF;
    }

    public String getLongeODCIL() {
        return longeODCIL;
    }

    public void setLongeODCIL(String longeODCIL) {
        this.longeODCIL = longeODCIL;
    }

    public String getLongeOECIL() {
        return longeOECIL;
    }

    public void setLongeOECIL(String longeOECIL) {
        this.longeOECIL = longeOECIL;
    }

    public String getLongeODEixo() {
        return longeODEixo;
    }

    public void setLongeODEixo(String longeODEixo) {
        this.longeODEixo = longeODEixo;
    }

    public String getLongeOEEixo() {
        return longeOEEixo;
    }

    public void setLongeOEEixo(String longeOEEixo) {
        this.longeOEEixo = longeOEEixo;
    }

    public String getPertoODESF() {
        return pertoODESF;
    }

    public void setPertoODESF(String pertoODESF) {
        this.pertoODESF = pertoODESF;
    }

    public String getPertoOEESF() {
        return pertoOEESF;
    }

    public void setPertoOEESF(String pertoOEESF) {
        this.pertoOEESF = pertoOEESF;
    }

    public String getPertoODCIL() {
        return pertoODCIL;
    }

    public void setPertoODCIL(String pertoODCIL) {
        this.pertoODCIL = pertoODCIL;
    }

    public String getPertoOECIL() {
        return pertoOECIL;
    }

    public void setPertoOECIL(String pertoOECIL) {
        this.pertoOECIL = pertoOECIL;
    }

    public String getPertoODEixo() {
        return pertoODEixo;
    }

    public void setPertoODEixo(String pertoODEixo) {
        this.pertoODEixo = pertoODEixo;
    }

    public String getPertoOEEixo() {
        return pertoOEEixo;
    }

    public void setPertoOEEixo(String pertoOEEixo) {
        this.pertoOEEixo = pertoOEEixo;
    }

    public String getArmacao() {
        return armacao;
    }

    public void setArmacao(String armacao) {
        this.armacao = armacao;
    }

    public String getLente() {
        return lente;
    }

    public void setLente(String lente) {
        this.lente = lente;
    }

    public String getDp() {
        return dp;
    }

    public void setDp(String dp) {
        this.dp = dp;
    }

    public String getOd() {
        return od;
    }

    public void setOd(String od) {
        this.od = od;
    }

    public String getOe() {
        return oe;
    }

    public void setOe(String oe) {
        this.oe = oe;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getConvenio() {
        return convenio;
    }

    public void setConvenio(String convenio) {
        this.convenio = convenio;
    }

    public String getFormattedDataAle() {
        if (dataNasc != null) {
            return dataNasc.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        return "";
    }

    public String getFormattedDateNasc() {
        if (dataAle != null) {
            return dataAle.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        return "";
    }

    public String getFormattedEntregaPrev() {
        if (entregaPrev != null) {
            return entregaPrev.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        }
        return "";
    }

}
