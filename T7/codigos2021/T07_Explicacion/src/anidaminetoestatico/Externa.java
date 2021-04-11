package anidaminetoestatico;

public class Externa {
    private String nombreClaseExterna;
    private int numeroClaseInternsa;

    public Externa(String nombreClaseExterna, int numeroClaseInternsa) {
        this.nombreClaseExterna = nombreClaseExterna;
        this.numeroClaseInternsa = numeroClaseInternsa;
    }

    public String getNombreClaseExterna() {
        return nombreClaseExterna;
    }

    public void setNombreClaseExterna(String nombreClaseExterna) {
        this.nombreClaseExterna = nombreClaseExterna;
    }

    public int getNumeroClaseInternsa() {
        return numeroClaseInternsa;
    }

    public void setNumeroClaseInternsa(int numeroClaseInternsa) {
        this.numeroClaseInternsa = numeroClaseInternsa;
    }

    static class Interna{
        String nombreInterna;
        int numeroInterna;

        public Interna(String nombreInterna, int numeroInterna) {
            this.nombreInterna = nombreInterna;
            this.numeroInterna = numeroInterna;
        }

        public String getNombreInterna() {
            return nombreInterna;
        }

        public void setNombreInterna(String nombreInterna) {
            this.nombreInterna = nombreInterna;
        }

        public int getNumeroInterna() {
            return numeroInterna;
        }

        public void setNumeroInterna(int numeroInterna) {
            this.numeroInterna = numeroInterna;
        }
    }
}
