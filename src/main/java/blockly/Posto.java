package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity
public class Posto {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Posto
public static Var AposInserir(@ParamMetaData(description = "Entidade") Var Entidade) throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {

    cronapi.database.Operations.insert(Var.valueOf("app.entity.Noticias"),Var.valueOf("texto",
    Var.valueOf(
    cronapi.i18n.Operations.translate(Var.valueOf("AposInserirPostoTitulo")).toString() +
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("posto")).toString() +
    cronapi.i18n.Operations.translate(Var.valueOf("Endereco")).toString() +
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("endereco")).toString() +
    cronapi.i18n.Operations.translate(Var.valueOf("Cidade")).toString() +
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("cidade")).toString() +
    cronapi.i18n.Operations.translate(Var.valueOf("Uf")).toString() +
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("uf")).toString())),Var.valueOf("titulo",
    Var.valueOf(
    cronapi.i18n.Operations.translate(Var.valueOf("AposInserirPostoTitulo")).toString() +
    cronapi.object.Operations.getObjectField(Entidade, Var.valueOf("posto")).toString())));
    return Var.VAR_NULL;
   }
 }.call();
}

}

