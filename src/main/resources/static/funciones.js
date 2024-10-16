function eliminar(id){
	swal({
  title: "Realmente desea eliminar el registro?",
  text: "Sí elimina el registro no podrá recuperarlo!",
  icon: "warning",
  buttons: true,
  dangerMode: true,
})
.then((OK) => {
  if (OK) {
	$.ajax({
		url:"/eliminar/" + id,
		success:function(res){
			console.log(res);
		},
	});
    swal("Elimino el registro correctamente!", {
      icon: "success",
    }).then((ok)=>{
		if(ok){
		location.href="/listar";
	 }
	});
  } else {
    swal("No se guardo ningún cambio!");
  }
});
}