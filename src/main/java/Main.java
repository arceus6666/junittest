/**
 * Created by Arceus6666 on 07/05/2018.
 */
public class Main {
    /**
     * Este metodo verifica si un estudiante aprobo una materia
     * @param nota1
     * @param nota2
     * @param nota3
     */
    public static String getStatus (int nota1, int nota2, int nota3){
        String nota="Nota: ";
        if (nota1 < 0 || nota1>30)
            return nota+"nota1 es incorrecta";
        if (nota2 <= 0 || nota2>30)
            return nota+"nota2 es incorrecta";
        if (nota3 < 0 && nota3>40)
            return nota+"nota1 es incorrecta";
        nota1=nota1==30?0:nota1;
        nota2=nota2==0?30:nota2;
        nota1=nota2==1?nota1*-1:nota1;
        return nota+(nota1+nota2+nota3);
    }
}
