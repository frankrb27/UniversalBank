/**
* Métodos de usuario
*/

//Crear usuario
function createUser(userName, password_, confirm_password, firstName, lastName){
	//var username = $("#username").val();
console.log(headers);
	$.ajax({
		type: "POST",
		url: dominio+'/bonita/API/identity/user/',
		contentType: 'application/json;charset=UTF-8',	
		headers : {'X-Bonita-API-Token' : token},
		dataType: 'json',
		data : JSON.stringify({'userName':userName,'password':password_,'password_confirm':confirm_password,'firstname':firstName,'lastname':lastName}),
		success: function (data, res, jqXHR) {
			console.log('usuario creado');
		},
		error: function(jqXHR, textStatus, errorThrown) {
			console.log('Error al crear usuario')
			console.log(jqXHR);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Consultar usuarios
function getUser(idUser){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/identity/user/'+idUser,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('usuario consultado');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error al consultar usuario')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Actualizar usuarios
function updateUser(idUser, userName, password_, confirm_password, firstName, lastName){
	$.ajax({
		type: "PUT",
		url: dominio+'/bonita/API/identity/user/'+idUser,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		data : JSON.stringify({'id':idUser, 'userName':userName,'password':password_,'password_confirm':confirm_password,'firstname':firstName,'lastname':lastName}),
		success: function (data, res, jqXHR) {
			console.log('usuario actualizado');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error al actualizar usuario')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Deshabilitar usuarios
function enabledUser(idUser,state){
	$.ajax({
		type: "PUT",
		url: dominio+'/bonita/API/identity/user/'+idUser,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		data : JSON.stringify({'enabled':state}),
		success: function (data, jqXHR) {
			console.log('usuario habilitado o deshabilitado');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error al habilitar o deshabilitar usuario')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Eliminar usuarios
function deleteUser(idUser){
	$.ajax({
		type: "DELETE",
		url: dominio+'/bonita/API/identity/user/'+idUser,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('usuario eliminado');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error al eliminar usuario')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}
