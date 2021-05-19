package blockly;

import cronapi.*;
import cronapi.rest.security.CronappSecurity;
import java.util.concurrent.Callable;



@CronapiMetaData(type = "blockly")
@CronappSecurity(post = "Public", get = "Public", execute = "Public")
public class Usuario {

public static final int TIMEOUT = 300;

/**
 *
 * @param @ParamMetaData
 * @return Var
 */
// Usuario
public static Var Cadastrar(@ParamMetaData(description = "nome") Var nome, @ParamMetaData(description = "email") Var email, @ParamMetaData(description = "senha") Var senha, @ParamMetaData(description = "confirmasenha") Var confirmasenha) throws Exception {
 return new Callable<Var>() {

   private Var sucesso = Var.VAR_NULL;
   private Var idUser = Var.VAR_NULL;
   private Var exp = Var.VAR_NULL;

   public Var call() throws Exception {

    sucesso =
    Var.VAR_TRUE;

    try {

        idUser =
        cronapi.util.Operations.generateUUID();

        cronapi.database.Operations.insert(Var.valueOf("app.entity.User"),Var.valueOf("password",
        cronapi.util.Operations.encryptPassword(senha)),Var.valueOf("normalizedUserName",
        cronapi.text.Operations.normalize(email)),Var.valueOf("name",nome),Var.valueOf("normalizedEmail",
        cronapi.text.Operations.normalize(email)),Var.valueOf("id",idUser),Var.valueOf("userName",email),Var.valueOf("email",email));

        cronapi.database.Operations.insert(Var.valueOf("app.entity.ApplicationUser"),Var.valueOf("application",
        cronapi.util.Operations.getApplicationId()),Var.valueOf("user",idUser));
     } catch (Exception exp_exception) {
          exp = Var.valueOf(exp_exception);

        sucesso =
        Var.VAR_FALSE;
     }
    return sucesso;
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ObterIdUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   private Var sucesso = Var.VAR_NULL;
   private Var idUser = Var.VAR_NULL;
   private Var senha = Var.VAR_NULL;
   private Var email = Var.VAR_NULL;
   private Var nome = Var.VAR_NULL;
   private Var exp = Var.VAR_NULL;

   public Var call() throws Exception {
    return
cronapi.database.Operations.getField(
cronapi.database.Operations.query(Var.valueOf("app.entity.User"),Var.valueOf("select u from User u where u.normalizedUserName = :normalizedUserName"),Var.valueOf("normalizedUserName",
cronapi.util.Operations.getCurrentUserName())),
Var.valueOf("this[0].id"));
   }
 }.call();
}

/**
 *
 * @return Var
 */
// Descreva esta função...
public static Var ObterUserNameUsuarioLogado() throws Exception {
 return new Callable<Var>() {

   public Var call() throws Exception {
    return
cronapi.util.Operations.getCurrentUserName();
   }
 }.call();
}

}

