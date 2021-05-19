window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Login = window.blockly.js.blockly.Login || {};

/**
 * Login
 */
window.blockly.js.blockly.Login.abrirModalCadastroArgs = [];
window.blockly.js.blockly.Login.abrirModalCadastro = async function() {
 var sucessoCadastro;
  this.cronapi.screen.showModal("modal-cadastro");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Login.fecharModalCadastroArgs = [];
window.blockly.js.blockly.Login.fecharModalCadastro = async function() {
 var sucessoCadastro;
  this.cronapi.screen.hideModal("modal-cadastro");
}

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Login.confirmarCadastroArgs = [];
window.blockly.js.blockly.Login.confirmarCadastro = async function() {
 var sucessoCadastro;
  if (this.cronapi.screen.getValueOfField("vars.senha") == this.cronapi.screen.getValueOfField("vars.confirmasenha")) {
    if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("vars.nome"))) {
      this.cronapi.screen.notify('error',this.cronapi.i18n.translate("NomeNaoInformado",[  ]));
    } else if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("vars.email"))) {
      this.cronapi.screen.notify('error',this.cronapi.i18n.translate("EmailNaoInformado",[  ]));
    } else if (this.cronapi.logic.isNullOrEmpty(this.cronapi.screen.getValueOfField("vars.senha"))) {
      this.cronapi.screen.notify('error',this.cronapi.i18n.translate("SenhaNaoInformado",[  ]));
    } else {
      this.cronapi.util.callServerBlocklyAsynchronous('blockly.Usuario:Cadastrar', async function(sender_sucessoCadastro) {
          sucessoCadastro = sender_sucessoCadastro;
        if (sucessoCadastro) {
          this.cronapi.screen.hideModal("modal-cadastro");
          this.cronapi.screen.notify('success',this.cronapi.i18n.translate("UserCadastrado",[  ]));
        } else {
          this.cronapi.screen.notify('error',this.cronapi.i18n.translate("FailUserCadastrado",[  ]));
        }
      }.bind(this), this.cronapi.screen.getValueOfField("vars.nome"), this.cronapi.screen.getValueOfField("vars.email"), this.cronapi.screen.getValueOfField("vars.senha"), this.cronapi.screen.getValueOfField("vars.confirmasenha"));
    }
  } else {
    this.cronapi.screen.notify('error',this.cronapi.i18n.translate("SenhaFail",[  ]));
  }
}
