<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no">
        <link href="layout/styles/layout.css" rel="stylesheet" type="text/css" media="all">
        <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.3/umd/popper.min.js" integrity="sha384-vFJXuSJphROIrBnz7yo7oB41mKfc8JzQZiCq4NCceLEaO4IHwicKwpJf9c9IpFgh" crossorigin="anonymous"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/js/bootstrap.min.js" integrity="sha384-alpBpkh1PFOepccYVYDB4do5UnbKysX5WZXm3XxPqe5iKTfUKjNkCk9SaVuEZflJ" crossorigin="anonymous"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta.2/css/bootstrap.min.css" integrity="sha384-PsH8R72JQ3SOdhVi3uxftmaW6Vc51MKb0q5P2rRUpPvrszuE4W1povHYgTpBfshb" crossorigin="anonymous">
        <link rel="stylesheet" href="layout/styles/styles.css">
        <script type="text/javascript">
            $(document).ready(function () {

                $("#states").change(function () {
                    $("#cities").empty();
                    if ($("#states").val() === "Coahuila") {
                        $.getJSON("layout/json/coahuila.json", function (data) {
                            $.each(data, function (index, value) {
                                $("#cities").append("<option>" + value + "</option>");
                            });
                        });
                    }
                    if ($("#states").val() === "Durango") {
                        $.getJSON("layout/json/durango.json", function (data) {
                            $.each(data, function (index, value) {
                                $("#cities").append("<option>" + value + "</option>");
                            });
                        })
                    }
                });
            });
        </script>
    </head>

    <body>
        <jsp:include page="header.jsp" flush="true" />
        <h1 align="center">Voluntarios</h1>
        <h4 align="center">Si estás interesado en ser voluntario de la Casa del Anciano, llena este formulario y nos pondremos en cotacto contigo lo más pronto posible</h4>
        <div class="container">
            <form action="app" method="post">
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="name">Nombre</label>
                        <input type="hidden" name="action" value="addV">
                        <input type="text" class="form-control" placeholder="Nombre" name="name" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="lastname">Apellido</label>
                        <input type="text" class="form-control" placeholder="Apellido" name="lastname" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="email">Email</label>
                        <input type="email" class="form-control" placeholder="Email" name="email" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="address">Domicilio</label>
                        <input type="text" class="form-control" placeholder="Domicilio" name="address" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 mb-3">
                        <label for="state">Estado</label><br>
                        <select class="custom-select" id="states" name="state">
                            <option selected>Selecciona un Estado</option>
                            <option value="Coahuila">Coahuila</option>
                            <option value="Durango">Durango</option>                           
                        </select>

                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="state">Ciudad</label><br>
                        <select class="custom-select" id="cities" name="city">
                            <option selected>Selecciona una ciudad</option>
                        </select>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="zip">Código Postal</label>
                        <input type="text" class="form-control" placeholder="Código Postal" name="zip" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="zip">Telefono</label>
                        <input type="text" class="form-control" placeholder="Telefono" name="tel" required>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="study">Grado de Estudios</label><br>
                        <select class="custom-select" name="study">
                            <option selected>Selecciona tu Grado de Estudios</option>
                            <option value="Primaria">Primaria</option>
                            <option value="Secundaria">Secundaria</option>
                            <option value="Preparatoria">Preparatoria</option>
                            <option value="Profesional">Profesional</option>
                            <option value="Posgrado">Posgrado</option>
                        </select>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="service">Tipo de Servicio</label><br>
                        <select class="custom-select" name="service">
                            <option selected>Selecciona un Tipo de Servicio</option>
                            <option value="Servicio 1">Servicio 1</option>
                            <option value="Servicio 2">Servicio 2</option>
                            <option value="Servicio 3">Servicio 3</option>
                        </select>
                    </div>
                </div>
                <button class="btn btn-danger btn-lg btn-block" type="submit">Enviar</button>
            </form> 
        </div>

    </div>
    <jsp:include page="footer.jsp" flush="true" />
    <a id="backtotop" href="#top"><i class="fa fa-chevron-up"></i></a>
    <script src="layout/scripts/jquery.min.js"></script>
    <script src="layout/scripts/jquery.backtotop.js"></script>
    <script src="layout/scripts/jquery.mobilemenu.js"></script>
    <script src="layout/scripts/jquery.placeholder.min.js"></script>
    <script src="layout/scripts/jquery.flexslider-min.js"></script>
</body>

</html>






