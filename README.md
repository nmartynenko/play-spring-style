## Sample CRUD application [![Build Status](https://travis-ci.org/nmartynenko/play-spring-style.png?branch=master)](https://travis-ci.org/nmartynenko/play-spring-style)

This is Play project with mature JEE technologies.

####Spring stack####
Here is a stack of Java-based technologies:

- [Spring](http://www.springsource.org/) &mdash; IoC/DI/AOP container;

- [Spring Security](http://www.springsource.org/spring-security/) &mdash; ACL/security (it also uses JBCrypt hash function internally);

- [Spring Data JPA](http://www.springsource.org/spring-data/jpa) &mdash; JPA persistence;

- [Hibernate](http://www.hibernate.org/) &mdash; JPA-vendor;

- [HyperSQL](http://hsqldb.org/) &mdash; embedded RDMBS;

- [OVal](http://oval.sourceforge.net/) &mdash; object validation (for me it's more preferable than [JSR-303](http://jcp.org/en/jsr/detail?id=303));

- [Jackson](http://jackson.codehaus.org/) &mdash; Java JSON processor along with [Jackson Scala module](https://github.com/FasterXML/jackson-module-scala);

- [Spring Scala](https://github.com/spring-projects/spring-scala) &mdash; Spring support of Scala's classes and Scala's friendly wrappers;

And lots of things, which are provided by Play itself.