<%@page contentType="text/html" pageEncoding="UTF-8"%>
<div class="modal fade" id="agregarKartModal">
    <div class="modal-dialog modal-lg">
        <div class="modal-content">
            <div class="modal-header bg-info text-white">
                <h5 class="modal-title">Agregar Kart</h5> 
                <button class="close" data-dismiss="modal"> <span>&times;</span> </button>
            </div>
            
            <form action="${pageContext.request.contextPath}/Kart?action=insert" method="POST" class="was-validated">
                
                <div class="modal-body">
                    <div class="form-group">
                        <label for="name">Nombre del Kart</label>
                        <input type="text" class="form-control" name="name" required />
                    </div>
                    <div class="form-group">
                        <label for="type">Tipo de Kart</label>
                        <input type="text" class="form-control" name="type" required>
                    </div>
                    <div class="form-group">
                        <label for="price">Precio por minuto</label>
                        <input type="number" class="form-control" name="price" required />
                    </div>
                </div>
                <div class="modal-footer">
                    <button class="btn btn-primary" type="submit">Guardar</button>
                </div>    
            </form>
        </div>
    </div>
</div>
    