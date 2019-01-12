package negocio;

import java.util.Calendar;

public class DiasMes {
    public int numeroDias(){
        Calendar calendario = Calendar.getInstance();
        int dias = calendario.getActualMaximum(Calendar.DAY_OF_MONTH);
        return dias;
    }
}
