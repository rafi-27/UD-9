package maraton.nuevePuntoNueve;

import java.text.DecimalFormat;

public class MovilPrepagoClass {
    //Creamos el numero movil recordamos que tiene 13 digitos.
    protected int numeroMovil;
    //float costeEstableceLlamada (euros, con dos decimales)
    protected float costeEstableceLlamada;
    //float costeMinutoLlamada (euros, con dos decimales)
    protected float costeMinutoLlamada;
    //float costeConsumoMB (euros, con dos decimales)
    protected float costeConsumoMB;
    //float saldo (euros, con dos decimales) nunca puede ser negativo
    protected float saldo;

    public MovilPrepagoClass(int number,float costcall, float costminutcall,float costconsumMB,float cash){
        this.numeroMovil=number;
        this.costeEstableceLlamada=costcall;
        this.costeMinutoLlamada=costminutcall;
        this.costeConsumoMB=costconsumMB;
        this.saldo=cash;
    }

    //Getters

    public int getNumeroMovil() {
        return numeroMovil;
    }

    public String getCosteEstableceLlamada() {
        DecimalFormat formato = new DecimalFormat("#,00");
        return formato.format(getCosteEstableceLlamada());
    }

    public String getCosteMinutoLlamada() {
        DecimalFormat formato = new DecimalFormat("#,00");
        return formato.format(getCosteMinutoLlamada());
    }

    public String getCosteConsumoMB() {
        DecimalFormat formato = new DecimalFormat("#,00");
        return formato.format(getCosteConsumoMB());    }

    public String getSaldo() {
        DecimalFormat formato = new DecimalFormat("#,00");
        return formato.format(getSaldo());
    }

    //Setters
    public void setNumeroMovil(int number){
        this.numeroMovil=number;
    }

    public void setCosteEstableceLlamada(float costellamda){
        this.costeEstableceLlamada=costellamda;
    }

    public void setCosteMinutoLlamada(float costMinutCall){
        this.costeMinutoLlamada=costMinutCall;
    }

    public void setCosteConsumoMB(float costConsumMB){
        this.costeConsumoMB=costConsumMB;
    }

    public void setSaldo(float cash){
        this.saldo=cash;
    }

    //Metodos a implementar:

    public void efectuarLlamada (int segundos){
        float costoLlamada =this.costeEstableceLlamada+(costeMinutoLlamada*segundos/60);
        if(this.saldo > 0){
            this.saldo=this.saldo-costoLlamada;
        }else {
            System.err.println("No tienes suficiente saldo!");
        }
    }

    public void navegar(int MB){
        float costoNavegacion = this.costeConsumoMB*MB;
        if(this.saldo > 0){
            this.saldo-=costoNavegacion;
        }else {
            System.err.println("No tienes suficiente saldo!");
        }
    }

    public boolean recargar (int importe){
        if(importe % 5 == 0){
            this.saldo+=importe;
            return true;
        }else return false;
    }

    public float consultarSaldo (){
        return (float) (Math.round(this.saldo*Math.pow(10,2))/Math.pow(10,2));
    }
}
