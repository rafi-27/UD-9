package ejercicioParking;

public class vehicles {
    String matricula;
    int metros;
    public vehicles(String matricula, int metros) {
        this.matricula = matricula;
        this.metros = metros;
    }
    @Override
    public String toString() {
        return "vehicles [matricula=" + matricula + ", metros=" + metros + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        result = prime * result + metros;
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        vehicles other = (vehicles) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        if (metros != other.metros)
            return false;
        return true;
    }

    
}
