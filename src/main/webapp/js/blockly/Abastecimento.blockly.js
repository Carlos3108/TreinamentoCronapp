window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Abastecimento = window.blockly.js.blockly.Abastecimento || {};

/**
 * Descreva esta função...
 */
window.blockly.js.blockly.Abastecimento.ConfirmarAbastecimentoArgs = [];
window.blockly.js.blockly.Abastecimento.ConfirmarAbastecimento = async function() {

  if (await this.blockly.js.blockly.Abastecimento.ValidarValor()) {
    this.cronapi.screen.post("Abastecimento");
  } else {
    this.cronapi.screen.notify('error',this.cronapi.i18n.translate("AbastecimentoValorAcimaLimite",[  ]));
  }
}

/**
 * Abastecimento
 */
window.blockly.js.blockly.Abastecimento.ValidarValorArgs = [];
window.blockly.js.blockly.Abastecimento.ValidarValor = async function() {

  return this.cronapi.screen.getValueOfField("Abastecimento.active.valor") <= 10000 ? true : false;
}
