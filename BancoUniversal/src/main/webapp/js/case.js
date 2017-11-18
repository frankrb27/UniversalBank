/**
* Métodos de casos
*/

//Crear caso
function createCase(tipoDocumento, numeroDocumento, nombres, apellidos, numeroCelular, correoElectronico, genero, estadoCivil, tipoVivienda, ubicacion, modalidad, montoSolicitado, plazo, ingresos, egresos, activos, pasivos, sector, empresa, salario, cargoActual){	
	$.ajax({
		type: "POST",
		url: dominio+'/bonita/API/bpm/case',
		contentType: 'application/json',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		dataType: 'json', 
		data : JSON.stringify({'processDefinitionId': idProcess,
								'variables' : [
								{'name' : 'solicitudOk',       'value' : 'false'},
								{'name' : 'referenciasOk',     'value' : 'false'},
								{'name' : 'cumpleOk',          'value' : 'false'},
								{'name' : 'estadoOk',          'value' : 'false'},
								{'name' : 'tipoDocumento',     'value' : tipoDocumento},
								{'name' : 'numeroDocumento',   'value' : numeroDocumento},
								{'name' : 'nombres',           'value' : nombres},
								{'name' : 'apellidos',         'value' : apellidos},
								{'name' : 'numeroCelular',     'value' : numeroCelular},
								{'name' : 'correoElectronico', 'value' : correoElectronico},
								{'name' : 'genero',            'value' : genero},
								{'name' : 'estadoCivil',       'value' : estadoCivil},
								{'name' : 'tipoVivienda',      'value' : tipoVivienda},
								{'name' : 'ubicacion',         'value' : ubicacion},
								{'name' : 'modalidad',         'value' : modalidad},
								{'name' : 'montoSolicitado',   'value' : montoSolicitado},
								{'name' : 'plazo',             'value' : plazo},
								{'name' : 'ingresos',          'value' : ingresos},
								{'name' : 'egresos',           'value' : egresos},
								{'name' : 'activos',           'value' : activos},
								{'name' : 'pasivos',           'value' : pasivos},
								{'name' : 'sector',            'value' : sector},
								{'name' : 'empresa',           'value' : empresa},
								{'name' : 'salario',           'value' : salario},
								{'name' : 'cargoActual',       'value' : cargoActual},
								{'name' : 'estadoSolicitud',   'value' : 'RADICADA'}
								]
								}),
		success: function (data, jqXHR) {
			console.log('caso creado');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error al crear caso')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Consultar casos
function getCase(idCase){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/case/'+idCase+'?d',
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		dataType: 'json',
		success: function (data, jqXHR) {
			console.log('caso consultado');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error al consultar caso')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Eliminar usuarios
function deleteCase(idCase){
	$.ajax({
		type: "DELETE",
		url: dominio+'/bonita/API/bpm/case/'+idCase,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		dataType: 'json',
		success: function (data, jqXHR) {
			console.log('caso eliminado');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error al eliminar caso')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}
