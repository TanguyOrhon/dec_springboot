package decouv.spring.repository;

import decouv.spring.entity.GameCharacter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameCharacterRepository extends JpaRepository<GameCharacter, Integer> {
}
