package edu.sabanciuniv.calismakerem1.repository;

import edu.sabanciuniv.calismakerem1.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
