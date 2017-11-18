//Obtener tareas
function getTask(){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/humanTask?c=50&d=rootContainerId&f=state=ready&f=user_id='+userInfo.id+'&o=displayName+ASC&p=0',//&f=25
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('getTask');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error getTask')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Obtener tareas
function getTask_1(){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/humanTask?c=0&f=state=ready&f=user_id='+userInfo.id+'&p=0',
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('getTask_1');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error getTask_1')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Obtener tareas
function getTask_2(){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/humanTask?c=0&f=state=ready&f=assigned_id='+userInfo.id+'&p=0',
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('getTask_2');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error getTask_2')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Obtener tareas
function getTaskById(idTask){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/task/'+idTask,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('getTaskById');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error getTask')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Obtener tareas
function getTaskVariables(idCase){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/caseVariable?p=0&c=50&f=case_id='+idCase,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('getTaskVariables');
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error getTaskVariables')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Asignar tareas
function assignTask(idTask, idCase){
	$.ajax({
		type: "PUT",
		url: dominio+'/bonita/API/bpm/humanTask/'+idTask,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		data: JSON.stringify({'assigned_id' : userInfo.id}),
		success: function (data, jqXHR) {
			console.log('assignTask');			
			console.log(data);
			//startTask(idCase);					
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error assignTask')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Asignar tareas
function breakTask(idTask){
	$.ajax({
		type: "PUT",
		url: dominio+'/bonita/API/bpm/humanTask/'+idTask,
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		data: JSON.stringify({'assigned_id' : ''}),
		success: function (data, jqXHR) {
			console.log('breakTask');			
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error breakTask')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Iniciar tareas
function startTask(idCase){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/bpm/case/'+idCase+'?d=started_by&d=processDefinitionId',
		contentType: 'application/json;charset=UTF-8',
		headers : {'X-Bonita-API-Token' : token},
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('startTask');			
			console.log(data);
			//mapTask(idCase);					
		},
		error: function(jqXHR, textStatus, errorThrown, err) {
			console.log('Error startTask')
			console.log(err);
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});
}

//Map tareas
function mapTask(idCase){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/form/mapping?c=1&f=processDefinitionId='+idProcess+'&f=type=PROCESS_OVERVIEW&p=0',
		contentType: 'application/json',
		context: this,
		crossDomain: true,
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('mapTask');			
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown) {
			console.log('Error mapTask')
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});						
}

//Map tareas
function mapNextActivity(idCase, nameTask){
	$.ajax({
		type: "GET",
		url: dominio+'/bonita/API/form/mapping?c=1&f=processDefinitionId='+idProcess+'&f=task='+nameTask+'&f=type=TASK&p=0',
		contentType: 'application/json',
		context: this,
		crossDomain: true,
		xhrFields: {
			withCredentials: true
		},
		success: function (data, jqXHR) {
			console.log('mapNextActivity');			
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown) {
			console.log('Error mapNextActivity')
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});						
}

//Cambiar valor de las variables de la tarea
function changeValueVariable(idCase, type, variable, value){
	$.ajax({
		type: "PUT",
		url: dominio+'/bonita/API/bpm/caseVariable/'+idCase+'/'+variable,
		contentType: 'application/json',
		headers : {'X-Bonita-API-Token' : token},
		data: JSON.stringify({'type' : type, 'value' : value}),
		success: function (data, jqXHR) {
			console.log('changeValueVariable');			
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown) {
			console.log('Error changeValueVariable')
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});						
}

//Cambiar valor de las variables de la tarea
function executeTask(idTask){
	$.ajax({
		type: "POST",
		url: dominio+'/bonita/API/bpm/userTask/'+idTask+'/execution',
		contentType: 'application/json',
		headers : {'X-Bonita-API-Token' : token},
		data: JSON.stringify({'ticket_comment': 'Tarea ejecutada'}),
		success: function (data, jqXHR) {
			console.log('executeTask');			
			console.log(data);
		},
		error: function(jqXHR, textStatus, errorThrown) {
			console.log('Error executeTask')
			console.log(jqXHR.status);
			console.log(textStatus);
			console.log(errorThrown);
		}
	});						
}