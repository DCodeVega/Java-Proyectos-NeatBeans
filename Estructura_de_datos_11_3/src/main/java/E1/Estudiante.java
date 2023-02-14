
package E1;

public class Estudiante {
    public String ci,pat,mat,nom,dir,car;
    public double nota;

    public Estudiante(String ci, String pat, String mat, String nom, String dir, String car, double nota) {
        this.ci = ci;
        this.pat = pat;
        this.mat = mat;
        this.nom = nom;
        this.dir = dir;
        this.car = car;
        this.nota = nota;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getPat() {
        return pat;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    public String getTodo(){
        String s;
        s=ci+"\t"+pat+"\t"+mat+"\t"+nom+"\t"+dir+"\t"+car+"\t"+nota+"\n";
        return s;
    }
    
}
