/**
 * Iniciar sesión
 * @param xhr
 * @param status
 * @param args
 * @returns
 */
function manejarLogin(xhr, status, args) {
    if (!args.validationFailed && args.estaLogeado) {
      setTimeout(function() {
        window.location = args.view;
      }, 500);
    }
  }