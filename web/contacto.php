<?php  
$nombre = $_POST['nombre']; 
$email = $_POST['email']; 
$telefono = $_POST['telefono']; 
$mensaje = $_POST['mensaje']; 
$para = 'samuel-silva@live.com.mx'; 
$titulo = 'Casa del Anciano'; 
$header = 'From: ' . $email; 
$msjCorreo = "Nombre: $nombre\n E-Mail: $email\n Telefono: $telefono\n Mensaje:\n $mensaje"; 
if ($_POST['submit']) { 
if (mail($para, $titulo, $msjCorreo, $header)) { 
echo "<script language='javascript'> 
alert('Mensaje enviado, muchas gracias.'); 
window.location.href = 'www.google.com'; 
</script>"; 
} else { 
echo 'Fallo el envio'; 
}
} 
?> 
