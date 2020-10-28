<jsp:include page="head.jsp" />
<style>
#conteiner {
	width: 960px;
	margin: 0 auto;
	padding-top: 20px;
}

#buscarUsuario {
	height: 110px;
}
</style>
<header>
	<nav class="navbar navbar-light bg-dark">
		<span class="navbar-brand mb-0 text-danger h1">Dashboard
			Usuarios</span>
	</nav>
</header>
<body>
	<div id="conteiner" class="row justify-content-between">

		<div id="buscarUsuario" class="col-3 bg-dark .mr-1 rounded">
			<Strong class="text-light">Buscar usuario</Strong><br>
			<div class="input-group mb-3">
				<input id="idBusca" type="text" class="form-control"
					placeholder="Digite o ID" aria-label="Recipiente para nickname"
					aria-describedby="basic-addon2">
				<button id="btnBusca" type='button'
					class='btn btn-secondary btn-sm mr-2'>
					<svg width="1em" height="1em" viewBox="0 0 16 16"
						class="bi bi-search" fill="currentColor"
						xmlns="http://www.w3.org/2000/svg">
  							<path fill-rule="evenodd"
							d="M10.442 10.442a1 1 0 0 1 1.415 0l3.85 3.85a1 1 0 0 1-1.414 1.415l-3.85-3.85a1 1 0 0 1 0-1.415z" />
  							<path fill-rule="evenodd"
							d="M6.5 12a5.5 5.5 0 1 0 0-11 5.5 5.5 0 0 0 0 11zM13 6.5a6.5 6.5 0 1 1-13 0 6.5 6.5 0 0 1 13 0z" />
				    	</svg>
				</button>
			</div>
		</div>
		<table class="table table-dark table-striped col-8">
			<thead class="thead">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Nome</th>
					<th scope="col">Email</th>
					<th scope="col">Ações</th>

				</tr>
			</thead>
			<tbody id="tabelaUsuarios">

			</tbody>
		</table>

	</div>

	<!-- Modal -->
	<div class="modal fade" id="buscaModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Usuario encontrado</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form id="formCadastro">
						<div class="form-group">
							<label for="nome">Nome</label> <input type="text"
								class="form-control" id="nomeConsulta" name="nome"
								aria-describedby="emailHelp">
						</div>
						<div class="form-group">
							<label for="email">Email</label> <input type="email"
								class="form-control" id="emailConsulta" name="email">
						</div>
						<div class="form-group">
							<label for="ddd">DDD</label> <input type="number"
								class="form-control" id="dddConsulta" name="ddd"> <label
								for="numero">Número</label> <input type="number"
								class="form-control" id="numeroConsulta" name="número">
							<label for="tipo">Tipo</label>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="tipo"
									id="RFixoCadastro" value="Fixo" checked> <label
									class="form-check-label" for="fixo"> Fixo </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="tipo"
									id="RCelularCadastro" value="Celular"> <label
									class="form-check-label" for="celular"> Celular </label>
							</div>
						</div>
						<button type="submit" class="btn btn-primary">Submit</button>
					</form>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-secondary btn-sm mr-2">
							<svg width="1em" height="1em" viewBox="0 0 16 16" class="bi bi-pencil1" fill="currentColor" xmlns="http://www.w3.org/2000/svg">
							<path fill-rule="evenodd" d="M12.146.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1 0 .708l-10 10a.5.5 0 0 1-.168.11l-5 2a.5.5 0 0 1-.65-.65l2-5a.5.5 0 0 1 .11-.168l10-10zM11.207 2.5L13.5 4.793 14.793 3.5 12.5 1.207 11.207 2.5zm1.586 3L10.5 3.207 4 9.707V10h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.293l6.5-6.5zm-9.761 5.175l-.106.106-1.528 3.821 3.821-1.528.106-.106A.5.5 0 0 1 5 12.5V12h-.5a.5.5 0 0 1-.5-.5V11h-.5a.5.5 0 0 1-.468-.325z"/></svg>
						</button>
					<button type="button" class="btn btn-danger btn-sm">
						<svg width="1em" height="1em" viewBox="0 0 16 16"
							class="bi bi-trash" fill="currentColor"
							xmlns="http://www.w3.org/2000/svg">
						  		<path
								d="M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z" />
						  		<path fill-rule="evenodd"
								d="M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4L4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z" />
							</svg>
					</button>
				</div>
			</div>
		</div>
	</div>


