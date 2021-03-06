package com.aimprosoft.play.glossaries.service

import com.aimprosoft.play.glossaries.models.{UserRole, BusinessModel}
import org.springframework.data.domain.Page
import org.springframework.transaction.annotation.Transactional
import com.aimprosoft.play.glossaries.models.impl.{User, Glossary}

@Transactional(readOnly = true)
trait BaseCrudService[T <: BusinessModel] {

  def getCurrentPage(startRow: Int, pageSize: Int): Page[T]

  def exists(id: java.lang.Long): Boolean

  def count: Long

  def getById(id: java.lang.Long): Option[T]

  @Transactional(readOnly = false)
  def add(entity: T): Unit

  @Transactional(readOnly = false)
  def update(entity: T): Unit

  @Transactional(readOnly = false)
  def remove(entity: T): Unit

  @Transactional(readOnly = false)
  def removeById(id: java.lang.Long): Unit

}

trait GlossaryService extends BaseCrudService[Glossary]

@Transactional(readOnly = true)
trait UserService extends BaseCrudService[User]{

  def getByEmail(username: String): Option[User]

  def countByRole(role: UserRole): Long

}