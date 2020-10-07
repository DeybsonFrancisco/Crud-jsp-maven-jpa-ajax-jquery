<jsp:include page="head.jsp" />
<style>
#conteiner {
	width: 960px;
	margin: 0 auto;
	padding-top: 20px;
}
</style>
<header>
	<nav class="navbar navbar-light bg-dark">
		<span class="navbar-brand mb-0 text-danger h1">Dashboard
			Usuarios</span>
	</nav>
</header>
<body>
	<div id="conteiner">
		<table class="table table-dark table-striped">
			<thead class="thead">
				<tr>
					<th scope="col">ID</th>
					<th scope="col">Nome</th>
					<th scope="col">Email</th>
					<th scope="col">Telefone</th>
					<th scope="col">Ações</th>

				</tr>
			</thead>
			<tbody>
				<tr>
					<th scope="row">1</th>
					<td>Mark</td>
					<td>Otto</td>
					<td>Thornton</td>
					<td>
						<button type="button" class="btn btn-secondary btn-sm">Atualizar
							button</button>
						<button type="button" class="btn btn-danger btn-sm">Excluir
							button</button>
					</td>
				</tr>
				<tr>
					<th scope="row">2</th>
					<td>Jacob</td>
					<td>Thornton</td>
					<td>Thornton</td>
					<td>
						<button type="button" class="btn btn-secondary btn-sm">Atualizar
							button</button>
						<button type="button" class="btn btn-danger btn-sm">Excluir
							button</button>
					</td>
				</tr>
				<tr>
					<th scope="row">3</th>
					<td>Larry</td>
					<td>the Bird</td>
					<td>@twitter</td>
					<td>
						<button type="button" class="btn btn-secondary btn-sm">Atualizar
							button</button>
						<button type="button" class="btn btn-danger btn-sm">Excluir
							button</button>
					</td>
				</tr>

			</tbody>
		</table>

	</div>


</body>
</html>