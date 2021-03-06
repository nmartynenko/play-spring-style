package com.aimprosoft.play.glossaries.service.impl

import com.aimprosoft.play.glossaries.service.BaseCrudService
import org.springframework.data.domain.{PageRequest, Pageable, Page}
import org.springframework.data.jpa.repository.JpaRepository
import com.aimprosoft.play.glossaries.models.BusinessModel

abstract class BaseCrudServiceImpl[T <: BusinessModel, P <: JpaRepository[T, java.lang.Long]] extends BaseCrudService[T]{

  protected val persistence: P

  def getCurrentPage(startRow: Int, pageSize: Int): Page[T] = {
    var pageable: Pageable = null

    if (startRow >= 0 && pageSize > 0) {
      pageable = new PageRequest(startRow / pageSize, pageSize)
    }

    persistence.findAll(pageable)
  }

  def count: Long = {
    persistence.count()
  }

  def exists(id: java.lang.Long): Boolean = {
    persistence.exists(id)
  }

  def getById(id: java.lang.Long): Option[T] = {
      Option(persistence.findOne(id))
  }

  def add(entity: T): Unit = {
      persistence.save(entity)
  }

  def update(entity: T): Unit = {
      persistence.save(entity)
  }

  def remove(entity: T): Unit = {
      persistence.delete(entity)
  }

  def removeById(id: java.lang.Long): Unit = {
      persistence.delete(id)
  }

}
