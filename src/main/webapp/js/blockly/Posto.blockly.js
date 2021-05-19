window.blockly = window.blockly || {};
window.blockly.js = window.blockly.js || {};
window.blockly.js.blockly = window.blockly.js.blockly || {};
window.blockly.js.blockly.Posto = window.blockly.js.blockly.Posto || {};

/**
 * Posto
 */
window.blockly.js.blockly.Posto.ObterDadosCepArgs = [];
window.blockly.js.blockly.Posto.ObterDadosCep = async function() {
 var dadosCep;
  this.cronapi.util.getURLFromOthers('GET', 'application/json', ['https://viacep.com.br/ws/',this.cronapi.screen.getValueOfField("Posto.active.cep"),'/json/'].join(''), null, null, async function(sender_dadosCep) {
      dadosCep = sender_dadosCep;
    this.cronapi.screen.changeValueOfField("Posto.active.cidade", this.cronapi.object.getProperty(dadosCep, 'localidade'));
    this.cronapi.screen.changeValueOfField("Posto.active.endereco", this.cronapi.object.getProperty(dadosCep, 'logradouro'));
    this.cronapi.screen.changeValueOfField("Posto.active.uf", this.cronapi.object.getProperty(dadosCep, 'uf'));
  }.bind(this), async function(sender_dadosCep) {
      dadosCep = sender_dadosCep;
    this.cronapi.screen.notify('warning',this.cronapi.i18n.translate("CepNaoValido",[  ]));
  }.bind(this));
}
