
package ventanasHijas;

public class datosEst {
    String ci,pat,mat,nom,dir,tel;

    public datosEst() {
        
    }
    
    public datosEst(String ci, String pat, String mat, String nom, String dir, String tel) {
        this.ci = ci;
        this.pat = pat;
        this.mat = mat;
        this.nom = nom;
        this.dir = dir;
        this.tel = tel;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public void setPat(String pat) {
        this.pat = pat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getCi() {
        return ci;
    }

    public String getPat() {
        return pat;
    }

    public String getMat() {
        return mat;
    }

    public String getNom() {
        return nom;
    }

    public String getDir() {
        return dir;
    }

    public String getTel() {
        return tel;
    }
    
}
