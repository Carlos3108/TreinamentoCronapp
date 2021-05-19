package blockly;

import cronapi.*;
import cronapi.rest.security.CronappAudit;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronappAudit
@CronapiMetaData(type = "blockly")
@CronappSecurity
public class ImprimeListaMapas {

public static final int TIMEOUT = 300;

/**
 *
 * @return Var
 */
// ImprimeListaMapas
public static Var Imprimir() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    System.out.println(
    Var.valueOf("Imprime Lista de Mapa").getObjectAsString());

    System.out.println(
    cronapi.list.Operations.newList(
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("nome",
    Var.valueOf("Audi")) , Var.valueOf("codigo",
    Var.valueOf("1"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("nome",
    Var.valueOf("BMW")) , Var.valueOf("codigo",
    Var.valueOf("2"))),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("nome",
    Var.valueOf("VW")) , Var.valueOf("codigo",
    Var.valueOf("3")))).getObjectAsString());

    cronapi.util.Operations.audit(
    Var.valueOf("General"),
    Var.valueOf("Teste"),
    Var.valueOf("Trace"),
    cronapi.map.Operations.createObjectMapWith(Var.valueOf("nome",
    Var.valueOf("Audi")) , Var.valueOf("codigo",
    Var.valueOf("1"))));
    return Var.VAR_NULL;
   }
 }.call();
}

}