</body>

<script>
	$(document).ready(function() {
		$("#conteiner").append("<div class='d-flex justify-content-center'><div class='spinner-border text-danger' role='status'><span class='sr-only'>Loading...</span></div></div>")
		$.ajax({
			url : "Controller",
			type : 'GET',
			data : {
				cmd : "listar"
			},
			success : function(data) {
				$(".d-flex").remove()
				for(usuario of data){ 
					
					var componente = " <tr > " +
					"<th scope='row'>"+ usuario.id + "</th>" +
					"<td>"+ usuario.nome +"</td>"+
					"<td>"+ usuario.email +"</td>"+
					"<td>" +
						"<button type='button' class='btn btn-secondary btn-sm mr-2'>"+
							"<svg width='1em' height='1em' viewBox='0 0 16 16' class='bi bi-pencil1' fill='currentColor' xmlns='http://www.w3.org/2000/svg'>"+
							"<path fill-rule='evenodd' d='M12.146.146a.5.5 0 0 1 .708 0l3 3a.5.5 0 0 1 0 .708l-10 10a.5.5 0 0 1-.168.11l-5 2a.5.5 0 0 1-.65-.65l2-5a.5.5 0 0 1 .11-.168l10-10zM11.207 2.5L13.5 4.793 14.793 3.5 12.5 1.207 11.207 2.5zm1.586 3L10.5 3.207 4 9.707V10h.5a.5.5 0 0 1 .5.5v.5h.5a.5.5 0 0 1 .5.5v.5h.293l6.5-6.5zm-9.761 5.175l-.106.106-1.528 3.821 3.821-1.528.106-.106A.5.5 0 0 1 5 12.5V12h-.5a.5.5 0 0 1-.5-.5V11h-.5a.5.5 0 0 1-.468-.325z'/></svg>"+
						"</button>"+
						"<button type='button' class='btn btn-danger btn-sm'>"+
							"<svg width='1em' height='1em' viewBox='0 0 16 16' class='bi bi-trash' fill='currentColor' xmlns='http://www.w3.org/2000/svg'>"+
						  		"<path d='M5.5 5.5A.5.5 0 0 1 6 6v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm2.5 0a.5.5 0 0 1 .5.5v6a.5.5 0 0 1-1 0V6a.5.5 0 0 1 .5-.5zm3 .5a.5.5 0 0 0-1 0v6a.5.5 0 0 0 1 0V6z'/>"+
						  		"<path fill-rule='evenodd' d='M14.5 3a1 1 0 0 1-1 1H13v9a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V4h-.5a1 1 0 0 1-1-1V2a1 1 0 0 1 1-1H6a1 1 0 0 1 1-1h2a1 1 0 0 1 1 1h3.5a1 1 0 0 1 1 1v1zM4.118 4L4 4.059V13a1 1 0 0 0 1 1h6a1 1 0 0 0 1-1V4.059L11.882 4H4.118zM2.5 3V2h11v1h-11z'/>"+
							"</svg>"
						"</button>"+
					"</td>"+
			  "</tr>";
					$("#tabelaUsuarios").append(componente);
				}
			}
		});
	});
	$("#btnBusca").click(function(){
		$.ajax({
			url : "Controller",
			type : 'GET',
			data : {
				id : $("#idBusca").val(),
				cmd : "buscar"
			},
			success : function(data) {
				if(data !== null){ 
					console.log(data.nome)
					$('#buscaModal').modal()
					$('#nomeConsulta').val(data.nome)
					$('#emailConsulta').val(data.email)
					$('#dddConsulta').val(data.telefone[0].ddd)
					$('#numeroConsulta').val(data.telefone[0].numero)						
				}else{
					alert("usuario não existe")
				}
			}
		});
	});
</script>
</html>