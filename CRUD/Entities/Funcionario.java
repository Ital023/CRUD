package Entities;

public class Funcionario {
    private String nome;
    private int id;
    private double salario;
    private int horasTrabalhadas;
    private String cargo;
    private String expediente;

    public Funcionario() {
    }
    public Funcionario(String nome, int id, double salario, int horasTrabalhadas, String cargo, String expediente) {
        this.nome = nome;
        this.id = id;
        this.salario = salario;
        this.horasTrabalhadas = horasTrabalhadas;
        this.cargo = cargo;
        this.expediente = expediente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getExpediente() {
        return expediente;
    }

    public void setExpediente(String expediente) {
        this.expediente = expediente;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "nome='" + nome + '\'' +
                ", id=" + id +
                ", salario=" + salario +
                ", horasTrabalhadas=" + horasTrabalhadas +
                ", cargo='" + cargo + '\'' +
                ", expediente='" + expediente + '\'' +
                '}';
    }
}
