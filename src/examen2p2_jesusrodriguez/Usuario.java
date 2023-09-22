
package examen2p2_jesusrodriguez;


public class Usuario {
    private String tipo;
    private String username;
    private String password;
    private int age;

    public Usuario(String tipo, String username, String password, int age) {
        this.tipo = tipo;
        this.username = username;
        this.password = password;
        this.age = age;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return username;
    }
    
   
}
