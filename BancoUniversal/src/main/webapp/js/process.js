/**
 * Métodos de procesos
 */

//Obtener procesos desplegados
function getProcess(){
	var process;
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/process?p=0&c=10&s=Fondo Nacional de Ahorro',
		contentType: 'application/json;charset=UTF-8',
		context: this,
		crossDomain: true,
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('getProcess');
			console.log(data);
			idProcess = data[0].id;
			process = data;
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error getProcess')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Obtener procesos desplegados
function getProcessById(){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/process/'+idProcess,
		contentType: 'application/json;charset=UTF-8',
		context: this,
		crossDomain: true,
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('getProcessById');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error getProcessById')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Obtener procesos desplegados
function getProcessPending(){
	console.log(userInfo);
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/process?c=2147483646&f=user_id='+userInfo.id+'&f=forPendingOrAssignedTask=true&p=0',
		contentType: 'application/json;charset=UTF-8',
		context: this,
		crossDomain: true,
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('getProcessPending');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error getProcessPending')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

function dataSet(){
	
	getProcess();
	$('#example').puidatatable({
	    columns: [],
	    datasource: process
	});
}