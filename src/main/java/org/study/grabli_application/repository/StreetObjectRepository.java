package org.study.grabli_application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.study.grabli_application.entity.StreetObject;

public interface StreetObjectRepository extends JpaRepository<StreetObject, Long> {
}
