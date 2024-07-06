public class People
{
    private String name;
    private Integer age;

    public People(String name, Integer age)
    {
        this.name = name;
        this.age = age;
    }

    public String getNome()
    {
        return name;
    }

    public void setNome(String nome)
    {
        this.name = nome;
    }

    public Integer getIdade()
    {
        return age;
    }

    public void setIdade(Integer age)
    {
        this.age = age;
    }
}
