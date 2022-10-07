package com.company;

public class User {
    public User(String jmeno, String heslo, String email, int vek) {
        this.jmeno = jmeno;
        this.heslo = heslo;
        this.email = email;
        this.vek = vek;
    }

    private String jmeno;
    private String heslo;
    private String email;
    private int vek;

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getHeslo() {
        return heslo;
    }

    public void setHeslo(String heslo) {
        this.heslo = heslo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getVek() {
        return vek;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "jmeno='" + jmeno + '\'' +
                ", heslo='" + heslo + '\'' +
                ", email='" + email + '\'' +
                ", vek=" + vek +
                '}';
    }

    public void zmenaHesla(){
        System.out.println("Menim heslo");
    }

    public void zmenaJmena(){
        System.out.println("Menim jmeno");
    }

    public void zmenaEmailu(){
        System.out.println("Menim email");
    }

    public void zmenaVeku(){
        System.out.println("Menim vek");
    }
}
