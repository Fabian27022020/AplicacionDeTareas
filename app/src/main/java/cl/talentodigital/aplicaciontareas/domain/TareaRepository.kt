package cl.talentodigital.aplicaciontareas.domain

import cl.talentodigital.aplicaciontareas.domain.model.Tareas
import io.reactivex.Single

interface TareaRepository {

    fun obtenerDatos() : Single<Tareas>
}