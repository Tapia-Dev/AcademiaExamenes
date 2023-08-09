import com.dto.CursoDTO;
import com.service.CursoService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CursosService2Test {


    @Test
    public void test1(){
        CursoDTO cursoEsperado = new CursoDTO(1,"JAVA", 2500,"160HRS");
        CursoService cursoService = new CursoService();
        final CursoDTO resultado = cursoService.crearCurso(1,"JAVA", 2500,"160HRS");
        // ES IGUAL QUE OTRO
        Assertions.assertEquals(cursoEsperado,resultado);
    }

}