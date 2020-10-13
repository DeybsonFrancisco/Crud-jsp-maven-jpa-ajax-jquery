<jsp:include page = "head.jsp" /> 
<body>
	<header> <nav
		class="navbar navbar-expand-lg navbar-light bg-dark ">
	<span class="navbar-brand mb-0 text-danger h1">Projeto segunda fse</span>
	<button class="navbar-toggler" type="button" data-toggle="collapse"
		data-target="#navbarNav" aria-controls="navbarNav"
		aria-expanded="false" aria-label="Toggle navigation">
		<span class="navbar-toggler-icon"></span>
	</button>
	<div class="collapse navbar-collapse" id="navbarNav">
		<ul class="navbar-nav">
			<li class="nav-item active"><a class="nav-link text-white"
				href="#" data-toggle="modal" data-target="#loginModal">Login <span
					class="sr-only"></span></a></li>
			<li class="nav-item active"><a class="nav-link text-white"
				href="#" data-toggle="modal" data-target="#cadastroModal">Cadastre-se
					<span class="sr-only"></span>
			</a></li>
			<li class="nav-item active"><button id="enviar">enviar</button></li>
		</ul>
	</div>
	</nav> </header>

	<!-- Modal login-->
	<div class="modal fade" id="loginModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Login</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label for="exampleInputEmail1">Email</label> <input type="email"
								class="form-control" id="exampleInputEmail1"
								aria-describedby="emailHelp">
						</div>
						<div class="form-group">
							<label for="exampleInputPassword1">Senha</label> <input
								type="password" class="form-control" id="exampleInputPassword1">
						</div>
						<button type="submit" class="btn btn-primary">Entrar</button>
					</form>
				</div>
			</div>
		</div>
	</div>

	<!-- Modal cadastro-->
	<div class="modal fade" id="cadastroModal" tabindex="-1"
		aria-labelledby="exampleModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<h5 class="modal-title" id="exampleModalLabel">Cadastro</h5>
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<div class="modal-body">
					<form>
						<div class="form-group">
							<label for="nome">Nome</label> <input type="text"
								class="form-control" id="nome" name="nome"
								aria-describedby="emailHelp">
						</div>
						<div class="form-group">
							<label for="email">Email</label> <input type="email"
								class="form-control" id="email" name="email">
						</div>
						<div class="form-group">
							<label for="senha">Senha</label> <input type="password"
								class="form-control" id="senha" name="senha">
						</div>
						<div class="form-group">
							<label for="ddd">DDD</label> <input type="number"
								class="form-control" id="ddd" name="ddd"> <label
								for="numero">Número</label> <input type="number"
								class="form-control" id="número" name="número"> <label
								for="tipo">Tipo</label>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="tipo"
									id="RFixo" value="Fixo" checked> <label
									class="form-check-label" for="fixo"> Fixo </label>
							</div>
							<div class="form-check">
								<input class="form-check-input" type="radio" name="tipo"
									id="RCelular" value="Celular"> <label
									class="form-check-label" for="celular"> Celular </label>
							</div>
						</div>
				</div>

				<button type="submit" class="btn btn-primary">Submit</button>
				</form>
			</div>
		</div>
	</div>
	</div>

</body>
<script>
    $(document).ready(function(){
        $("#enviar").click(function(event){
        	console.log("entrou na função")
            $.ajax({
                url: "Controller",
                type: 'POST',
                data:{
                    nome: 'admin',
                    email: 'admin',
                    senha: '123',
                    ddd: 11,
            		numero: 88888888,
            		tipo: "fixo",
            		ddd2: 11,
            		numero2: 88888888,
            		tipo2: "fixo",
                    cmd: "cadastrar"
                },
                success: function(data) {
                    session = data.session;
                    console.log(data);
                }
            });
        });
    });
</script>

</html>