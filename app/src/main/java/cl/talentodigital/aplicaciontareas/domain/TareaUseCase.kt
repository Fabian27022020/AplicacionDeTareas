package cl.talentodigital.aplicaciontareas.domain

class TareaUseCase (private val repository: TareaRepository){

    fun excecute() = repository.obtenerDatos()
}