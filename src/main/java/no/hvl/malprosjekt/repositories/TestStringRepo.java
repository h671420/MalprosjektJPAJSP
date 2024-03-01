package no.hvl.malprosjekt.repositories;

import no.hvl.malprosjekt.entities.TestString;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TestStringRepo extends JpaRepository<TestString, Long> {
}
