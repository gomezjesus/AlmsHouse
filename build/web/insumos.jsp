<%-- 
    Document   : insumos
    Created on : Nov 28, 2017, 12:44:36 PM
    Author     : chuy_
--%>

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
        <title>Insumos</title>
    </head>
    <body>
        <jsp:include page="headerAdmin.jsp" flush="true" />
        <h1 align="center">Insumos</h1>
        <div class="container">              
            <form action="app" method="post">
                <div class="row">
                    <div class="col-md-6 mb-3">
                        <label for="name">Nombre</label>
                        <input type="hidden" name="action" value="addI">
                        <input type="text" class="form-control" placeholder="Nombre" name="name" required>
                    </div>
                    <div class="col-md-6 mb-3">
                        <label for="lastname">Categoría</label><br>
                        <select class="custom-select" name="category">
                            <option selected>Selecciona una Categoría</option>
                            <option value="Higiene">Higiene</option>
                            <option value="No Perecederos">No Perecederos</option>
                            <option value="Perecederos">Perecederos</option>
                            <option value="Medicamentos">Medicamentos</option>                            
                        </select>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-3 mb-3">
                        <label for="state">Cantidad</label><br>                        
                        <input type="number" class="form-control" placeholder="Cantidad" name="qty" required>
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="state">TIpo de Unidad</label><br>
                        <select class="custom-select" id="cities" name="unit">
                            <option selected>Selecciona un tipo de unidad</option>
                            <option>Pieza(s)</option>
                            <option>Kilo(s)</option>
                            <option>Paquete(s)</option>
                        </select>
                    </div>
                    <div class="col-md-3 mb-3">
                        <label for="state">Estado</label><br>
                        <select class="custom-select" id="cities" name="status">
                            <option selected>Selecciona estado</option>
                            <option>Aceptable</option>
                            <option>Escaso</option>
                            <option>Abundante</option>
                        </select>
                    </div>
                </div>
                <button class="btn btn-danger btn-lg btn-block" type="submit">Añadir</button>
            </form>
        </div>
    </body>
</html>
