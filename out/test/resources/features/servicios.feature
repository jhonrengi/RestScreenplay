#language: es
  Característica: resolucion reto tecnico para servicios
    @Get
    Escenario: Consumir get para traer data de los empleados
      Cuando se consume el servicio get
      Entonces trae la data del empleado

    @Post
    Escenario: Consumir post para crear data de los empleados
      Cuando se consume el servicio post
      Entonces se crea el empleado y se recive un estado "success"

    @Put
    Escenario: Consumir put para actualizar la data de los empleados
      Cuando se consume el servicio put
      Entonces se actualiza el empleado y se recibe un estado "success"


    @Delete
    Escenario: Consumir Delete para borrar data de los empleados
      Cuando se consume el servicio Delete
      Entonces se elimina la data del empleado y se recibe un estado "success"
