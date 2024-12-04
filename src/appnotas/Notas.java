package appnotas;


import java.util.ArrayList;
import java.util.List;

public class Notas implements INotas {
    private double notaAV1;
    private double notaAV2;
    private double notaAV3;
    private double media;
    
    public static List<Notas> medias = new ArrayList<>();
    
    public void adicionarMedia(Notas nota){
        medias.add(nota);
    }

    public double getNotaAV1() {
        return notaAV1;
    }

    public void setNotaAV1(double notaAV1) {
        this.notaAV1 = notaAV1;
    }

    public double getNotaAV2() {
        return notaAV2;
    }

    public void setNotaAV2(double notaAV2) {
        this.notaAV2 = notaAV2;
    }

    public double getNotaAV3() {
        return notaAV3;
    }

    public void setNotaAV3(double notaAV3) {
        this.notaAV3 = notaAV3;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }
     
    @Override
    public double calcularMedia(double notaAV1, double notaAV2, double notaAV3) {
        setNotaAV1(notaAV1);
        setNotaAV2(notaAV2);
        setNotaAV3(notaAV3);
        
        double media = (getNotaAV1() + getNotaAV2() + getNotaAV3()) / 3;
        
        setMedia(media);
        
        return media;
    }

    @Override
    public void mostrarAprovados() {
        
    }

    @Override
    public void mostrarReprovados() {
         
    }
    
}
