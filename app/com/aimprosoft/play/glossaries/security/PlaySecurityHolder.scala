package com.aimprosoft.play.glossaries.security

import org.springframework.security.core.Authentication
import play.api.Logger
import play.api.Play.current
import play.api.cache.Cache
import play.api.mvc.{Security, RequestHeader}

trait PlaySecurityHolder {

  def getAuthentication(implicit request: RequestHeader): Option[Authentication] = {
    //get username from session
    request.session.get(Security.username) flatMap {
      username =>
        val fromCache = Cache.getAs[Authentication](username)

        Logger.debug(s"Getting value for $username, and it returns $fromCache")

        fromCache
    }
  }

}

object PlaySecurityHolder extends PlaySecurityHolder
